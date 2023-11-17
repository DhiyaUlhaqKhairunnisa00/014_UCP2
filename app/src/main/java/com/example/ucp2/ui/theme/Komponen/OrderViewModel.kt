package com.example.ucp2.ui.theme.Komponen

import androidx.lifecycle.ViewModel
import com.example.ucp2.Data.OrderUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class OrderViewModel : ViewModel(){
    private val _stateUi = MutableStateFlow(OrderUiState())
    val stateUi : StateFlow<OrderUiState> = _stateUi.asStateFlow()


    fun setFormulir(namaMhs: String, nim:String, konsetrasi:String, judulSkripsi: String){
        _stateUi.update { stateSaatIni ->
            stateSaatIni.copy(
                namaMahasiswa = namaMhs,
                no_mhs = nim,
                minat = konsetrasi,
                judulSkripsi = judulSkripsi
            )
        }
    }

    fun setDosen1(dosen1: String){
        _stateUi.update { stateSaatIni ->
            stateSaatIni.copy(dosenPembimbing1 = dosen1)
        }
    }
    fun setDosen2(dosen2: String){
        _stateUi.update { stateSaatIni ->
            stateSaatIni.copy(dosenPembimbing2 = dosen2)
        }
    }
}