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
</body>
<script>
    var texto = document.getElementById("texto")
    function exe2() {
    var peso = Number(prompt("Digite seu peso:"));
    var altura = Number(prompt("Digite sua altura:"));
    var resultado = peso / (altura * altura)

    if(resultado <= 18) {
        texto.innerHTML = `Peso:${peso}kg Altura:${altura}m <br/>Voce esta magro`
    }else if(resultado <= 25) {
        texto.innerHTML = `Peso:${peso}kg Altura:${altura}m <br/>Voce esta com um peso normal`
    }else if(resultado <= 30) {
        texto.innerHTML = `Peso:${peso}kg Altura:${altura}m <br/>Voce esta com sobre peso`
    }else if(resultado >= 40) {
        texto.innerHTML = `Peso:${peso}kg Altura:${altura}m <br/>Chamem os caçadores de baleia!!!!!`
    }
    }
    exe2()

</script>
</html>
