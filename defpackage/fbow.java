package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbow extends fbsk {
    protected fbow() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.fbsj a() throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbow.a():fbsj");
    }

    public abstract fbsk b();

    @Override // defpackage.fbsk
    public final void c(fbso fbsoVar) {
        fbsk fbskVarB = b();
        fbsoVar.getClass();
        ((fcly) fbskVarB).f.add(fbsoVar);
    }

    public final void d(fbmx fbmxVar) {
        fbsk fbskVarB = b();
        fbmxVar.getClass();
        HashMap map = ((fcly) fbskVarB).d.a;
        fbst fbstVarN = fbmxVar.n();
        map.put(fbstVarN.a.a, fbstVarN);
    }

    public final void e(Executor executor) {
        ((fcly) b()).j = executor != null ? new fcdj(executor) : fcly.b;
    }

    public final void f(fbpc fbpcVar) {
        fbsk fbskVarB = b();
        if (fbpcVar == null) {
            fbpcVar = fcly.c;
        }
        ((fcly) fbskVarB).i = fbpcVar;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("delegate", b());
        return ejwfVarB.toString();
    }
}
