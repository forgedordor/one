package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkny {
    public final dkzd a;
    public final dknx b;
    public final fdae c;

    public dkny(dkzd dkzdVar, dknx dknxVar, fdae fdaeVar) {
        this.a = dkzdVar;
        this.b = dknxVar;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkny)) {
            return false;
        }
        dkny dknyVar = (dkny) obj;
        return fdbq.f(this.a, dknyVar.a) && fdbq.f(this.b, dknyVar.b) && fdbq.f(this.c, dknyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionsBarPopupUiData(content=" + this.a + ", positioning=" + this.b + ", onDismissRequest=" + this.c + ")";
    }
}
