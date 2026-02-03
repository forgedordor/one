package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvr {
    public static final cqce a = cqce.g("BugleCms", "CloudStoreRequestHeaderFactory");
    private static final eqny d;
    public final aurx b;
    public final eosc c;
    private final Context e;

    static {
        eqnw eqnwVar = (eqnw) eqny.a.createBuilder();
        eqjk eqjkVar = (eqjk) eqjl.a.createBuilder();
        eqjkVar.copyOnWrite();
        ((eqjl) eqjkVar.instance).d = "ANDROID_MESSAGES";
        eqnwVar.copyOnWrite();
        eqny eqnyVar = (eqny) eqnwVar.instance;
        eqjl eqjlVar = (eqjl) eqjkVar.build();
        eqjlVar.getClass();
        eqnyVar.c = eqjlVar;
        eqnyVar.b |= 1;
        d = (eqny) eqnwVar.build();
    }

    public tvr(aurx aurxVar, Context context, eosc eoscVar) {
        this.b = aurxVar;
        this.e = context;
        this.c = eoscVar;
    }

    public final eiju a(final eqnw eqnwVar) {
        return this.b.n().h(new ejvr() { // from class: tvk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cqce cqceVar = tvr.a;
                boolean zIsPresent = optional.isPresent();
                eqnw eqnwVar2 = eqnwVar;
                if (!zIsPresent) {
                    tvr.a.r("Missing device ID in proto store");
                    return eqnwVar2;
                }
                eqjk eqjkVar = (eqjk) eqjl.a.createBuilder();
                eqjkVar.copyOnWrite();
                ((eqjl) eqjkVar.instance).d = "ANDROID_MESSAGES";
                String str = (String) optional.get();
                eqjkVar.copyOnWrite();
                ((eqjl) eqjkVar.instance).b = str;
                eqjl eqjlVar = (eqjl) eqjkVar.build();
                eqnwVar2.copyOnWrite();
                eqny eqnyVar = (eqny) eqnwVar2.instance;
                eqny eqnyVar2 = eqny.a;
                eqjlVar.getClass();
                eqnyVar.c = eqjlVar;
                eqnyVar.b |= 1;
                return eqnwVar2;
            }
        }, this.c);
    }

    public final eiju b(final eqnw eqnwVar) {
        return this.b.k().h(new ejvr() { // from class: tvq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                aurw aurwVar = this.a.b.m;
                auml aumlVarB = auml.b(aumqVar.l);
                if (aumlVarB == null) {
                    aumlVarB = auml.UNSPECIFIED_STATUS;
                }
                eqnw eqnwVar2 = eqnwVar;
                if (aurw.f(aumlVarB)) {
                    eqnwVar2.a(eqkm.FEATURE_TYPE_MULTI_DEVICE);
                    return eqnwVar2;
                }
                auml aumlVarB2 = auml.b(aumqVar.r);
                if (aumlVarB2 == null) {
                    aumlVarB2 = auml.UNSPECIFIED_STATUS;
                }
                if (aurw.f(aumlVarB2)) {
                    eqnwVar2.a(eqkm.FEATURE_TYPE_BACKUP_AND_RESTORE);
                }
                return eqnwVar2;
            }
        }, this.c);
    }

    public final eqnw c() throws PackageManager.NameNotFoundException {
        eqnw eqnwVar = (eqnw) d.toBuilder();
        String string = UUID.randomUUID().toString();
        eqnwVar.copyOnWrite();
        eqny eqnyVar = (eqny) eqnwVar.instance;
        string.getClass();
        eqnyVar.d = string;
        eqjp eqjpVar = (eqjp) eqjq.a.createBuilder();
        eqjpVar.copyOnWrite();
        ((eqjq) eqjpVar.instance).b = "PHONE";
        Context context = this.e;
        String strD = cpge.d(context);
        eqjpVar.copyOnWrite();
        eqjq eqjqVar = (eqjq) eqjpVar.instance;
        strD.getClass();
        eqjqVar.c = strD;
        int iB = cpge.b(context);
        eqjpVar.copyOnWrite();
        ((eqjq) eqjpVar.instance).d = iB;
        int iC = cpge.c(context);
        eqjpVar.copyOnWrite();
        ((eqjq) eqjpVar.instance).e = iC;
        eqjq eqjqVar2 = (eqjq) eqjpVar.build();
        eqnwVar.copyOnWrite();
        eqny eqnyVar2 = (eqny) eqnwVar.instance;
        eqjqVar2.getClass();
        eqnyVar2.e = eqjqVar2;
        eqnyVar2.b |= 2;
        return eqnwVar;
    }

    public final eqny d() {
        return (eqny) c().build();
    }

    public final eiju e(int i) throws PackageManager.NameNotFoundException {
        eqnw eqnwVarC = c();
        eqnwVarC.copyOnWrite();
        eqny eqnyVar = (eqny) eqnwVarC.instance;
        eqny eqnyVar2 = eqny.a;
        eqnyVar.f = eqnx.a(i);
        return b(eqnwVarC).h(new tvo(), this.c);
    }
}
