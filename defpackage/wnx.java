package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnx implements amwa, wnq {
    private final Uri a;
    private final String b;
    private final double c;
    private final double d;

    public wnx(Uri uri, String str, double d, double d2) {
        this.a = uri;
        this.b = str;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.amwa
    public final double a() {
        return this.c;
    }

    @Override // defpackage.amvr
    public final String b() {
        return "application/vnd.gsma.rcspushlocation+xml";
    }

    @Override // defpackage.amsv
    public final Uri c() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnx)) {
            return false;
        }
        wnx wnxVar = (wnx) obj;
        return fdbq.f(this.a, wnxVar.a) && fdbq.f(this.b, wnxVar.b) && Double.compare(this.c, wnxVar.c) == 0 && Double.compare(this.d, wnxVar.d) == 0;
    }

    @Override // defpackage.amwm
    public final Size f() {
        return new Size(800, 400);
    }

    @Override // defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ athh fn() {
        return null;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    @Override // defpackage.amwa
    public final double h() {
        return this.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + wnw.a(this.c)) * 31) + wnw.a(this.d);
    }

    @Override // defpackage.amwm
    public final /* bridge */ /* synthetic */ String l() {
        return null;
    }

    @Override // defpackage.amwa
    public final String m() {
        return this.b;
    }

    public final String toString() {
        double d = this.d;
        String str = this.b;
        return "MapiRichLocationContent(uri=" + cqcy.d(this.a) + ", captionText=" + ((Object) cqcy.c(str)) + ", longitude=" + ((Object) cqcy.c(String.valueOf(d))) + ", latitude=" + ((Object) cqcy.c(String.valueOf(this.c))) + ")";
    }
}
