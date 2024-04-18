package so;

public class Execute {
	public static void main(String[] args) {
		
		//while vai aqui
		
		Process p1 = SystemOperation.SystemCall(SystemCallType.CREATE_PROCESS, 50, 10, 2);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p1);
		
		System.out.println("\n***************************************************************************************************");
		
		Process p2 = SystemOperation.SystemCall(SystemCallType.CREATE_PROCESS, 100, 5, 3);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p2);
		
		System.out.println("\n***************************************************************************************************");
		
		Process p3 = SystemOperation.SystemCall(SystemCallType.CREATE_PROCESS, 100, 15, 1);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p3);
		
		Process p4 = SystemOperation.SystemCall(SystemCallType.CREATE_PROCESS, 20, 15, 1);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p4);
		
		
		

		
		
		
		/**Saia daqui, primeiro ajeite os ids dos processos*/
		/*Process p1 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 50);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p1);
		
		Process p2 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 22);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p2);
		
		Process p3 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 25);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p3);
		
		Process p4 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 28);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p4);
		
		Process p5 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 2);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p5);
		
		Process p6 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, 2);
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p6);
		
		SystemOperation.systemCall(SystemCallType.DELETE_PROCESS, p2);
		//SystemOperation.systemCall(SystemCallType.DELETE_PROCESS, p4);*/
		
		//Process p5 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 40); // Estouro de memoria
		//SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p4, 0);
		
		//Só usar quando for o best fit ou o Worst
		//Process p5 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 8); // O gerenciador adiciona no final da memoria para o best fit e adiciona no lugar de p2 se for o Worst fit
		//SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p5, 0);
		
		
		
	}
	

}





//escalonador - 5 algoritmos / calclar o tempo que um processo leva para executar as instruções
