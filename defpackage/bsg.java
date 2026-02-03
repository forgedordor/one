package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsg extends bti {
    public final Object a;
    public final bob b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final bib h;

    public bsg(Object obj, bob bobVar, int i, Size size, Rect rect, int i2, Matrix matrix, bib bibVar) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
        this.b = bobVar;
        this.c = i;
        this.d = size;
        this.e = rect;
        this.f = i2;
        this.g = matrix;
        this.h = bibVar;
    }

    @Override // defpackage.bti
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bti
    public final int b() {
        return this.f;
    }

    @Override // defpackage.bti
    public final Matrix c() {
        return this.g;
    }

    @Override // defpackage.bti
    public final Rect d() {
        return this.e;
    }

    @Override // defpackage.bti
    public final Size e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        bob bobVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bti) {
            bti btiVar = (bti) obj;
            if (this.a.equals(btiVar.h()) && ((bobVar = this.b) != null ? bobVar.equals(btiVar.g()) : btiVar.g() == null) && this.c == btiVar.a() && this.d.equals(btiVar.e()) && this.e.equals(btiVar.d()) && this.f == btiVar.b() && this.g.equals(btiVar.c()) && this.h.equals(btiVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bti
    public final bib f() {
        return this.h;
    }

    @Override // defpackage.bti
    public final bob g() {
        return this.b;
    }

    @Override // defpackage.bti
    public final Object h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        bob bobVar = this.b;
        return (((((((((((((iHashCode * 1000003) ^ (bobVar == null ? 0 : bobVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
