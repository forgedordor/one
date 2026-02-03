package defpackage;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drit implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ driu a;
    private final int b;

    public drit(driu driuVar, int i) {
        this.a = driuVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
            driu driuVar = this.a;
            driuVar.e = z;
            if (z) {
                if (driuVar.ag.getChildCount() != driuVar.d.length + 1) {
                    Log.e("HatsLibMultiSelectFrag", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i = 0; i < driuVar.ag.getChildCount(); i++) {
                    CheckBox checkBox = (CheckBox) driuVar.ag.getChildAt(i).findViewById(R.id.hats_lib_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox.getTag())) {
                        checkBox.setChecked(false);
                    }
                }
            }
        } else {
            driu driuVar2 = this.a;
            driuVar2.d[this.b] = z;
            if (z) {
                ((CheckBox) driuVar2.ag.findViewWithTag("NoneOfTheAbove")).setChecked(false);
            }
        }
        driu driuVar3 = this.a;
        driw driwVar = (driw) driuVar3.G();
        if (driwVar != null) {
            driwVar.F(driuVar3.t(), driuVar3);
        }
    }
}
