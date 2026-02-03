package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class woi extends fcyz implements fdat {
    int a;
    final /* synthetic */ athh b;
    final /* synthetic */ wor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woi(athh athhVar, wor worVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = athhVar;
        this.c = worVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((woi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarG = wor.a.g();
            ekrwVarG.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarG;
            athh athhVar = this.b;
            ekrdVar.X(coie.j, athhVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/processor/DraftAttachmentPostProcessorImpl$cancel$1", "invokeSuspend", 122, "DraftAttachmentPostProcessorImpl.kt")).q("Cancel early processing.");
            wor worVar = this.c;
            this.a = 1;
            amvu amvuVar = (amvu) worVar.e;
            Object objA = fdin.a(eicg.a(amvuVar.b), new amvs(null, amvuVar, athhVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new woi(this.b, this.c, fcxyVar);
    }
}
