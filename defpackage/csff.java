package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csff extends fcyz implements fdat {
    int a;
    final /* synthetic */ csfg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csff(csfg csfgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csfgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csff) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                csfg csfgVar = this.b;
                ((ains) csfgVar.b.b()).e("Bugle.Spam.FM.TachyonFetch.Event", 1);
                this.a = 1;
                if (csfgVar.a(this) == fcylVar) {
                    return fcylVar;
                }
            }
            ((ains) this.b.b.b()).e("Bugle.Spam.FM.TachyonFetch.Event", 2);
        } catch (Exception e) {
            ((ains) this.b.b.b()).e("Bugle.Spam.FM.TachyonFetch.Event", 3);
            ekrw ekrwVarJ = csfg.a.j();
            ekrwVarJ.X(eksq.a, "BugleSpam");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TachyonTemplateFetcher$fetchWithoutWaitingForResults$1", "invokeSuspend", 52, "TachyonTemplateFetcher.kt")).q("failed to sync fm templates from tachyon");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csff(this.b, fcxyVar);
    }
}
