package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xas extends fcyz implements fdat {
    int a;
    final /* synthetic */ vvs b;
    final /* synthetic */ xax c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xas(fcxy fcxyVar, vvs vvsVar, xax xaxVar) {
        super(2, fcxyVar);
        this.b = vvsVar;
        this.c = xaxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xas) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ekrw ekrwVarG = xax.a.g();
        ekrwVarG.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/DraftSendButtonClickHandler$processAttachments$lambda$10$lambda$9$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 211, "DraftSendButtonClickHandler.kt");
        vvs vvsVar = this.b;
        ekrdVar.t("DraftSendButtonClickHandler processing %s", vvsVar);
        xax xaxVar = this.c;
        this.a = 1;
        Object objA = xaxVar.g.a((vvp) vvsVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xas xasVar = new xas(fcxyVar, this.b, this.c);
        xasVar.d = obj;
        return xasVar;
    }
}
