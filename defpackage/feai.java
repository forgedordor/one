package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final /* synthetic */ class feai extends fdbo implements fdau {
    public static final feai a = new feai();

    public feai() {
        super(3, feaj.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final feaj feajVar = (feaj) obj;
        final fear fearVar = (fear) obj2;
        long j = feajVar.a;
        if (j <= 0) {
            fearVar.i(fctx.a);
        } else {
            Runnable runnable = new Runnable() { // from class: feah
                @Override // java.lang.Runnable
                public final void run() {
                    fearVar.j(feajVar, fctx.a);
                }
            };
            fearVar.getClass();
            feaq feaqVar = (feaq) fearVar;
            fcyh fcyhVar = feaqVar.a;
            feaqVar.c = fdkj.e(fcyhVar).c(j, runnable, fcyhVar);
        }
        return fctx.a;
    }
}
