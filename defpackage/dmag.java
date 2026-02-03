package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmag {
    public final Uri a;
    public final ebsu b;
    public final fduj c;
    public final dogg d;
    public final int e;
    public final int f = 1;
    public final int g;
    public final Integer h;
    public final fdap i;
    public final fdat j;

    public dmag(Uri uri, ebsu ebsuVar, fduj fdujVar, dogg doggVar, int i, int i2, Integer num, fdap fdapVar, fdat fdatVar) {
        this.a = uri;
        this.b = ebsuVar;
        this.c = fdujVar;
        this.d = doggVar;
        this.e = i;
        this.g = i2;
        this.h = num;
        this.i = fdapVar;
        this.j = fdatVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmag)) {
            return false;
        }
        dmag dmagVar = (dmag) obj;
        if (!fdbq.f(this.a, dmagVar.a) || !fdbq.f(this.b, dmagVar.b) || !fdbq.f(this.c, dmagVar.c) || !fdbq.f(this.d, dmagVar.d) || this.e != dmagVar.e) {
            return false;
        }
        int i = dmagVar.f;
        return this.g == dmagVar.g && fdbq.f(this.h, dmagVar.h) && fdbq.f(this.i, dmagVar.i) && fdbq.f(this.j, dmagVar.j);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        Integer num = this.h;
        return (((((((((((iHashCode * 31) + this.e) * 31) + 1) * 31) + this.g) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    public final String toString() {
        return "FileAudioSinkConfiguration(outputUri=" + this.a + ", sourcePolicy=" + this.b + ", inputFlow=" + this.c + ", format=" + this.d + ", sampleRate=" + this.e + ", channelCount=1, bitRate=" + this.g + ", maxFileSize=" + this.h + ", onMaxFileSizeReached=" + this.i + ", onError=" + this.j + ")";
    }
}
