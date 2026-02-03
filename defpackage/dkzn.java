package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzn implements dkzp {
    public final String a;
    public final String b;
    public final dkzw c;

    public dkzn(String str, String str2, dkzw dkzwVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = dkzwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkzn)) {
            return false;
        }
        dkzn dkznVar = (dkzn) obj;
        return fdbq.f(this.a, dkznVar.a) && fdbq.f(this.b, dkznVar.b) && fdbq.f(this.c, dkznVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dkzw dkzwVar = this.c;
        return (iHashCode * 31) + (dkzwVar == null ? 0 : dkzwVar.hashCode());
    }

    public final String toString() {
        return "Full(title=" + this.a + ", description=" + this.b + ", thumbnail=" + this.c + ")";
    }

    public /* synthetic */ dkzn(String str, String str2) {
        this(str, str2, null);
    }
}
