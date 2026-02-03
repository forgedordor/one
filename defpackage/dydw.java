package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydw {
    public static final String a = "dydw";
    public final dydh b;
    private final fr c;
    private final eg d;

    public dydw(fr frVar, dydh dydhVar, eg egVar) {
        this.c = frVar;
        this.b = dydhVar;
        this.d = egVar;
        kc kcVarD = d(frVar);
        if (kcVarD != null && (kcVarD instanceof dzdb)) {
            e((dzdb) kcVarD);
        }
    }

    private static kc d(fr frVar) {
        return (kc) frVar.h(a);
    }

    private final void e(dzdb dzdbVar) {
        ecem.c();
        exbf exbfVar = (exbf) exbg.a.createBuilder();
        exbfVar.copyOnWrite();
        exbg exbgVar = (exbg) exbfVar.instance;
        exbgVar.d = 1;
        exbgVar.b |= 2;
        exbfVar.copyOnWrite();
        exbg exbgVar2 = (exbg) exbfVar.instance;
        exbgVar2.f = 8;
        exbgVar2.b |= 32;
        exbfVar.copyOnWrite();
        exbg exbgVar3 = (exbg) exbfVar.instance;
        exbgVar3.e = 3;
        exbgVar3.b = 8 | exbgVar3.b;
        new dyoh(this.b, dzdbVar, (exbg) exbfVar.build());
    }

    public final dzdb a() {
        ecem.c();
        dzdb dzdbVar = (dzdb) d(this.c);
        if (dzdbVar != null) {
            return dzdbVar;
        }
        dzdb dzdbVar2 = new dzdb();
        Bundle bundle = new Bundle();
        bundle.putBoolean("accountMenuFlavorsStyle", true);
        dzdbVar2.at(bundle);
        e(dzdbVar2);
        return dzdbVar2;
    }

    public final void b() {
        ecem.c();
        c(a());
    }

    public final void c(kc kcVar) {
        ecem.c();
        eg egVar = this.d;
        if ((egVar == null || !egVar.isFinishing()) && !kcVar.aF()) {
            fr frVar = this.c;
            if (frVar.ag()) {
                return;
            }
            kcVar.t(frVar, a);
        }
    }
}
