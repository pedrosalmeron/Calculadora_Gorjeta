package com.example.calculadora_gorjeta

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora_gorjeta.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var porcentagem = 0

        binding.btnSubtrairPessoa.setOnClickListener {

            val numeroPessoas: Int = binding.tvNumeroPessoas.text.toString().toInt()
            val totalMesa = binding.tiTotalMesa.text.toString().toFloat()

            if (numeroPessoas > 1 && binding.rbGorjeta1.isChecked) {

                val NovoNumeroPessoas = numeroPessoas - 1

                porcentagem = 10

                val totalPorPessoaSemGorjeta = totalMesa / NovoNumeroPessoas
                val totalGorjeta = totalMesa / 100 * (porcentagem)
                val gorjetaPorPessoa = totalGorjeta / NovoNumeroPessoas
                val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)
                binding.tvNumeroPessoas.text = NovoNumeroPessoas.toString()

            }else if(numeroPessoas > 1 && binding.rbGorjeta2.isChecked) {

                val NovoNumeroPessoas = numeroPessoas - 1

                porcentagem = 15

                val totalPorPessoaSemGorjeta = totalMesa / NovoNumeroPessoas
                val totalGorjeta = totalMesa / 100 * (porcentagem)
                val gorjetaPorPessoa = totalGorjeta / NovoNumeroPessoas
                val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)
                binding.tvNumeroPessoas.text = NovoNumeroPessoas.toString()

            } else if(numeroPessoas > 1 && binding.rbGorjeta3.isChecked) {

                val NovoNumeroPessoas = numeroPessoas - 1

                porcentagem = 20

                val totalPorPessoaSemGorjeta = totalMesa / NovoNumeroPessoas
                val totalGorjeta = totalMesa / 100 * (porcentagem)
                val gorjetaPorPessoa = totalGorjeta / NovoNumeroPessoas
                val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)
                binding.tvNumeroPessoas.text = NovoNumeroPessoas.toString()

            }
        }

        binding.btnAdicionarPessoa.setOnClickListener {

            val numeroPessoas = binding.tvNumeroPessoas.text.toString().toInt()
            val NovoNumeroPessoas = numeroPessoas + 1
            val totalMesa: Float = binding.tiTotalMesa.text.toString().toFloat()

            if (binding.rbGorjeta1.isChecked) {
                porcentagem = 10

                val totalPorPessoaSemGorjeta = totalMesa / NovoNumeroPessoas
                val totalGorjeta = totalMesa / 100 * (porcentagem)
                val gorjetaPorPessoa = totalGorjeta / NovoNumeroPessoas
                val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)
                binding.tvNumeroPessoas.text = NovoNumeroPessoas.toString()

            } else if (binding.rbGorjeta2.isChecked) {
                porcentagem = 15

                val totalPorPessoaSemGorjeta = totalMesa / NovoNumeroPessoas
                val totalGorjeta = totalMesa / 100 * (porcentagem)
                val gorjetaPorPessoa = totalGorjeta / NovoNumeroPessoas
                val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)
                binding.tvNumeroPessoas.text = NovoNumeroPessoas.toString()

            } else if (binding.rbGorjeta3.isChecked) {
                porcentagem = 20

                val totalPorPessoaSemGorjeta = totalMesa / NovoNumeroPessoas
                val totalGorjeta = totalMesa / 100 * (porcentagem)
                val gorjetaPorPessoa = totalGorjeta / NovoNumeroPessoas
                val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                binding.tvTotalPorPessoaComGorjeta.text = totalPorPessoaComGorjeta.toString()
                binding.tvContaPorPessoa.text = totalPorPessoaSemGorjeta.toString()
                binding.tvGorjetaPorPessoa.text = gorjetaPorPessoa.toString()
                binding.tvNumeroPessoas.text = NovoNumeroPessoas.toString()
            }
        }

            binding.rbGorjeta1.setOnCheckedChangeListener { _, isChecked ->
                if(isChecked){

                    porcentagem = 10
                    val totalMesa : Float = binding.tiTotalMesa.text.toString().toFloat()
                    val numeroPessoas : Int = binding.tvNumeroPessoas.text.toString().toInt()

                    val totalPorPessoaSemGorjeta = totalMesa/numeroPessoas
                    val totalGorjeta = totalMesa/100 * (porcentagem)
                    val gorjetaPorPessoa = totalGorjeta/numeroPessoas
                    val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                    binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                    binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                    binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)

                }
            }

            binding.rbGorjeta2.setOnCheckedChangeListener{_,isChecked ->
                if(isChecked){
                    porcentagem = 15

                    val totalMesa : Float = binding.tiTotalMesa.text.toString().toFloat()
                    val numeroPessoas : Int = binding.tvNumeroPessoas.text.toString().toInt()

                    val totalPorPessoaSemGorjeta = totalMesa/numeroPessoas
                    val totalGorjeta = totalMesa/100 * (porcentagem)
                    val gorjetaPorPessoa = totalGorjeta/numeroPessoas
                    val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                    binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                    binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                    binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)
                }
            }

            binding.rbGorjeta3.setOnCheckedChangeListener{_,isChecked ->
                if(isChecked){
                    porcentagem = 20

                    val totalMesa : Float = binding.tiTotalMesa.text.toString().toFloat()
                    val numeroPessoas : Int = binding.tvNumeroPessoas.text.toString().toInt()

                    val totalPorPessoaSemGorjeta = totalMesa/numeroPessoas
                    val totalGorjeta = totalMesa/100 * (porcentagem)
                    val gorjetaPorPessoa = totalGorjeta/numeroPessoas
                    val totalPorPessoaComGorjeta = totalPorPessoaSemGorjeta + gorjetaPorPessoa

                    binding.tvTotalPorPessoaComGorjeta.text = String.format("%.2f", totalPorPessoaComGorjeta)
                    binding.tvContaPorPessoa.text = String.format("%.2f", totalPorPessoaSemGorjeta)
                    binding.tvGorjetaPorPessoa.text = String.format("%.2f", gorjetaPorPessoa)
                }
            }
        }
    }
