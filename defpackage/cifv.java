package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cifv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fdjx f;
    private final aofc g;

    public cifv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aofc aofcVar, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        aofcVar.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.g = aofcVar;
        this.e = fcsuVar4;
        this.f = fdjxVar;
    }

    public static final boolean c(ekgb ekgbVar) {
        if (ekgbVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            if (!((aoer) it.next()).x()) {
                return true;
            }
        }
        return false;
    }

    public final Object a(fcxy fcxyVar) {
        eiju eijuVarB = this.g.a().b();
        eijuVarB.getClass();
        return fdxs.c(eijuVarB, fcxyVar);
    }

    public final void b(audk audkVar, atrj atrjVar, ewxh ewxhVar) {
        audkVar.getClass();
        ewxhVar.getClass();
        ConversationIdType conversationIdTypeF = atrjVar.f();
        if (conversationIdTypeF.b()) {
            ((eksl) a.j()).q("Propagating invalid groupConversationId. Impossible to log participant count.");
        } else {
            auvw.k(this.f, null, null, new cifu(this, audkVar, conversationIdTypeF, ewxhVar, null), 3);
        }
    }
}
