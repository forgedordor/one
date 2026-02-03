package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxy implements dkyb {
    public final qrz a;
    public final String b;
    public final fdae c;

    public dkxy(qrz qrzVar, String str, fdae fdaeVar) {
        this.a = qrzVar;
        this.b = str;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkxy)) {
            return false;
        }
        dkxy dkxyVar = (dkxy) obj;
        return fdbq.f(this.a, dkxyVar.a) && fdbq.f(this.b, dkxyVar.b) && fdbq.f(this.c, dkxyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Animation(lottie=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
