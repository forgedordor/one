package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chqp extends fcyz implements fdat {
    int a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ chqw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqp(fcxy fcxyVar, ConversationIdType conversationIdType, chqw chqwVar) {
        super(2, fcxyVar);
        this.b = conversationIdType;
        this.c = chqwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ConversationIdType conversationIdType = this.b;
            if (conversationIdType.b()) {
                ekrw ekrwVarJ = chqw.a.j();
                ekrwVarJ.X(eksq.a, "BugleProfiles");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$conversationRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 65, "ProfilesRefresherImpl.kt")).q("Conversation ID is empty, not refreshing profiles for conversation");
                return fctx.a;
            }
            chqw chqwVar = this.c;
            eiju eijuVarY = chqwVar.b.y(chqwVar.e, new BugleConversationId(conversationIdType));
            this.a = 1;
            obj = fdxs.c(eijuVarY, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgp ekgpVar = (ekgp) obj;
        ekrw ekrwVarH = chqw.a.h();
        ekrwVarH.X(eksq.a, "BugleProfiles");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$conversationRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 80, "ProfilesRefresherImpl.kt")).r("Profiles conversation refresh finished, updated %s profiles", ekgpVar.size());
        bakt baktVar = (bakt) this.c.d.b();
        ekgpVar.getClass();
        ArrayList arrayList = new ArrayList(ekgpVar.size());
        Iterator it = ekgpVar.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getKey().toString());
        }
        baktVar.S(new ArrayList(arrayList));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chqp chqpVar = new chqp(fcxyVar, this.b, this.c);
        chqpVar.d = obj;
        return chqpVar;
    }
}
