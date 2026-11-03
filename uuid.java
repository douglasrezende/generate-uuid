private String gerarUUID() {

		// Gera um UUID Versão 4 (aleatório)
		UUID uuid = UUID.randomUUID();

		// Exibe o objeto UUID
		System.out.println("UUID: " + uuid);

		// Converte para String, se necessário
		String uuidString = uuid.toString();
		System.out.println("UUID em String: " + uuidString);
		return uuidString;
	}
