<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Exercicio</h1>
    <div id="texto"></div>
    <div id="texto2"></div>
</body>
<script>
    function  exe3() {
        var texto = document.getElementById("texto")
        var texto2 = document.getElementById("texto2")
        
        var tentativas = 3
        var senhaAtual = "cachorro1337"

        while(tentativas > 0) {
            var senha = prompt("Digite sua senha")
            if(senha !== senhaAtual) {
                tentativas --;
                alert("Senha errada. Tentativas restantes: " +tentativas)
                continue;
            }
            texto.innerHTML = `Senha correta ${senha}`
            break;
        }
        if(tentativas <= 0) {
            texto2.innerHTML = `Acabaram as tentativas`
        }
    }
    exe3()

</script>
</html>
