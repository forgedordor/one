package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmmb {
    public final domv a;
    public final Duration b;
    public final azg c;
    public final Duration d;
    public final int e;
    public final dmrm f;
    public final dmma g;

    public /* synthetic */ dmmb(domv domvVar, azg azgVar, Duration duration, int i, dmrm dmrmVar, dmma dmmaVar, int i2) {
        Duration durationG = (i2 & 2) != 0 ? eoob.g(30) : null;
        azgVar = (i2 & 4) != 0 ? azg.b : azgVar;
        duration = (i2 & 8) != 0 ? eoob.g(3) : duration;
        i = (i2 & 16) != 0 ? 20 : i;
        dmrmVar = (i2 & 32) != 0 ? null : dmrmVar;
        durationG.getClass();
        azgVar.getClass();
        duration.getClass();
        this.a = domvVar;
        this.b = durationG;
        this.c = azgVar;
        this.d = duration;
        this.e = i;
        this.f = dmrmVar;
        this.g = dmmaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmmb)) {
            return false;
        }
        dmmb dmmbVar = (dmmb) obj;
        return fdbq.f(this.a, dmmbVar.a) && fdbq.f(this.b, dmmbVar.b) && fdbq.f(this.c, dmmbVar.c) && fdbq.f(this.d, dmmbVar.d) && this.e == dmmbVar.e && fdbq.f(this.f, dmmbVar.f) && fdbq.f(this.g, dmmbVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dmrm dmrmVar = this.f;
        return (((((iHashCode * 31) + this.e) * 31) + (dmrmVar == null ? 0 : dmrmVar.hashCode())) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "CameraManagerConfiguration(outputFileProvider=" + this.a + ", maxVideoRecordingDuration=" + this.b + ", cameraSelector=" + this.c + ", maxGifRecordingDuration=" + this.d + ", gifRecordingQuality=" + this.e + ", cameraEffectsConfiguration=" + this.f + ", flags=" + this.g + ")";
    }
}
