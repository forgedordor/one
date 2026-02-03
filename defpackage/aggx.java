package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aggx extends fcyz implements fdap {
    public aggx(fcxy fcxyVar) {
        super(1, fcxyVar);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aggx((fcxy) obj).b(fctx.a);
    }
}
