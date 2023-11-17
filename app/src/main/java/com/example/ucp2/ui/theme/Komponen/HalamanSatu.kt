package com.example.ucp2.ui.theme.Komponen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    dospem1: List<String>,
    dospem2: List<String>,
    onSubmitButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    var namaMahasiswa by rememberSaveable { mutableStateOf("") }
    var nim by rememberSaveable { mutableStateOf("") }
    var jurusan by rememberSaveable { mutableStateOf("") }
    var judulSkripsi by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        OutlinedTextField(
            value = namaMahasiswa,
            onValueChange = { namaMahasiswa = it },
            label = { Text(text = "Nama Mahasiswa") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
        OutlinedTextField(
            value = nim,
            onValueChange = { nim = it },
            label = { Text(text = "NIM") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
        OutlinedTextField(
            value = jurusan,
            onValueChange = { jurusan = it },
            label = { Text(text = "Konsetrasi") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
        OutlinedTextField(
            value = judulSkripsi,
            onValueChange = { judulSkripsi = it },
            label = { Text(text = "Judul Skripsi") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
    }
}