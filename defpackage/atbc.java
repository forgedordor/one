package defpackage;

import j$.util.Optional;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atbc extends atbp {
    private coid a;
    private int b;
    private ekgp c;
    private String d;
    private Optional e = Optional.empty();
    private Optional f = Optional.empty();
    private byte g;

    @Override // defpackage.atbp
    public final atbq a() {
        if (this.g == 1 && this.a != null && this.c != null && this.d != null) {
            return new atbd(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" reason");
        }
        if (this.g == 0) {
            sb.append(" httpResponseCode");
        }
        if (this.c == null) {
            sb.append(" httpHeaders");
        }
        if (this.d == null) {
            sb.append(" transactionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.atbp
    public final void b(CronetException cronetException) {
        this.e = Optional.of(cronetException);
    }

    @Override // defpackage.atbp
    public final void c(Throwable th) {
        this.f = Optional.of(th);
    }

    @Override // defpackage.atbp
    public final void d(ekgp ekgpVar) {
        if (ekgpVar == null) {
            throw new NullPointerException("Null httpHeaders");
        }
        this.c = ekgpVar;
    }

    @Override // defpackage.atbp
    public final void e(int i) {
        this.b = i;
        this.g = (byte) 1;
    }

    @Override // defpackage.atbp
    public final void f(coid coidVar) {
        if (coidVar == null) {
            throw new NullPointerException("Null reason");
        }
        this.a = coidVar;
    }

    @Override // defpackage.atbp
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null transactionId");
        }
        this.d = str;
    }
}
