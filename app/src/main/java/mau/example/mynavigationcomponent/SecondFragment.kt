package mau.example.mynavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_second, container, false)
        // en vez de usar viewBinding, se puede usar findViewById
        val btn2 = rootView.findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            // buscar el controlador de navegacion
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        // retornar la vista inflada the layout for this fragment
        return rootView
    }
}