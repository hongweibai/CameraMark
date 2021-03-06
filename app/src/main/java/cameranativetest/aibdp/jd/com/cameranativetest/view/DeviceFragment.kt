package cameranativetest.aibdp.jd.com.cameranativetest.view

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cameranativetest.aibdp.jd.com.cameranativetest.R

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class DeviceFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_device, container, false)

        return root
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
