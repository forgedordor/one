package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cefq {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/MsisdnDiscoveryService");
    public final fcsu a;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public cefq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.a = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar8;
    }

    public final Optional a(dggn dggnVar) {
        Optional optionalB = b(dggnVar);
        cmmh cmmhVar = (cmmh) fdct.b(((cmlb) this.f.b()).j(dggnVar));
        alqm alqmVar = null;
        if (cmmhVar == null) {
            ((ekrd) b.j().h("com/google/android/apps/messaging/shared/net/MsisdnDiscoveryService", "getMessagingIdentityFromSim", 104, "MsisdnDiscoveryService.kt")).t("SIM Subscription not found for %s", dhiz.SIM_ID.c(dggo.a(dggnVar).a));
        } else {
            fcsu fcsuVar = ((cefr) this.g.b()).b;
            int i = cmmhVar.d;
            alqm alqmVar2 = (alqm) fdct.b(((crny) fcsuVar.b()).h(i).i(true));
            if (alqmVar2 == null) {
                ((ekrd) cefr.a.j().h("com/google/android/apps/messaging/shared/net/MsisdnFromSimHelper", "getMessagingIdentityForSubscription", 62, "MsisdnFromSimHelper.kt")).r("Message identity not found for subId %s", i);
            } else {
                alqmVar = alqmVar2;
            }
        }
        return Optional.ofNullable(optionalB.orElse(alqmVar));
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [alqm, java.lang.Object] */
    public final Optional b(dggn dggnVar) {
        dggnVar.getClass();
        Optional optionalF = ((dghj) this.c.b()).f(dggnVar);
        final fdap fdapVar = new fdap() { // from class: cefo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((alrj) this.a.a.b()).r(((dggk) obj).a);
            }
        };
        Optional map = optionalF.map(new Function() { // from class: cefp
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
        dgiq dgiqVar = (dgiq) fdct.b(((dggz) this.d.b()).h(dggnVar));
        Object obj = null;
        if (dgiqVar == null) {
            ((ekrd) b.j().h("com/google/android/apps/messaging/shared/net/MsisdnDiscoveryService", "getMessagingIdentityFromRcsConfiguration", 81, "MsisdnDiscoveryService.kt")).t("RCS Configuration not found for %s", dhiz.SIM_ID.c(dggo.a(dggnVar).a));
        } else {
            Optional optionalA = ((cqej) this.e.b()).a(dgiqVar);
            if (optionalA.isPresent() && optionalA.get().e().isPresent()) {
                obj = optionalA.get();
            }
        }
        return Optional.ofNullable(map.orElse(obj));
    }
}
