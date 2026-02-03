package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyg implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ DropDownPreference a;

    public oyg(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            DropDownPreference dropDownPreference = this.a;
            String string = ((ListPreference) dropDownPreference).h[i].toString();
            if (string.equals(((ListPreference) dropDownPreference).i) || !dropDownPreference.Q(string)) {
                return;
            }
            dropDownPreference.o(string);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
