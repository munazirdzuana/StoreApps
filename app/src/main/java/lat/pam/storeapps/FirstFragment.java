package lat.pam.storeapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import lat.pam.storeapps.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    public static Bundle extrass=new Bundle();

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {


        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Intent i = new Intent(getActivity(), MainActivity4.class);
        view.findViewById(R.id.pizza).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extrass=new Bundle();
                extrass.putInt("pitzza",R.drawable.mpizza);
                extrass.putInt("t",R.string.pizza_t);
                extrass.putInt("p",R.string.desc_p);
                i.putExtras(extrass);
                startActivity(i);
            }
        });
        view.findViewById(R.id.spageti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extrass=new Bundle();
                extrass.putInt("pitzza",R.drawable.mpizza);
                extrass.putInt("t",R.string.spageti_t);
                extrass.putInt("p",R.string.spageti_p);
                i.putExtras(extrass);
                startActivity(i);
            }
        });
        view.findViewById(R.id.burger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extrass=new Bundle();
                extrass.putInt("pitzza",R.drawable.mpizza);
                extrass.putInt("t",R.string.burger_t);
                extrass.putInt("p",R.string.burger_p);
                i.putExtras(extrass);
                startActivity(i);
            }
        });
        view.findViewById(R.id.steak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extrass=new Bundle();
                extrass.putInt("pitzza",R.drawable.mpizza);
                extrass.putInt("t",R.string.steak_t);
                extrass.putInt("p",R.string.steak_p);
                i.putExtras(extrass);
                startActivity(i);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}