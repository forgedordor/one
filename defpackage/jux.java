package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jux extends juy {
    public final String a;
    public final jyj b;

    public jux(String str, jyj jyjVar) {
        this.a = str;
        this.b = jyjVar;
    }

    @Override // defpackage.juy
    public final jyj a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jux)) {
            return false;
        }
        jux juxVar = (jux) obj;
        return fdbq.f(this.a, juxVar.a) && fdbq.f(this.b, juxVar.b) && fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jyj jyjVar = this.b;
        return (iHashCode + (jyjVar != null ? jyjVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ')';
    }

    @Override // defpackage.juy
    public final void b() {
    }
}
