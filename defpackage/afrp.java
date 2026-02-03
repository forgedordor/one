package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class afrp extends fdbo implements fdae {
    public afrp(Object obj) {
        super(0, obj, afrq.class, "onListInteractive", "onListInteractive()V", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        afrq afrqVar = (afrq) this.g;
        ((afxx) afrqVar.b.b()).c(4, afrqVar.a);
        afva afvaVar = afrqVar.e;
        fcsu fcsuVar = afvaVar.b;
        Object objB = fcsuVar.b();
        objB.getClass();
        afva.a((dzuc) objB, afxy.c);
        Object objB2 = fcsuVar.b();
        objB2.getClass();
        afva.a((dzuc) objB2, afxy.b);
        afvaVar.c.e(afxy.e, null);
        afva.a.p("multi-share list is interactive");
        return fctx.a;
    }
}
