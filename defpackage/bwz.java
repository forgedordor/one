package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwz extends cax {
    public final bxs a;
    public final int b;
    public final Range c;
    public final int d;

    public bwz(bxs bxsVar, int i, Range range, int i2) {
        this.a = bxsVar;
        this.b = i;
        this.c = range;
        this.d = i2;
    }

    @Override // defpackage.cax
    public final int a() {
        return this.d;
    }

    @Override // defpackage.cax
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cax
    public final Range c() {
        return this.c;
    }

    @Override // defpackage.cax
    public final bxs d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cax) {
            cax caxVar = (cax) obj;
            if (this.a.equals(caxVar.d()) && this.b == caxVar.b() && this.c.equals(caxVar.c()) && this.d == caxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "VideoSpec{qualitySelector=" + this.a + ", encodeFrameRate=" + this.b + ", bitrate=" + this.c + ", aspectRatio=" + this.d + "}";
    }
}
