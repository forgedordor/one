package defpackage;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.settingspage.SettingsPageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afey {
    public static final cqce a = cqce.g("Lighter", "LighterSettingsFragment");
    public final fcsu b;
    public final eosc c;
    public final afex d;
    dwje e;
    dwpx f;
    public final egpr g;
    public final ehbb h;
    public final egps i = new egps<Boolean, Boolean>() { // from class: afey.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            afex afexVar = afey.this.d;
            afexVar.getClass();
            Toast.makeText(((SettingsPageView) afexVar.N().findViewById(R.id.settings_page)).getContext(), true != ((Boolean) obj2).booleanValue() ? R.string.read_receipt_setting_disable_success : R.string.read_receipt_setting_enable_success, 0).show();
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            afex afexVar = afey.this.d;
            afexVar.getClass();
            Toast.makeText(((SettingsPageView) afexVar.N().findViewById(R.id.settings_page)).getContext(), R.string.read_receipt_setting_failure, 0).show();
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ehay j = new afez(this);
    public dxdt k;
    public dvpy l;

    public afey(afex afexVar, fcsu fcsuVar, egpr egprVar, ehbb ehbbVar, eosc eoscVar) {
        this.d = afexVar;
        this.b = fcsuVar;
        this.g = egprVar;
        this.h = ehbbVar;
        this.c = eoscVar;
    }

    public final void a() {
        afex afexVar = this.d;
        afexVar.getClass();
        ((ProgressBar) afexVar.N().findViewById(R.id.settings_progress_bar)).setVisibility(4);
    }

    public final void b() {
        afex afexVar = this.d;
        afexVar.getClass();
        ((LinearLayout) afexVar.N().findViewById(R.id.settings_read_receipt_container)).setVisibility(0);
    }
}
