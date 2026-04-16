<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Exercio</h1>
    <div id="texto"></div>
</body>

<script>
    
    var texto = document.getElementById("texto")
    var lista = []

    function adicionar() {
        var adicao = prompt("Digite oque quer adicionar:");
        lista.push(adicao)
        alert(adicao +" adicionado a lista!")
    }
    function remover() {
        var item = prompt("Digite oque quer remover:")
        for(var i = 0; i < lista.length; i++) {
            if(lista[i] == item) {
                lista.splice(i, 1)
                alert(item +" removido da lista!")
                return;
            }
        }
        alert(item +" nao existe em Lista")
    }
    function mostrar() {
        texto.innerHTML = (`${lista}`)
    }
    function comando() {
        while(true) {
            var escolha = prompt("Oque voce quer fazer? Adicionar, Remover, Mostrar")

            if(escolha == "adicionar") {
                adicionar()
                continue;
            }
            if(escolha == "remover") {
                remover()
                continue;
            }
            if(escolha == "mostrar") {
                mostrar()
                break;
            }
        }
    }

    comando()

</script>

</html>
