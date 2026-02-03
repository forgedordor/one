package defpackage;

import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buo extends buz {
    private final EGLSurface a;
    private final int b;
    private final int c;

    public buo(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.buz
    public final int a() {
        return this.c;
    }

    @Override // defpackage.buz
    public final int b() {
        return this.b;
    }

    @Override // defpackage.buz
    public final EGLSurface c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof buz) {
            buz buzVar = (buz) obj;
            if (this.a.equals(buzVar.c()) && this.b == buzVar.b() && this.c == buzVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "OutputSurface{eglSurface=" + this.a + ", width=" + this.b + ", height=" + this.c + "}";
    }
}
