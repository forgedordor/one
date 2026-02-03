package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ycy extends fdbo implements fdap {
    public ycy(Object obj) {
        super(1, obj, yek.class, "onScroll", "onScroll(Z)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        zqi zqiVar = ((yek) this.g).Q;
        zqiVar.d.f(bool);
        if (zBooleanValue) {
            if (!zqiVar.c.a()) {
                ((vwg) zqiVar.b.b()).c(null);
            }
            zqiVar.f.a.remove(aadl.a);
            ((dzpl) zqiVar.a.b()).f(ajfo.k);
        } else {
            zqiVar.f.a(aadl.a);
            ((dzpl) zqiVar.a.b()).k(ajfo.k, null);
        }
        return fctx.a;
    }
}
