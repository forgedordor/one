package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woa implements amvy, wnq {
    public final boolean a;
    public final boolean b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final Size f;
    private final String g;
    private final Duration h;
    private final Instant i;
    private final athh j;

    public woa(String str, Uri uri, Uri uri2, Size size, Duration duration, Instant instant, boolean z, boolean z2, athh athhVar) {
        str.getClass();
        this.c = str;
        this.d = uri;
        this.e = uri2;
        this.f = size;
        this.g = null;
        this.h = duration;
        this.i = instant;
        this.a = z;
        this.b = z2;
        this.j = athhVar;
    }

    @Override // defpackage.amvy
    public final long a() {
        return this.i.toEpochMilli();
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
    public final Uri d() {
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
        if (!(obj instanceof woa)) {
            return false;
        }
        woa woaVar = (woa) obj;
        if (!fdbq.f(this.c, woaVar.c) || !fdbq.f(this.d, woaVar.d) || !fdbq.f(this.e, woaVar.e) || !fdbq.f(this.f, woaVar.f)) {
            return false;
        }
        String str = woaVar.g;
        return fdbq.f(null, null) && fdbq.f(this.h, woaVar.h) && fdbq.f(this.i, woaVar.i) && this.a == woaVar.a && this.b == woaVar.b && fdbq.f(this.j, woaVar.j);
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
        return this.j;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    @Override // defpackage.amvy
    public final amvx h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        Uri uri = this.e;
        int iHashCode2 = ((((((((((((iHashCode * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + this.f.hashCode()) * 961) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + wnz.a(this.a)) * 31) + wnz.a(this.b)) * 31;
        athh athhVar = this.j;
        return iHashCode2 + (athhVar != null ? athhVar.hashCode() : 0);
    }

    @Override // defpackage.amvy
    public final Optional k() {
        return Optional.ofNullable(Long.valueOf(this.h.toMillis()));
    }

    @Override // defpackage.amwm
    public final String l() {
        return null;
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
        return "MapiVideoContent(contentType=" + this.c + ", uri=" + strD + ", originalUri=" + strD2 + ", size=" + this.f + ", caption=null, duration=" + this.h + ", mediaModifiedTimestamp=" + this.i + ", isResizable=" + this.a + ", saveToExternalStorage=" + this.b + ",processingId=" + this.j + ")";
    }
}
