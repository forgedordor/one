package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayu extends bdn {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public ayu(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.e = matrix;
        this.f = z2;
    }

    @Override // defpackage.bdn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bdn
    public final int b() {
        return this.c;
    }

    @Override // defpackage.bdn
    public final Matrix c() {
        return this.e;
    }

    @Override // defpackage.bdn
    public final Rect d() {
        return this.a;
    }

    @Override // defpackage.bdn
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdn) {
            bdn bdnVar = (bdn) obj;
            if (this.a.equals(bdnVar.d()) && this.b == bdnVar.a() && this.c == bdnVar.b() && this.d == bdnVar.e() && this.e.equals(bdnVar.c()) && this.f == bdnVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdn
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return (((((((((iHashCode * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true == this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.c + ", hasCameraTransform=" + this.d + ", getSensorToBufferTransform=" + this.e + ", isMirroring=" + this.f + "}";
    }
}
