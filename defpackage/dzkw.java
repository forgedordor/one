package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzkw extends dzle {
    public String a;
    public feeg b;
    public String c;
    public Long d;
    public dzok e;
    public Predicate f;
    public dzii g;
    private boolean h;
    private feix i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte n;

    @Override // defpackage.dzle
    public final dzlf a() {
        feix feixVar;
        Predicate predicate;
        if (this.n == 31 && (feixVar = this.i) != null && (predicate = this.f) != null) {
            return new dzkx(this.a, this.h, feixVar, this.b, this.c, this.d, this.j, this.e, this.k, this.l, predicate, this.g, this.m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.n & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.i == null) {
            sb.append(" metric");
        }
        if ((this.n & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.n & 4) == 0) {
            sb.append(" shouldAttachActiveTraces");
        }
        if ((this.n & 8) == 0) {
            sb.append(" maxActiveTraces");
        }
        if (this.f == null) {
            sb.append(" activeTracePredicate");
        }
        if ((this.n & 16) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzle
    public final void b(int i) {
        this.m = i;
        this.n = (byte) (this.n | 16);
    }

    @Override // defpackage.dzle
    public final void c(boolean z) {
        this.h = z;
        this.n = (byte) (this.n | 1);
    }

    @Override // defpackage.dzle
    public final void d(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 2);
    }

    @Override // defpackage.dzle
    public final void e(int i) {
        this.l = i;
        this.n = (byte) (this.n | 8);
    }

    @Override // defpackage.dzle
    public final void f(feix feixVar) {
        if (feixVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.i = feixVar;
    }

    @Override // defpackage.dzle
    public final void g(boolean z) {
        this.k = z;
        this.n = (byte) (this.n | 4);
    }
}
