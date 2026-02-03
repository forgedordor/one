package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccvn extends fcyz implements fdap {
    final /* synthetic */ ccvp a;
    final /* synthetic */ awxn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvn(ccvp ccvpVar, awxn awxnVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ccvpVar;
        this.b = awxnVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.d.a(this.b);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ccvn(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
