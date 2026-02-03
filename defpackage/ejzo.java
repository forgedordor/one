package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ejzo<K, V> extends ejyp<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    final ejzs b;
    final ejzs c;
    final ejvp d;
    final ejvp e;
    final long f;
    final long g;
    final long h;
    final int i;
    final ejya j;
    final ejyn k;
    transient ejye l;
    final ejyj m;
    final ejyi n;

    public ejzo(ekak ekakVar) {
        ejzs ejzsVar = ekakVar.j;
        ejzs ejzsVar2 = ekakVar.k;
        ejvp ejvpVar = ekakVar.h;
        ejvp ejvpVar2 = ekakVar.i;
        long j = ekakVar.n;
        long j2 = ekakVar.m;
        long j3 = ekakVar.l;
        ejyj ejyjVar = ekakVar.v;
        int i = ekakVar.g;
        ejyi ejyiVar = ekakVar.w;
        ejya ejyaVar = ekakVar.p;
        ejyn ejynVar = ekakVar.r;
        this.b = ejzsVar;
        this.c = ejzsVar2;
        this.d = ejvpVar;
        this.e = ejvpVar2;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.m = ejyjVar;
        this.i = i;
        this.n = ejyiVar;
        this.j = (ejyaVar == ejya.b || ejyaVar == ejyk.b) ? null : ejyaVar;
        this.k = ejynVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.l = e().a();
    }

    private Object readResolve() {
        return this.l;
    }

    final ejyk e() {
        ejyk ejykVar = new ejyk();
        ejzs ejzsVar = ejykVar.g;
        ejwl.p(ejzsVar == null, "Key strength was already set to %s", ejzsVar);
        ejzs ejzsVar2 = this.b;
        ejzsVar2.getClass();
        ejykVar.g = ejzsVar2;
        ejzs ejzsVar3 = ejykVar.h;
        ejwl.p(ejzsVar3 == null, "Value strength was already set to %s", ejzsVar3);
        ejzs ejzsVar4 = this.c;
        ejzsVar4.getClass();
        ejykVar.h = ejzsVar4;
        ejvp ejvpVar = ejykVar.k;
        ejwl.p(ejvpVar == null, "key equivalence was already set to %s", ejvpVar);
        ejvp ejvpVar2 = this.d;
        ejvpVar2.getClass();
        ejykVar.k = ejvpVar2;
        ejvp ejvpVar3 = ejykVar.l;
        ejwl.p(ejvpVar3 == null, "value equivalence was already set to %s", ejvpVar3);
        ejvp ejvpVar4 = this.e;
        ejvpVar4.getClass();
        ejykVar.l = ejvpVar4;
        int i = ejykVar.d;
        ejwl.n(i == -1, "concurrency level was already set to %s", i);
        int i2 = this.i;
        ejwl.a(i2 > 0);
        ejykVar.d = i2;
        ejwl.l(ejykVar.p == null);
        ejyi ejyiVar = this.n;
        ejyiVar.getClass();
        ejykVar.p = ejyiVar;
        ejykVar.c = false;
        long j = this.f;
        if (j > 0) {
            ejykVar.e(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.g;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j3 = ejykVar.j;
            ejwl.o(j3 == -1, "expireAfterAccess was already set to %s ns", j3);
            ejwl.u(true, j2, timeUnit);
            ejykVar.j = timeUnit.toNanos(j2);
        }
        ejyj ejyjVar = this.m;
        if (ejyjVar != ejyj.a) {
            ejwl.l(ejykVar.o == null);
            if (ejykVar.c) {
                long j4 = ejykVar.e;
                ejwl.o(j4 == -1, "weigher can not be combined with maximum size (%s provided)", j4);
            }
            ejyjVar.getClass();
            ejykVar.o = ejyjVar;
            long j5 = this.h;
            if (j5 != -1) {
                long j6 = ejykVar.f;
                ejwl.o(j6 == -1, "maximum weight was already set to %s", j6);
                long j7 = ejykVar.e;
                ejwl.o(j7 == -1, "maximum size was already set to %s", j7);
                ejwl.b(j5 >= 0, "maximum weight must not be negative");
                ejykVar.f = j5;
            }
        } else {
            long j8 = this.h;
            if (j8 != -1) {
                ejykVar.f(j8);
            }
        }
        ejya ejyaVar = this.j;
        if (ejyaVar != null) {
            ejwl.l(ejykVar.m == null);
            ejykVar.m = ejyaVar;
        }
        return ejykVar;
    }

    @Override // defpackage.ejyp, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.l;
    }
}
