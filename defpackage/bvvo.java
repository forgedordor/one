package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvvo extends fcyz implements fdat {
    final /* synthetic */ bvvp a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvvo(bvvp bvvpVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bvvpVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvvo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bvvp bvvpVar = this.a;
        bakt baktVar = (bakt) bvvpVar.c.b();
        ConversationIdType conversationIdType = this.b;
        if (baktVar.c(conversationIdType) == 0) {
            ekrw ekrwVarH = bvvp.a.h();
            ekrwVarH.X(eksq.a, "BugleE2eeEtouffee");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/E2eeConversationCreationListener$onCreated$1", "invokeSuspend", 52, "E2eeConversationCreationListener.kt")).t("Ensure encryption status for a newly created conversation: %s", conversationIdType.a());
            ((aykj) bvvpVar.b.b()).a(conversationIdType).s();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvvo(this.a, this.b, fcxyVar);
    }
}
