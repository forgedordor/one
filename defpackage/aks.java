package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aks extends akt implements Iterator {
    akq a;
    akq b;

    public aks(akq akqVar, akq akqVar2) {
        this.a = akqVar2;
        this.b = akqVar;
    }

    private final akq d() {
        akq akqVar = this.b;
        akq akqVar2 = this.a;
        if (akqVar == akqVar2 || akqVar2 == null) {
            return null;
        }
        return b(akqVar);
    }

    public abstract akq a(akq akqVar);

    public abstract akq b(akq akqVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        akq akqVar = this.b;
        this.b = d();
        return akqVar;
    }

    @Override // defpackage.akt
    public final void dI(akq akqVar) {
        if (this.a == akqVar && akqVar == this.b) {
            this.b = null;
            this.a = null;
        }
        akq akqVar2 = this.a;
        if (akqVar2 == akqVar) {
            this.a = a(akqVar2);
        }
        if (this.b == akqVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
