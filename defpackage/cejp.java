package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class cejp {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/RcsMsisdnAccessor");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final eosc f;
    private final fcsu g;

    public cejp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar, fcsu fcsuVar5) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = eoscVar;
        this.g = fcsuVar5;
        new ConcurrentHashMap(2);
    }

    @Deprecated
    public final eiju a() {
        eieu eieuVarK = eiiy.k("RcsMsisdnAccessor::getRcsMsisdnAsync");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: cejn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.c();
                }
            }, this.f);
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final Optional b() {
        Optional optionalL = ((chwq) this.b.b()).l();
        if (!optionalL.isPresent()) {
            Optional optionalOfNullable = Optional.ofNullable(((chtk) this.g.b()).a(((chvg) this.c.b()).a(chvn.m)));
            final alfq alfqVar = (alfq) this.e.b();
            alfqVar.getClass();
            optionalL = optionalOfNullable.map(new Function() { // from class: cejm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return alfqVar.b((aubq) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        return optionalL.flatMap(new Function() { // from class: cejl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Deprecated
    public final String c() {
        fcsu fcsuVar = this.d;
        if (((crny) fcsuVar.b()).a() == 0) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/net/RcsMsisdnAccessor", "getRcsMsisdn", 123, "RcsMsisdnAccessor.java")).q("Attempt to get an RCS msisdn from the legacy API when no sims installed.");
            return "";
        }
        int iA = ((crny) fcsuVar.b()).k().a();
        if (iA >= 0) {
            return d(iA);
        }
        ekrw ekrwVarJ2 = a.j();
        ekrwVarJ2.X(eksq.a, "BugleRcs");
        ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
        ekrdVar2.Z(eksk.MEDIUM);
        ekrdVar2.X(cqnc.w, Integer.valueOf(iA));
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/net/RcsMsisdnAccessor", "getRcsMsisdn", 135, "RcsMsisdnAccessor.java")).q("Failed to get RCS MSISDN from legacy API, sub id is not valid");
        return "";
    }

    public final String d(int i) {
        aubq aubqVarA = ((chtk) this.g.b()).a(i);
        return aubqVarA != null ? aubqVarA.d : "";
    }
}
