package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayr extends bcs {
    public final Size a;
    public final Rect b;
    public final biu c;
    public final int d;
    public final boolean e;

    public ayr(Size size, Rect rect, biu biuVar, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.a = size;
        this.b = rect;
        this.c = biuVar;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.bcs
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bcs
    public final Rect b() {
        return this.b;
    }

    @Override // defpackage.bcs
    public final Size c() {
        return this.a;
    }

    @Override // defpackage.bcs
    public final biu d() {
        return this.c;
    }

    @Override // defpackage.bcs
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        biu biuVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcs) {
            bcs bcsVar = (bcs) obj;
            if (this.a.equals(bcsVar.c()) && this.b.equals(bcsVar.b()) && ((biuVar = this.c) != null ? biuVar.equals(bcsVar.d()) : bcsVar.d() == null) && this.d == bcsVar.a() && this.e == bcsVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        biu biuVar = this.c;
        return (((((iHashCode * 1000003) ^ (biuVar == null ? 0 : biuVar.hashCode())) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.a + ", inputCropRect=" + this.b + ", cameraInternal=" + this.c + ", rotationDegrees=" + this.d + ", mirroring=" + this.e + "}";
    }
}
