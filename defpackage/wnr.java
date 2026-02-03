package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnr implements amwb, wnq {
    private final dnvg a;
    private final Uri b;
    private final String c = null;

    public wnr(dnvg dnvgVar, Uri uri) {
        this.a = dnvgVar;
        this.b = uri;
    }

    @Override // defpackage.amwb
    public final String a() {
        return this.a.a;
    }

    @Override // defpackage.amvr
    public final String b() {
        return dogh.a(this.a.e).a();
    }

    @Override // defpackage.amsv
    public final Uri c() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        Uri uri = this.b;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse(this.a.b);
        uri2.getClass();
        return uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnr)) {
            return false;
        }
        wnr wnrVar = (wnr) obj;
        if (!fdbq.f(this.a, wnrVar.a) || !fdbq.f(this.b, wnrVar.b)) {
            return false;
        }
        String str = wnrVar.c;
        return fdbq.f(null, null);
    }

    @Override // defpackage.amwm
    public final Size f() {
        dnvg dnvgVar = this.a;
        return new Size(dnvgVar.g, dnvgVar.h);
    }

    @Override // defpackage.amsv
    public final /* bridge */ /* synthetic */ amyb fm() {
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

    @Override // defpackage.amwb
    public final String g() {
        return "custom_sticker";
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
    }

    @Override // defpackage.amwm
    public final String l() {
        return null;
    }

    public final String toString() {
        Uri uri = this.b;
        String strD = uri != null ? cqcy.d(uri) : null;
        return "MapiCustomStickerContent(sticker=" + this.a + ", copy=" + strD + ", caption=null)";
    }
}
