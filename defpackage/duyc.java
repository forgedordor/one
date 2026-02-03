package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyc implements duwe {
    private final ejxr a;
    private final Executor b;

    public duyc(duyb duybVar) {
        this.b = duybVar.b;
        this.a = duybVar.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.duwe
    public final ListenableFuture a(final List list) {
        ?? r0 = this.a.get();
        ejvr ejvrVar = new ejvr() { // from class: duxy
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0216, code lost:
            
                r3.add(r7);
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r26) {
                /*
                    Method dump skipped, instructions count: 650
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.duxy.apply(java.lang.Object):java.lang.Object");
            }
        };
        Executor executor = this.b;
        return eika.j(eika.j(r0, ejvrVar, executor), new ejvr() { // from class: duxz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list2 = (List) obj;
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                for (dtnq dtnqVar : list) {
                    Iterator it = ejxk.d(":").a().g(dtnqVar.c).iterator();
                    if (it.hasNext() && list2.contains(it.next())) {
                        ekfwVar.h(dtnqVar);
                    }
                }
                return ekfwVar.g();
            }
        }, executor);
    }
}
