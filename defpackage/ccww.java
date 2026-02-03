package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccww {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public ccww(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final void a(elof elofVar, MessageCoreData messageCoreData) {
        elofVar.getClass();
        messageCoreData.getClass();
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        conversationIdTypeA.getClass();
        b(elofVar, conversationIdTypeA);
    }

    public final void b(elof elofVar, ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        if (((aquo) this.a.b()).a()) {
            List listK = ((bakt) this.b.b()).K(conversationIdType);
            enph enphVar = null;
            if (listK.size() == 1) {
                alqm alqmVarQ = ((alrj) this.c.b()).q((ParticipantsTable.BindData) listK.get(0));
                if (alqmVarQ.v()) {
                    enpg enpgVar = (enpg) enph.a.createBuilder();
                    String strJ = alqmVarQ.j();
                    enpgVar.copyOnWrite();
                    enph enphVar2 = (enph) enpgVar.instance;
                    strJ.getClass();
                    enphVar2.b = 1 | enphVar2.b;
                    enphVar2.c = strJ;
                    enphVar = (enph) enpgVar.build();
                }
            }
            if (enphVar != null) {
                elofVar.copyOnWrite();
                elpg elpgVar = (elpg) elofVar.instance;
                evsy evsyVar = elpg.a;
                elpgVar.aD = enphVar;
                elpgVar.e |= 2097152;
            }
        }
    }
}
