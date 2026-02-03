package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlih {
    public final long a;
    public final long b;
    public final long c;

    public dlih(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlih)) {
            return false;
        }
        dlih dlihVar = (dlih) obj;
        long j = this.a;
        long j2 = dlihVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, dlihVar.b) && fcts.a(this.c, dlihVar.c);
    }

    public final int hashCode() {
        long j = ije.a;
        return (((fctr.a(this.a) * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c);
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.b;
        return "AbcBackgroundColors(background=" + ije.g(this.a) + ", decoration=" + ije.g(j2) + ", decorationAccent=" + ije.g(j) + ")";
    }
}
