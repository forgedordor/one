package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhg extends bki {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public bhg(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
    }

    @Override // defpackage.bki
    public final int a() {
        return this.h;
    }

    @Override // defpackage.bki
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bki
    public final int c() {
        return this.i;
    }

    @Override // defpackage.bki
    public final int d() {
        return this.a;
    }

    @Override // defpackage.bki
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bki) {
            bki bkiVar = (bki) obj;
            if (this.a == bkiVar.d() && this.b.equals(bkiVar.j()) && this.c == bkiVar.b() && this.d == bkiVar.e() && this.e == bkiVar.i() && this.f == bkiVar.g() && this.g == bkiVar.h() && this.h == bkiVar.a() && this.i == bkiVar.c() && this.j == bkiVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bki
    public final int f() {
        return this.j;
    }

    @Override // defpackage.bki
    public final int g() {
        return this.f;
    }

    @Override // defpackage.bki
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j;
    }

    @Override // defpackage.bki
    public final int i() {
        return this.e;
    }

    @Override // defpackage.bki
    public final String j() {
        return this.b;
    }

    public final String toString() {
        return "VideoProfileProxy{codec=" + this.a + ", mediaType=" + this.b + ", bitrate=" + this.c + ", frameRate=" + this.d + ", width=" + this.e + ", height=" + this.f + ", profile=" + this.g + ", bitDepth=" + this.h + ", chromaSubsampling=" + this.i + ", hdrFormat=" + this.j + "}";
    }
}
