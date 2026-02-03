package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekka {
    boolean a;
    int b = -1;
    int c = -1;
    ekkp d;
    ekkp e;
    ejvp f;

    final int a() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    final int b() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    final ekkp c() {
        return (ekkp) ejwg.c(this.d, ekkp.STRONG);
    }

    final ekkp d() {
        return (ekkp) ejwg.c(this.e, ekkp.STRONG);
    }

    public final ConcurrentMap e() {
        if (!this.a) {
            return new ConcurrentHashMap(b(), 0.75f, a());
        }
        int i = eklm.k;
        ekkp ekkpVarC = c();
        ekkp ekkpVar = ekkp.STRONG;
        if (ekkpVarC == ekkpVar && d() == ekkpVar) {
            return new eklm(this, ekkq.a);
        }
        if (c() == ekkpVar && d() == ekkp.WEAK) {
            return new eklm(this, ekku.a);
        }
        ekkp ekkpVarC2 = c();
        ekkp ekkpVar2 = ekkp.WEAK;
        if (ekkpVarC2 == ekkpVar2 && d() == ekkpVar) {
            return new eklm(this, ekla.a);
        }
        if (c() == ekkpVar2 && d() == ekkpVar2) {
            return new eklm(this, ekle.a);
        }
        throw new AssertionError();
    }

    public final void f(ekkp ekkpVar) {
        ekkp ekkpVar2 = this.e;
        ejwl.p(ekkpVar2 == null, "Value strength was already set to %s", ekkpVar2);
        ekkpVar.getClass();
        this.e = ekkpVar;
        if (ekkpVar != ekkp.STRONG) {
            this.a = true;
        }
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        int i = this.b;
        if (i != -1) {
            ejwfVarB.f("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            ejwfVarB.f("concurrencyLevel", i2);
        }
        ekkp ekkpVar = this.d;
        if (ekkpVar != null) {
            ejwfVarB.b("keyStrength", ejuf.c(ekkpVar.toString()));
        }
        ekkp ekkpVar2 = this.e;
        if (ekkpVar2 != null) {
            ejwfVarB.b("valueStrength", ejuf.c(ekkpVar2.toString()));
        }
        if (this.f != null) {
            ejwfVarB.a("keyEquivalence");
        }
        return ejwfVarB.toString();
    }
}
