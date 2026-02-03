package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juw extends juy {
    public final String a;
    public final jyj b;
    public final juz c = null;

    public juw(String str, jyj jyjVar) {
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
        if (!(obj instanceof juw)) {
            return false;
        }
        juw juwVar = (juw) obj;
        if (!fdbq.f(this.a, juwVar.a) || !fdbq.f(this.b, juwVar.b)) {
            return false;
        }
        juz juzVar = juwVar.c;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jyj jyjVar = this.b;
        return (iHashCode + (jyjVar != null ? jyjVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.a + ')';
    }

    @Override // defpackage.juy
    public final void b() {
    }
}
