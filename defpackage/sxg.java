package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxg {
    public final svz a;
    public final String b;
    public final Duration c;

    public sxg(svz svzVar, String str, Duration duration) {
        this.a = svzVar;
        this.b = str;
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxg)) {
            return false;
        }
        sxg sxgVar = (sxg) obj;
        return fdbq.f(this.a, sxgVar.a) && fdbq.f(this.b, sxgVar.b) && fdbq.f(this.c, sxgVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TranscriptionSessionInfo(audioInfo=" + this.a + ", finalResult=" + this.b + ", sessionDuration=" + this.c + ")";
    }
}
