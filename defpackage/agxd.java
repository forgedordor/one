package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxd {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final Optional d;
    public SwitchPreferenceCompat e;
    public final egps f;

    public agxd(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, Optional optional) {
        fcsuVar2.getClass();
        fdjxVar.getClass();
        optional.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = optional;
        this.f = new egps<Boolean, Void>() { // from class: agxd.1
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                agxd agxdVar = agxd.this;
                SwitchPreferenceCompat switchPreferenceCompat = agxdVar.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(false);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = agxdVar.e;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(zBooleanValue);
                }
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                agxd agxdVar = agxd.this;
                SwitchPreferenceCompat switchPreferenceCompat = agxdVar.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                fcsu fcsuVar4 = agxdVar.a;
                Snackbar.q(((agxb) fcsuVar4.b()).N().getRootView(), ((agxb) fcsuVar4.b()).Z(true != zBooleanValue ? R.string.gemini_chat_archived : R.string.gemini_chat_restored, ((cgsa) agxdVar.d.get()).s()), -1).i();
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                agxd agxdVar = agxd.this;
                SwitchPreferenceCompat switchPreferenceCompat = agxdVar.e;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = agxdVar.e;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(!zBooleanValue);
                }
            }
        };
    }
}
