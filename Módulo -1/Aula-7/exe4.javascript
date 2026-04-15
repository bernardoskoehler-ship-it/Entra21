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
    function exe4() {
        var texto = document.getElementById("texto")
        var frutas = []

        while(true) {
            var continuar = prompt("Quer adicionar uma fruta?")
            if(continuar == "sim") {
                var fruta = prompt("adicione uma fruta: ")
                frutas.push(fruta)
                continue;
            }else {
                break
            }
        }
        texto.innerHTML = `${frutas}`
    }
    exe4()
</script>
</html>
