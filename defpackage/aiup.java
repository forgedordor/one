package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiup {
    private final fcsu a;
    private final fcsu b;
    private final cmvy c;

    public aiup(fcsu fcsuVar, fcsu fcsuVar2, cmvy cmvyVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = cmvyVar;
    }

    private final int b(String str, int i) {
        if (i == 2) {
            return 3;
        }
        cqce cqceVar = cmvy.a;
        if (alwh.i(str)) {
            return 4;
        }
        return this.c.j(str) ? 2 : 1;
    }

    public final void a(elof elofVar, MessageCoreData messageCoreData, int i) {
        elyy elyyVarA;
        fcsu fcsuVar = this.a;
        String strAB = messageCoreData.aB();
        btxd btxdVarA = bbdn.a(aofa.c(strAB));
        if (btxdVarA == null) {
            elyyVarA = elyy.a;
        } else {
            btxdVarA.aA(1, "phone_number");
            String str = btxdVarA.b;
            if (str == null) {
                elyyVarA = elyy.a;
            } else {
                aiuo aiuoVar = new aiuo();
                aiuoVar.b = b(str, i);
                aiuoVar.b(str);
                elyyVarA = aiuoVar.a();
            }
        }
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elyyVarA.getClass();
        elpgVar.U = elyyVarA;
        elpgVar.d |= 262144;
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        ArrayList arrayList = new ArrayList();
        if (!conversationIdTypeA.b()) {
            for (ParticipantsTable.BindData bindData : ((bakt) this.b.b()).K(conversationIdTypeA)) {
                String strV = bindData.V();
                String strT = bindData.T();
                if (strV == null || strT == null) {
                    break;
                }
                aiuo aiuoVar2 = new aiuo();
                aiuoVar2.b = b(strV, i);
                aiuoVar2.b(strV);
                aiuoVar2.a = Optional.of(strT);
                arrayList.add(aiuoVar2.a());
            }
        }
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.a();
        evpz.addAll(arrayList, elpgVar2.V);
    }
}
