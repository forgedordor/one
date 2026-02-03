package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdk {
    public static final mdk a = new mdk(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public mdk(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = mgb.Y(i3) ? mgb.o(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdk)) {
            return false;
        }
        mdk mdkVar = (mdk) obj;
        return this.b == mdkVar.b && this.c == mdkVar.c && this.d == mdkVar.d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.b + ", channelCount=" + this.c + ", encoding=" + this.d + "]";
    }

    public mdk(mau mauVar) {
        this(mauVar.H, mauVar.G, mauVar.I);
    }
}
