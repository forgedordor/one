package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dmnx extends fdbo implements fdae {
    public dmnx(Object obj) {
        super(0, obj, dmoo.class, "onClose", "onClose()V", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        dmoo dmooVar = (dmoo) this.g;
        if (((dmoz) dmooVar.h.c()).f) {
            fdil.d(dmooVar.d, null, null, new dmog(dmooVar, null), 3);
        } else {
            fdil.d(dmooVar.d, null, null, new dmoh(dmooVar, null), 3);
        }
        dmooVar.j.b();
        return fctx.a;
    }
}
