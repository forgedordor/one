package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbx extends jer {
    private static final ikb h;
    public final jgc f;
    public jdf g;

    static {
        iii iiiVar = new iii();
        iiiVar.k(ije.e);
        iiiVar.r(1.0f);
        iiiVar.s(1);
        h = iiiVar;
    }

    public jbx(jcr jcrVar) {
        super(jcrVar);
        jgc jgcVar = new jgc();
        this.f = jgcVar;
        jgcVar.y = this;
        this.g = jcrVar.j != null ? new jbw(this) : null;
    }

    private final void G() {
        if (this.k) {
            return;
        }
        this.t.v().A();
    }

    @Override // defpackage.jer
    public final /* synthetic */ icr A() {
        return this.f;
    }

    @Override // defpackage.jer
    public final jdf C() {
        return this.g;
    }

    @Override // defpackage.jer
    public final void D() {
        if (this.g == null) {
            this.g = new jbw(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [icr] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [hum] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.jer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.jel r18, long r19, defpackage.jbu r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbx.E(jel, long, jbu, int, boolean):void");
    }

    @Override // defpackage.jer
    public final void F(ijb ijbVar, ini iniVar) throws Throwable {
        jcr jcrVar = this.t;
        jfh jfhVarA = jcv.a(jcrVar);
        hum humVarP = jcrVar.p();
        Object[] objArr = humVarP.a;
        int i = humVarP.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar2 = (jcr) objArr[i2];
            if (jcrVar2.f()) {
                jcrVar2.L(ijbVar, iniVar);
            }
        }
        if (jfhVarA.A()) {
            aj(ijbVar, h);
        }
    }

    @Override // defpackage.ivt
    public final int a(int i) {
        jbz jbzVarR = this.t.r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.a(jcrVar.x(), jcrVar.D(), i);
    }

    @Override // defpackage.ivt
    public final int b(int i) {
        jbz jbzVarR = this.t.r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.b(jcrVar.x(), jcrVar.D(), i);
    }

    @Override // defpackage.ivt
    public final int c(int i) {
        jbz jbzVarR = this.t.r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.c(jcrVar.x(), jcrVar.D(), i);
    }

    @Override // defpackage.ivt
    public final int d(int i) {
        jbz jbzVarR = this.t.r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.d(jcrVar.x(), jcrVar.D(), i);
    }

    @Override // defpackage.ixk
    public final iyl e(long j) {
        if (this.v) {
            jdf jdfVar = this.g;
            jdfVar.getClass();
            j = jdfVar.d;
        }
        z(j);
        jcr jcrVar = this.t;
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((jcr) objArr[i2]).v().G = 3;
        }
        ay(jcrVar.q.e(this, jcrVar.D(), j));
        ar();
        return this;
    }

    @Override // defpackage.jer, defpackage.iyl
    protected final void ef(long j, float f, fdap fdapVar) {
        super.ef(j, f, fdapVar);
        G();
    }

    @Override // defpackage.jde
    public final int s(itz itzVar) {
        jdf jdfVar = this.g;
        if (jdfVar != null) {
            return jdfVar.s(itzVar);
        }
        jdv jdvVar = (jdv) af();
        if (!jdvVar.l) {
            if (jdvVar.D() == 1) {
                jaj jajVar = jdvVar.w;
                jajVar.f = true;
                if (jajVar.b) {
                    jdvVar.r();
                }
            } else {
                jdvVar.w.g = true;
            }
        }
        jdvVar.i().l = true;
        jdvVar.k();
        jdvVar.i().l = false;
        Integer num = (Integer) jdvVar.w.h.get(itzVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.jer, defpackage.iyl
    public final void x(long j, float f, ini iniVar) {
        super.x(j, f, iniVar);
        G();
    }
}
