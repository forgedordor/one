package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cexm implements cesd {
    public static final cqce a = cqce.g("BugleProtoData", "TachyonPhoneDataService");
    public final cmfo b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final String f;
    public final fcsu g;
    public final fcsu h;
    private final Set i;
    private final eosc j;
    private final fcsu k;

    public cexm(cmgk cmgkVar, eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, String str) {
        this.h = fcsuVar6;
        this.g = fcsuVar5;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.k = fcsuVar4;
        this.f = str;
        this.j = eoscVar;
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.TACHYON_PHONE);
        cmggVarC.g(str);
        cmggVarC.f(cevr.a);
        cmggVarC.c(new Supplier() { // from class: cexh
            @Override // java.util.function.Supplier
            public final Object get() {
                return new cevs();
            }
        });
        cmggVarC.b(true);
        this.b = cmgkVar.a(cmggVarC.a());
        this.i = new CopyOnWriteArraySet((Collection) eyggVar.b());
    }

    public static elys q(cevp cevpVar) {
        int iOrdinal = cevpVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? elys.UNKNOWN_PREKEY_STATE : elys.LOW_PREKEYS : elys.SUFFICIENT_PREKEYS;
    }

    public static elyu r(cevq cevqVar) {
        int iOrdinal = cevqVar.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? elyu.UNKNOWN_TACHYON_STATE : elyu.REGISTERED_WITH_PREKEYS : elyu.REGISTERED_WITHOUT_PREKEYS : elyu.NOT_REGISTERED;
    }

    @Override // defpackage.cesd
    public final eiju a() {
        return m();
    }

    @Override // defpackage.cesd
    public final eiju b() {
        return this.b.h().h(new ejvr() { // from class: cewq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cevr) obj).e);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final eiju c() {
        return this.b.h().h(new ejvr() { // from class: cevy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cevr) obj).d.I();
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final eiju d(final long j) {
        return this.b.j(new ejvr() { // from class: cexi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevo cevoVar = (cevo) ((cevr) obj).toBuilder();
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).e = j;
                return (cevr) cevoVar.build();
            }
        }).h(new ejvr() { // from class: cexj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final eiju e(final byte[] bArr) {
        return this.b.j(new ejvr() { // from class: cevw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevo cevoVar = (cevo) ((cevr) obj).toBuilder();
                evqs evqsVarX = evqs.x(bArr);
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).d = evqsVarX;
                return (cevr) cevoVar.build();
            }
        }).h(new ejvr() { // from class: cevx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju f() {
        a.p("Clearing Tachyon phone data");
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.h().i(new eooz() { // from class: cevu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                atomicReference.set((cevr) obj);
                return this.a.b.f();
            }
        }, eoqg.a).i(new eooz() { // from class: cevv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                cevq cevqVarB = cevq.b(((cevr) atomicReference2.get()).i);
                if (cevqVarB == null) {
                    cevqVarB = cevq.UNRECOGNIZED;
                }
                cexm cexmVar = this.a;
                cevq cevqVar = cevq.UNSET_TACHYON_STATE;
                cexmVar.v(cevqVarB, cevqVar, 6);
                cevq cevqVarB2 = cevq.b(((cevr) atomicReference2.get()).i);
                if (cevqVarB2 == null) {
                    cevqVarB2 = cevq.UNRECOGNIZED;
                }
                return cexmVar.u(cevqVarB2, cevqVar, 6);
            }
        }, this.j);
    }

    public final eiju g() {
        return this.b.h();
    }

    public final eiju h() {
        return this.b.h().h(new ejvr() { // from class: ceww
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cevr) obj).f.I();
            }
        }, eoqg.a);
    }

    public final eiju i() {
        return this.b.h().h(new ejvr() { // from class: cewj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevq cevqVarB = cevq.b(((cevr) obj).i);
                return cevqVarB == null ? cevq.UNRECOGNIZED : cevqVarB;
            }
        }, eoqg.a);
    }

    public final eiju j() {
        return this.b.h().h(new ejvr() { // from class: cewk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cevr) obj).h.I();
            }
        }, eoqg.a);
    }

    public final eiju k() {
        return this.b.g().i(new eooz() { // from class: cewz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgp ekgpVar = (ekgp) obj;
                cexm cexmVar = this.a;
                String str = cexmVar.f;
                cevr cevrVar = (cevr) ekgpVar.get(str);
                if (cevrVar != null && !cevrVar.c.isEmpty() && !cevrVar.d.H()) {
                    cexm.a.m("Phone registration data exists.");
                    return eijx.e(Optional.of(cevrVar));
                }
                Optional optionalS = cexmVar.s(str);
                ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
                String str2 = null;
                long j = 0;
                while (ekqgVarListIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    String str3 = (String) entry.getKey();
                    if (!str.equals(str3)) {
                        cczv cczvVar = alvx.a;
                        if (((Boolean) new aluo().get()).booleanValue()) {
                            if (optionalS.isPresent() && optionalS.equals(cexmVar.s(str3))) {
                                if (((cevr) entry.getValue()).d.d() <= 0 && ((cevr) entry.getValue()).e >= j) {
                                    long j2 = ((cevr) entry.getValue()).e;
                                    cqbd cqbdVarC = cexm.a.c();
                                    cqbdVarC.I("Found alternative phone number");
                                    cqbdVarC.M("alternative", str3);
                                    cqbdVarC.r();
                                    j = j2;
                                    str2 = str3;
                                }
                            }
                        } else if (((ephj) ((crmx) cexmVar.e.b()).c.b()).l(str, str3) == 5) {
                            if (((cevr) entry.getValue()).d.d() <= 0) {
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    cexm.a.m("No alternative phone number exists.");
                    return eijx.e(Optional.empty());
                }
                ((ains) cexmVar.d.b()).c("Bugle.PhoneRegistration.Alternative.Move.Count");
                cexm.a.p("Reuse existing phone registration data.");
                return cexmVar.b.i(str2);
            }
        }, this.j);
    }

    public final eiju l() {
        return this.b.j(new ejvr() { // from class: cexa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevo cevoVar = (cevo) ((cevr) obj).toBuilder();
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).r = 0;
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).q = 0L;
                return (cevr) cevoVar.build();
            }
        }).h(new ejvr() { // from class: cexb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju m() {
        a.p("Resetting registration state");
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new ejvr() { // from class: cewx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevr cevrVar = (cevr) obj;
                atomicReference.set(cevrVar);
                cevo cevoVar = (cevo) cevrVar.toBuilder();
                cevoVar.copyOnWrite();
                cevr cevrVar2 = (cevr) cevoVar.instance;
                cevr cevrVar3 = cevr.a;
                cevrVar2.h = cevrVar3.h;
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).d = cevrVar3.d;
                cevq cevqVar = cevq.NOT_REGISTERED;
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).i = cevqVar.a();
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).k = 0;
                return (cevr) cevoVar.build();
            }
        }).i(new eooz() { // from class: cewy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                cevq cevqVarB = cevq.b(((cevr) atomicReference2.get()).i);
                if (cevqVarB == null) {
                    cevqVarB = cevq.UNRECOGNIZED;
                }
                cexm cexmVar = this.a;
                cevq cevqVar = cevq.NOT_REGISTERED;
                cexmVar.v(cevqVarB, cevqVar, 2);
                cevq cevqVarB2 = cevq.b(((cevr) atomicReference2.get()).i);
                if (cevqVarB2 == null) {
                    cevqVarB2 = cevq.UNRECOGNIZED;
                }
                return cexmVar.u(cevqVarB2, cevqVar, 2);
            }
        }, this.j);
    }

    public final eiju n(final cevp cevpVar) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Tachyon PrekeyState set for phone number");
        cqbdVarC.A("state", cevpVar);
        cqbdVarC.r();
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new ejvr() { // from class: cexk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevr cevrVar = (cevr) obj;
                atomicReference.set(cevrVar);
                cevo cevoVar = (cevo) cevrVar.toBuilder();
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).j = cevpVar.a();
                return (cevr) cevoVar.build();
            }
        }).h(new ejvr() { // from class: cexl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevp cevpVarB = cevp.b(((cevr) atomicReference.get()).j);
                if (cevpVarB == null) {
                    cevpVarB = cevp.UNRECOGNIZED;
                }
                cevp cevpVar2 = cevpVar;
                elys elysVarQ = cexm.q(cevpVarB);
                elys elysVarQ2 = cexm.q(cevpVar2);
                if (elysVarQ == elysVarQ2) {
                    return null;
                }
                cexm cexmVar = this.a;
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_E2EE_STATE_TRANSITION;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                emiw emiwVar = (emiw) emix.a.createBuilder();
                emiwVar.copyOnWrite();
                emix emixVar = (emix) emiwVar.instance;
                emixVar.c = elysVarQ.d;
                emixVar.b |= 1;
                emiwVar.copyOnWrite();
                emix emixVar2 = (emix) emiwVar.instance;
                emixVar2.d = elysVarQ2.d;
                emixVar2.b |= 2;
                emix emixVar3 = (emix) emiwVar.build();
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                emixVar3.getClass();
                ellhVar2.X = emixVar3;
                ellhVar2.c |= 16777216;
                ((aill) cexmVar.c.b()).j(ellgVar);
                return null;
            }
        }, this.j);
    }

    public final eiju o(final cevq cevqVar, final Optional optional, final Optional optional2, final Optional optional3) {
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Setting probationary values");
        cqbdVarC.A("state", cevqVar);
        if (optional.isPresent()) {
            cqbdVarC.A("client feature flags", ((ezoc) optional.get()).c.toString());
        }
        if (optional2.isPresent()) {
            cqbdVarC.A("client capabilities extension", ((eznz) optional2.get()).b.toString());
        }
        if (optional3.isPresent()) {
            cqbdVarC.A("client caps", ((ezuu) optional3.get()).b.toString());
        }
        cqbdVarC.r();
        return this.b.j(new ejvr() { // from class: cewg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final cevo cevoVar = (cevo) ((cevr) obj).toBuilder();
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).k = cevqVar.a();
                cevoVar.getClass();
                optional.ifPresent(new Consumer() { // from class: cewn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        cevo cevoVar2 = cevoVar;
                        ezoc ezocVar = (ezoc) obj2;
                        cevoVar2.copyOnWrite();
                        cevr cevrVar = (cevr) cevoVar2.instance;
                        cevr cevrVar2 = cevr.a;
                        ezocVar.getClass();
                        cevrVar.l = ezocVar;
                        cevrVar.b |= 1;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                optional2.ifPresent(new Consumer() { // from class: cewo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        cevo cevoVar2 = cevoVar;
                        eznz eznzVar = (eznz) obj2;
                        cevoVar2.copyOnWrite();
                        cevr cevrVar = (cevr) cevoVar2.instance;
                        cevr cevrVar2 = cevr.a;
                        eznzVar.getClass();
                        cevrVar.n = eznzVar;
                        cevrVar.b |= 4;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                optional3.ifPresent(new Consumer() { // from class: cewp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        cevo cevoVar2 = cevoVar;
                        ezuu ezuuVar = (ezuu) obj2;
                        cevoVar2.copyOnWrite();
                        cevr cevrVar = (cevr) cevoVar2.instance;
                        cevr cevrVar2 = cevr.a;
                        ezuuVar.getClass();
                        cevrVar.s = ezuuVar;
                        cevrVar.b |= 16;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return (cevr) cevoVar.build();
            }
        }).h(new ejvr() { // from class: cewh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju p(final byte[] bArr) {
        return this.b.j(new ejvr() { // from class: cevz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevo cevoVar = (cevo) ((cevr) obj).toBuilder();
                evqs evqsVarX = evqs.x(bArr);
                cevoVar.copyOnWrite();
                ((cevr) cevoVar.instance).h = evqsVarX;
                return (cevr) cevoVar.build();
            }
        }).h(new ejvr() { // from class: cewb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final Optional s(String str) {
        try {
            cczv cczvVar = alvx.a;
            return ((Boolean) new aluo().get()).booleanValue() ? Optional.of(((asqx) this.k.b()).a(str, false)) : Optional.empty();
        } catch (asrb unused) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Could not create ChatEndpoint from ");
            cqbdVarC.M("phone number", str);
            cqbdVarC.r();
            return Optional.empty();
        }
    }

    public final eiju t(final int i) {
        final AtomicReference atomicReference = new AtomicReference();
        return this.b.j(new ejvr() { // from class: cewc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cevr cevrVar = (cevr) obj;
                cqce cqceVar = cexm.a;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("Setting probationary values");
                cevq cevqVarB = cevq.b(cevrVar.k);
                if (cevqVarB == null) {
                    cevqVarB = cevq.UNRECOGNIZED;
                }
                cqbdVarC.A("state", cevqVarB);
                ezoc ezocVar = cevrVar.l;
                if (ezocVar == null) {
                    ezocVar = ezoc.b;
                }
                cqbdVarC.A("client feature flags", ezocVar.c.toString());
                eznz eznzVar = cevrVar.n;
                if (eznzVar == null) {
                    eznzVar = eznz.a;
                }
                cqbdVarC.A("client capabilities extension", eznzVar.b.toString());
                if ((cevrVar.b & 16) != 0) {
                    ezuu ezuuVar = cevrVar.s;
                    if (ezuuVar == null) {
                        ezuuVar = ezuu.a;
                    }
                    cqbdVarC.A("client caps", ezuuVar.b.toString());
                }
                cqbdVarC.r();
                cevo cevoVar = (cevo) cevrVar.toBuilder();
                cevq cevqVarB2 = cevq.b(cevrVar.k);
                if (cevqVarB2 == null) {
                    cevqVarB2 = cevq.UNRECOGNIZED;
                }
                if (cevqVarB2 != cevq.UNSET_TACHYON_STATE) {
                    atomicReference.set(cevrVar);
                    cevq cevqVarB3 = cevq.b(cevrVar.k);
                    if (cevqVarB3 == null) {
                        cevqVarB3 = cevq.UNRECOGNIZED;
                    }
                    cevoVar.copyOnWrite();
                    ((cevr) cevoVar.instance).i = cevqVarB3.a();
                    cevoVar.copyOnWrite();
                    ((cevr) cevoVar.instance).k = 0;
                } else {
                    cqceVar.n("Committing probationary state without the probationary state being set in the first place. Ignoring the commit.");
                }
                if ((cevrVar.b & 1) != 0) {
                    ezoc ezocVar2 = cevrVar.l;
                    if (ezocVar2 == null) {
                        ezocVar2 = ezoc.b;
                    }
                    cevoVar.copyOnWrite();
                    cevr cevrVar2 = (cevr) cevoVar.instance;
                    ezocVar2.getClass();
                    cevrVar2.m = ezocVar2;
                    cevrVar2.b |= 2;
                    cevoVar.copyOnWrite();
                    cevr cevrVar3 = (cevr) cevoVar.instance;
                    cevrVar3.l = null;
                    cevrVar3.b &= -2;
                } else {
                    cqceVar.m("No probationary client feature flags. Skipping commit");
                }
                if ((cevrVar.b & 4) != 0) {
                    eznz eznzVar2 = cevrVar.n;
                    if (eznzVar2 == null) {
                        eznzVar2 = eznz.a;
                    }
                    cevoVar.copyOnWrite();
                    cevr cevrVar4 = (cevr) cevoVar.instance;
                    eznzVar2.getClass();
                    cevrVar4.o = eznzVar2;
                    cevrVar4.b |= 8;
                    cevoVar.copyOnWrite();
                    cevr cevrVar5 = (cevr) cevoVar.instance;
                    cevrVar5.n = null;
                    cevrVar5.b &= -5;
                } else {
                    cqceVar.m("No probationary client capabilities. Skipping commit");
                }
                if ((cevrVar.b & 16) != 0) {
                    ezuu ezuuVar2 = cevrVar.s;
                    if (ezuuVar2 == null) {
                        ezuuVar2 = ezuu.a;
                    }
                    cevoVar.copyOnWrite();
                    cevr cevrVar6 = (cevr) cevoVar.instance;
                    ezuuVar2.getClass();
                    cevrVar6.t = ezuuVar2;
                    cevrVar6.b |= 32;
                    cevoVar.copyOnWrite();
                    cevr cevrVar7 = (cevr) cevoVar.instance;
                    cevrVar7.s = null;
                    cevrVar7.b &= -17;
                }
                return (cevr) cevoVar.build();
            }
        }).i(new eooz() { // from class: cewd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                cevr cevrVar = (cevr) obj;
                if (atomicReference2.get() == null) {
                    return eijx.e(null);
                }
                cevq cevqVarB = cevq.b(((cevr) atomicReference2.get()).i);
                if (cevqVarB == null) {
                    cevqVarB = cevq.UNRECOGNIZED;
                }
                cevq cevqVarB2 = cevq.b(cevrVar.i);
                if (cevqVarB2 == null) {
                    cevqVarB2 = cevq.UNRECOGNIZED;
                }
                int i2 = i;
                cexm cexmVar = this.a;
                cexmVar.v(cevqVarB, cevqVarB2, i2);
                cevq cevqVarB3 = cevq.b(((cevr) atomicReference2.get()).i);
                if (cevqVarB3 == null) {
                    cevqVarB3 = cevq.UNRECOGNIZED;
                }
                cevq cevqVarB4 = cevq.b(cevrVar.i);
                if (cevqVarB4 == null) {
                    cevqVarB4 = cevq.UNRECOGNIZED;
                }
                return cexmVar.u(cevqVarB3, cevqVarB4, i2);
            }
        }, this.j);
    }

    public final eiju u(cevq cevqVar, cevq cevqVar2, int i) {
        a.m("Notifying tachyon phone data store listeners");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            arrayList.add(((cfsb) it.next()).l(this.f, cevqVar2, cevqVar, i));
        }
        return eijx.j(arrayList).a(new Callable() { // from class: cewv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqg.a);
    }

    public final void v(cevq cevqVar, cevq cevqVar2, int i) {
        elyu elyuVarR = r(cevqVar);
        elyu elyuVarR2 = r(cevqVar2);
        if (elyuVarR == elyuVarR2) {
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_E2EE_STATE_TRANSITION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        emiy emiyVar = (emiy) emja.a.createBuilder();
        emiyVar.copyOnWrite();
        emja emjaVar = (emja) emiyVar.instance;
        emjaVar.c = elyuVarR.e;
        emjaVar.b |= 1;
        emiyVar.copyOnWrite();
        emja emjaVar2 = (emja) emiyVar.instance;
        emjaVar2.d = elyuVarR2.e;
        emjaVar2.b |= 2;
        emiyVar.copyOnWrite();
        emja emjaVar3 = (emja) emiyVar.instance;
        emjaVar3.e = i - 1;
        emjaVar3.b |= 4;
        emja emjaVar4 = (emja) emiyVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emjaVar4.getClass();
        ellhVar2.Y = emjaVar4;
        ellhVar2.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        ((aill) this.c.b()).j(ellgVar);
    }
}
