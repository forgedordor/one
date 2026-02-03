package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oye implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ CheckBoxPreference a;

    public oye(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBoxPreference checkBoxPreference = this.a;
        if (checkBoxPreference.Q(Boolean.valueOf(z))) {
            checkBoxPreference.k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
