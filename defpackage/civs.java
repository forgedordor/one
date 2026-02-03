package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class civs extends fcyz implements fdat {
    final /* synthetic */ civx a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ chxo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civs(civx civxVar, ConversationIdType conversationIdType, chxo chxoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = civxVar;
        this.b = conversationIdType;
        this.c = chxoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((civs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String str = this.c.h().d;
        str.getClass();
        civx civxVar = this.a;
        List listK = ((bakt) civxVar.p.b()).K(this.b);
        listK.getClass();
        if (listK.isEmpty()) {
            ((ains) civxVar.m.b()).c("Bugle.Rcs.OnIncomingRcsMessage.SelfParticipantPresent.Counts");
        } else {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (fdbq.f(str, ((ParticipantsTable.BindData) it.next()).T())) {
                    break;
                }
            }
            ((ains) civxVar.m.b()).c("Bugle.Rcs.OnIncomingRcsMessage.SelfParticipantPresent.Counts");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new civs(this.a, this.b, this.c, fcxyVar);
    }
}
