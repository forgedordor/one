package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xat extends fcyz implements fdat {
    int a;
    final /* synthetic */ xax b;
    final /* synthetic */ vvw c;
    final /* synthetic */ vwv d;
    final /* synthetic */ vwk e;
    final /* synthetic */ wyj f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xat(fcxy fcxyVar, xax xaxVar, wyj wyjVar, vvw vvwVar, vwv vwvVar, vwk vwkVar) {
        super(2, fcxyVar);
        this.b = xaxVar;
        this.f = wyjVar;
        this.c = vvwVar;
        this.d = vwvVar;
        this.e = vwkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xat) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                wyz wyzVar = this.b.d;
                wyj wyjVar = this.f;
                this.a = 1;
                Object objA = fdin.a(eicg.a(((wyy) wyzVar).b), new wyu(null, wyjVar, (wyy) wyzVar), this);
                if (objA != obj2) {
                    objA = fctx.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            }
            return true;
        } catch (Throwable th) {
            ekrw ekrwVarI = xax.a.i();
            ekrwVarI.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/handler/DraftSendButtonClickHandler$queueForSending$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 265, "DraftSendButtonClickHandler.kt")).I("Failed to send message %s, %s, %s", this.c, this.d, this.e);
            return false;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xat xatVar = new xat(fcxyVar, this.b, this.f, this.c, this.d, this.e);
        xatVar.g = obj;
        return xatVar;
    }
}
