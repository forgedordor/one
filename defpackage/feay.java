package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feay implements fdis, fdne {
    public final fdiu a;
    final /* synthetic */ feaz b;

    public feay(feaz feazVar, fdiu fdiuVar) {
        this.b = feazVar;
        this.a = fdiuVar;
    }

    @Override // defpackage.fdne
    public final void C(fdzf fdzfVar, int i) {
        this.a.C(fdzfVar, i);
    }

    @Override // defpackage.fdis
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.fdis
    public final void d(fdap fdapVar) {
        throw null;
    }

    @Override // defpackage.fdis
    public final /* bridge */ /* synthetic */ void e(Object obj, fdap fdapVar) {
        throw null;
    }

    @Override // defpackage.fdis
    public final /* bridge */ /* synthetic */ void f(Object obj, fdau fdauVar) {
        boolean z = fdkb.a;
        final feaz feazVar = this.b;
        feazVar.a.c(null);
        this.a.e(obj, new fdap() { // from class: feax
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                feazVar.d();
                return fctx.a;
            }
        });
    }

    @Override // defpackage.fdis
    public final /* bridge */ /* synthetic */ void g(fdjq fdjqVar, Object obj) {
        throw null;
    }

    @Override // defpackage.fdis
    public final boolean h(Throwable th) {
        return this.a.h(th);
    }

    @Override // defpackage.fdis
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.fdis
    public final boolean j() {
        throw null;
    }

    @Override // defpackage.fdis
    public final boolean k() {
        throw null;
    }

    @Override // defpackage.fdis
    public final /* synthetic */ Object l(Object obj, fdau fdauVar) {
        boolean z = fdkb.a;
        final feaz feazVar = this.b;
        fdau fdauVar2 = new fdau() { // from class: feaw
            @Override // defpackage.fdau
            public final Object a(Object obj2, Object obj3, Object obj4) {
                boolean z2 = fdkb.a;
                feaz feazVar2 = feazVar;
                feazVar2.a.c(null);
                feazVar2.d();
                return fctx.a;
            }
        };
        fdzi fdziVarJ = this.a.J((fctx) obj, fdauVar2);
        if (fdziVarJ != null) {
            feazVar.a.c(null);
        }
        return fdziVarJ;
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return this.a.b;
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        this.a.w(obj);
    }
}
