package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awfh {
    public final eosc c;
    public final fcsu d;
    private final fcsu f;
    private final fcsu g;
    private final awch h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private static final eksp e = eksp.c("BugleConversation");
    static final cczv a = cdag.h(cdag.b, "log_destinations_from_telephony", true);
    public static final cczv b = cdag.h(cdag.b, "bug_182819110", false);

    public awfh(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, awch awchVar) {
        this.f = fcsuVar;
        this.d = fcsuVar2;
        this.c = eoscVar;
        this.g = fcsuVar4;
        this.h = awchVar;
        this.i = fcsuVar3;
        this.k = fcsuVar5;
        this.j = fcsuVar6;
    }

    public static emub c(awcf awcfVar) {
        emua emuaVar = (emua) emub.a.createBuilder();
        cczv cczvVar = b;
        String strF = ((Boolean) cczvVar.e()).booleanValue() ? awcfVar.f() : awcfVar.e();
        emuaVar.copyOnWrite();
        emub emubVar = (emub) emuaVar.instance;
        emubVar.b |= 2;
        emubVar.f = strF;
        String strD = awcfVar.d();
        emuaVar.copyOnWrite();
        emub emubVar2 = (emub) emuaVar.instance;
        emubVar2.b |= 1;
        emubVar2.e = strD;
        awcg awcgVarA = awcfVar.a();
        if (awcgVarA != null) {
            emuc emucVar = (emuc) emud.a.createBuilder();
            emucVar.copyOnWrite();
            emud emudVar = (emud) emucVar.instance;
            emudVar.b |= 2;
            avoh avohVar = (avoh) awcgVarA;
            emudVar.d = avohVar.c;
            if (((Boolean) cczvVar.e()).booleanValue()) {
                Optional optional = avohVar.a;
                if (optional.isPresent()) {
                    int i = ((crnc) optional.get()).a;
                    emucVar.copyOnWrite();
                    emud emudVar2 = (emud) emucVar.instance;
                    emudVar2.b |= 1;
                    emudVar2.c = i;
                }
            }
            emud emudVar3 = (emud) emucVar.build();
            emuaVar.copyOnWrite();
            emub emubVar3 = (emub) emuaVar.instance;
            emudVar3.getClass();
            emubVar3.d = emudVar3;
            emubVar3.c = 3;
        }
        emtz emtzVarB = awcfVar.b();
        if (emtzVarB != null) {
            emuaVar.copyOnWrite();
            emub emubVar4 = (emub) emuaVar.instance;
            emubVar4.d = emtzVarB;
            emubVar4.c = 5;
        }
        emuf emufVarC = awcfVar.c();
        if (emufVarC != null) {
            emuaVar.copyOnWrite();
            emub emubVar5 = (emub) emuaVar.instance;
            emubVar5.d = emufVarC;
            emubVar5.c = 4;
        }
        return (emub) emuaVar.build();
    }

    static emvc e(awcf awcfVar) {
        emvb emvbVar = (emvb) emvc.a.createBuilder();
        awcg awcgVarA = awcfVar.a();
        if (awcgVarA == null) {
            return (emvc) emvbVar.build();
        }
        avoh avohVar = (avoh) awcgVarA;
        boolean zIsPresent = avohVar.b.isPresent();
        emvbVar.copyOnWrite();
        emvc emvcVar = (emvc) emvbVar.instance;
        emvcVar.b |= 1;
        emvcVar.c = zIsPresent;
        Optional optional = avohVar.a;
        if (optional.isPresent()) {
            int i = ((crnc) optional.get()).a;
            emvbVar.copyOnWrite();
            emvc emvcVar2 = (emvc) emvbVar.instance;
            emvcVar2.b |= 2;
            emvcVar2.d = i;
        }
        return (emvc) emvbVar.build();
    }

    public static int f(bajf bajfVar) {
        int iE = bajfVar.E();
        if (iE == 0) {
            return 2;
        }
        if (iE != 1) {
            return iE != 2 ? 1 : 4;
        }
        return 3;
    }

    /* JADX WARN: Type inference failed for: r14v47, types: [java.lang.Object, java.util.List] */
    public final awfg a(ConversationIdType conversationIdType) {
        Optional optionalEmpty;
        bajf bajfVarA = ((bapl) this.d.b()).a(conversationIdType);
        List<ParticipantsTable.BindData> listK = ((bakt) this.f.b()).K(conversationIdType);
        emug emugVar = (emug) emuh.a.createBuilder();
        emuv emuvVar = (emuv) emuw.a.createBuilder();
        long jB = ((aika) this.k.b()).b(conversationIdType);
        emugVar.copyOnWrite();
        emuh emuhVar = (emuh) emugVar.instance;
        emuhVar.b |= 1;
        emuhVar.c = jB;
        if (bajfVarA == null) {
            return new awev((emuh) emugVar.build(), (emuw) emuvVar.build());
        }
        long jA = cnqk.a(bajfVarA.j());
        emugVar.copyOnWrite();
        emuh emuhVar2 = (emuh) emugVar.instance;
        emuhVar2.b |= 2;
        emuhVar2.d = jA;
        if (((Boolean) a.e()).booleanValue() && bajfVarA.j().c()) {
            fcsu fcsuVar = this.g;
            if (((cnmc) fcsuVar.b()).a()) {
                eieu eieuVarK = eiiy.k("ConversationInfoCreator#populateTelephonyThreadRecipients");
                try {
                    cnqj cnqjVarJ = bajfVarA.j();
                    if (((cnmc) fcsuVar.b()).a() && !cnqjVarJ.d()) {
                        try {
                            optionalEmpty = ((cmqj) this.i.b()).aj(cnqjVarJ);
                        } catch (Throwable th) {
                            ((eksl) ((eksl) e.a(Level.WARNING).g(th)).h("com/google/android/apps/messaging/shared/conversation/match/logging/ConversationInfoCreator", "getTelephonyThreadRecipients", 213, "ConversationInfoCreator.java")).q("Unable to iterate through canonical recipients");
                            optionalEmpty = Optional.empty();
                        }
                    } else {
                        optionalEmpty = Optional.empty();
                    }
                    if (!optionalEmpty.isEmpty()) {
                        ?? r14 = optionalEmpty.get();
                        int size = r14.size();
                        for (int i = 0; i < size; i++) {
                            awcf awcfVarA = this.h.a(ejwk.b(((alqm) r14.get(i)).n()));
                            emub emubVarC = c(awcfVarA);
                            emugVar.copyOnWrite();
                            emuh emuhVar3 = (emuh) emugVar.instance;
                            emubVarC.getClass();
                            evtg evtgVar = emuhVar3.h;
                            if (!evtgVar.c()) {
                                emuhVar3.h = evsn.mutableCopy(evtgVar);
                            }
                            emuhVar3.h.add(emubVarC);
                            emvc emvcVarE = e(awcfVarA);
                            emuvVar.copyOnWrite();
                            emuw emuwVar = (emuw) emuvVar.instance;
                            emvcVarE.getClass();
                            evtg evtgVar2 = emuwVar.c;
                            if (!evtgVar2.c()) {
                                emuwVar.c = evsn.mutableCopy(evtgVar2);
                            }
                            emuwVar.c.add(emvcVarE);
                        }
                    }
                    eieuVarK.close();
                } catch (Throwable th2) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        if (bajfVarA.E() == 2) {
            String strR = bajfVarA.r();
            if (strR == null) {
                strR = "";
            }
            emut emutVar = (emut) emuu.a.createBuilder();
            emua emuaVar = (emua) emub.a.createBuilder();
            emue emueVar = (emue) emuf.a.createBuilder();
            String strC = this.h.c(strR);
            emueVar.copyOnWrite();
            emuf emufVar = (emuf) emueVar.instance;
            emufVar.b |= 1;
            emufVar.c = strC;
            emuaVar.copyOnWrite();
            emub emubVar = (emub) emuaVar.instance;
            emuf emufVar2 = (emuf) emueVar.build();
            emufVar2.getClass();
            emubVar.d = emufVar2;
            emubVar.c = 4;
            emutVar.copyOnWrite();
            emuu emuuVar = (emuu) emutVar.instance;
            emub emubVar2 = (emub) emuaVar.build();
            emubVar2.getClass();
            emuuVar.c = emubVar2;
            emuuVar.b |= 1;
            emugVar.a(emutVar);
        } else {
            for (ParticipantsTable.BindData bindData : listK) {
                emut emutVarD = d(bindData);
                emux emuxVar = (emux) emuy.a.createBuilder();
                String strT = bindData.T();
                if (strT != null) {
                    emvc emvcVarE2 = e(this.h.a(strT));
                    emuxVar.copyOnWrite();
                    emuy emuyVar = (emuy) emuxVar.instance;
                    emvcVarE2.getClass();
                    emuyVar.d = emvcVarE2;
                    emuyVar.b |= 2;
                }
                String strV = bindData.V();
                if (strV != null) {
                    emvc emvcVarE3 = e(this.h.a(strV));
                    emuxVar.copyOnWrite();
                    emuy emuyVar2 = (emuy) emuxVar.instance;
                    emvcVarE3.getClass();
                    emuyVar2.c = emvcVarE3;
                    emuyVar2.b |= 1;
                }
                emuvVar.copyOnWrite();
                emuw emuwVar2 = (emuw) emuvVar.instance;
                emuy emuyVar3 = (emuy) emuxVar.build();
                emuyVar3.getClass();
                evtg evtgVar3 = emuwVar2.b;
                if (!evtgVar3.c()) {
                    emuwVar2.b = evsn.mutableCopy(evtgVar3);
                }
                emuwVar2.b.add(emuyVar3);
                emugVar.a(emutVarD);
            }
        }
        int iF = f(bajfVarA);
        emugVar.copyOnWrite();
        emuh emuhVar4 = (emuh) emugVar.instance;
        emuhVar4.e = iF - 1;
        emuhVar4.b |= 4;
        boolean zP = bajfVarA.P();
        emugVar.copyOnWrite();
        emuh emuhVar5 = (emuh) emugVar.instance;
        emuhVar5.b |= 8;
        emuhVar5.f = zP;
        return new awev((emuh) emugVar.build(), (emuw) emuvVar.build());
    }

    public final eiju b(final ConversationIdType conversationIdType) {
        return eijx.g(new Callable() { // from class: awff
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((awev) this.a.a(conversationIdType)).a;
            }
        }, this.c);
    }

    public final emut d(ParticipantsTable.BindData bindData) {
        emut emutVar = (emut) emuu.a.createBuilder();
        String strT = bindData.T();
        if (strT != null) {
            emub emubVarC = c(this.h.a(strT));
            emutVar.copyOnWrite();
            emuu emuuVar = (emuu) emutVar.instance;
            emubVarC.getClass();
            emuuVar.c = emubVarC;
            emuuVar.b |= 1;
        }
        String strV = bindData.V();
        if (strV != null) {
            emub emubVarC2 = c(this.h.a(strV));
            emutVar.copyOnWrite();
            emuu emuuVar2 = (emuu) emutVar.instance;
            emubVarC2.getClass();
            emuuVar2.d = emubVarC2;
            emuuVar2.b |= 2;
        }
        if (bindData.p() == 1) {
            Optional optionalB = this.h.b(cmpf.a(bindData));
            optionalB.isPresent();
            emub emubVar = emub.a;
            emua emuaVar = (emua) emubVar.createBuilder();
            Object obj = optionalB.get();
            emuaVar.copyOnWrite();
            emub emubVar2 = (emub) emuaVar.instance;
            emubVar2.d = obj;
            emubVar2.c = 5;
            emub emubVar3 = (emub) emuaVar.buildPartial();
            emutVar.copyOnWrite();
            emuu emuuVar3 = (emuu) emutVar.instance;
            emubVar3.getClass();
            emub emubVar4 = emuuVar3.c;
            if (emubVar4 != null && emubVar4 != emubVar) {
                emua emuaVar2 = (emua) emubVar.createBuilder(emubVar4);
                emuaVar2.mergeFrom((emua) emubVar3);
                emubVar3 = (emub) emuaVar2.buildPartial();
            }
            emuuVar3.c = emubVar3;
            emuuVar3.b |= 1;
        }
        return emutVar;
    }
}
