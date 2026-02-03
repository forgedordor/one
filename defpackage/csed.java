package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csed {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private final fdjx f;

    public csed(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.e = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.f = fdjxVar;
    }

    public final eofg a(Throwable th) {
        if (!(th instanceof fbtf)) {
            return eofg.UNEXPECTED_ERROR_TYPE;
        }
        eofg eofgVarApply = new csdt().apply(((fbtf) th).a.getCode());
        eofgVarApply.getClass();
        return eofgVarApply;
    }

    public final void b(csdr csdrVar, Throwable th, csdl csdlVar, eoeo eoeoVar, int i) {
        csdlVar.getClass();
        eoeoVar.getClass();
        boolean z = th instanceof fbtf;
        eofg eofgVarA = a(th);
        if (z) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSpam");
            ((ekrd) ((ekrd) ekrwVarH).g(th).h("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler", "handleClassificationError", 74, "SpamErrorHandler.kt")).q("SpamErrorHandler#handleClassificationError: failed to classify spam");
        } else {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSpam");
            ((ekrd) ((ekrd) ekrwVarJ).g(th).h("com/google/android/apps/messaging/shared/util/spam/common/SpamErrorHandler", "handleClassificationError", 79, "SpamErrorHandler.kt")).q("SpamErrorHandler#handleClassificationError: failed to classify spam");
        }
        c(th, eofgVarA);
        auvw.k(this.f, null, null, new csec(this, csdrVar, csdlVar, eoeoVar, i, eofgVarA, null), 3);
    }

    public final void c(Throwable th, eofg eofgVar) {
        if (eofgVar == eofg.UNEXPECTED_ERROR_TYPE) {
            auvh.h(((cden) this.e.b()).b(th));
        }
    }
}
