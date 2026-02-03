package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anaq extends anck {
    public ajmb a;
    public angr b;
    public ajmx c;
    public String d;
    public amwc e;
    public ekgp f;
    public anac g;
    public anms h;
    public angj i;
    public int j;
    private boolean k;
    private ekgb l;
    private ekgb m;
    private ekgb n;
    private byte o;

    @Override // defpackage.anck
    public final ancl a() {
        if (this.o == 1 && this.j != 0 && this.l != null && this.f != null && this.m != null && this.n != null) {
            return new anar(this.k, this.a, this.b, this.c, this.d, this.j, this.l, this.e, this.h, this.f, this.m, this.n, this.i, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.o == 0) {
            sb.append(" starred");
        }
        if (this.j == 0) {
            sb.append(" contentCategory");
        }
        if (this.l == null) {
            sb.append(" annotations");
        }
        if (this.f == null) {
            sb.append(" voiceTranscriptions");
        }
        if (this.m == null) {
            sb.append(" readByRecipients");
        }
        if (this.n == null) {
            sb.append(" failedToDecryptRecipients");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.anck
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null annotations");
        }
        this.l = ekgbVar;
    }

    @Override // defpackage.anck
    public final void c(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null failedToDecryptRecipients");
        }
        this.n = ekgbVar;
    }

    @Override // defpackage.anck
    public final void d(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null readByRecipients");
        }
        this.m = ekgbVar;
    }

    @Override // defpackage.anck
    public final void e(boolean z) {
        this.k = z;
        this.o = (byte) 1;
    }
}
