package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crwg {
    public static final ejxr a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;

    static {
        ejxr ejxrVarX = cdag.x("enable_chatbot_unsubscribe_logging");
        ejxrVarX.getClass();
        a = ejxrVarX;
    }

    public crwg(fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fcsuVar;
        this.e = fdjxVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    public final Runnable a(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return new Runnable() { // from class: crwc
                @Override // java.lang.Runnable
                public final void run() {
                    ejxr ejxrVar = crwg.a;
                }
            };
        }
        final ekgb ekgbVarE = bbca.e(((MessageCoreData) list.get(0)).A());
        return new Runnable() { // from class: crwd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                ekgb ekgbVar = ekgbVarE;
                if (ekgbVar.size() != 1) {
                    return;
                }
                crwg crwgVar = this;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ekgbVar.get(0);
                alqm alqmVarQ = ((alrj) crwgVar.c.b()).q(bindData);
                if (alqmVarQ.u()) {
                    return;
                }
                if (bbbe.d(bindData) || alqmVarQ.C() || alqmVarQ.s()) {
                    crwr crwrVar = (crwr) crwgVar.d.b();
                    String strR = bindData.R();
                    strR.getClass();
                    crwh crwhVarA = crwrVar.a(Long.parseLong(strR));
                    if (crwhVarA != null) {
                        crwi crwiVar = crwhVarA.c;
                        if (crwiVar == crwi.UNSUBSCRIBE_SENT || crwiVar == crwi.UNSUBSCRIBE_CONFIRMED) {
                            crwgVar.d("Bugle.Spam.ChatbotUnsubscribe.Deletion.Counts", 3);
                        } else {
                            crwgVar.d("Bugle.Spam.ChatbotUnsubscribe.Deletion.Counts", 2);
                        }
                    }
                }
            }
        };
    }

    public final void b(crwh crwhVar) {
        if (crwhVar == null) {
            return;
        }
        crwi crwiVar = crwhVar.c;
        if (crwiVar == crwi.UNSUBSCRIBE_SENT || crwiVar == crwi.UNSUBSCRIBE_CONFIRMED) {
            d("Bugle.Spam.ChatbotUnsubscribe.Deletion.Counts", 5);
        } else {
            d("Bugle.Spam.ChatbotUnsubscribe.Deletion.Counts", 4);
        }
    }

    public final void c(String str) {
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            auvw.m(this.e, null, new crwe(this, str, null), 3);
        }
    }

    public final void d(String str, int i) {
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            auvw.m(this.e, null, new crwf(this, str, i, null), 3);
        }
    }

    public final void e(int i) {
        d("Bugle.Spam.ChatbotUnsubscribe.BottomSheet.Counts", i);
    }

    public final void f(int i) {
        d("Bugle.Spam.ChatbotUnsubscribe.Tombstone.Counts", i);
    }

    public final void g(int i) {
        d("Bugle.Spam.ChatbotUnsubscribe.Toolstone.Counts", i);
    }
}
