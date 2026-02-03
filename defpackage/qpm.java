package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpm implements qpq, qoy {
    public final qpv a;
    public qty b;
    private final qof c;

    public qpm(qof qofVar, quh quhVar, qtx qtxVar) {
        this.c = qofVar;
        qpv qpvVarA = qtxVar.a.a();
        this.a = qpvVarA;
        quhVar.k(qpvVarA);
        qpvVarA.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.qpq
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.qoy
    public final String g() {
        throw null;
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
    }
}
