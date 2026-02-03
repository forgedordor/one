package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class annt extends fcyz implements fdat {
    final /* synthetic */ BugleConversationId a;
    final /* synthetic */ annv b;
    final /* synthetic */ aoff c;
    final /* synthetic */ ekgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public annt(BugleConversationId bugleConversationId, annv annvVar, aoff aoffVar, ekgb ekgbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bugleConversationId;
        this.b = annvVar;
        this.c = aoffVar;
        this.d = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((annt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        BugleConversationId bugleConversationId = this.a;
        final annv annvVar = this.b;
        final ConversationIdType conversationIdType = bugleConversationId.a;
        final aoff aoffVar = this.c;
        final ekgb ekgbVar = this.d;
        annvVar.h.d("ConnectionTypeTombstoneManager#updateTombstoneStateForConnectionTypeChange", new Runnable() { // from class: annr
            @Override // java.lang.Runnable
            public final void run() {
                final annv annvVar2 = annvVar;
                fcsu fcsuVar = annvVar2.b;
                baxe baxeVar = (baxe) fcsuVar.b();
                final ConversationIdType conversationIdType2 = conversationIdType;
                MessageCoreData messageCoreDataR = baxeVar.r(conversationIdType2);
                MessageIdType messageIdTypeC = messageCoreDataR != null ? messageCoreDataR.C() : null;
                if (aoffVar.ordinal() != 3) {
                    if (messageIdTypeC == null || ((baxe) fcsuVar.b()).s(conversationIdType2) == null) {
                        return;
                    }
                    ekrw ekrwVarH = annv.a.h();
                    ekrwVarH.X(eksq.a, "BugleSatellite");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/message/tombstone/ConnectionTypeTombstoneManagerImpl$updateTombstoneStateForConnectionTypeChange$2", "invokeSuspend$lambda$1", 134, "ConnectionTypeTombstoneManagerImpl.kt")).q("Removing tombstone for satellite auto connect.");
                    if (((appk) annvVar2.g.b()).a()) {
                        ((cdys) annvVar2.f.b()).e(messageIdTypeC, cdyt.PREVIOUS_TOMBSTONE_DELETION);
                        return;
                    } else {
                        ((cdys) annvVar2.f.b()).d(messageIdTypeC);
                        return;
                    }
                }
                if (messageIdTypeC != null) {
                    ekrw ekrwVarH2 = annv.a.h();
                    ekrwVarH2.X(eksq.a, "BugleSatellite");
                    ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/api/messaging/message/tombstone/ConnectionTypeTombstoneManagerImpl$updateTombstoneStateForConnectionTypeChange$2", "invokeSuspend$lambda$1", 105, "ConnectionTypeTombstoneManagerImpl.kt")).q("Connected to satellite but tombstone already present for satellite auto connect.");
                    return;
                }
                ekgb ekgbVar2 = ekgbVar;
                ekrw ekrwVarH3 = annv.a.h();
                ekrwVarH3.X(eksq.a, "BugleSatellite");
                ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/api/messaging/message/tombstone/ConnectionTypeTombstoneManagerImpl$updateTombstoneStateForConnectionTypeChange$2", "invokeSuspend$lambda$1", 109, "ConnectionTypeTombstoneManagerImpl.kt")).q("Connected to satellite auto connect: inserting.");
                final fdcg fdcgVar = new fdcg();
                fdcgVar.a = 251;
                if (ekgbVar2.size() == 1) {
                    ekgbVar2.getClass();
                    if (((ResolvedRecipient) fcva.X(ekgbVar2)).g().u()) {
                        fdcgVar.a = 239;
                    }
                }
                annvVar2.h.d("ConnectionTypeTombstoneManager#insert", new Runnable() { // from class: anns
                    @Override // java.lang.Runnable
                    public final void run() {
                        annv annvVar3 = annvVar2;
                        ((byeb) annvVar3.c.b()).n(((bbdl) annvVar3.d.b()).d(), annvVar3.e.f().toEpochMilli(), conversationIdType2, -1L, fdcgVar.a);
                    }
                });
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new annt(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
