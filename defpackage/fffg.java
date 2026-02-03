package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffg extends ffgd {
    public ffgd a;

    public fffg(ffgd ffgdVar) {
        ffgdVar.getClass();
        this.a = ffgdVar;
    }

    @Override // defpackage.ffgd
    public final void g() throws InterruptedIOException {
        this.a.g();
    }

    @Override // defpackage.ffgd
    public final boolean h() {
        return this.a.h();
    }

    @Override // defpackage.ffgd
    public final long j() {
        return this.a.j();
    }

    @Override // defpackage.ffgd
    public final ffgd k() {
        return this.a.k();
    }

    @Override // defpackage.ffgd
    public final ffgd l() {
        return this.a.l();
    }

    @Override // defpackage.ffgd
    public final ffgd m(long j) {
        return this.a.m(j);
    }

    @Override // defpackage.ffgd
    public final ffgd n(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.n(j, timeUnit);
    }

    @Override // defpackage.ffgd
    public final long o() {
        return this.a.o();
    }
}
