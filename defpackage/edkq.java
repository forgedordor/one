package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkq extends edjq {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final Bitmap f;

    public edkq(int i, int i2, int i3, int i4, String str, Bitmap bitmap) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = bitmap;
    }

    @Override // defpackage.edjq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.edjq
    public final int b() {
        return this.d;
    }

    @Override // defpackage.edjq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.edjq
    public final int d() {
        return this.a;
    }

    @Override // defpackage.edjq
    public final Bitmap e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edjq) {
            edjq edjqVar = (edjq) obj;
            if (this.a == edjqVar.d() && this.b == edjqVar.a() && this.c == edjqVar.c() && this.d == edjqVar.b() && this.e.equals(edjqVar.f()) && this.f.equals(edjqVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edjq
    public final String f() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "ArtSkinTone{skinTone=" + this.a + ", hue=" + this.b + ", saturation=" + this.c + ", lightness=" + this.d + ", url=" + this.e + ", bitmap=" + this.f.toString() + "}";
    }
}
