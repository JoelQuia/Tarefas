package com.example.myapplication.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
    fun MainGui(){

        Column {


            Box{

                Column {
                    Text(text = "Tarefa 1")
                    Text(text = "Descrição: Fazer relatório do Trabalho")
                    Text(text = "Dia da Tarefa: 10/09/2024")


                    Row {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Concluir")

                        }
                    }
                }
            }





            Box {
                Column {
                    Text(text = "Tarefa 2")
                    Text(text = "Descrição: Finalizar trabalho da Faculdade")
                    Text(text = "Dia da Tarefa: 11/09/2024")

                    Row {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Concluir")

                        }
                    }
                }
            }





            Box{
                Column {
                    Text(text = "Tarefa 3")
                    Text(text = "Descrição: Aula De Violão")
                    Text(text = "Dia da Tarefa: 11/09/2024")

                    Row {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Concluir")

                        }
                    }
                }
            }
        }

    }


