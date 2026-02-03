package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amte extends amue {
    public final String a;
    public final Uri b;
    public final Optional c;
    public final Uri d;
    public final amyb e;
    private final Size f;
    private final long g;
    private final boolean h;
    private final String i;
    private final Uri j;
    private final amvx k;

    public amte(String str, Uri uri, Size size, Optional optional, long j, boolean z, Uri uri2, amyb amybVar, String str2, Uri uri3, amvx amvxVar) {
        this.a = str;
        this.b = uri;
        this.f = size;
        this.c = optional;
        this.g = j;
        this.h = z;
        this.d = uri2;
        this.e = amybVar;
        this.i = str2;
        this.j = uri3;
        this.k = amvxVar;
    }

    @Override // defpackage.amvy
    public final long a() {
        return this.g;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amue, defpackage.amsv
    public final Uri c() {
        return this.d;
    }

    @Override // defpackage.amue, defpackage.amvy
    public final Uri d() {
        return this.j;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amue) {
            amue amueVar = (amue) obj;
            if (this.a.equals(amueVar.b()) && this.b.equals(amueVar.e()) && this.f.equals(amueVar.f()) && this.c.equals(amueVar.k()) && this.g == amueVar.a() && this.h == amueVar.m()) {
                amueVar.n();
                Uri uri = this.d;
                if (uri != null ? uri.equals(amueVar.c()) : amueVar.c() == null) {
                    amyb amybVar = this.e;
                    if (amybVar != null ? amybVar.equals(amueVar.fm()) : amueVar.fm() == null) {
                        String str = this.i;
                        if (str != null ? str.equals(amueVar.l()) : amueVar.l() == null) {
                            Uri uri2 = this.j;
                            if (uri2 != null ? uri2.equals(amueVar.d()) : amueVar.d() == null) {
                                if (this.k.equals(amueVar.h())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.amwm
    public final Size f() {
        return this.f;
    }

    @Override // defpackage.amue, defpackage.amsv
    public final amyb fm() {
        return this.e;
    }

    @Override // defpackage.amue, defpackage.amvy
    public final amvx h() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode();
        Uri uri = this.d;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        long j = this.g;
        int i = ((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ iHashCode2) * 1000003;
        amyb amybVar = this.e;
        int iHashCode3 = (i ^ (amybVar == null ? 0 : amybVar.hashCode())) * 1000003;
        String str = this.i;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Uri uri2 = this.j;
        return ((iHashCode4 ^ (uri2 != null ? uri2.hashCode() : 0)) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.amvy
    public final Optional k() {
        return this.c;
    }

    @Override // defpackage.amue, defpackage.amwm
    public final String l() {
        return this.i;
    }

    @Override // defpackage.amvy
    public final boolean m() {
        return this.h;
    }

    @Override // defpackage.amvy
    public final boolean n() {
        return false;
    }

    public final String toString() {
        amvx amvxVar = this.k;
        Uri uri = this.j;
        amyb amybVar = this.e;
        Uri uri2 = this.d;
        Optional optional = this.c;
        Size size = this.f;
        return "BugleImageContent{contentType=" + this.a + ", uri=" + this.b.toString() + ", size=" + size.toString() + ", duration=" + String.valueOf(optional) + ", mediaModifiedTimestamp=" + this.g + ", isResizable=" + this.h + ", saveToExternalStorage=false, originalUri=" + String.valueOf(uri2) + ", progress=" + String.valueOf(amybVar) + ", caption=" + this.i + ", previewUri=" + String.valueOf(uri) + ", displayState=" + amvxVar.toString() + "}";
    }
}
