package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfwc {
    public final dfvy a;
    public final Object b = new Object();
    public final dfwa c;

    public dfwc(dfvy dfvyVar, dfwa dfwaVar) {
        this.a = dfvyVar;
        this.c = dfwaVar;
    }

    public static String c(Conversation conversation) {
        return conversation.c() == 2 ? conversation.b() : conversation.a().a();
    }

    public final dfwe a(efdi efdiVar) {
        dgzn dgznVarCreateOutgoingSession;
        Conversation conversationB = efdiVar.b();
        String strC = c(conversationB);
        dfvn dfvnVar = new dfvn();
        synchronized (this.b) {
            dfwa dfwaVar = this.c;
            dgznVarCreateOutgoingSession = (dgzn) dfwaVar.get(strC);
            if (dgznVarCreateOutgoingSession == null) {
                dgznVarCreateOutgoingSession = this.a.createOutgoingSession(dfwf.f(conversationB.a()));
                dgznVarCreateOutgoingSession.bm();
                dgznVarCreateOutgoingSession.O = dgyn.CONFERENCE_URI;
                if (efdiVar.e()) {
                    dhja.c("Updating CREATED GroupSession to support encryption", new Object[0]);
                    dgznVarCreateOutgoingSession.aY(true);
                    dgznVarCreateOutgoingSession.aX(true);
                }
                String strB = conversationB.b();
                String strB2 = dgznVarCreateOutgoingSession.ai() ? ebmh.b() : strB;
                if (true != dgznVarCreateOutgoingSession.ai()) {
                    strB = null;
                }
                dgznVarCreateOutgoingSession.y = strB2;
                if (strB != null) {
                    dgznVarCreateOutgoingSession.z = strB;
                }
                dfvnVar.a = 1;
                dgznVarCreateOutgoingSession.aF(new dfwb(this, strC, dgznVarCreateOutgoingSession));
                dfwaVar.put(strC, dgznVarCreateOutgoingSession);
            } else {
                dfvnVar.a = 2;
            }
        }
        dfvnVar.b(dgznVarCreateOutgoingSession);
        return dfvnVar.a();
    }

    public final dfwe b(Conversation conversation, dhat dhatVar) {
        dfwe dfweVarA;
        Object obj = this.b;
        synchronized (obj) {
            String strC = c(conversation);
            dhja.c("Using session key for incoming session: %s", dhiz.PHONE_NUMBER.c(strC));
            if (dhatVar instanceof dhaq) {
                strC = a.v(strC, "standfw_");
            }
            dfwa dfwaVar = this.c;
            dgzn dgznVar = (dgzn) dfwaVar.get(strC);
            if (dgznVar == null) {
                dhatVar.aF(new dfwb(this, strC, dhatVar));
                dfwaVar.put(strC, dhatVar);
                dfvn dfvnVar = new dfvn();
                dfvnVar.a = 1;
                dfvnVar.b(dhatVar);
                return dfvnVar.a();
            }
            String strC2 = c(conversation);
            synchronized (obj) {
                dhatVar.aF(new dfwb(this, strC2, dhatVar));
                dfwaVar.put(strC2, dhatVar);
                dfvn dfvnVar2 = new dfvn();
                dfvnVar2.a = 3;
                dfvnVar2.b(dgznVar);
                dfweVarA = dfvnVar2.a();
            }
            return dfweVarA;
        }
    }
}
