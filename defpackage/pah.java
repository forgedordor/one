package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pah implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ SwitchPreference a;

    public pah(SwitchPreference switchPreference) {
        this.a = switchPreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SwitchPreference switchPreference = this.a;
        if (switchPreference.Q(Boolean.valueOf(z))) {
            switchPreference.k(z);
        } else {
            compoundButton.setChecked(!z);
        }
    }
}
