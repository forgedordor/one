package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhu extends uii {
    public Size a;
    public boolean b;
    public Uri c;
    public Uri d;
    public String e;
    public amvx f;
    public byte g;
    private String i;
    private Uri j;
    private elha k;
    private long l;
    private boolean m;
    private Optional n;
    private bvdr o;

    public uhu() {
        this.n = Optional.empty();
    }

    @Override // defpackage.uii
    public final GalleryContent a() {
        if (this.g == 7 && this.i != null && this.j != null && this.k != null && this.a != null && this.o != null && this.f != null) {
            return new uhz(this.i, this.j, this.k, this.a, this.l, this.m, this.b, this.c, this.n, this.o, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" contentType");
        }
        if (this.j == null) {
            sb.append(" uri");
        }
        if (this.k == null) {
            sb.append(" contentSource");
        }
        if (this.a == null) {
            sb.append(" size");
        }
        if ((this.g & 1) == 0) {
            sb.append(" mediaModifiedTimestamp");
        }
        if ((this.g & 2) == 0) {
            sb.append(" isResizable");
        }
        if ((this.g & 4) == 0) {
            sb.append(" saveToExternalStorage");
        }
        if (this.o == null) {
            sb.append(" mediaSendType");
        }
        if (this.f == null) {
            sb.append(" displayState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.uii
    public final elha b() {
        elha elhaVar = this.k;
        if (elhaVar != null) {
            return elhaVar;
        }
        throw new IllegalStateException("Property \"contentSource\" has not been set");
    }

    @Override // defpackage.uii
    public final Optional c() {
        return (this.g & 2) == 0 ? Optional.empty() : Optional.of(Boolean.valueOf(this.m));
    }

    @Override // defpackage.uii
    public final String d() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"contentType\" has not been set");
    }

    @Override // defpackage.uii
    public final void e(elha elhaVar) {
        if (elhaVar == null) {
            throw new NullPointerException("Null contentSource");
        }
        this.k = elhaVar;
    }

    @Override // defpackage.uii
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.i = str;
    }

    @Override // defpackage.uii
    public final void g(long j) {
        this.n = Optional.of(Long.valueOf(j));
    }

    @Override // defpackage.uii
    public final void h(boolean z) {
        this.m = z;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.uii
    public final void i(long j) {
        this.l = j;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.uii
    public final void j(bvdr bvdrVar) {
        if (bvdrVar == null) {
            throw new NullPointerException("Null mediaSendType");
        }
        this.o = bvdrVar;
    }

    @Override // defpackage.uii
    public final void k(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.j = uri;
    }

    public uhu(GalleryContent galleryContent) {
        this.n = Optional.empty();
        this.i = galleryContent.b();
        this.j = galleryContent.e();
        this.k = galleryContent.j();
        this.a = galleryContent.f();
        this.l = galleryContent.a();
        this.m = galleryContent.m();
        this.b = galleryContent.n();
        this.c = galleryContent.d();
        this.n = galleryContent.k();
        this.o = galleryContent.i();
        this.d = galleryContent.c();
        this.e = galleryContent.l();
        this.f = galleryContent.h();
        this.g = (byte) 7;
    }
}
