package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csve {
    public static final ekfk a;
    public static final cqce b;
    public static final cczv c;
    public final ecjh d;
    public final cogw e;
    public final cden f;
    public final eosc g;
    private final cmfo h;
    private volatile boolean i = false;

    static {
        eqrd eqrdVar = eqrd.C11N;
        csuj csujVar = csuj.C11N;
        eqrd eqrdVar2 = eqrd.RCS;
        csuj csujVar2 = csuj.RCS;
        eqrd eqrdVar3 = eqrd.C11N_RCS;
        csuj csujVar3 = csuj.C11N_RCS;
        ekcw.a(eqrdVar, csujVar);
        ekcw.a(eqrdVar2, csujVar2);
        ekcw.a(eqrdVar3, csujVar3);
        a = new ekod(new Object[]{eqrdVar, csujVar, eqrdVar2, csujVar2, eqrdVar3, csujVar3}, 3);
        b = cqce.g("Bugle", "VerifiedSmsDataService");
        cdag.h(cdag.b, "verified_sms_enable_clearing_registration_data", true);
        c = cdag.h(cdag.b, "enable_vsms_keypair_consistency_read_check", false);
    }

    public csve(fcsu fcsuVar, ecjh ecjhVar, cogw cogwVar, ains ainsVar, cden cdenVar, eosc eoscVar) {
        this.d = ecjhVar;
        this.e = cogwVar;
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.VERIFIED_SMS);
        cmggVarC.f(csup.a);
        cmggVarC.e(new csvd(ecjhVar, ainsVar));
        this.h = cmgkVar.a(cmggVarC.a());
        this.f = cdenVar;
        this.g = eoscVar;
    }

    public static Collection e(Collection collection, Object obj) {
        if (byew.a().booleanValue()) {
            throw new IllegalStateException();
        }
        ekea ekeaVar = new ekea(5);
        ekeaVar.addAll(collection);
        ekeaVar.add(obj);
        return ekeaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final csul a(csup csupVar, String str, csvg csvgVar, csuj csujVar) {
        if (byew.a().booleanValue()) {
            throw new IllegalStateException();
        }
        csuk csukVar = csuk.a;
        evub evubVar = csupVar.e;
        if (evubVar.containsKey(str)) {
            csukVar = (csuk) evubVar.get(str);
        }
        csui csuiVar = (csui) csukVar.toBuilder();
        cqce cqceVar = b;
        cqceVar.p("Setting registration time.");
        csuiVar.a(csvgVar);
        long epochMilli = this.e.f().toEpochMilli();
        csuiVar.copyOnWrite();
        ((csuk) csuiVar.instance).c = epochMilli;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.A("Setting registration type", csujVar);
        cqbdVarC.r();
        csuiVar.copyOnWrite();
        ((csuk) csuiVar.instance).f = csujVar.a();
        csul csulVar = (csul) csupVar.toBuilder();
        while (true) {
            if (((csuk) csuiVar.instance).b.size() <= 2) {
                break;
            }
            csvg csvgVar2 = (csvg) ((csuk) csuiVar.instance).b.get(0);
            if (csvgVar2.equals(csvgVar)) {
                cqceVar.r("Attempting to remove fresh key pair? Something is wrong with the order. Cleaning and now fresh pair is the only pair stored.");
                csuiVar.copyOnWrite();
                ((csuk) csuiVar.instance).b = csuk.emptyProtobufList();
                csuiVar.a(csvgVar);
                csuf csufVar = ((csup) csulVar.instance).h;
                if (csufVar == null) {
                    csufVar = csuf.a;
                }
                csud csudVar = (csud) csufVar.toBuilder();
                csudVar.copyOnWrite();
                ((csuf) csudVar.instance).c = true;
                csuf csufVar2 = (csuf) csudVar.build();
                csulVar.copyOnWrite();
                csup csupVar2 = (csup) csulVar.instance;
                csufVar2.getClass();
                csupVar2.h = csufVar2;
                csupVar2.b |= 2;
            } else {
                cqceVar.p("Removing a deprecated pair of keys.");
                csuiVar.copyOnWrite();
                csuk csukVar2 = (csuk) csuiVar.instance;
                csukVar2.a();
                csukVar2.b.remove(0);
                if (csupVar.f && !byew.a().booleanValue()) {
                    cqceVar.p("Populating diagnostic info with deprecated key pair.");
                    csuf csufVar3 = ((csup) csulVar.instance).h;
                    if (csufVar3 == null) {
                        csufVar3 = csuf.a;
                    }
                    csug csugVar = (csug) ((csuh) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(csufVar3.f), str, csuh.a)).toBuilder();
                    Collection collectionE = e(DesugarCollections.unmodifiableList(((csuh) csugVar.instance).b), csvgVar2);
                    csugVar.copyOnWrite();
                    ((csuh) csugVar.instance).b = csuh.emptyProtobufList();
                    csugVar.copyOnWrite();
                    csuh csuhVar = (csuh) csugVar.instance;
                    evtg evtgVar = csuhVar.b;
                    if (!evtgVar.c()) {
                        csuhVar.b = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(collectionE, csuhVar.b);
                    csuf csufVar4 = ((csup) csulVar.instance).h;
                    if (csufVar4 == null) {
                        csufVar4 = csuf.a;
                    }
                    csud csudVar2 = (csud) csufVar4.toBuilder();
                    csuh csuhVar2 = (csuh) csugVar.build();
                    csuhVar2.getClass();
                    csudVar2.copyOnWrite();
                    csuf csufVar5 = (csuf) csudVar2.instance;
                    evub evubVar2 = csufVar5.f;
                    if (!evubVar2.b) {
                        csufVar5.f = evubVar2.a();
                    }
                    csufVar5.f.put(str, csuhVar2);
                    csulVar.copyOnWrite();
                    csup csupVar3 = (csup) csulVar.instance;
                    csuf csufVar6 = (csuf) csudVar2.build();
                    csufVar6.getClass();
                    csupVar3.h = csufVar6;
                    csupVar3.b |= 2;
                }
            }
        }
        csulVar.b(str, (csuk) csuiVar.build());
        return csulVar;
    }

    public final eiju b(final String str, final String str2) {
        return byew.a().booleanValue() ? eijx.e(null) : d(new Function() { // from class: csuq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekfk ekfkVar = csve.a;
                csul csulVar = (csul) ((csup) obj).toBuilder();
                csulVar.a(str, str2);
                return csulVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju c() {
        return byew.a().booleanValue() ? eijx.e(csup.a) : this.h.h().f(Exception.class, new eooz() { // from class: csuv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws Exception {
                final Exception exc = (Exception) obj;
                if (byew.a().booleanValue()) {
                    throw exc;
                }
                csve csveVar = this.a;
                return csveVar.f.b(exc).i(new eooz() { // from class: csur
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ekfk ekfkVar = csve.a;
                        return eijx.d(exc);
                    }
                }, csveVar.g);
            }
        }, this.g);
    }

    public final eiju d(final Function function) {
        if (byew.a().booleanValue()) {
            return eijx.e(null);
        }
        final long epochMilli = this.e.f().toEpochMilli();
        final Function function2 = new Function() { // from class: csus
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csup csupVar = (csup) obj;
                ekfk ekfkVar = csve.a;
                csul csulVar = (csul) function.apply(csupVar);
                long j = epochMilli;
                evvp evvpVarC = evxc.c(j);
                csulVar.copyOnWrite();
                csup csupVar2 = (csup) csulVar.instance;
                csup csupVar3 = csup.a;
                evvpVarC.getClass();
                csupVar2.g = evvpVarC;
                csupVar2.b |= 1;
                long j2 = csupVar.i + 1;
                csulVar.copyOnWrite();
                ((csup) csulVar.instance).i = j2;
                evvp evvpVar = csupVar.g;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                long jA = evxc.a(evvpVar);
                if (jA > j) {
                    cqbd cqbdVarE = csve.b.e();
                    cqbdVarE.I("Trying to update VerifiedSmsData with old data: update time must advance");
                    cqbdVarE.z("now", j);
                    evvp evvpVar2 = csupVar.g;
                    if (evvpVar2 == null) {
                        evvpVar2 = evvp.a;
                    }
                    cqbdVarE.A("oldUpdateTime", evvpVar2);
                    cqbdVarE.z("diff_seconds", (jA - j) / 1000);
                    cqbdVarE.r();
                    csuf csufVar = ((csup) csulVar.instance).h;
                    if (csufVar == null) {
                        csufVar = csuf.a;
                    }
                    csud csudVar = (csud) csufVar.toBuilder();
                    csudVar.copyOnWrite();
                    ((csuf) csudVar.instance).b = true;
                    csuf csufVar2 = (csuf) csudVar.build();
                    csulVar.copyOnWrite();
                    csup csupVar4 = (csup) csulVar.instance;
                    csufVar2.getClass();
                    csupVar4.h = csufVar2;
                    csupVar4.b |= 2;
                }
                return (csup) csulVar.build();
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        return this.h.j(new csva(function2)).i(new eooz() { // from class: csut
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d.b(new csva(function2), eoqg.a);
            }
        }, eoqg.a);
    }
}
