package mau.example.mynavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_first, container, false)
        // en vez de usar viewBinding, se puede usar findViewById
        val btnNavigate = rootView.findViewById<Button>(R.id.btnNavigate)
        btnNavigate.setOnClickListener {
            // buscar el controlador de navegacion
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        // retornar la vista inflada the layout for this fragment
        return rootView
    }
}