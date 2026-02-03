package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddd implements cdbr {
    public static final cqce a = cqce.g("BugleNetwork", "NewLightTickleFcmHandler");
    final Map b;
    private final cdbq c;
    private final cogw d;
    private final fcsu e;

    public cddd(Map map, cdbq cdbqVar, cogw cogwVar, fcsu fcsuVar) {
        this.b = map;
        this.c = cdbqVar;
        this.d = cogwVar;
        this.e = fcsuVar;
    }

    private final boolean d() {
        return cezu.a();
    }

    @Override // defpackage.cdbr
    public final int a(esju esjuVar) {
        return 0;
    }

    @Override // defpackage.cdbr
    public final void b(esju esjuVar) {
        if (!((Boolean) ccze.i.e()).booleanValue() && !d()) {
            a.m("Ignore received Firebase messages because features are not enabled.");
            return;
        }
        String str = (String) esjuVar.c().get("tickle");
        if (str == null) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Received FCM tickle without tickle key.");
            cqbdVarC.r();
            return;
        }
        ezol ezolVarA = cddy.a((String) esjuVar.c().get("receiverId"));
        if (ezolVarA == null) {
            cqbd cqbdVarC2 = a.c();
            cqbdVarC2.I("Received FCM tickle without a receiver id.");
            cqbdVarC2.r();
            return;
        }
        felm felmVarB = felm.b(ezolVarA.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        Integer numValueOf = Integer.valueOf(felmVarB.a());
        Map map = this.b;
        if (!map.containsKey(numValueOf)) {
            cqbd cqbdVarC3 = a.c();
            cqbdVarC3.I("No handler registered for tickle type");
            cqbdVarC3.A("IdType", numValueOf);
            cqbdVarC3.r();
            return;
        }
        cdbu cdbuVar = (cdbu) ((fcsu) map.get(numValueOf)).b();
        if (esjuVar.b() == 2 && esjuVar.a() == 1) {
            cqbd cqbdVarC4 = a.c();
            cqbdVarC4.I("FireBase message priority downgraded.");
            cqbdVarC4.r();
            cdbuVar.b(this.d.f().toEpochMilli());
        }
        cdbuVar.c(ezolVarA, str, esjuVar.b(), esjuVar.a(), 1);
    }

    @Override // defpackage.cdbr
    public final void c() {
        if (!((Boolean) ccze.i.e()).booleanValue() && !d()) {
            a.m("Skipping Firebase Instance ID refresh because feature is not enabled.");
            return;
        }
        cqce cqceVar = a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Handling firebase new token");
        cqbdVarC.r();
        if (this.c == null) {
            cqceVar.n("firebaseInstanceIDManager is null");
            return;
        }
        eijw eijwVarL = eijx.l((Iterable) Collection.EL.stream(((ekgp) this.b).values()).map(new Function() { // from class: cdcx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (cdbu) ((fcsu) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: cdcy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cdbu) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cdcz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        })));
        Callable callable = new Callable() { // from class: cdda
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eika.l(eijwVarL.a(callable, eoqgVar), new cqob(new Consumer() { // from class: cddb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarC2 = cddd.a.c();
                cqbdVarC2.I("Successfully handled firebase new token.");
                cqbdVarC2.r();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: cddc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqbd cqbdVarB = cddd.a.b();
                cqbdVarB.I("Failed to handle firebase new token.");
                cqbdVarB.s((Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoqgVar);
    }
}
