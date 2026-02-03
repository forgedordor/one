package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzpe extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzpg b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzpe(bzpg bzpgVar, String str, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzpgVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzpe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bzpg bzpgVar = this.b;
            String str = this.c;
            int i2 = this.d;
            this.a = 1;
            camy camyVar = (camy) cand.a.createBuilder();
            camyVar.getClass();
            caiz.b(i2, camyVar);
            caiz.c(str, camyVar);
            cand candVarA = caiz.a(camyVar);
            caxr caxrVar = new caxr();
            caxrVar.a = "priority";
            ((cazj) bzpgVar.b.a.b()).a(cbcu.g("cms_local_media_restore", candVarA, caxrVar.a()));
            ekrw ekrwVarH = bzpg.a.h();
            ekrwVarH.X(eksq.a, "BugleCmsMediaRestore");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreDelegateImpl", "enqueuePartForPriorityMediaRestore", 78, "CmsLocalMediaRestoreDelegateImpl.kt")).t("Enqueued priority media restore for part %s", str);
            if (fctx.a == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzpe(this.b, this.c, this.d, fcxyVar);
    }
}
