package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alh extends asi {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f = false;
    public final Range g;

    public alh(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, Range range) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.g = range;
    }

    @Override // defpackage.asi
    public final int a() {
        return this.b;
    }

    @Override // defpackage.asi
    public final Range b() {
        return this.g;
    }

    @Override // defpackage.asi
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.asi
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.asi
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof asi) {
            asi asiVar = (asi) obj;
            asiVar.h();
            if (this.a == asiVar.c() && this.b == asiVar.a() && this.c == asiVar.e() && this.d == asiVar.f() && this.e == asiVar.d()) {
                asiVar.g();
                Range range = this.g;
                if (range != null ? range.equals(asiVar.b()) : asiVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.asi
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.asi
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        Range range = this.g;
        int iHashCode = range == null ? 0 : range.hashCode();
        int i = true != this.a ? 1237 : 1231;
        int i2 = this.b;
        int i3 = true != this.c ? 1237 : 1231;
        int i4 = ((i ^ (-721379959)) * 1000003) ^ i2;
        return iHashCode ^ (((((((((i4 * 1000003) ^ i3) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        return "FeatureSettings{getCameraMode=0, hasVideoCapture=" + this.a + ", getRequiredMaxBitDepth=" + this.b + ", isPreviewStabilizationOn=" + this.c + ", isUltraHdrOn=" + this.d + ", isHighSpeedOn=" + this.e + ", requiresFeatureComboQuery=false, getTargetFpsRange=" + this.g + "}";
    }

    @Override // defpackage.asi
    public final void h() {
    }
}
