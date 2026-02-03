package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajr extends fcyz implements fdat {
    final /* synthetic */ ekgb a;
    final /* synthetic */ aajt b;
    final /* synthetic */ ajlk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajr(ekgb ekgbVar, aajt aajtVar, ajlk ajlkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ekgbVar;
        this.b = aajtVar;
        this.c = ajlkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aajr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.P(this.a);
        if (resolvedRecipient == null || !resolvedRecipient.D()) {
            ekrw ekrwVarH = aajt.a.h();
            ekrwVarH.X(eksq.a, "BugleConversation");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/topcontent/topappbar/TopAppBarMiddleUiAdapterImpl$onClick$1", "invokeSuspend", 217, "TopAppBarMiddleUiAdapterImpl.kt")).q("Open conversation details from top app bar.");
            aajt aajtVar = this.b;
            aajtVar.d.h(new agbt(this.c, aajtVar.f, 2, 1));
            return fctx.a;
        }
        String strN = resolvedRecipient.g().n();
        if (strN != null) {
            aajt aajtVar2 = this.b;
            ((ajhd) aajtVar2.j.b()).am(2, elrk.BIZINFO_SOURCE_CONVERSATION_TITLE, strN);
            aajtVar2.d.h(new agde(aajtVar2.c.a, strN));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aajr(this.a, this.b, this.c, fcxyVar);
    }
}
