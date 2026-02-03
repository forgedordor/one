package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csfi extends fcyz implements fdat {
    int a;
    final /* synthetic */ csfj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csfi(csfj csfjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csfjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csfi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (!((Boolean) csfa.a.e()).booleanValue()) {
                ekrw ekrwVarE = csfj.a.e();
                ekrwVarE.X(eksq.a, "BugleSpam");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/util/spam/fuzzymatching/TemplateFetcherSynclet$sync$1", "invokeSuspend", 42, "TemplateFetcherSynclet.kt")).q("skipping due to feature flag");
                return fctx.a;
            }
            csfj csfjVar = this.b;
            this.a = 1;
            if (csfjVar.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csfi(this.b, fcxyVar);
    }
}
