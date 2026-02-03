package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public dqb(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dqb)) {
            return false;
        }
        long j = this.a;
        dqb dqbVar = (dqb) obj;
        long j2 = dqbVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fcts.a(this.b, dqbVar.b) && fcts.a(this.c, dqbVar.c) && fcts.a(this.d, dqbVar.d) && fcts.a(this.e, dqbVar.e);
    }

    public final int hashCode() {
        long j = ije.a;
        int iA = fctr.a(this.a);
        long j2 = this.e;
        long j3 = this.d;
        return (((((((iA * 31) + fctr.a(this.b)) * 31) + fctr.a(this.c)) * 31) + fctr.a(j3)) * 31) + fctr.a(j2);
    }

    public final String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) ije.g(this.a)) + ", textColor=" + ((Object) ije.g(this.b)) + ", iconColor=" + ((Object) ije.g(this.c)) + ", disabledTextColor=" + ((Object) ije.g(this.d)) + ", disabledIconColor=" + ((Object) ije.g(this.e)) + ')';
    }
}
