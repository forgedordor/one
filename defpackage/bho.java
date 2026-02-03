package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bho extends bms {
    public final Size a;
    public final Size b;
    public final azv c;
    public final int d;
    public final Range e;
    public final bjq f;
    public final boolean g;

    public bho(Size size, Size size2, azv azvVar, int i, Range range, bjq bjqVar, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = azvVar;
        this.d = i;
        this.e = range;
        this.f = bjqVar;
        this.g = z;
    }

    @Override // defpackage.bms
    public final int a() {
        return this.d;
    }

    @Override // defpackage.bms
    public final Range b() {
        return this.e;
    }

    @Override // defpackage.bms
    public final Size c() {
        return this.b;
    }

    @Override // defpackage.bms
    public final Size d() {
        return this.a;
    }

    @Override // defpackage.bms
    public final azv e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        bjq bjqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bms) {
            bms bmsVar = (bms) obj;
            if (this.a.equals(bmsVar.d()) && this.b.equals(bmsVar.c()) && this.c.equals(bmsVar.e()) && this.d == bmsVar.a() && this.e.equals(bmsVar.b()) && ((bjqVar = this.f) != null ? bjqVar.equals(bmsVar.f()) : bmsVar.f() == null) && this.g == bmsVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bms
    public final bjq f() {
        return this.f;
    }

    @Override // defpackage.bms
    public final bmr g() {
        return new bhn(this);
    }

    @Override // defpackage.bms
    public final boolean h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
        bjq bjqVar = this.f;
        return (((iHashCode * 1000003) ^ (bjqVar == null ? 0 : bjqVar.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.a + ", originalConfiguredResolution=" + this.b + ", dynamicRange=" + this.c + ", sessionType=" + this.d + ", expectedFrameRateRange=" + this.e + ", implementationOptions=" + this.f + ", zslDisabled=" + this.g + "}";
    }
}
