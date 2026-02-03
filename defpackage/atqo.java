package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atqo implements atsk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter");
    public final fcsu b;
    private final atsg c;
    private final fcsu d;

    public atqo(atsg atsgVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = atsgVar;
        this.d = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audc audcVar = (audc) obj;
        auex auexVar = (auex) auey.a.createBuilder();
        String strA = atrjVar.f().a();
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        strA.getClass();
        aueyVar.b |= 1;
        aueyVar.c = strA;
        final aueo aueoVar = (aueo) auer.a.createBuilder();
        aubq aubqVar = audcVar.t;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        auexVar.copyOnWrite();
        auey aueyVar2 = (auey) auexVar.instance;
        aubqVar.getClass();
        aueyVar2.l = aubqVar;
        aueyVar2.b |= 512;
        Stream[] streamArr = new Stream[3];
        streamArr[0] = Collection.EL.stream(((bakt) this.d.b()).x(atrjVar.f())).filter(new Predicate() { // from class: atqf
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
                return ((bgvm) obj2).f() == auej.JOINED;
            }
        }).map(new Function() { // from class: atqg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bgvm) obj2).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: atqh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                atqo atqoVar = this.a;
                String str = (String) obj2;
                if (str == null) {
                    return Optional.empty();
                }
                try {
                    return Optional.of(((asqx) atqoVar.b.b()).a(str, false));
                } catch (asrb unused) {
                    ekrw ekrwVarJ = atqo.a.j();
                    ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toChatEndpoint", 190, "GroupEventSelfMembershipConverter.java")).q("Ignoring invalid participant in group");
                    return Optional.empty();
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: atqi
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
                return ((Optional) obj2).isPresent();
            }
        }).map(new Function() { // from class: atqj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (aubq) ((Optional) obj2).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        streamArr[1] = Collection.EL.stream(audcVar.g);
        aubq aubqVar2 = audcVar.t;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        streamArr[2] = Stream.CC.of(aubqVar2);
        ekhx ekhxVarF = ekpg.b((Set) Stream.CC.of((Object[]) streamArr).flatMap(new Function() { // from class: atqk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (Stream) obj2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b), ekhx.o(audcVar.h)).f();
        atsg atsgVar = this.c;
        Optional optionalB = atsgVar.b(ekhxVarF, atrjVar);
        aueoVar.getClass();
        optionalB.ifPresent(new Consumer() { // from class: atql
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                aueo aueoVar2 = aueoVar;
                aubq aubqVar3 = (aubq) obj2;
                aueoVar2.copyOnWrite();
                auer auerVar = (auer) aueoVar2.instance;
                auer auerVar2 = auer.a;
                aubqVar3.getClass();
                auerVar.e = aubqVar3;
                auerVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        atsgVar.a(ekhxVarF, atrjVar).map(new Function() { // from class: atqm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((axcy) obj2).f();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: atqn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                String strC = ((SelfIdentityId) obj2).c();
                aueo aueoVar2 = aueoVar;
                aueoVar2.copyOnWrite();
                auer auerVar = (auer) aueoVar2.instance;
                auer auerVar2 = auer.a;
                auerVar.b |= 8;
                auerVar.f = strC;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aubq aubqVar3 = audcVar.t;
        if (aubqVar3 == null) {
            aubqVar3 = aubq.a;
        }
        aubq aubqVar4 = ((auer) aueoVar.instance).e;
        if (aubqVar4 == null) {
            aubqVar4 = aubq.a;
        }
        if (!ekhxVarF.contains(aubqVar3) && !aubqVar4.equals(aubqVar3) && !atrjVar.c().equals(aubqVar3)) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, atrjVar.f());
            ekrdVar.X(cqnc.N, atrjVar.o());
            ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toGroupUpdate", 103, "GroupEventSelfMembershipConverter.java");
            aueq aueqVar = aueq.UNKNOWN_STATE;
            ekrdVar2.t("Self participant is not member of the group, returning %s", aueqVar);
            aueoVar.copyOnWrite();
            auer auerVar = (auer) aueoVar.instance;
            auerVar.c = aueqVar.e;
            auerVar.b |= 1;
            auexVar.copyOnWrite();
            auey aueyVar3 = (auey) auexVar.instance;
            auer auerVar2 = (auer) aueoVar.build();
            auerVar2.getClass();
            aueyVar3.i = auerVar2;
            aueyVar3.b |= 64;
            return (auey) auexVar.build();
        }
        aubq aubqVar5 = audcVar.t;
        if (aubqVar5 == null) {
            aubqVar5 = aubq.a;
        }
        Iterator<E> it = audcVar.h.iterator();
        while (it.hasNext()) {
            if (aubqVar5.equals((aubq) it.next())) {
                aufb aufbVar = audcVar.r;
                if (aufbVar == null) {
                    aufbVar = aufb.a;
                }
                aubq aubqVar6 = aufbVar.c;
                if (aubqVar6 == null) {
                    aubqVar6 = aubq.a;
                }
                aueq aueqVar2 = aubqVar5.equals(aubqVar6) ? aueq.LEFT_GROUP : aueq.KICKED_OUT;
                ekrw ekrwVarE2 = a.e();
                ekrwVarE2.X(eksq.a, "BugleGroupManagement");
                ekrd ekrdVar3 = (ekrd) ekrwVarE2;
                ekrdVar3.X(cqnc.s, atrjVar.f());
                ekrdVar3.X(cqnc.N, atrjVar.o());
                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toGroupUpdate", 126, "GroupEventSelfMembershipConverter.java")).t("Self participant membership changed, reason %s", aueqVar2);
                aueoVar.copyOnWrite();
                auer auerVar3 = (auer) aueoVar.instance;
                auerVar3.c = aueqVar2.e;
                auerVar3.b |= 1;
                aufb aufbVar2 = aufb.a;
                aufb aufbVar3 = audcVar.r;
                if (aufbVar3 == null) {
                    aufbVar3 = aufbVar2;
                }
                if (!aufbVar2.equals(aufbVar3)) {
                    aufb aufbVar4 = audcVar.r;
                    if (aufbVar4 != null) {
                        aufbVar2 = aufbVar4;
                    }
                    aueoVar.copyOnWrite();
                    auer auerVar4 = (auer) aueoVar.instance;
                    aufbVar2.getClass();
                    auerVar4.d = aufbVar2;
                    auerVar4.b |= 2;
                }
                auexVar.copyOnWrite();
                auey aueyVar4 = (auey) auexVar.instance;
                auer auerVar5 = (auer) aueoVar.build();
                auerVar5.getClass();
                aueyVar4.i = auerVar5;
                aueyVar4.b |= 64;
                return (auey) auexVar.build();
            }
        }
        aueq aueqVar3 = aueq.UNKNOWN_STATE;
        aueoVar.copyOnWrite();
        auer auerVar6 = (auer) aueoVar.instance;
        auerVar6.c = aueqVar3.e;
        auerVar6.b |= 1;
        auexVar.copyOnWrite();
        auey aueyVar5 = (auey) auexVar.instance;
        auer auerVar7 = (auer) aueoVar.build();
        auerVar7.getClass();
        aueyVar5.i = auerVar7;
        aueyVar5.b |= 64;
        return (auey) auexVar.build();
    }
}
