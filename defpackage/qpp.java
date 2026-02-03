package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpp implements qoy, qpq {
    public final boolean a;
    public final qpv b;
    public final qpv c;
    public final qpv d;
    public final int e;
    private final List f = new ArrayList();

    public qpp(quh quhVar, quf qufVar) {
        this.a = qufVar.d;
        this.e = qufVar.e;
        qpv qpvVarA = qufVar.a.a();
        this.b = qpvVarA;
        qpv qpvVarA2 = qufVar.b.a();
        this.c = qpvVarA2;
        qpv qpvVarA3 = qufVar.c.a();
        this.d = qpvVarA3;
        quhVar.k(qpvVarA);
        quhVar.k(qpvVarA2);
        quhVar.k(qpvVarA3);
        qpvVarA.h(this);
        qpvVarA2.h(this);
        qpvVarA3.h(this);
    }

    final void a(qpq qpqVar) {
        this.f.add(qpqVar);
    }

    @Override // defpackage.qpq
    public final void d() {
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                return;
            }
            ((qpq) list.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.qoy
    public final String g() {
        throw null;
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
    }
}
