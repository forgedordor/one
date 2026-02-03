package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhb extends bha {
    private final bmv a;
    private final int b;
    private final Size c;
    private final azv d;
    private final List e;
    private final bjq f;
    private final Range g;
    private final Range h;

    public bhb(bmv bmvVar, int i, Size size, azv azvVar, List list, bjq bjqVar, Range range, Range range2) {
        this.a = bmvVar;
        this.b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size;
        if (azvVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.d = azvVar;
        this.e = list;
        this.f = bjqVar;
        this.g = range;
        this.h = range2;
    }

    @Override // defpackage.bha
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bha
    public final Range b() {
        return this.g;
    }

    @Override // defpackage.bha
    public final Range c() {
        return this.h;
    }

    @Override // defpackage.bha
    public final Size d() {
        return this.c;
    }

    @Override // defpackage.bha
    public final azv e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        bjq bjqVar;
        Range range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bha) {
            bha bhaVar = (bha) obj;
            if (this.a.equals(bhaVar.h()) && this.b == bhaVar.a() && this.c.equals(bhaVar.d()) && this.d.equals(bhaVar.e()) && this.e.equals(bhaVar.i()) && ((bjqVar = this.f) != null ? bjqVar.equals(bhaVar.f()) : bhaVar.f() == null) && ((range = this.g) != null ? range.equals(bhaVar.b()) : bhaVar.b() == null) && this.h.equals(bhaVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bha
    public final bjq f() {
        return this.f;
    }

    @Override // defpackage.bha
    public final bmv h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        bjq bjqVar = this.f;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bjqVar == null ? 0 : bjqVar.hashCode())) * 1000003;
        Range range = this.g;
        return ((iHashCode2 ^ (range != null ? range.hashCode() : 0)) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.bha
    public final List i() {
        return this.e;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + ", targetHighSpeedFrameRate=" + this.h + "}";
    }
}
