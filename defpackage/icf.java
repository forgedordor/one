package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icf implements ics {
    public final ics a;
    public final ics b;

    public icf(ics icsVar, ics icsVar2) {
        this.a = icsVar;
        this.b = icsVar2;
    }

    @Override // defpackage.ics
    public final /* synthetic */ ics a(ics icsVar) {
        return icn.a(this, icsVar);
    }

    @Override // defpackage.ics
    public final Object b(Object obj, fdat fdatVar) {
        return this.b.b(this.a.b(obj, fdatVar), fdatVar);
    }

    @Override // defpackage.ics
    public final boolean c(fdap fdapVar) {
        return this.a.c(fdapVar) && this.b.c(fdapVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof icf)) {
            return false;
        }
        icf icfVar = (icf) obj;
        return fdbq.f(this.a, icfVar.a) && fdbq.f(this.b, icfVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "[" + ((String) b("", ice.a)) + ']';
    }
}
