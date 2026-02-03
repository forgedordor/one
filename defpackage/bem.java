package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bem extends bgv {
    private final Executor b;
    private final bba c;
    private final bbb d;
    private final Rect e;
    private final Matrix f;
    private final int g;
    private final int h;
    private final int i;
    private final List j;

    public bem(Executor executor, bba bbaVar, bbb bbbVar, Rect rect, Matrix matrix, int i, int i2, int i3, List list) {
        this.b = executor;
        this.c = bbaVar;
        this.d = bbbVar;
        this.e = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f = matrix;
        this.g = i;
        this.h = i2;
        this.i = i3;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.j = list;
    }

    @Override // defpackage.bgv
    public final int a() {
        return this.i;
    }

    @Override // defpackage.bgv
    public final int b() {
        return this.h;
    }

    @Override // defpackage.bgv
    public final int c() {
        return this.g;
    }

    @Override // defpackage.bgv
    public final Matrix d() {
        return this.f;
    }

    @Override // defpackage.bgv
    public final Rect e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgv) {
            bgv bgvVar = (bgv) obj;
            if (this.b.equals(bgvVar.i())) {
                bgvVar.j();
                if (this.c.equals(bgvVar.f()) && this.d.equals(bgvVar.g())) {
                    bgvVar.k();
                    if (this.e.equals(bgvVar.e()) && this.f.equals(bgvVar.d()) && this.g == bgvVar.c() && this.h == bgvVar.b() && this.i == bgvVar.a()) {
                        bgvVar.l();
                        if (this.j.equals(bgvVar.h())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bgv
    public final bba f() {
        return this.c;
    }

    @Override // defpackage.bgv
    public final bbb g() {
        return this.d;
    }

    @Override // defpackage.bgv
    public final List h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.b.hashCode() ^ 1000003) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * (-721379959)) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ 1237) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.bgv
    public final Executor i() {
        return this.b;
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=" + this.b + ", inMemoryCallback=null, onDiskCallback=" + this.c + ", outputFileOptions=" + this.d + ", secondaryOutputFileOptions=null, cropRect=" + this.e + ", sensorToBufferTransform=" + this.f + ", rotationDegrees=" + this.g + ", jpegQuality=" + this.h + ", captureMode=" + this.i + ", simultaneousCapture=false, sessionConfigCameraCaptureCallbacks=" + this.j + "}";
    }

    @Override // defpackage.bgv
    public final void j() {
    }

    @Override // defpackage.bgv
    public final void k() {
    }

    @Override // defpackage.bgv
    public final void l() {
    }
}
