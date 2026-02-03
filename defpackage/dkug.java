package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkug {
    public final dkri a;
    public final String b;
    public final fdae c;
    private final String d;
    private final boolean e;

    public dkug(dkri dkriVar, String str, fdae fdaeVar) {
        str.getClass();
        this.a = dkriVar;
        this.d = null;
        this.b = str;
        this.e = true;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkug)) {
            return false;
        }
        dkug dkugVar = (dkug) obj;
        if (!fdbq.f(this.a, dkugVar.a)) {
            return false;
        }
        String str = dkugVar.d;
        if (!fdbq.f(null, null) || !fdbq.f(this.b, dkugVar.b)) {
            return false;
        }
        boolean z = dkugVar.e;
        return fdbq.f(this.c, dkugVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HeaderUiData(monogram=" + this.a + ", title=null, description=" + this.b + ", useLegacyStyle=true, onClick=" + this.c + ")";
    }
}
