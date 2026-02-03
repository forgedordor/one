package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atsg {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator");
    public final fcsu a;
    private final dghj c;
    private final dggl d;
    private final bbdl e;

    public atsg(dghj dghjVar, fcsu fcsuVar, dggl dgglVar, bbdl bbdlVar) {
        this.c = dghjVar;
        this.a = fcsuVar;
        this.d = dgglVar;
        this.e = bbdlVar;
    }

    private final ekgb c() {
        Stream map = Collection.EL.stream(this.c.m()).map(new Function() { // from class: atry
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((asqx) this.a.a.b()).c(((dggk) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public final Optional a(java.util.Collection collection, atrj atrjVar) {
        final bbdl bbdlVar = this.e;
        final Optional optionalOfNullable = Optional.ofNullable(bbdlVar.e(atrjVar.b()));
        boolean z = false;
        if (optionalOfNullable.isPresent() && Collection.EL.stream(this.c.n()).map(new Function() { // from class: atrz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((dggr) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).anyMatch(new Predicate() { // from class: atsa
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
                return ((Integer) obj).intValue() == ((axcy) optionalOfNullable.get()).e();
            }
        })) {
            z = true;
        }
        Optional map = optionalOfNullable.map(new Function() { // from class: atsb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((axcy) obj).e());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final dghj dghjVar = this.c;
        dghjVar.getClass();
        Optional map2 = map.flatMap(new Function() { // from class: atsc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dghjVar.g(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: atsd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dggk) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final asqx asqxVar = (asqx) this.a.b();
        asqxVar.getClass();
        Optional map3 = map2.map(new Function() { // from class: atse
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return asqxVar.c((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        collection.getClass();
        boolean zIsPresent = map3.filter(new atrw(collection)).isPresent();
        if (z && zIsPresent) {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, atrjVar.f());
            ekrdVar.X(cqnc.N, atrjVar.o());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 206, "GroupSelfMsisdnUpdateCalculator.java")).q("Current subscription still valid, not updating");
            return Optional.empty();
        }
        Optional optionalFindFirst = Collection.EL.stream(c()).filter(new atrw(collection)).findFirst();
        if (optionalFindFirst.isEmpty()) {
            ekrw ekrwVarE2 = b.e();
            ekrwVarE2.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar2 = (ekrd) ekrwVarE2;
            ekrdVar2.X(cqnc.s, atrjVar.f());
            ekrdVar2.X(cqnc.N, atrjVar.o());
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 221, "GroupSelfMsisdnUpdateCalculator.java")).q("Current subscription invalid and no other subscription available, not updating");
            return Optional.empty();
        }
        Optional map4 = dghjVar.i(this.d.a(((aubq) optionalFindFirst.get()).d)).map(new Function() { // from class: atrz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((dggr) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bbdlVar.getClass();
        Optional map5 = map4.map(new Function() { // from class: atsf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bbdlVar.f(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (map5.isEmpty()) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar3 = (ekrd) ekrwVarJ;
            ekrdVar3.X(cqnc.s, atrjVar.f());
            ekrdVar3.X(cqnc.N, atrjVar.o());
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 239, "GroupSelfMsisdnUpdateCalculator.java")).q("Cannot find subscription for other identity in the group, not updating");
            return Optional.empty();
        }
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar4 = (ekrd) ekrwVarH;
        ekrdVar4.X(cqnc.s, atrjVar.f());
        ekrdVar4.X(cqnc.N, atrjVar.o());
        ekrdVar4.X(cqnc.w, Integer.valueOf(((axcy) map5.get()).e()));
        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 249, "GroupSelfMsisdnUpdateCalculator.java")).q("Updating current subscription in group");
        return map5;
    }

    public final Optional b(java.util.Collection collection, atrj atrjVar) {
        Stream stream = Collection.EL.stream(c());
        collection.getClass();
        final ekhx ekhxVar = (ekhx) stream.filter(new atrw(collection)).collect(ekcv.b);
        Optional optionalL = atrjVar.l();
        ekhxVar.getClass();
        if (((Boolean) optionalL.map(new Function() { // from class: atrx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(ekhxVar.contains((aubq) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, atrjVar.f());
            ekrdVar.X(cqnc.N, atrjVar.o());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 152, "GroupSelfMsisdnUpdateCalculator.java")).q("Self still active in group, not changing rcs group self MSISDN.");
            return Optional.empty();
        }
        Optional optionalFindFirst = Collection.EL.stream(ekhxVar).findFirst();
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar2 = (ekrd) ekrwVarH;
        ekrdVar2.X(cqnc.s, atrjVar.f());
        ekrdVar2.X(cqnc.N, atrjVar.o());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 162, "GroupSelfMsisdnUpdateCalculator.java")).t("Self not active in group, other exists: %s.", Boolean.valueOf(optionalFindFirst.isPresent()));
        return optionalFindFirst;
    }
}
