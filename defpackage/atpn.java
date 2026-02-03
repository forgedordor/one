package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atpn implements atsk {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleGroupManagement");
    private final atsg c;

    public atpn(atsg atsgVar) {
        this.c = atsgVar;
    }

    public static aueq b(auek auekVar) {
        auej auejVar = auej.DEPARTED;
        auej auejVarB = auej.b(auekVar.d);
        if (auejVarB == null) {
            auejVarB = auej.UNKNOWN_STATE;
        }
        if (!auejVar.equals(auejVarB)) {
            return aueq.MEMBERSHIP_CONFIRMED;
        }
        aubq aubqVar = auekVar.c;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aufb aufbVar = auekVar.e;
        if (aufbVar == null) {
            aufbVar = aufb.a;
        }
        aubq aubqVar2 = aufbVar.c;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        return aubqVar.equals(aubqVar2) ? aueq.LEFT_GROUP : aueq.KICKED_OUT;
    }

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audk audkVar = (audk) obj;
        auex auexVar = (auex) auey.a.createBuilder();
        String strA = atrjVar.f().a();
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        strA.getClass();
        aueyVar.b |= 1;
        aueyVar.c = strA;
        final aueo aueoVar = (aueo) auer.a.createBuilder();
        aubq aubqVar = audkVar.m;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        auexVar.copyOnWrite();
        auey aueyVar2 = (auey) auexVar.instance;
        aubqVar.getClass();
        aueyVar2.l = aubqVar;
        aueyVar2.b |= 512;
        Stream map = Collection.EL.stream(audkVar.h).filter(new Predicate() { // from class: atpl
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
                return atpn.b((auek) obj2).equals(aueq.MEMBERSHIP_CONFIRMED);
            }
        }).map(new Function() { // from class: atpm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                aubq aubqVar2 = ((auek) obj2).c;
                return aubqVar2 == null ? aubq.a : aubqVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        atsg atsgVar = this.c;
        Optional optionalB = atsgVar.b(ekgbVar, atrjVar);
        aueoVar.getClass();
        optionalB.ifPresent(new Consumer() { // from class: atpj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                aueo aueoVar2 = aueoVar;
                aubq aubqVar2 = (aubq) obj2;
                aueoVar2.copyOnWrite();
                auer auerVar = (auer) aueoVar2.instance;
                auer auerVar2 = auer.a;
                aubqVar2.getClass();
                auerVar.e = aubqVar2;
                auerVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        atsgVar.a(ekgbVar, atrjVar).ifPresent(new Consumer() { // from class: atpk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                int i2 = atpn.a;
                String str = ((SelfIdentityIdImpl) ((axcy) obj2).f()).a;
                aueo aueoVar2 = aueoVar;
                aueoVar2.copyOnWrite();
                auer auerVar = (auer) aueoVar2.instance;
                auer auerVar2 = auer.a;
                auerVar.b |= 8;
                auerVar.f = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        for (auek auekVar : audkVar.h) {
            aubq aubqVar2 = audkVar.m;
            if (aubqVar2 == null) {
                aubqVar2 = aubq.a;
            }
            aubq aubqVar3 = auekVar.c;
            if (aubqVar3 == null) {
                aubqVar3 = aubq.a;
            }
            if (aubqVar2.equals(aubqVar3)) {
                aueq aueqVarB = b(auekVar);
                ekrw ekrwVarN = b.n();
                ekrwVarN.X(cqnc.r, atrjVar.f().toString());
                ekrwVarN.X(cqnc.N, atrjVar.o());
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSelfMembershipConverter", "toGroupUpdate", 84, "GroupFullStateSelfMembershipConverter.java")).t("Explicit self participant membership state found %s", aueqVarB);
                aueoVar.copyOnWrite();
                auer auerVar = (auer) aueoVar.instance;
                auerVar.c = aueqVarB.e;
                auerVar.b |= 1;
                aufb aufbVar = aufb.a;
                aufb aufbVar2 = auekVar.e;
                if (aufbVar2 == null) {
                    aufbVar2 = aufbVar;
                }
                if (!aufbVar.equals(aufbVar2)) {
                    aufb aufbVar3 = auekVar.e;
                    if (aufbVar3 != null) {
                        aufbVar = aufbVar3;
                    }
                    aueoVar.copyOnWrite();
                    auer auerVar2 = (auer) aueoVar.instance;
                    aufbVar.getClass();
                    auerVar2.d = aufbVar;
                    auerVar2.b |= 2;
                }
                auexVar.copyOnWrite();
                auey aueyVar3 = (auey) auexVar.instance;
                auer auerVar3 = (auer) aueoVar.build();
                auerVar3.getClass();
                aueyVar3.i = auerVar3;
                aueyVar3.b |= 64;
                return (auey) auexVar.build();
            }
        }
        aueq aueqVar = aueq.KICKED_OUT;
        ekrw ekrwVarN2 = b.n();
        ekrwVarN2.X(cqnc.r, atrjVar.f().toString());
        ekrwVarN2.X(cqnc.N, atrjVar.o());
        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSelfMembershipConverter", "toGroupUpdate", 106, "GroupFullStateSelfMembershipConverter.java")).q("Explicit self participant membership state not found. Assuming has been removed from the group.");
        aueoVar.copyOnWrite();
        auer auerVar4 = (auer) aueoVar.instance;
        auerVar4.c = aueqVar.e;
        auerVar4.b |= 1;
        auexVar.copyOnWrite();
        auey aueyVar4 = (auey) auexVar.instance;
        auer auerVar5 = (auer) aueoVar.build();
        auerVar5.getClass();
        aueyVar4.i = auerVar5;
        aueyVar4.b |= 64;
        return (auey) auexVar.build();
    }
}
