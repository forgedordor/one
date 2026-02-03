package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqz extends fcyz implements fdap {
    final /* synthetic */ qra a;
    final /* synthetic */ qnm b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqz(qra qraVar, qnm qnmVar, float f, boolean z, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = qraVar;
        this.b = qnmVar;
        this.c = f;
        this.d = z;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        qra qraVar = this.a;
        qraVar.l(this.b);
        qraVar.o(this.c);
        qraVar.m(1);
        qraVar.n(false);
        if (this.d) {
            qraVar.u(Long.MIN_VALUE);
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new qqz(this.a, this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
