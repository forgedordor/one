package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drmp implements drod {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/DefaultGlobalPreferencesProtoProvider");
    public final ecjh b;
    public final Executor c;
    public final drng d;

    public drmp(Context context) {
        eosd eosdVar = drle.a().e;
        this.c = eosdVar;
        ecjl ecjlVar = drvk.b;
        if (ecjlVar == null) {
            synchronized (drvk.class) {
                ecjlVar = drvk.b;
                if (ecjlVar == null) {
                    eclv eclvVar = eclv.a;
                    HashMap map = new HashMap();
                    ecev ecevVar = drvk.a;
                    if (ecevVar == null) {
                        synchronized (drvk.class) {
                            ecev ecevVar2 = drvk.a;
                            if (ecevVar2 == null) {
                                ecgd ecgdVarA = ecgd.a();
                                ecex ecexVar = new ecex(context.getApplicationContext());
                                ecgq.a(true, "LockScope will not be used in the custom backend. Only call builderWithOverrideForTest if you want to override the backend for testing, or call builder together with setLockScope to set a new lock scope.", new Object[0]);
                                ecexVar.c = ecgdVarA;
                                ecev ecevVar3 = new ecev(ekgb.s(new ecey(ecexVar), new ecfn(ecgdVarA)));
                                drvk.a = ecevVar3;
                                ecevVar2 = ecevVar3;
                            }
                            ecevVar = ecevVar2;
                        }
                    }
                    ecjm.a(eckx.a, map);
                    ecjl ecjlVar2 = new ecjl(eosdVar, ecevVar, eclvVar, map);
                    drvk.b = ecjlVar2;
                    ecjlVar = ecjlVar2;
                }
            }
        }
        ecji ecjiVarH = ecjj.h();
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f("protodatastore");
        ecfaVar.g("global_variant_prefs.pb");
        ecjiVarH.f(ecfaVar.a());
        ecjiVarH.e(drnr.a);
        this.b = ecjlVar.a(ecjiVarH.a());
        this.d = new drng(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(ekgb ekgbVar) {
        int iA;
        int iA2 = ekis.a(ekgbVar, new ejwm() { // from class: drmm
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((drof) obj).b == 2;
            }
        });
        if (iA2 < 0) {
            return 0;
        }
        drof drofVar = (drof) ekgbVar.get(iA2);
        if (drofVar.b != 2 || (iA = drno.a(((Integer) drofVar.c).intValue())) == 0) {
            return 1;
        }
        return iA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(ekgb ekgbVar) {
        int iA;
        int iA2 = ekis.a(ekgbVar, new ejwm() { // from class: drmk
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((drof) obj).b == 1;
            }
        });
        if (iA2 < 0) {
            return 0;
        }
        drof drofVar = (drof) ekgbVar.get(iA2);
        if (drofVar.b != 1 || (iA = droj.a(((Integer) drofVar.c).intValue())) == 0) {
            return 1;
        }
        return iA;
    }

    public final void a(final drnr drnrVar) {
        ejvr ejvrVar = new ejvr() { // from class: drml
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return drnrVar;
            }
        };
        Executor executor = this.c;
        eork.r(eoqt.t(this.b.b(ejvrVar, executor)), new drmo(this, drnrVar), executor);
    }
}
