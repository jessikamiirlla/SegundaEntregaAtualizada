package so;

public class Execute {
	public static void main(String[] args) {
		/**Saia daqui, primeiro ajeite os ids dos processos*/
		Process p1 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 20, "P1");
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p1, 0, null);
		
		Process p2 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 38, "P2");
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p2, 0, null);
		
		Process p3 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 38, "P3");
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p3, 0, null);
		
		Process p4 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 20, "P4");
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p4, 0, null);
		
		Process p5 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 8, "P5");
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p5, 0, null);
		
		Process p6 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 4, "P6");
		SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p6, 0, null);
		
		SystemOperation.systemCall(SystemCallType.DELETE_PROCESS, p3, 0, null);
		SystemOperation.systemCall(SystemCallType.DELETE_PROCESS, p5, 0, null);
		
		//Process p5 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 40); // Estouro de memoria
		//SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p4, 0);
		
		//Só usar quando for o best fit ou o Worst
		//Process p5 = (Process)SystemOperation.systemCall(SystemCallType.CREATE_PROCESS, null, 8); // O gerenciador adiciona no final da memoria para o best fit e adiciona no lugar de p2 se for o Worst fit
		//SystemOperation.systemCall(SystemCallType.WRITE_PROCESS, p5, 0);
		
	}
	

}
