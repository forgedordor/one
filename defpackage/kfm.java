package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfm {
    public final juo a;
    public final kel b;

    public kfm(juo juoVar, kel kelVar) {
        this.a = juoVar;
        this.b = kelVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfm)) {
            return false;
        }
        kfm kfmVar = (kfm) obj;
        return fdbq.f(this.a, kfmVar.a) && fdbq.f(this.b, kfmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
