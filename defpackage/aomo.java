package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aomo extends aomn {
    public final Duration a;
    public final Duration b;
    public final int c;

    public aomo(int i, Duration duration, Duration duration2) {
        this.c = i;
        if (duration == null) {
            throw new NullPointerException("Null duration");
        }
        this.a = duration;
        if (duration2 == null) {
            throw new NullPointerException("Null position");
        }
        this.b = duration2;
    }

    @Override // defpackage.aomn
    public final Duration a() {
        return this.a;
    }

    @Override // defpackage.aomn
    public final Duration b() {
        return this.b;
    }

    @Override // defpackage.aomn
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aomn) {
            aomn aomnVar = (aomn) obj;
            if (this.c == aomnVar.c() && this.a.equals(aomnVar.a()) && this.b.equals(aomnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? "STOPPED" : "PAUSED" : "PLAYING";
        Duration duration = this.a;
        Duration duration2 = this.b;
        return "AudioAttachmentViewModel{playbackState=" + str + ", duration=" + duration.toString() + ", position=" + duration2.toString() + "}";
    }
}
