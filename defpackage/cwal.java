package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwal extends fcyz implements fdat {
    final /* synthetic */ cwam a;
    final /* synthetic */ ResolvedRecipient b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwal(cwam cwamVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cwamVar;
        this.b = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = cwam.a.h();
        ekrwVarH.X(eksq.a, "BugleCdp");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/conversation/details/header/actions/ActionsUiAdapterImpl$onShowOrAddContact$1", "invokeSuspend", 313, "ActionsUiAdapterImpl.kt")).q("Navigate to show or add contact");
        ((afzc) this.a.c.b()).h(new agfu(this.b));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwal(this.a, this.b, fcxyVar);
    }
}
