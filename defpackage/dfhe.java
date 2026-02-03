package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfhe extends dfhl {
    private String d;
    private long e;
    private String f;
    private String g;
    private byte q;
    private Optional h = Optional.empty();
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    private Optional i = Optional.empty();
    private Optional j = Optional.empty();
    private Optional k = Optional.empty();
    private Optional l = Optional.empty();
    private Optional m = Optional.empty();
    private Optional n = Optional.empty();
    private Optional o = Optional.empty();
    public Optional c = Optional.empty();
    private final Optional p = Optional.empty();

    @Override // defpackage.dfhl
    public final dfhm a() {
        String str;
        String str2;
        String str3;
        if (this.q == 1 && (str = this.d) != null && (str2 = this.f) != null && (str3 = this.g) != null) {
            return new dfhf(str, this.e, str2, str3, this.h, this.a, this.b, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.c, this.p);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" rcsMessageId");
        }
        if (this.q == 0) {
            sb.append(" fileSize");
        }
        if (this.f == null) {
            sb.append(" contentType");
        }
        if (this.g == null) {
            sb.append(" fileUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dfhl
    public final void b(long j) {
        this.k = Optional.of(Long.valueOf(j));
    }

    @Override // defpackage.dfhl
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentType");
        }
        this.f = str;
    }

    @Override // defpackage.dfhl
    public final void d(Uri uri) {
        this.m = Optional.of(uri);
    }

    @Override // defpackage.dfhl
    public final void e(String str) {
        this.l = Optional.of(str);
    }

    @Override // defpackage.dfhl
    public final void f(long j) {
        this.e = j;
        this.q = (byte) 1;
    }

    @Override // defpackage.dfhl
    public final void g(long j) {
        this.j = Optional.of(Long.valueOf(j));
    }

    @Override // defpackage.dfhl
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null fileUrl");
        }
        this.g = str;
    }

    @Override // defpackage.dfhl
    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null rcsMessageId");
        }
        this.d = str;
    }

    @Override // defpackage.dfhl
    public final void j(String str) {
        this.h = Optional.of(str);
    }

    @Override // defpackage.dfhl
    public final void k(String str) {
        this.n = Optional.of(str);
    }

    @Override // defpackage.dfhl
    public final void l(byte[] bArr) {
        this.o = Optional.of(bArr);
    }

    @Override // defpackage.dfhl
    public final void m(long j) {
        this.i = Optional.of(Long.valueOf(j));
    }
}
