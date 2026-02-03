package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmcd {
    public final Duration a;
    public final fdae b;
    public final Integer c;
    public final Integer d;
    private final boolean e = true;

    public dmcd(Duration duration, fdae fdaeVar, Integer num, Integer num2) {
        this.a = duration;
        this.b = fdaeVar;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmcd)) {
            return false;
        }
        dmcd dmcdVar = (dmcd) obj;
        if (!fdbq.f(this.a, dmcdVar.a) || !fdbq.f(this.b, dmcdVar.b) || !fdbq.f(this.c, dmcdVar.c) || !fdbq.f(this.d, dmcdVar.d)) {
            return false;
        }
        boolean z = dmcdVar.e;
        return true;
    }

    public final int hashCode() {
        Duration duration = this.a;
        return ((((((((duration == null ? 0 : duration.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "PopupCameraConfiguration(countdownDuration=" + this.a + ", outputBitmapSizeProvider=" + this.b + ", recordingStartedSound=" + this.c + ", recordingStoppedSound=" + this.d + ", enablePopupCameraPlaybackBottomMarginFix=true)";
    }
}
