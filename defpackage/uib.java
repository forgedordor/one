package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uib extends uil {
    private final String a;
    private final Uri b;
    private final elha c;
    private final Size d;
    private final String e;
    private final double f;
    private final double g;

    public uib(String str, Uri uri, elha elhaVar, Size size, String str2, double d, double d2) {
        this.a = str;
        this.b = uri;
        this.c = elhaVar;
        this.d = size;
        this.e = str2;
        this.f = d;
        this.g = d2;
    }

    @Override // defpackage.amwa
    public final double a() {
        return this.g;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.uil, defpackage.amsv
    public final Uri c() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uil) {
            uil uilVar = (uil) obj;
            if (this.a.equals(uilVar.b()) && this.b.equals(uilVar.e()) && this.c.equals(uilVar.j()) && this.d.equals(uilVar.f()) && this.e.equals(uilVar.m()) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(uilVar.h()) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(uilVar.a())) {
                uilVar.c();
                uilVar.fm();
                uilVar.l();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amwm
    public final Size f() {
        return this.d;
    }

    @Override // defpackage.uil, defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.amwa
    public final double h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        double d = this.f;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        double d2 = this.g;
        return ((((iHashCode * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)))) * 583896283;
    }

    @Override // defpackage.uig
    public final elha j() {
        return this.c;
    }

    @Override // defpackage.uil, defpackage.amwm
    public final String l() {
        return null;
    }

    @Override // defpackage.amwa
    public final String m() {
        return this.e;
    }

    public final String toString() {
        Size size = this.d;
        elha elhaVar = this.c;
        return "LocationContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", contentSource=" + elhaVar.toString() + ", size=" + size.toString() + ", captionText=" + this.e + ", longitude=" + this.f + ", latitude=" + this.g + ", originalUri=null, progress=null, caption=null}";
    }
}
