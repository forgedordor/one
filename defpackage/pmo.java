package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmo extends pmy {
    public boolean b;
    public boolean c;
    public lnz e;
    public Runnable g;
    public final /* synthetic */ pmx h;
    public long a = -1;
    public int d = 0;
    public final pnj f = new pnj();

    public pmo(pmx pmxVar) {
        this.h = pmxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmo.l():void");
    }

    @Override // defpackage.pmy, defpackage.pmq
    public final void a(pmx pmxVar) {
        this.c = true;
    }

    public final long h() {
        return this.h.s;
    }

    public final void i() {
        if (this.b) {
            l();
            this.e.e(h() + 1);
        } else {
            this.d = 1;
            this.g = null;
        }
    }

    public final void j(Runnable runnable) {
        this.g = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            l();
            this.e.e(0.0f);
        }
    }

    public final void k(float f) {
        long jMax = Math.max(-1L, Math.min(h() + 1, Math.round(f)));
        this.h.y(jMax, this.a);
        this.a = jMax;
    }
}
