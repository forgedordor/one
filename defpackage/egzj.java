package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egzj extends egzh implements egzo {
    public final Object a = new Object();
    public final Map b = new csq();
    private final ekni c = new ekfg();

    private final void f(Object obj, egzn egznVar) {
        ekhg ekhgVar = new ekhg();
        Map map = this.b;
        ekhj ekhjVar = (ekhj) map.get(obj);
        if (ekhjVar != null) {
            ekhgVar.b(ekhjVar);
        }
        ekhgVar.c(egznVar);
        map.put(obj, ekhgVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g(java.lang.Object r7, defpackage.egzn r8) {
        /*
            r6 = this;
            java.util.Map r0 = r6.b
            java.lang.Object r1 = r0.get(r7)
            ekhj r1 = (defpackage.ekhj) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r3
        Lf:
            java.lang.String r5 = "Failed to remove a subscription key. State is corrupted."
            defpackage.ejwl.m(r4, r5)
            ekhg r4 = new ekhg
            r4.<init>()
            r4.b(r1)
            int r1 = r1.b(r8)
            int r1 = r1 + (-1)
            eknt r5 = r4.a
            r5.getClass()
            if (r1 != 0) goto L39
            boolean r1 = r4.c
            if (r1 != 0) goto L38
            eknu r1 = new eknu
            r1.<init>(r5)
            r4.a = r1
            r4.c = r2
            r1 = r3
            goto L46
        L38:
            r1 = r3
        L39:
            boolean r2 = r4.b
            if (r2 == 0) goto L46
            eknt r2 = new eknt
            r2.<init>(r5)
            r4.a = r2
            r4.c = r3
        L46:
            r4.b = r3
            r8.getClass()
            if (r1 != 0) goto L57
            eknt r1 = r4.a
            int r2 = defpackage.ekfh.b(r8)
            r1.f(r8, r2)
            goto L5c
        L57:
            eknt r2 = r4.a
            r2.p(r8, r1)
        L5c:
            ekhj r8 = r4.a()
            r0.put(r7, r8)
            java.lang.Object r8 = r0.get(r7)
            ekhj r8 = (defpackage.ekhj) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L72
            r0.remove(r7)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egzj.g(java.lang.Object, egzn):void");
    }

    private final boolean h(egzl egzlVar) {
        return this.c.a(egzlVar, 1) == 0;
    }

    private final boolean i(egzl egzlVar) {
        int iD = this.c.d(egzlVar, 1);
        ejwl.l(iD > 0);
        return iD == 1;
    }

    @Override // defpackage.egzh
    public final void a(ListenableFuture listenableFuture, Object obj) {
        c(listenableFuture, obj, egzm.a, ejud.a, eoqg.a);
    }

    @Override // defpackage.egzh
    public final void b(ListenableFuture listenableFuture, Object obj) {
        c(listenableFuture, obj, egzm.b, ejud.a, eoqg.a);
    }

    public final void c(ListenableFuture listenableFuture, Object obj, egzm egzmVar, ejwi ejwiVar, Executor executor) {
        eiiy.e();
        eork.r(listenableFuture, eiid.h(new egzi(this, obj, egzmVar, ejwiVar)), executor);
    }

    @Override // defpackage.egzo
    public final void d(Object obj, egzn egznVar) {
        ecem.c();
        obj.getClass();
        css cssVar = new css();
        synchronized (this.a) {
            if (obj instanceof egyk) {
                ekqg ekqgVarListIterator = ((egyk) obj).a().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    Object next = ekqgVarListIterator.next();
                    f(next, egznVar);
                    if (next instanceof egzl) {
                        egzl egzlVar = (egzl) next;
                        if (h(egzlVar)) {
                            cssVar.add(egzlVar);
                        }
                    }
                }
            } else {
                f(obj, egznVar);
                if (obj instanceof egzl) {
                    egzl egzlVar2 = (egzl) obj;
                    if (h(egzlVar2)) {
                        cssVar.add(egzlVar2);
                    }
                }
            }
        }
        csr csrVar = new csr(cssVar);
        while (csrVar.hasNext()) {
            ((egzl) csrVar.next()).a();
        }
    }

    @Override // defpackage.egzo
    public final void e(Object obj, egzn egznVar) {
        ecem.c();
        obj.getClass();
        css cssVar = new css();
        synchronized (this.a) {
            if (obj instanceof egyk) {
                ekqg ekqgVarListIterator = ((egyk) obj).a().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    Object next = ekqgVarListIterator.next();
                    g(next, egznVar);
                    if (next instanceof egzl) {
                        egzl egzlVar = (egzl) next;
                        if (i(egzlVar)) {
                            cssVar.add(egzlVar);
                        }
                    }
                }
            } else {
                g(obj, egznVar);
                if (obj instanceof egzl) {
                    egzl egzlVar2 = (egzl) obj;
                    if (i(egzlVar2)) {
                        cssVar.add(egzlVar2);
                    }
                }
            }
        }
        csr csrVar = new csr(cssVar);
        while (csrVar.hasNext()) {
            ((egzl) csrVar.next()).b();
        }
    }
}
