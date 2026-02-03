package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class baqk extends fcyz implements fdau {
    int a;
    final /* synthetic */ azxa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqk(azxa azxaVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = azxaVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new baqk(this.b, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = baql.a.h();
            ekrwVarH.X(eksq.a, "BugleDatabase");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataFullSyncWorkHandler$1", "invokeSuspend", 42, "ConversationMetadataFullSyncWorkHandler.kt");
            botb botbVarE = botm.e();
            botbVarE.A("debug_conversations");
            ekrdVar.r("Finished a Conversation Metadata Refresh from PWQ. Total conversations: %d", botbVarE.b().h());
            azxa azxaVar = this.b;
            this.a = 1;
            if (azxaVar.a(this) == fcylVar) {
                return fcylVar;
            }
        }
        ekrw ekrwVarH2 = baql.a.h();
        ekrwVarH2.X(eksq.a, "BugleDatabase");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/data/conversation/ConversationMetadataFullSyncWorkHandler$1", "invokeSuspend", 50, "ConversationMetadataFullSyncWorkHandler.kt")).q("Finished a Conversation Metadata Refresh from PWQ");
        return cbcw.i();
    }
}
