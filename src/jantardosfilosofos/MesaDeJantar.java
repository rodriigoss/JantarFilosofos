package jantardosfilosofos;

public class MesaDeJantar {
        private InterfaceGrafica ig;
	/* filósofo pensando */
	final static int PENSANDO = 1;
	/* filósofo comendo */
	final static int COMENDO = 2;
	/* filósofo com fome */
	final static int COM_FOME = 3;
	/* Quantidade de filósofos */
	final static int QUANT_FILOSOFOS = 5;
	/* Número do primeiro filósofo */
	final static int PRIMEIRO_FILOSOFO = 0;
	/* Número do último filósofo */
	final static int ULTIMO_FILOSOFO = QUANT_FILOSOFOS - 1;
 
       
	/* array[0...QUANT_FILOSOFOS - 1] representando os garfos na mesa :
	 * true = garfo na mesa; false = garfo com filósofo
	 */
	boolean[] garfos = new boolean[QUANT_FILOSOFOS];
	
	/* array [0...QUANT_FILOSOFOS - 1]
	representando o estado de cada um dos filósofos
	 */
	int[] filosofos = new int[QUANT_FILOSOFOS];
	
	/* Quantas vezes cada filósofo tentou comer e não conseguiu,
	 * serve para identificar situações de Starvation
	 */
	int[] tentativasParaComer = new int[QUANT_FILOSOFOS];
	
	/* Construtor */
	public MesaDeJantar(InterfaceGrafica ig) {
                this.ig = ig;
		/* Preenchendo os vetores de Garfos e filósofos à mesa */
		for (int i = 0; i < 5; i++) {
			/* Todos os garfos estão na mesa */
			garfos[i] = true;
			/* Todos os filósofos sentam à mesa pensando */
			filosofos[i] = PENSANDO;
			/* Nenhum filósofo tentou comer ainda */
			tentativasParaComer[i] = 0;
		}
	}
	
	/* filosofo pegando os garfos */
	synchronized void pegandoGarfos (int filosofo) {
		/* filÃ³sofo com fome */
		filosofos[filosofo] = COM_FOME;
		
		/* Deve esperar enquanto algum filÃ³sofo vizinho estive comendo */
		while (filosofos[aEsquerda(filosofo)] == COMENDO
				|| filosofos[aDireita(filosofo)] == COMENDO) {
			try {
				/* FilÃ³sofo tentou comer e nÃ£o conseguiu */
				tentativasParaComer[filosofo]++;
				
				/* colocando o filosofo para esperar */
				wait();
			} catch (InterruptedException e) {
				System.out.println("FilÃ³sofo morreu de fome");
			}
		}
		
		/* FilÃ³sofo conseguiu comer */
		tentativasParaComer[filosofo] = 0;
		
		/* retirando os garfos esquerdo e direito da mesa */
		garfos[garfoEsquerdo(filosofo)] = false;
		garfos[garfoDireito(filosofo)] = false;
		/* FilÃ³sofo comendo */
		
		filosofos[filosofo] = COMENDO;
		imprimeEstadosFilosofos();
		imprimeGarfos();
	}
	
	/* Filosofo devolvendo os garfos */
	synchronized void devolvendoGarfos (int filosofo) {
		/* Devolvendo os garfos esquerdo e direito da mesa */
		garfos[garfoEsquerdo(filosofo)] = true;
		garfos[garfoDireito(filosofo)] = true;
		/* Verificando se há algum filósofo vizinho com fome */
		if (filosofos[aEsquerda(filosofo)] == COM_FOME ||
				filosofos[aDireita(filosofo)] == COM_FOME) {
			/* Notifica (acorda) os vizinhos com fome */
			notifyAll();
		}
		/* Filósofo pensando */
		filosofos[filosofo] = PENSANDO;
		imprimeEstadosFilosofos();
		imprimeGarfos();
	}
	/* Retorna o número do filósofo a direita */
	private int aDireita (int filosofo) {
		int direito;
		/* Caso seja o filósofo no5, a sua direita está o filósofo no1 */
		if (filosofo == ULTIMO_FILOSOFO) {
			direito = PRIMEIRO_FILOSOFO;
		} else {
			/* Caso contrário */
			direito = filosofo + 1;
		}
		return direito;
	}
	/* Retorna o número do filósofo a esquerda */
	private int aEsquerda (int filosofo) {
		int esquerdo;
		/* Caso seja o primeiro filósofo a sua esquerda está o último */
		if (filosofo == PRIMEIRO_FILOSOFO) {
			esquerdo = ULTIMO_FILOSOFO;
		} else {
			esquerdo = filosofo - 1;
		}
		return esquerdo;
	}
	/** Retorna o número do garfo a esquerda do filósofo */
	private int garfoEsquerdo (int filosofo) {
		/* O filósofo 1 possui o garfo 1 a sua esquerda e assim por diante */
		int garfoEsquerdo = filosofo;
		return garfoEsquerdo;
	}
	/** Retorna o número do garfo a direita do filósofo */
	private int garfoDireito (int filosofo) {
		int garfoDireito;
		/* O último filósofo possui o garfo 0 a sua direita*/
		if (filosofo == ULTIMO_FILOSOFO) {
			garfoDireito = 0;
		} else {
			garfoDireito = filosofo + 1;
		}
		return garfoDireito;
	}
	
	/* Imprimindo os estados dos filósofos */
	private void imprimeEstadosFilosofos () {
            int filosofo = 0;
		for (int i = 0; i < QUANT_FILOSOFOS; i++) {
                    filosofo = i +1;
			switch (filosofos[i]) {
			case PENSANDO :
                                ig.SetInterfaceToFilosofo(filosofo, "PENSANDO");
				break;
			case COM_FOME :
                                ig.SetInterfaceToFilosofo(filosofo, "COM_FOME");
				break;
			case COMENDO :
                                ig.SetInterfaceToFilosofo(filosofo, "COMENDO");
				break;
			}
		}
	}
	/* Imprimindo os que estão na mesa */
	private void imprimeGarfos () {
                int garfo = 0;
                for (int i = 0; i < QUANT_FILOSOFOS; i++) {
                    garfo = i +1;
                    if (garfos[i]) {
                        ig.SetInterfaceToGarfo(garfo, "LIVRE");
                    } else {
                        ig.SetInterfaceToGarfo(garfo, "OCUPADO");
                    }
                }
	}  
}
