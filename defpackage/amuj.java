package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amuj implements amvy {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Size f;
    private final long h;
    private final amvx l;
    private final Uri d = null;
    private final amyb e = null;
    private final String g = null;
    private final long i = 0;
    private final boolean j = true;
    private final boolean k = false;

    public amuj(String str, Uri uri, Uri uri2, Size size, long j, amvx amvxVar) {
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.f = size;
        this.h = j;
        this.l = amvxVar;
    }

    @Override // defpackage.amvy
    public final long a() {
        return this.h;
    }

    @Override // defpackage.amvr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.amsv
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.amvy
    public final Uri d() {
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
        if (!(obj instanceof amuj)) {
            return false;
        }
        amuj amujVar = (amuj) obj;
        if (!fdbq.f(this.a, amujVar.a) || !fdbq.f(this.b, amujVar.b) || !fdbq.f(this.c, amujVar.c)) {
            return false;
        }
        Uri uri = amujVar.d;
        if (!fdbq.f(null, null)) {
            return false;
        }
        amyb amybVar = amujVar.e;
        if (!fdbq.f(null, null) || !fdbq.f(this.f, amujVar.f)) {
            return false;
        }
        String str = amujVar.g;
        if (!fdbq.f(null, null) || this.h != amujVar.h) {
            return false;
        }
        long j = amujVar.i;
        boolean z = amujVar.j;
        boolean z2 = amujVar.k;
        return this.l == amujVar.l;
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
    public final /* synthetic */ athh fn() {
        return null;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    @Override // defpackage.amvy
    public final amvx h() {
        return this.l;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 29791) + this.f.hashCode()) * 961) + amuh.a(this.h)) * 31) + amuh.a(0L)) * 31) + amui.a(true)) * 31) + amui.a(false)) * 31) + this.l.hashCode();
    }

    @Override // defpackage.amvy
    public final Optional k() {
        return Optional.of(0L);
    }

    @Override // defpackage.amwm
    public final String l() {
        return null;
    }

    @Override // defpackage.amvy
    public final boolean m() {
        return true;
    }

    @Override // defpackage.amvy
    public final boolean n() {
        return false;
    }

    public final String toString() {
        return "BuglePhotoVideoContent(contentType=" + this.a + ", uri=" + this.b + ", originalUri=" + this.c + ", previewUri=null, progress=null, size=" + this.f + ", caption=null, mediaModifiedTimestamp=" + this.h + ", duration=0, isResizable=true, saveToExternalStorage=false, displayState=" + this.l + ")";
    }
}
