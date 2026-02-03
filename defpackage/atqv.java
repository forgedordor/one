package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atqv implements atru {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final cigc b;
    public final atrt c;
    private final eosc d;
    private final attm e;

    public atqv(eosc eoscVar, attm attmVar, cigc cigcVar, atrt atrtVar) {
        this.d = eoscVar;
        this.e = attmVar;
        this.b = cigcVar;
        this.c = atrtVar;
    }

    @Override // defpackage.atru
    public final eiju a(final ConversationIdType conversationIdType, auey aueyVar) {
        final aucn aucnVar = aueyVar.f;
        if (aucnVar == null) {
            aucnVar = aucn.a;
        }
        return this.e.h(conversationIdType).h(new ejvr() { // from class: atqu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atqv atqvVar;
                ConversationIdType conversationIdType2;
                atrj atrjVar = (atrj) obj;
                cifz cifzVarA = atrjVar.h().a();
                aucn aucnVar2 = aucnVar;
                Iterator<E> it = aucnVar2.b.iterator();
                while (true) {
                    atqvVar = this.a;
                    if (!it.hasNext()) {
                        break;
                    }
                    auax auaxVar = (auax) it.next();
                    cigc cigcVar = atqvVar.b;
                    aucp aucpVarB = aucp.b(auaxVar.c);
                    if (aucpVarB == null) {
                        aucpVarB = aucp.UNKNOWN_TYPE;
                    }
                    ciga cigaVar = (ciga) cigcVar.fM(aucpVarB);
                    if (cigaVar == null) {
                        eksl ekslVar = (eksl) atqv.a.n().h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "addCapabilitiesToBuilder", 103, "CapabilitiesGroupMetadataProcessor.java");
                        aucp aucpVarB2 = aucp.b(auaxVar.c);
                        if (aucpVarB2 == null) {
                            aucpVarB2 = aucp.UNKNOWN_TYPE;
                        }
                        ekslVar.t("Received a server capability not supported by the client: %s", aucpVarB2.name());
                    } else {
                        cifzVarA.c(cigaVar);
                    }
                }
                for (augc augcVar : aucnVar2.c) {
                    cigc cigcVar2 = atqvVar.b;
                    aucp aucpVarB3 = aucp.b(augcVar.c);
                    if (aucpVarB3 == null) {
                        aucpVarB3 = aucp.UNKNOWN_TYPE;
                    }
                    ciga cigaVar2 = (ciga) cigcVar2.fM(aucpVarB3);
                    if (cigaVar2 == null) {
                        eksl ekslVar2 = (eksl) atqv.a.n().h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "removeCapabilitiesFromBuilder", 120, "CapabilitiesGroupMetadataProcessor.java");
                        aucp aucpVarB4 = aucp.b(augcVar.c);
                        if (aucpVarB4 == null) {
                            aucpVarB4 = aucp.UNKNOWN_TYPE;
                        }
                        ekslVar2.t("Received a server capability not supported by the client: %s", aucpVarB4.name());
                    } else {
                        cifzVarA.b(cigaVar2);
                    }
                }
                cigb cigbVarA = cifzVarA.a();
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("CapabilitiesG/roupMetadataProcessor#process");
                boteVar.al();
                boteVar.O(cigbVarA);
                boteVar.f(atrjVar.f());
                ekrw ekrwVarN = atqv.a.n();
                ekrwVarN.X(cqnc.u, atrjVar.i());
                ekrwVarN.X(cqnc.r, atrjVar.f().toString());
                ekrwVarN.X(cqnc.N, atrjVar.o());
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "process", 81, "CapabilitiesGroupMetadataProcessor.java")).D("RCS group capabilities updated. Previous capabilities: %s. New capabilities; %s", atrjVar.h().c(), cigbVarA.c());
                atrt atrtVar = atqvVar.c;
                Iterator<E> it2 = aucnVar2.b.iterator();
                while (true) {
                    conversationIdType2 = conversationIdType;
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i = ((auax) it2.next()).c;
                    aucp aucpVarB5 = aucp.b(i);
                    if (aucpVarB5 == null) {
                        aucpVarB5 = aucp.UNKNOWN_TYPE;
                    }
                    if (aucpVarB5 == aucp.REMOVE_PARTICIPANT_BY_ALL) {
                        atrtVar.a.a(conversationIdType2, 3);
                    } else {
                        aucp aucpVarB6 = aucp.b(i);
                        if (aucpVarB6 == null) {
                            aucpVarB6 = aucp.UNKNOWN_TYPE;
                        }
                        if (aucpVarB6 == aucp.REMOVE_PARTICIPANT_BY_ADMIN) {
                            atrtVar.a.a(conversationIdType2, 4);
                        }
                    }
                }
                Iterator<E> it3 = aucnVar2.c.iterator();
                while (it3.hasNext()) {
                    int i2 = ((augc) it3.next()).c;
                    aucp aucpVarB7 = aucp.b(i2);
                    if (aucpVarB7 == null) {
                        aucpVarB7 = aucp.UNKNOWN_TYPE;
                    }
                    if (aucpVarB7 != aucp.REMOVE_PARTICIPANT_BY_ALL) {
                        aucp aucpVarB8 = aucp.b(i2);
                        if (aucpVarB8 == null) {
                            aucpVarB8 = aucp.UNKNOWN_TYPE;
                        }
                        if (aucpVarB8 == aucp.REMOVE_PARTICIPANT_BY_ADMIN) {
                        }
                    }
                    atrtVar.a.a(conversationIdType2, 2);
                }
                return cbcw.i();
            }
        }, this.d);
    }
}
