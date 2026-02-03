package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class basa {
    public final long a;

    public basa(long j) {
        this.a = j;
    }

    public final boolean a(cefn cefnVar) {
        return (this.a & cefnVar.a()) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof basa) && this.a == ((basa) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }
}
