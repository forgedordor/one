package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atqe implements atsk {
    public static final /* synthetic */ int b = 0;
    private static final eksp c = eksp.c("BugleGroupManagement");
    public final fcsu a;
    private final fcsu d;
    private final alrj e;

    public atqe(fcsu fcsuVar, alrj alrjVar, fcsu fcsuVar2) {
        this.d = fcsuVar;
        this.e = alrjVar;
        this.a = fcsuVar2;
    }

    private final ekgb b(final atrj atrjVar, final boolean z) {
        Stream streamFilter = Collection.EL.stream(((bakt) this.d.b()).K(atrjVar.f())).filter(new Predicate() { // from class: atqa
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
            public final boolean test(Object obj) {
                int i = atqe.b;
                return ((ParticipantsTable.BindData) obj).T() != null;
            }
        });
        final alrj alrjVar = this.e;
        alrjVar.getClass();
        Stream streamFilter2 = streamFilter.map(new Function() { // from class: atqb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return alrjVar.q((ParticipantsTable.BindData) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: atqc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                alqm alqmVar = (alqm) obj;
                asqx asqxVar = (asqx) this.a.a.b();
                String strN = alqmVar.n();
                strN.getClass();
                return asqxVar.f(alqmVar, strN);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: atqd
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
            public final boolean test(Object obj) {
                aubq aubqVar = (aubq) obj;
                int i = atqe.b;
                return z || !aubqVar.equals(atrjVar.c());
            }
        });
        int i = ekgb.d;
        return (ekgb) streamFilter2.collect(ekcv.a);
    }

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audc audcVar = (audc) obj;
        ejwl.b(audcVar.e.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aucv aucvVar = audcVar.s;
        if (aucvVar == null) {
            aucvVar = aucv.a;
        }
        aucu aucuVarB = aucu.b(aucvVar.c);
        if (aucuVarB == null) {
            aucuVarB = aucu.CAUSE_UNSPECIFIED;
        }
        if (aucuVarB.equals(aucu.CAUSE_ONLY_SELF_IN_GROUP)) {
            final auem auemVar = (auem) auen.a.createBuilder();
            Stream map = Collection.EL.stream(b(atrjVar, true)).map(new Function() { // from class: atpx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    aubq aubqVar = (aubq) obj2;
                    int i = atqe.b;
                    augd augdVar = (augd) auge.a.createBuilder();
                    augdVar.copyOnWrite();
                    auge augeVar = (auge) augdVar.instance;
                    aubqVar.getClass();
                    augeVar.c = aubqVar;
                    augeVar.b |= 1;
                    return (auge) augdVar.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            auemVar.getClass();
            map.forEach(new Consumer() { // from class: atpy
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
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "buildGroupUpdateToRemoveAllParticipants", 167, "GroupEventParticipantsConverter.java")).r("Group event will remove %s participant(s) from the group in self only error state.", ((auen) auemVar.instance).c.size());
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
        auen auenVar2 = auen.a;
        auem auemVar2 = (auem) auenVar2.createBuilder();
        for (aubq aubqVar : audcVar.g) {
            ekrw ekrwVarN = c.n();
            ekrwVarN.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN.X(cqnc.N, atrjVar.o());
            ekrwVarN.X(cqnc.q, cqcv.b(aubqVar.d));
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "toGroupUpdate", 85, "GroupEventParticipantsConverter.java")).q("Participant from the server to add to the client.");
            auay auayVar = (auay) auaz.a.createBuilder();
            auayVar.copyOnWrite();
            auaz auazVar = (auaz) auayVar.instance;
            aubqVar.getClass();
            auazVar.c = aubqVar;
            auazVar.b |= 1;
            aufb aufbVar = audcVar.r;
            if (aufbVar == null) {
                aufbVar = aufb.a;
            }
            auayVar.copyOnWrite();
            auaz auazVar2 = (auaz) auayVar.instance;
            aufbVar.getClass();
            auazVar2.d = aufbVar;
            auazVar2.b |= 2;
            auej auejVar = auej.JOINED;
            auayVar.copyOnWrite();
            auaz auazVar3 = (auaz) auayVar.instance;
            auazVar3.e = auejVar.e;
            auazVar3.b |= 4;
            auemVar2.a(auayVar);
        }
        for (aubq aubqVar2 : audcVar.h) {
            ekrw ekrwVarN2 = c.n();
            ekrwVarN2.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN2.X(cqnc.N, atrjVar.o());
            ekrwVarN2.X(cqnc.q, cqcv.b(aubqVar2.d));
            ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "toGroupUpdate", 105, "GroupEventParticipantsConverter.java")).q("Participant from the server to remove from the client.");
            augd augdVar = (augd) auge.a.createBuilder();
            augdVar.copyOnWrite();
            auge augeVar = (auge) augdVar.instance;
            aubqVar2.getClass();
            augeVar.c = aubqVar2;
            augeVar.b |= 1;
            aufb aufbVar2 = audcVar.r;
            if (aufbVar2 == null) {
                aufbVar2 = aufb.a;
            }
            augdVar.copyOnWrite();
            auge augeVar2 = (auge) augdVar.instance;
            aufbVar2.getClass();
            augeVar2.d = aufbVar2;
            augeVar2.b |= 2;
            auemVar2.b(augdVar);
        }
        auex auexVar2 = (auex) auey.a.createBuilder();
        String strO2 = atrjVar.o();
        auexVar2.copyOnWrite();
        auey aueyVar3 = (auey) auexVar2.instance;
        aueyVar3.b |= 1;
        aueyVar3.c = strO2;
        auexVar2.copyOnWrite();
        auey aueyVar4 = (auey) auexVar2.instance;
        auen auenVar3 = (auen) auemVar2.build();
        auenVar3.getClass();
        aueyVar4.e = auenVar3;
        aueyVar4.b |= 4;
        avoe avoeVarD = atrjVar.d();
        avoe avoeVar = avoe.RCS_GROUP_SELF_ONLY;
        if (!avoeVarD.equals(avoeVar)) {
            aucv aucvVar2 = audcVar.s;
            if (aucvVar2 == null) {
                aucvVar2 = aucv.a;
            }
            aucu aucuVarB2 = aucu.b(aucvVar2.c);
            if (aucuVarB2 == null) {
                aucuVarB2 = aucu.CAUSE_UNSPECIFIED;
            }
            if (aucuVarB2.equals(aucu.CAUSE_UNSPECIFIED)) {
                auen auenVar4 = ((auey) auexVar2.instance).e;
                if (auenVar4 != null) {
                    auenVar2 = auenVar4;
                }
                if (auenVar2.b.size() <= 0) {
                    Stream stream = Collection.EL.stream(b(atrjVar, false));
                    Collector collector = ekcv.b;
                    if (ekpg.b((ekhx) stream.collect(collector), (ekhx) Collection.EL.stream(auenVar2.c).map(new Function() { // from class: atpz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            aubq aubqVar3 = ((auge) obj2).c;
                            return aubqVar3 == null ? aubq.a : aubqVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(collector)).isEmpty()) {
                        eksl ekslVar2 = (eksl) c.h();
                        ekslVar2.X(cqnc.s, atrjVar.f());
                        ekslVar2.X(cqnc.N, atrjVar.o());
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "isOnlySelfInGroup", 199, "GroupEventParticipantsConverter.java")).q("RCS_GROUP_SELF_ONLY state detected");
                        aucw aucwVar = (aucw) aucx.a.createBuilder();
                        boolean z = !atrjVar.d().equals(avoeVar);
                        aucwVar.copyOnWrite();
                        aucx aucxVar = (aucx) aucwVar.instance;
                        aucxVar.b |= 1;
                        aucxVar.c = z;
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
            }
        }
        return (auey) auexVar2.build();
    }
}
