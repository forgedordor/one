package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnt implements amwm, wnq {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Size d;
    private final String e;
    private final athh f;

    public wnt(String str, Uri uri, Size size, athh athhVar) {
        str.getClass();
        uri.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = size;
        this.e = null;
        this.f = athhVar;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amsv
    public final Uri c() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnt)) {
            return false;
        }
        wnt wntVar = (wnt) obj;
        if (!fdbq.f(this.a, wntVar.a) || !fdbq.f(this.b, wntVar.b)) {
            return false;
        }
        Uri uri = wntVar.c;
        if (!fdbq.f(null, null) || !fdbq.f(this.d, wntVar.d)) {
            return false;
        }
        String str = wntVar.e;
        return fdbq.f(null, null) && fdbq.f(this.f, wntVar.f);
    }

    @Override // defpackage.amwm
    public final Size f() {
        return this.d;
    }

    @Override // defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.amsv
    public final athh fn() {
        return this.f;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode();
        athh athhVar = this.f;
        return (iHashCode * 961) + (athhVar == null ? 0 : athhVar.hashCode());
    }

    @Override // defpackage.amwm
    public final String l() {
        return null;
    }

    public final String toString() {
        return "MapiGifContent(contentType=" + this.a + ", uri=" + cqcy.d(this.b) + ", originalUri=null, size=" + this.d + ", caption=null)";
    }
}
