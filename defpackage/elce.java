package defpackage;

import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elce extends ekao {
    final /* synthetic */ Deque a;
    final /* synthetic */ Deque b;
    final /* synthetic */ elcf c;

    public elce(elcf elcfVar, Deque deque, Deque deque2) {
        this.a = deque;
        this.b = deque2;
        this.c = elcfVar;
    }

    @Override // defpackage.ekao
    protected final Object a() {
        elcf elcfVar = this.c;
        Deque deque = this.a;
        while (true) {
            Object objA = elcfVar.a(deque);
            if (objA == null) {
                Deque deque2 = this.b;
                if (!deque2.isEmpty()) {
                    return deque2.pop();
                }
                b();
                return null;
            }
            Iterator it = elcfVar.a.b(objA).iterator();
            if (!it.hasNext()) {
                return objA;
            }
            deque.addFirst(it);
            this.b.push(objA);
        }
    }
}
