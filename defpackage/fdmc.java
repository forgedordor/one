package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class fdmc extends fdbo implements fdau {
    public static final fdmc a = new fdmc();

    public fdmc() {
        super(3, fdme.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdme fdmeVar = (fdme) obj;
        fear fearVar = (fear) obj2;
        while (true) {
            Object objE = fdmeVar.E();
            if (!(objE instanceof fdll)) {
                if (!(objE instanceof fdjg)) {
                    objE = fdmf.b(objE);
                }
                fearVar.i(objE);
            } else if (fdmeVar.A(objE) >= 0) {
                fearVar.g(fdlw.b(fdmeVar, true, new fdmb(fdmeVar, fearVar)));
                break;
            }
        }
        return fctx.a;
    }
}
