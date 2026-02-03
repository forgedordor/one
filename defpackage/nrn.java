package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrn implements mbs {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public nrn(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ mau a() {
        return null;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nrn nrnVar = (nrn) obj;
            if (this.a == nrnVar.a && this.b == nrnVar.b && this.c == nrnVar.c && this.d == nrnVar.d && this.e == nrnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = eone.a(this.a) + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((iA * 31) + eone.a(this.b)) * 31) + eone.a(this.c)) * 31) + eone.a(j2)) * 31) + eone.a(j);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ void b(mbq mbqVar) {
    }
}
