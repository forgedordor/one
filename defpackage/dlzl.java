package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlzl {
    public final Uri a;
    public final ebsu b;
    public final dogg c;
    public final int d;
    public final int e;
    public final Duration f;
    public final fdat g;
    public final Integer h;
    public final fdat i;
    public final fdau j;
    public final xln k;
    private final int l = 1;

    public dlzl(Uri uri, ebsu ebsuVar, dogg doggVar, int i, int i2, xln xlnVar, Duration duration, fdat fdatVar, Integer num, fdat fdatVar2, fdau fdauVar) {
        this.a = uri;
        this.b = ebsuVar;
        this.c = doggVar;
        this.d = i;
        this.e = i2;
        this.k = xlnVar;
        this.f = duration;
        this.g = fdatVar;
        this.h = num;
        this.i = fdatVar2;
        this.j = fdauVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlzl)) {
            return false;
        }
        dlzl dlzlVar = (dlzl) obj;
        if (!fdbq.f(this.a, dlzlVar.a) || !fdbq.f(this.b, dlzlVar.b) || !fdbq.f(this.c, dlzlVar.c) || this.d != dlzlVar.d) {
            return false;
        }
        int i = dlzlVar.l;
        return this.e == dlzlVar.e && fdbq.f(this.k, dlzlVar.k) && fdbq.f(this.f, dlzlVar.f) && fdbq.f(this.g, dlzlVar.g) && fdbq.f(this.h, dlzlVar.h) && fdbq.f(this.i, dlzlVar.i) && fdbq.f(this.j, dlzlVar.j);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        xln xlnVar = this.k;
        int iHashCode2 = ((((((((iHashCode * 31) + this.d) * 31) + 1) * 31) + this.e) * 31) + (xlnVar == null ? 0 : xlnVar.hashCode())) * 31;
        Duration duration = this.f;
        int iHashCode3 = (((iHashCode2 + (duration == null ? 0 : duration.hashCode())) * 31) + this.g.hashCode()) * 31;
        Integer num = this.h;
        return ((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "AudioRecorderConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", format=" + this.c + ", sampleRate=" + this.d + ", channelCount=1, bitRate=" + this.e + ", recorderEffectFactory=" + this.k + ", maxDuration=" + this.f + ", onMaxDurationReached=" + this.g + ", maxFileSize=" + this.h + ", onMaxFileSizeReached=" + this.i + ", onError=" + this.j + ")";
    }
}
