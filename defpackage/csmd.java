package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csmd extends fcyz implements fdat {
    int a;
    final /* synthetic */ csme b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csmd(csme csmeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csmeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csmd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                long j = fdhi.a;
                Object objE = crtr.J.e();
                objE.getClass();
                long jG = fdhk.g(((Number) objE).longValue(), fdhl.c);
                csmc csmcVar = new csmc(this.b, null);
                this.a = 1;
                if (fdna.b(jG, csmcVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (fdmx unused) {
            ekrw ekrwVarJ = csme.a.j();
            ekrwVarJ.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker$getAccountIdAndCheckSpatulaSettings$1$1", "invokeSuspend", 68, "SpatulaSettingsChecker.kt")).q("Timeout when getting spatula settings.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csmd(this.b, fcxyVar);
    }
}
