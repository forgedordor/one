package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cipz extends fcyz implements fdat {
    final /* synthetic */ ciqt a;
    final /* synthetic */ List b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cipz(ciqt ciqtVar, List list, ConversationIdType conversationIdType, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ciqtVar;
        this.b = list;
        this.c = conversationIdType;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cipz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final List list = this.b;
        final ciqt ciqtVar = this.a;
        final ConversationIdType conversationIdType = this.c;
        final int i = this.d;
        ciqtVar.k.a("RepairForkedMmsGroupSynclet#fixConversationParticipants", new dqsl() { // from class: cipy
            @Override // defpackage.dqsl
            public final Object a(byeu byeuVar) {
                ciqt ciqtVar2;
                List list2 = list;
                ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                Iterator it = list2.iterator();
                while (true) {
                    ciqtVar2 = ciqtVar;
                    if (!it.hasNext()) {
                        break;
                    }
                    ParticipantsTable.BindData bindDataA = bbbd.h((alqm) it.next(), null, i).a();
                    ((bbca) ciqtVar2.h.b()).i(bindDataA);
                    arrayList.add(bindDataA);
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                fcsu fcsuVar = ciqtVar2.f;
                List listK = ((bakt) fcsuVar.b()).K(conversationIdType2);
                listK.getClass();
                List listI = ciqt.i(arrayList, listK);
                List listI2 = ciqt.i(listK, arrayList);
                ekrg ekrgVar = ciqt.a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "BugleGroupManagement");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$fixConversationParticipants$2", "invokeSuspend$lambda$2", 405, "RepairForkedMmsGroupSynclet.kt")).u("Add %d, remove %d participants.", listI.size(), listI2.size());
                if (!listI.isEmpty() && !((bakt) fcsuVar.b()).ao(listI, conversationIdType2)) {
                    ekrw ekrwVarI = ekrgVar.i();
                    ekrwVarI.X(ekrzVar, "BugleGroupManagement");
                    ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$fixConversationParticipants$2", "invokeSuspend$lambda$2", 418, "RepairForkedMmsGroupSynclet.kt")).q("Failed to add participants.");
                    byeuVar.a(null);
                    return fctx.a;
                }
                if (listI2.isEmpty() || ((bakt) fcsuVar.b()).at(listI2, conversationIdType2)) {
                    ((bakt) fcsuVar.b()).P(conversationIdType2);
                    return fctx.a;
                }
                ekrw ekrwVarI2 = ekrgVar.i();
                ekrwVarI2.X(ekrzVar, "BugleGroupManagement");
                ((ekrd) ekrwVarI2.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$fixConversationParticipants$2", "invokeSuspend$lambda$2", 434, "RepairForkedMmsGroupSynclet.kt")).q("Failed to remove participants.");
                byeuVar.a(null);
                return fctx.a;
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cipz(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
