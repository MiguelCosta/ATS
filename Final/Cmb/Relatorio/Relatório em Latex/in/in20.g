cabecalho [GrafoSDG g_in] returns [GrafoSDG g_out, String id, HashSet<String> vars_def, String nomeFuncao_out]
@init{
	HashSet<String> variaveis_definidas = new HashSet<String>();
	TreeMap<Integer, String> parms = new TreeMap<Integer, String>();
}
	:  ^(CAEBECALHO tipo ID (argumentos{variaveis_definidas = $argumentos.vars_def; parms = $argumentos.parms_out; })?)
	{
		$cabecalho.id = $ID.text;	
		$cabecalho.vars_def = variaveis_definidas;
		
		// cria uma instancia para guardar a informacao do cabecalho da funcao
		CabecalhoFuncao cf = new CabecalhoFuncao();
		cf.setNomeFuncao($ID.text);
		cf.setTipoRetorno($tipo.text_out);
		if($argumentos.parms_out != null){
			cf.setParametros($argumentos.parms_out);
		}
		// adiciona o cf ao GrafoSDG
		$cabecalho.g_in.putCabecalhoFuncao(cf);
		$cabecalho.g_out = $cabecalho.g_in;
	}
	;
