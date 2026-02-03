package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xbz extends fdbo implements fdap {
    public xbz(Object obj) {
        super(1, obj, xci.class, "onUrgentChange", "onUrgentChange(Z)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xci xciVar = (xci) this.g;
        auvw.k(xciVar.b, null, null, new xch(zBooleanValue, xciVar, null), 3);
        return fctx.a;
    }
}
