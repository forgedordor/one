package defpackage;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecsw implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ecsz a;
    private final int b;

    public ecsw(ecsz ecszVar, int i) {
        this.a = ecszVar;
        this.b = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBox checkBox;
        int i = 0;
        if ("NoneOfTheAbove".equals(compoundButton.getTag())) {
            ecsz ecszVar = this.a;
            ecszVar.a[this.b] = z;
            if (z) {
                if (ecszVar.getChildCount() != ecszVar.a.length + 1) {
                    Log.e("SurveyMultipleSelectView", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i2 = 0; i2 < ecszVar.getChildCount(); i2++) {
                    CheckBox checkBox2 = (CheckBox) ecszVar.getChildAt(i2).findViewById(R.id.survey_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox2.getTag())) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        } else if ("OtherPleaseSpecify".equals(compoundButton.getTag())) {
            ecsz ecszVar2 = this.a;
            ecszVar2.a[this.b] = z;
            if (z) {
                while (true) {
                    if (i >= ecszVar2.getChildCount()) {
                        break;
                    }
                    EditText editText = (EditText) ecszVar2.getChildAt(i).findViewById(R.id.survey_other_option);
                    if (editText != null) {
                        editText.requestFocus();
                        break;
                    }
                    i++;
                }
            }
        } else {
            ecsz ecszVar3 = this.a;
            ecszVar3.a[this.b] = z;
            if (z && (checkBox = (CheckBox) ecszVar3.findViewWithTag("NoneOfTheAbove")) != null) {
                checkBox.setChecked(false);
            }
        }
        ecsz ecszVar4 = this.a;
        ecszVar4.c.a(new ecsx(ecszVar4.b, ecszVar4.a));
    }
}
