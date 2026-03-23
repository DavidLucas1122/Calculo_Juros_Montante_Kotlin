package com.example.gestaoestado.juros

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.gestaoestado.calculos.calcularJuros
import com.example.gestaoestado.calculos.calcularMontante

class JurosScreenViewModel {
    private val _capitalState = MutableLiveData<String>()
    var capital : LiveData<String> = _capitalState

    private val _taxaState = MutableLiveData<String>()
    var taxa : LiveData<String> = _taxaState

    private val _tempoState = MutableLiveData<String>()
    var tempo : LiveData<String> = _tempoState

    private val _jurosState= MutableLiveData<Double>()
    var juros: LiveData<Double> = _jurosState

    private val _montanteState= MutableLiveData<Double>()
    var montante: LiveData<Double> = _montanteState

    fun onCapitalChanged(novoCapital: String) {
        _capitalState.value = novoCapital
    }

    fun onTaxaChanged(novaTaxa: String) {
        _taxaState.value = novaTaxa
    }

    fun onTempoChanged(novoTempo: String) {
        _tempoState.value = novoTempo
    }

    fun calcularJurosInvestimento() {
        _jurosState.value = calcularJuros(
            capital = _capitalState.value!!.toDouble(),
            taxa = _taxaState.value!!.toDouble(),
            tempo = _tempoState.value!!.toDouble()
        )
    }

    fun calcularMontanteInvestimento() {
        _montanteState.value = calcularMontante(
            capital = _capitalState.value!!.toDouble(),
            juros = _jurosState.value!!
        )
    }
}