package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoie implements aoiq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider");
    public final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public aoie(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.b = fcsuVar5;
    }

    private final dgiq c(dggk dggkVar) {
        Optional optionalJ = ((dggz) this.c.b()).j(dggkVar);
        optionalJ.getClass();
        return (dgiq) fdct.b(optionalJ);
    }

    @Override // defpackage.aoiq
    public final aoip a(alqm alqmVar) {
        alqmVar.getClass();
        if (!alqmVar.r()) {
            throw new IllegalArgumentException("messagingIdentity can not be a fully qualified phone number.");
        }
        Optional optionalE = alqmVar.e();
        optionalE.getClass();
        aubq aubqVar = (aubq) fdct.b(optionalE);
        String str = aubqVar != null ? aubqVar.d : null;
        if (str == null) {
            throw new IllegalArgumentException("messagingIdentity has no rcs identifier.");
        }
        dgiq dgiqVarC = c(((dggl) this.d.b()).a(str));
        if (dgiqVarC != null) {
            return ((ahmk) this.e.b()).a(dgiqVarC);
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleSelfIdentity");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig", 45, "IdentityBasedRcsConfigProvider.kt")).q("No configuration is found for messagingIdentity. Returning default config instead.");
        return aohv.a;
    }

    @Override // defpackage.aoiq
    public final aoip b(awxn awxnVar) {
        if (awxnVar.a() != awxl.a) {
            throw new IllegalArgumentException("Address type is not phone number.");
        }
        awyv awyvVarA = ((awyu) this.f.b()).a(awxnVar);
        Optional optionalC = awyvVarA.c();
        optionalC.getClass();
        String str = (String) fdct.b(optionalC);
        if (str != null && str.length() != 0) {
            dgiq dgiqVarC = c(((dggl) this.d.b()).a(str));
            if (dgiqVarC != null) {
                return ((ahmk) this.e.b()).a(dgiqVarC);
            }
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSelfIdentity");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig", 83, "IdentityBasedRcsConfigProvider.kt")).q("No configuration is found for MyIdentity. Returning default config instead.");
            return aohv.a;
        }
        ekrw ekrwVarJ2 = a.j();
        ekrwVarJ2.X(eksq.a, "BugleSelfIdentity");
        ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig", 65, "IdentityBasedRcsConfigProvider.kt")).q("MyIdentity address is not available when getting rcs config");
        Optional optionalD = awyvVarA.d();
        final fdap fdapVar = new fdap() { // from class: aohx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                aoin aoinVar = (aoin) this.a.b.b();
                num.getClass();
                return aoinVar.a(num.intValue());
            }
        };
        Optional optionalFlatMap = optionalD.flatMap(new Function() { // from class: aohy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final fdap fdapVar2 = new fdap() { // from class: aohz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((alqm) obj).e().isPresent());
            }
        };
        Optional optionalFilter = optionalFlatMap.filter(new Predicate() { // from class: aoia
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
                return ((Boolean) fdapVar2.invoke(obj)).booleanValue();
            }
        });
        final aoid aoidVar = new aoid(this);
        Object objOrElseGet = optionalFilter.map(new Function() { // from class: aoib
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aoidVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aoic
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrw ekrwVarJ3 = aoie.a.j();
                ekrwVarJ3.X(eksq.a, "BugleSelfIdentity");
                ((ekrd) ekrwVarJ3.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/IdentityBasedRcsConfigProvider", "getRcsConfig$lambda$8", 73, "IdentityBasedRcsConfigProvider.kt")).q("Messaging identity is not available, returning default config.");
                return aohv.a;
            }
        });
        objOrElseGet.getClass();
        return (aoip) objOrElseGet;
    }
}
