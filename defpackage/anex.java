package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anex implements ajmb {
    private final String a;
    private final Uri d;
    private final String e;
    private final Uri f;
    private final boolean i;
    private final String b = null;
    private final String c = null;
    private final boolean g = false;
    private final boolean h = false;
    private final boolean j = false;

    public anex(String str, Uri uri, String str2, Uri uri2, boolean z) {
        this.a = str;
        this.d = uri;
        this.e = str2;
        this.f = uri2;
        this.i = z;
    }

    @Override // defpackage.ajmb
    public final Uri a() {
        return this.d;
    }

    @Override // defpackage.ajmb
    public final Uri b() {
        return this.f;
    }

    @Override // defpackage.ajmb
    public final String c() {
        return this.e;
    }

    @Override // defpackage.ajmb
    public final String d() {
        return null;
    }

    @Override // defpackage.ajmb
    public final String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anex)) {
            return false;
        }
        anex anexVar = (anex) obj;
        if (!fdbq.f(this.a, anexVar.a)) {
            return false;
        }
        String str = anexVar.b;
        if (!fdbq.f(null, null)) {
            return false;
        }
        String str2 = anexVar.c;
        if (!fdbq.f(null, null) || !fdbq.f(this.d, anexVar.d) || !fdbq.f(this.e, anexVar.e) || !fdbq.f(this.f, anexVar.f)) {
            return false;
        }
        boolean z = anexVar.g;
        boolean z2 = anexVar.h;
        if (this.i != anexVar.i) {
            return false;
        }
        boolean z3 = anexVar.j;
        return true;
    }

    @Override // defpackage.ajmb
    public final String f() {
        return this.a;
    }

    @Override // defpackage.ajmb
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ajmb
    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.d;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        int i = iHashCode * 29791;
        String str2 = this.e;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int i2 = i + iHashCode2;
        Uri uri2 = this.f;
        return (((((((((((i2 * 31) + iHashCode3) * 31) + (uri2 == null ? 0 : uri2.hashCode())) * 31) + anew.a(false)) * 31) + anew.a(false)) * 31) + anew.a(this.i)) * 31) + anew.a(false);
    }

    @Override // defpackage.ajmb
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ajmb
    public final boolean j() {
        return false;
    }

    public final String toString() {
        return "BugleMessagePreview(linkTitle=" + this.a + ", linkDescription=null, linkDomain=null, linkImageUrl=" + this.d + ", linkCanonicalUrlString=" + this.e + ", linkTargetUrl=" + this.f + ", linkPreviewPrevented=false, linkPreviewFailed=false, isExpired=" + this.i + ", isDeferred=false)";
    }
}
