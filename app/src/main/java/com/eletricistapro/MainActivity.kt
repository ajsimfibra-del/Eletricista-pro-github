package com.eletricistapro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.eletricistapro.databinding.ActivityMainBinding

/**
 * MainActivity - Atividade principal do aplicativo
 * Gerencia a navegação entre as telas principais usando BottomNavigationView
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar ActionBar
        setSupportActionBar(binding.toolbar)

        // Obter NavController
        val navController = findNavController(R.id.nav_host_fragment)

        // Configurar AppBarConfiguration com os destinos de topo
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_calculadoras,
                R.id.nav_orcamento,
                R.id.nav_curso,
                R.id.nav_prova
            )
        )

        // Configurar ActionBar com NavController
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Configurar BottomNavigationView
        val navView: BottomNavigationView = binding.bottomNavigation
        navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
