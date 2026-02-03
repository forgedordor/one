package defpackage;

import android.widget.Switch;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.settingspage.SettingsPageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afez implements ehay {
    final /* synthetic */ afey a;

    public afez(afey afeyVar) {
        this.a = afeyVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        afey afeyVar = this.a;
        afeyVar.b();
        afeyVar.a();
        afex afexVar = afeyVar.d;
        afexVar.getClass();
        Toast.makeText(((SettingsPageView) afexVar.N().findViewById(R.id.settings_page)).getContext(), R.string.read_receipt_fetch_failure, 0).show();
        afexVar.getClass();
        ((Switch) afexVar.N().findViewById(R.id.read_receipt_switch_button)).setClickable(true);
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        afey afeyVar = this.a;
        afeyVar.b();
        afeyVar.a();
        afex afexVar = afeyVar.d;
        afexVar.getClass();
        Switch r0 = (Switch) afexVar.N().findViewById(R.id.read_receipt_switch_button);
        r0.setChecked(((Boolean) obj).booleanValue());
        r0.jumpDrawablesToCurrentState();
        r0.setClickable(true);
    }
}
