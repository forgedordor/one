package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wns implements amvp, wnq {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final String d;
    private final long e;
    private final athh f;

    public wns(String str, Uri uri, String str2, long j, athh athhVar) {
        str.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = str2;
        this.e = j;
        this.f = athhVar;
    }

    @Override // defpackage.amvp
    public final long a() {
        return this.e;
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
        if (!(obj instanceof wns)) {
            return false;
        }
        wns wnsVar = (wns) obj;
        if (!fdbq.f(this.a, wnsVar.a) || !fdbq.f(this.b, wnsVar.b)) {
            return false;
        }
        Uri uri = wnsVar.c;
        return fdbq.f(null, null) && fdbq.f(this.d, wnsVar.d) && this.e == wnsVar.e && fdbq.f(this.f, wnsVar.f);
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

    @Override // defpackage.amvp
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode();
        athh athhVar = this.f;
        int iHashCode2 = athhVar == null ? 0 : athhVar.hashCode();
        long j = this.e;
        return (((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2;
    }

    public final String toString() {
        String str = this.d;
        return "MapiFileContent(contentType=" + this.a + ", uri=" + cqcy.d(this.b) + ", originalUri=null, fileName=" + ((Object) cqcy.c(str)) + ", fileSize=" + this.e + ", processingId=" + this.f + ")";
    }
}
