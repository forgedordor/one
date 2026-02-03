package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpuh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dpuh(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpuh)) {
            return false;
        }
        dpuh dpuhVar = (dpuh) obj;
        return this.a == dpuhVar.a && this.b == dpuhVar.b && this.c == dpuhVar.c && this.d == dpuhVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "ExoPlayerConfiguration(minBufferMs=" + this.a + ", maxBufferMs=" + this.b + ", bufferForPlaybackMs=" + this.c + ", bufferForPlaybackAfterRebufferMs=" + this.d + ")";
    }
}
