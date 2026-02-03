package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dmnt extends fdbo implements fdae {
    public dmnt(Object obj) {
        super(0, obj, dmoo.class, "toggleFlash", "toggleFlash()V", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        Object objC;
        dmoo dmooVar = (dmoo) this.g;
        dmooVar.f();
        fduf fdufVar = dmooVar.h;
        int i2 = ((dmoz) fdufVar.c()).c;
        int i3 = 2;
        if (i2 == 1) {
            i = i3;
        } else if (i2 != 2) {
            i = 1;
        } else {
            i3 = 0;
            i = i3;
        }
        dmooVar.c.n(i);
        do {
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, dmoz.a((dmoz) objC, 0, null, i, null, false, null, null, null, 2097147)));
        return fctx.a;
    }
}
