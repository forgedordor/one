package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctqe implements ctqg {
    public final String a;
    public final String b;
    public final fdae c;
    public final ctrb d;

    public ctqe(String str, String str2, fdae fdaeVar, ctrb ctrbVar) {
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
        this.d = ctrbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctqe)) {
            return false;
        }
        ctqe ctqeVar = (ctqe) obj;
        return fdbq.f(this.a, ctqeVar.a) && fdbq.f(this.b, ctqeVar.b) && fdbq.f(this.c, ctqeVar.c) && fdbq.f(this.d, ctqeVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "BannerEmergencyRowUiData(text=" + this.a + ", buttonText=" + this.b + ", onClick=" + this.c + ", flags=" + this.d + ")";
    }
}
