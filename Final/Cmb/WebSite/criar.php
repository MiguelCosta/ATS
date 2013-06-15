<?php include 'header.php'; ?>

<h2>Texto de entrada:</h2>

<form name="form" action="criarResposta.php" method="post">
    <div class="textwrapper">
        <textarea name="texto" rows="25">
void imprime(string nome)
{
	string msg;
	msg = "blabla";
	print (nome);
	print (msg);
}

int main(int x, int y)
{
	int a;
	int b;
	
	a=2+1;
	
	if(a==2) {
		a = a + 1;
		b = 3;
	}
	else
		b = 5;
	
	while (a<5)
	{
		a = a+5 * 3;
	}
	
	b = xtop(a+2*3,a);
	
	print (a);
	
	scan (a);
}

bool xtop (bool t, int i)
{
	string s;
	
	s = "luis";
	
	imprime (s);
	
	return s;
}		
		
        </textarea>
    </div>
    <input type="submit" value="submeter" />
</form>

<?php include 'footer.php'; ?>