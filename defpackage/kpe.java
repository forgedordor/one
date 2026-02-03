package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kpe implements iwc {
    public final kow a;
    public final fdap b;
    private final Object c;

    public kpe(kow kowVar, fdap fdapVar) {
        this.a = kowVar;
        this.b = fdapVar;
        this.c = kowVar.a;
    }

    @Override // defpackage.iwc
    public final Object e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kpe)) {
            return false;
        }
        kpe kpeVar = (kpe) obj;
        return fdbq.f(this.a.a, kpeVar.a.a) && this.b == kpeVar.b;
    }

    public final int hashCode() {
        return (this.a.a.hashCode() * 31) + this.b.hashCode();
    }
}
