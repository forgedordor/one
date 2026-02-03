package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpm implements cjpl {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public cjpm(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    private final cmmb c() {
        return ((cmlb) this.a.b()).a();
    }

    private final List d(String str) {
        return ((aqsr) this.c.b()).a() ? new evsz(((cebq) this.b.b()).c(str).i, etsz.b) : new evsz(((cebq) this.b.b()).c(str).h, etsz.a);
    }

    private static final boolean e(cmmb cmmbVar, String str) {
        return fdbq.f(cmmbVar.c, str);
    }

    @Override // defpackage.cjpl
    public final boolean a(dggn dggnVar) {
        if (!((aqsq) this.d.b()).a()) {
            return false;
        }
        List listD = d(dggo.a(dggnVar).a);
        if (!listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((etsu) it.next()) == etsu.SIM_ROLE_MULTI_SIM_DISABLED) {
                    if (!e(c(), dggo.a(dggnVar).a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[RETURN] */
    @Override // defpackage.cjpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dggn r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpm.b(dggn):int");
    }
}
