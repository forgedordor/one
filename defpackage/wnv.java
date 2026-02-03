package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnv implements amvy, wnq {
    public final boolean a;
    public final boolean b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final Size f;
    private final String g;
    private final Instant h;
    private final athh i;
    private final amvx j;

    public wnv(String str, Uri uri, Uri uri2, Size size, String str2, Instant instant, boolean z, boolean z2, athh athhVar, amvx amvxVar) {
        str.getClass();
        amvxVar.getClass();
        this.c = str;
        this.d = uri;
        this.e = uri2;
        this.f = size;
        this.g = str2;
        this.h = instant;
        this.a = z;
        this.b = z2;
        this.i = athhVar;
        this.j = amvxVar;
    }

    @Override // defpackage.amvy
    public final long a() {
        return this.h.toEpochMilli();
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.c;
    }

    @Override // defpackage.amsv
    public final Uri c() {
        return this.e;
    }

    @Override // defpackage.amvy
    public final /* bridge */ /* synthetic */ Uri d() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnv)) {
            return false;
        }
        wnv wnvVar = (wnv) obj;
        return fdbq.f(this.c, wnvVar.c) && fdbq.f(this.d, wnvVar.d) && fdbq.f(this.e, wnvVar.e) && fdbq.f(this.f, wnvVar.f) && fdbq.f(this.g, wnvVar.g) && fdbq.f(this.h, wnvVar.h) && this.a == wnvVar.a && this.b == wnvVar.b && fdbq.f(this.i, wnvVar.i) && this.j == wnvVar.j;
    }

    @Override // defpackage.amwm
    public final Size f() {
        return this.f;
    }

    @Override // defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.amsv
    public final athh fn() {
        return this.i;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    @Override // defpackage.amvy
    public final amvx h() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        Uri uri = this.e;
        int iHashCode2 = ((((iHashCode * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.h.hashCode()) * 31) + wnu.a(this.a)) * 31) + wnu.a(this.b)) * 31;
        athh athhVar = this.i;
        return ((iHashCode3 + (athhVar != null ? athhVar.hashCode() : 0)) * 31) + this.j.hashCode();
    }

    @Override // defpackage.amvy
    public final Optional k() {
        return Optional.empty();
    }

    @Override // defpackage.amwm
    public final String l() {
        return this.g;
    }

    @Override // defpackage.amvy
    public final boolean m() {
        return this.a;
    }

    @Override // defpackage.amvy
    public final boolean n() {
        return this.b;
    }

    public final String toString() {
        Uri uri = this.e;
        String strD = cqcy.d(this.d);
        String strD2 = uri != null ? cqcy.d(uri) : null;
        Size size = this.f;
        String str = this.g;
        CharSequence charSequenceC = str != null ? cqcy.c(str) : null;
        return "MapiImageContent(contentType=" + this.c + ", uri=" + strD + ", originalUri=" + strD2 + ", size=" + size + ", caption=" + ((Object) charSequenceC) + ", mediaModifiedTimestamp=" + this.h + ", isResizable=" + this.a + ", saveToExternalStorage=" + this.b + "(), processingId=" + this.i + ")";
    }
}
