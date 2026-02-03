package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwm extends bwj {
    private final int b;
    private final double c;
    private final long d;
    private final Throwable e;

    public bwm(int i, double d, long j, Throwable th) {
        this.b = i;
        this.c = d;
        this.d = j;
        this.e = th;
    }

    @Override // defpackage.bwj
    public final double a() {
        return this.c;
    }

    @Override // defpackage.bwj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bwj
    public final long c() {
        return this.d;
    }

    @Override // defpackage.bwj
    public final Throwable d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwj) {
            bwj bwjVar = (bwj) obj;
            if (this.b == bwjVar.b() && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(bwjVar.a()) && this.d == bwjVar.c() && ((th = this.e) != null ? th.equals(bwjVar.d()) : bwjVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.c;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        Throwable th = this.e;
        int iHashCode = th == null ? 0 : th.hashCode();
        int i = this.b;
        long j = this.d;
        return ((((((int) jDoubleToLongBits) ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ iHashCode;
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.b + ", audioAmplitudeInternal=" + this.c + ", audioBytesRecorded=" + this.d + ", errorCause=" + this.e + "}";
    }
}
