package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atpi implements atsk {
    public static final /* synthetic */ int b = 0;
    private static final eksp c = eksp.c("BugleGroupManagement");
    public final fcsu a;
    private final fcsu d;
    private final alrj e;
    private final fcsu f;

    public atpi(fcsu fcsuVar, fcsu fcsuVar2, alrj alrjVar, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.d = fcsuVar2;
        this.e = alrjVar;
        this.f = fcsuVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audk audkVar = (audk) obj;
        ejwl.b(audkVar.d.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        fcsu fcsuVar = this.d;
        Stream streamFilter = Collection.EL.stream(((bakt) fcsuVar.b()).K(atrjVar.f())).filter(new Predicate() { // from class: atpc
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                int i = atpi.b;
                return ((ParticipantsTable.BindData) obj2).T() != null;
            }
        });
        Function function = new Function() { // from class: atpd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                int i = atpi.b;
                String strT = ((ParticipantsTable.BindData) obj2).T();
                strT.getClass();
                return strT;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        final alrj alrjVar = this.e;
        alrjVar.getClass();
        ekgp ekgpVar = (ekgp) streamFilter.collect(ekcv.a(function, new Function() { // from class: atpe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return alrjVar.q((ParticipantsTable.BindData) obj2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }));
        aucv aucvVar = audkVar.l;
        if (aucvVar == null) {
            aucvVar = aucv.a;
        }
        aucu aucuVarB = aucu.b(aucvVar.c);
        if (aucuVarB == null) {
            aucuVarB = aucu.CAUSE_UNSPECIFIED;
        }
        if (aucuVarB.equals(aucu.CAUSE_ONLY_SELF_IN_GROUP)) {
            ekfn ekfnVarValues = ekgpVar.values();
            final auem auemVar = (auem) auen.a.createBuilder();
            Stream map = Collection.EL.stream(ekfnVarValues).map(new Function() { // from class: atoz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    alqm alqmVar = (alqm) obj2;
                    asqx asqxVar = (asqx) this.a.a.b();
                    String strN = alqmVar.n();
                    strN.getClass();
                    return asqxVar.f(alqmVar, strN);
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            }).map(new Function() { // from class: atpa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    aubq aubqVar = (aubq) obj2;
                    int i = atpi.b;
                    augd augdVar = (augd) auge.a.createBuilder();
                    augdVar.copyOnWrite();
                    auge augeVar = (auge) augdVar.instance;
                    aubqVar.getClass();
                    augeVar.c = aubqVar;
                    augeVar.b |= 1;
                    return (auge) augdVar.build();
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            });
            auemVar.getClass();
            map.forEach(new Consumer() { // from class: atpb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    auemVar.c((auge) obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((auen) auemVar.instance).c.size() > 0) {
                eksl ekslVar = (eksl) c.h();
                ekslVar.X(cqnc.r, atrjVar.f().toString());
                ekslVar.X(cqnc.N, atrjVar.o());
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "buildGroupUpdateToRemoveAllParticipants", 371, "GroupFullStateParticipantsConverter.java")).r("Group full state notification will remove %s participant(s) from the group in self only error state.", ((auen) auemVar.instance).c.size());
            }
            auex auexVar = (auex) auey.a.createBuilder();
            String strO = atrjVar.o();
            auexVar.copyOnWrite();
            auey aueyVar = (auey) auexVar.instance;
            aueyVar.b |= 1;
            aueyVar.c = strO;
            auexVar.copyOnWrite();
            auey aueyVar2 = (auey) auexVar.instance;
            auen auenVar = (auen) auemVar.build();
            auenVar.getClass();
            aueyVar2.e = auenVar;
            aueyVar2.b |= 4;
            return (auey) auexVar.build();
        }
        ekgp ekgpVar2 = (ekgp) Collection.EL.stream(((bakt) fcsuVar.b()).x(atrjVar.f())).filter(new Predicate() { // from class: atpf
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                int i = atpi.b;
                return ((bgvm) obj2).g() != null;
            }
        }).collect(ekcv.a(new Function() { // from class: atpg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                int i = atpi.b;
                String strG = ((bgvm) obj2).g();
                strG.getClass();
                return strG;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Function() { // from class: atph
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bgvm) obj2).f();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }));
        ekgi ekgiVar = new ekgi();
        for (auek auekVar : audkVar.h) {
            aubq aubqVar = auekVar.c;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            aubp aubpVar = aubp.PHONE;
            aubp aubpVarB = aubp.b(aubqVar.c);
            if (aubpVarB == null) {
                aubpVarB = aubp.UNKNOWN_TYPE;
            }
            if (aubpVar.equals(aubpVarB)) {
                ekgiVar.i(aubqVar.d, auekVar);
            } else {
                eksl ekslVar2 = (eksl) ((eksl) c.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "toGroupUpdate", 118, "GroupFullStateParticipantsConverter.java");
                aubp aubpVarB2 = aubp.b(aubqVar.c);
                if (aubpVarB2 == null) {
                    aubpVarB2 = aubp.UNKNOWN_TYPE;
                }
                ekslVar2.D("Group participant does not have a ChatEndpoint of type Phone. Type: %s. ID: %s.", aubpVarB2.name(), cqcv.b(aubqVar.d));
            }
        }
        ekgp ekgpVarC = ekgiVar.c();
        auem auemVar2 = (auem) auen.a.createBuilder();
        ekqg it = ekpg.c(ekgpVar.keySet(), ekgpVarC.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            auek auekVar2 = (auek) ekgpVarC.get(str);
            auekVar2.getClass();
            auej auejVar = auej.DEPARTED;
            auej auejVarB = auej.b(auekVar2.d);
            if (auejVarB == null) {
                auejVarB = auej.UNKNOWN_STATE;
            }
            if (auejVar.equals(auejVarB)) {
                ekrw ekrwVarN = c.n();
                ekrwVarN.X(cqnc.r, atrjVar.f().toString());
                ekrwVarN.X(cqnc.N, atrjVar.o());
                ekrz ekrzVar = cqnc.q;
                aubq aubqVar2 = auekVar2.c;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                ekrwVarN.X(ekrzVar, cqcv.b(aubqVar2.d));
                eksl ekslVar3 = (eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 214, "GroupFullStateParticipantsConverter.java");
                auej auejVarB2 = auej.b(auekVar2.d);
                if (auejVarB2 == null) {
                    auejVarB2 = auej.UNKNOWN_STATE;
                }
                ekslVar3.t("Found a departed server participant. Generating remove participant GroupOperation. Participant status: %s", auejVarB2);
                augd augdVar = (augd) auge.a.createBuilder();
                aubq aubqVar3 = auekVar2.c;
                if (aubqVar3 == null) {
                    aubqVar3 = aubq.a;
                }
                augdVar.copyOnWrite();
                auge augeVar = (auge) augdVar.instance;
                aubqVar3.getClass();
                augeVar.c = aubqVar3;
                augeVar.b |= 1;
                aufb aufbVar = auekVar2.e;
                if (aufbVar == null) {
                    aufbVar = aufb.a;
                }
                augdVar.copyOnWrite();
                auge augeVar2 = (auge) augdVar.instance;
                aufbVar.getClass();
                augeVar2.d = aufbVar;
                augeVar2.b |= 2;
                auemVar2.b(augdVar);
            } else {
                auej auejVarB3 = auej.b(auekVar2.d);
                if (auejVarB3 == null) {
                    auejVarB3 = auej.UNKNOWN_STATE;
                }
                if (auejVarB3.equals(ekgpVar2.get(str))) {
                    ekrw ekrwVarN2 = c.n();
                    ekrwVarN2.X(cqnc.r, atrjVar.f().toString());
                    ekrwVarN2.X(cqnc.N, atrjVar.o());
                    ekrz ekrzVar2 = cqnc.q;
                    aubq aubqVar4 = auekVar2.c;
                    if (aubqVar4 == null) {
                        aubqVar4 = aubq.a;
                    }
                    ekrwVarN2.X(ekrzVar2, cqcv.b(aubqVar4.d));
                    ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 255, "GroupFullStateParticipantsConverter.java")).q("Found a participant present on both the server and the client.");
                } else {
                    ekrw ekrwVarN3 = c.n();
                    ekrwVarN3.X(cqnc.r, atrjVar.f().toString());
                    ekrwVarN3.X(cqnc.N, atrjVar.o());
                    ekrz ekrzVar3 = cqnc.q;
                    aubq aubqVar5 = auekVar2.c;
                    if (aubqVar5 == null) {
                        aubqVar5 = aubq.a;
                    }
                    ekrwVarN3.X(ekrzVar3, cqcv.b(aubqVar5.d));
                    eksl ekslVar4 = (eksl) ekrwVarN3.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 235, "GroupFullStateParticipantsConverter.java");
                    auej auejVarB4 = auej.b(auekVar2.d);
                    if (auejVarB4 == null) {
                        auejVarB4 = auej.UNKNOWN_STATE;
                    }
                    ekslVar4.t("Found an updated server participant. Generating update participant GroupOperation. Participant status: %s", auejVarB4);
                    auit auitVar = (auit) auiu.a.createBuilder();
                    aubq aubqVar6 = auekVar2.c;
                    if (aubqVar6 == null) {
                        aubqVar6 = aubq.a;
                    }
                    auitVar.copyOnWrite();
                    auiu auiuVar = (auiu) auitVar.instance;
                    aubqVar6.getClass();
                    auiuVar.c = aubqVar6;
                    auiuVar.b |= 1;
                    auej auejVarB5 = auej.b(auekVar2.d);
                    if (auejVarB5 == null) {
                        auejVarB5 = auej.UNKNOWN_STATE;
                    }
                    auitVar.copyOnWrite();
                    auiu auiuVar2 = (auiu) auitVar.instance;
                    auiuVar2.d = auejVarB5.e;
                    auiuVar2.b |= 2;
                    aufb aufbVar2 = auekVar2.e;
                    if (aufbVar2 == null) {
                        aufbVar2 = aufb.a;
                    }
                    auitVar.copyOnWrite();
                    auiu auiuVar3 = (auiu) auitVar.instance;
                    aufbVar2.getClass();
                    auiuVar3.e = aufbVar2;
                    auiuVar3.b |= 4;
                    auemVar2.copyOnWrite();
                    auen auenVar2 = (auen) auemVar2.instance;
                    auiu auiuVar4 = (auiu) auitVar.build();
                    auiuVar4.getClass();
                    evtg evtgVar = auenVar2.d;
                    if (!evtgVar.c()) {
                        auenVar2.d = evsn.mutableCopy(evtgVar);
                    }
                    auenVar2.d.add(auiuVar4);
                }
            }
        }
        ekqg it2 = ekpg.b(ekgpVarC.keySet(), ekgpVar.keySet()).iterator();
        while (it2.hasNext()) {
            auek auekVar3 = (auek) ekgpVarC.get((String) it2.next());
            auekVar3.getClass();
            auej auejVar2 = auej.JOINED;
            auej auejVarB6 = auej.b(auekVar3.d);
            if (auejVarB6 == null) {
                auejVarB6 = auej.UNKNOWN_STATE;
            }
            if (!auejVar2.equals(auejVarB6)) {
                auej auejVar3 = auej.PENDING;
                auej auejVarB7 = auej.b(auekVar3.d);
                if (auejVarB7 == null) {
                    auejVarB7 = auej.UNKNOWN_STATE;
                }
                if (!auejVar3.equals(auejVarB7)) {
                    auej auejVar4 = auej.UNKNOWN_STATE;
                    auej auejVarB8 = auej.b(auekVar3.d);
                    if (auejVarB8 == null) {
                        auejVarB8 = auejVar4;
                    }
                    if (!auejVar4.equals(auejVarB8)) {
                        ekrw ekrwVarN4 = c.n();
                        ekrwVarN4.X(cqnc.r, atrjVar.f().toString());
                        ekrwVarN4.X(cqnc.N, atrjVar.o());
                        ekrz ekrzVar4 = cqnc.q;
                        aubq aubqVar7 = auekVar3.c;
                        if (aubqVar7 == null) {
                            aubqVar7 = aubq.a;
                        }
                        ekrwVarN4.X(ekrzVar4, cqcv.b(aubqVar7.d));
                        ((eksl) ekrwVarN4.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnServerButNotOnClient", 305, "GroupFullStateParticipantsConverter.java")).q("Found a departed server participant not present on the client. Ignoring participant.");
                    }
                }
            }
            ekrw ekrwVarN5 = c.n();
            ekrwVarN5.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN5.X(cqnc.N, atrjVar.o());
            ekrz ekrzVar5 = cqnc.q;
            aubq aubqVar8 = auekVar3.c;
            if (aubqVar8 == null) {
                aubqVar8 = aubq.a;
            }
            ekrwVarN5.X(ekrzVar5, cqcv.b(aubqVar8.d));
            eksl ekslVar5 = (eksl) ekrwVarN5.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnServerButNotOnClient", 285, "GroupFullStateParticipantsConverter.java");
            auej auejVarB9 = auej.b(auekVar3.d);
            if (auejVarB9 == null) {
                auejVarB9 = auej.UNKNOWN_STATE;
            }
            ekslVar5.t("Found a server participant not present on the client. Generating add participant GroupEvent. Participant status: %s", auejVarB9);
            auay auayVar = (auay) auaz.a.createBuilder();
            aubq aubqVar9 = auekVar3.c;
            if (aubqVar9 == null) {
                aubqVar9 = aubq.a;
            }
            auayVar.copyOnWrite();
            auaz auazVar = (auaz) auayVar.instance;
            aubqVar9.getClass();
            auazVar.c = aubqVar9;
            auazVar.b |= 1;
            auej auejVarB10 = auej.b(auekVar3.d);
            if (auejVarB10 == null) {
                auejVarB10 = auej.UNKNOWN_STATE;
            }
            auayVar.copyOnWrite();
            auaz auazVar2 = (auaz) auayVar.instance;
            auazVar2.e = auejVarB10.e;
            auazVar2.b |= 4;
            aufb aufbVar3 = auekVar3.e;
            if (aufbVar3 == null) {
                aufbVar3 = aufb.a;
            }
            auayVar.copyOnWrite();
            auaz auazVar3 = (auaz) auayVar.instance;
            aufbVar3.getClass();
            auazVar3.d = aufbVar3;
            auazVar3.b |= 2;
            auemVar2.a(auayVar);
        }
        ekqg it3 = ekpg.b(ekgpVar.keySet(), ekgpVarC.keySet()).iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            ekrw ekrwVarN6 = c.n();
            ekrwVarN6.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN6.X(cqnc.N, atrjVar.o());
            ekrwVarN6.X(cqnc.q, cqcv.b(str2));
            ((eksl) ekrwVarN6.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnClientButNotOnServer", 330, "GroupFullStateParticipantsConverter.java")).q("Found a client participant not present on the server. Generating remove participant GroupEvent.");
            augd augdVar2 = (augd) auge.a.createBuilder();
            asqx asqxVar = (asqx) this.a.b();
            alqm alqmVar = (alqm) ekgpVar.get(str2);
            alqmVar.getClass();
            aubq aubqVarF = asqxVar.f(alqmVar, str2);
            augdVar2.copyOnWrite();
            auge augeVar3 = (auge) augdVar2.instance;
            aubqVarF.getClass();
            augeVar3.c = aubqVarF;
            augeVar3.b |= 1;
            auemVar2.b(augdVar2);
        }
        auex auexVar2 = (auex) auey.a.createBuilder();
        String str3 = audkVar.d;
        auexVar2.copyOnWrite();
        auey aueyVar3 = (auey) auexVar2.instance;
        str3.getClass();
        aueyVar3.b |= 1;
        aueyVar3.c = str3;
        auexVar2.copyOnWrite();
        auey aueyVar4 = (auey) auexVar2.instance;
        auen auenVar3 = (auen) auemVar2.build();
        auenVar3.getClass();
        aueyVar4.e = auenVar3;
        aueyVar4.b |= 4;
        avoe avoeVarD = atrjVar.d();
        avoe avoeVar = avoe.RCS_GROUP_SELF_ONLY;
        if (!avoeVarD.equals(avoeVar)) {
            evtg evtgVar2 = audkVar.h;
            if (evtgVar2.size() == 1) {
                aubq aubqVar10 = ((auek) evtgVar2.get(0)).c;
                if (aubqVar10 == null) {
                    aubqVar10 = aubq.a;
                }
                if (!aubqVar10.equals(atrjVar.c())) {
                    ((ains) this.f.b()).c("Bugle.RcsGroups.NotificationPipeline.FullState.OnlyOneParticipantButNotSelf.Count");
                }
                aucw aucwVar = (aucw) aucx.a.createBuilder();
                aucwVar.copyOnWrite();
                aucx aucxVar = (aucx) aucwVar.instance;
                aucxVar.b |= 1;
                aucxVar.c = true;
                aucwVar.copyOnWrite();
                aucx aucxVar2 = (aucx) aucwVar.instance;
                aucxVar2.d = avoeVar.a();
                aucxVar2.b |= 2;
                auexVar2.copyOnWrite();
                auey aueyVar5 = (auey) auexVar2.instance;
                aucx aucxVar3 = (aucx) aucwVar.build();
                aucxVar3.getClass();
                aueyVar5.j = aucxVar3;
                aueyVar5.b |= 128;
            }
        }
        return (auey) auexVar2.build();
    }
}
