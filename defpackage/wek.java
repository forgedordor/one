package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wek implements wqe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendUiAdapter");
    public final wbb b;
    public final dnhq c;
    public final dptk d;
    public final wcf e;
    public final fcsu f;
    public final whl g;
    public final aqol h;
    public final aqom i;
    public final ahob j;
    public final wre k;
    public final was l;
    private wqe m;
    private final fctc n;

    public wek(wbb wbbVar, ahob ahobVar, dnhq dnhqVar, wre wreVar, dptk dptkVar, wcf wcfVar, was wasVar, fcsu fcsuVar, whl whlVar, aqol aqolVar, aqom aqomVar, final eygg eyggVar) {
        ahobVar.getClass();
        dnhqVar.getClass();
        wreVar.getClass();
        fcsuVar.getClass();
        eyggVar.getClass();
        this.b = wbbVar;
        this.j = ahobVar;
        this.c = dnhqVar;
        this.k = wreVar;
        this.d = dptkVar;
        this.e = wcfVar;
        this.l = wasVar;
        this.f = fcsuVar;
        this.g = whlVar;
        this.h = aqolVar;
        this.i = aqomVar;
        this.n = fctd.a(new fdae() { // from class: wdv
            @Override // defpackage.fdae
            public final Object invoke() {
                return (vth) eyggVar.b();
            }
        });
    }

    @Override // defpackage.wqe
    public final void a() {
        wqe wqeVar = this.m;
        if (wqeVar != null) {
            wqeVar.a();
        }
        c(null);
    }

    public final vth b() {
        Object objA = this.n.a();
        objA.getClass();
        return (vth) objA;
    }

    public final void c(wqe wqeVar) {
        if (wqeVar != null && this.m != null) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendUiAdapter", "setProjectionDraftClearedListener", 71, "DirectSendUiAdapter.kt")).q("A projection was already bound to DraftClearedListener");
        }
        this.m = wqeVar;
    }

    public final void d(vvl vvlVar) {
        b().g(vvlVar, 2);
    }
}
