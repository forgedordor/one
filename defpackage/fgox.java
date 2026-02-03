package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgox extends fgoq {
    private final int a;
    private final int c;
    private final int d;

    public fgox(fgms fgmsVar, fgmu fgmuVar) {
        this(fgmsVar, fgmuVar, 1);
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int c() {
        return this.d;
    }

    @Override // defpackage.fgoq, defpackage.fgms
    public final int d() {
        return this.c;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long e(long j, int i) {
        long jE = super.e(j, i);
        fgot.c(this, a(jE), this.c, this.d);
        return jE;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna r() {
        return this.b.r();
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        return this.b.t(j);
    }

    public fgox(fgms fgmsVar, fgmu fgmuVar, int i) {
        super(fgmsVar, fgmuVar);
        this.a = i;
        if (fgmsVar.d() + i > Integer.MIN_VALUE) {
            this.c = fgmsVar.d() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (fgmsVar.c() + i < Integer.MAX_VALUE) {
            this.d = fgmsVar.c() + i;
        } else {
            this.d = Alert.DURATION_SHOW_INDEFINITELY;
        }
    }
}
