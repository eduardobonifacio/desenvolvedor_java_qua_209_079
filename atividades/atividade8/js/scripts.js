const form = document.querySelector('form');

const msg = () => {
    let peso = document.querySelector('#peso').value
    let altura = document.querySelector('#altura').value
    const imc = peso / (altura * altura);
    const result = 
        (imc <= 18.4) ? "classificação: magreza" :
        (imc >= 18.5 && imc <= 24.9) ? "classificação: normal" :
        (imc >= 25 && imc <= 29.9) ? "classificação: sobrepeso" :
        (imc >= 30 && imc <= 39.9) ? "classificação: obesidade" :
        (imc >= 40) ? "classificação: obesidade grave" :
        "";

    return result;
}