package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgk implements abfv {
    public final egzh a;
    public final eosc b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final egyt d;
    private final ecjh e;
    private final fcsu f;

    public abgk(egyt egytVar, egzh egzhVar, eosc eoscVar, ecjh ecjhVar, fcsu fcsuVar) {
        this.d = egytVar;
        this.a = egzhVar;
        this.b = eoscVar;
        this.e = ecjhVar;
        this.f = fcsuVar;
    }

    public static Optional l(abfu abfuVar) {
        int i = abfuVar.c;
        int i2 = i != 0 ? i != 3 ? 0 : 1 : 2;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 != 0) {
            return i3 != 1 ? Optional.empty() : Optional.empty();
        }
        return Optional.of(i == 3 ? (String) abfuVar.d : "");
    }

    @Override // defpackage.abfv
    public final egyi a() {
        return new egys(this.d, new eopk() { // from class: abge
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(this.a.e());
            }
        }, "PAIR_GAIA_ACCOUNT_STATE_KEY");
    }

    @Override // defpackage.abfv
    public final egyi b() {
        return new egys(this.d, new eopk() { // from class: abga
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                eiju eijuVarG;
                abgk abgkVar = this.a;
                if (abgkVar.m()) {
                    final AtomicBoolean atomicBoolean = abgkVar.c;
                    eijuVarG = eijx.g(new Callable() { // from class: abgb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(atomicBoolean.get());
                        }
                    }, abgkVar.b);
                } else {
                    eijuVarG = eijx.e(false);
                }
                return new eopy(eijuVarG);
            }
        }, "SHOW_FAIL_TO_LOAD_DIALOG_KEY");
    }

    @Override // defpackage.abfv
    public final eiju c() {
        return !m() ? eijx.e(false) : eiju.g(this.e.a()).h(new ejvr() { // from class: abfx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((abfu) obj).f);
            }
        }, this.b);
    }

    @Override // defpackage.abfv
    public final eiju d() {
        return !m() ? eijx.e(Optional.empty()) : eiju.g(this.e.a()).h(new ejvr() { // from class: abgi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return abgk.l((abfu) obj);
            }
        }, this.b);
    }

    @Override // defpackage.abfv
    public final eiju e() {
        return eiju.g(this.e.a()).h(new ejvr() { // from class: abfy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abft abftVarB = abft.b(((abfu) obj).g);
                return abftVarB == null ? abft.NOT_PAIRED : abftVarB;
            }
        }, this.b);
    }

    @Override // defpackage.abfv
    public final eiju f() {
        return !m() ? eijx.e("") : eiju.g(this.e.a()).h(new ejvr() { // from class: abfw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((abfu) obj).e;
            }
        }, this.b);
    }

    @Override // defpackage.abfv
    public final eiju g(final Boolean bool) {
        return !m() ? eijx.e(null) : eiju.g(this.e.b(new ejvr() { // from class: abgj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abfr abfrVar = (abfr) ((abfu) obj).toBuilder();
                boolean zBooleanValue = bool.booleanValue();
                abfrVar.copyOnWrite();
                abfu abfuVar = (abfu) abfrVar.instance;
                abfuVar.b |= 2;
                abfuVar.f = zBooleanValue;
                return (abfu) abfrVar.build();
            }
        }, this.b));
    }

    @Override // defpackage.abfv
    public final eiju h(final Optional optional) {
        if (!m()) {
            return eijx.e(false);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ecjh ecjhVar = this.e;
        ejvr ejvrVar = new ejvr() { // from class: abgg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abfu abfuVar = (abfu) obj;
                Optional optionalL = abgk.l(abfuVar);
                Optional optional2 = optional;
                boolean z = !optionalL.equals(optional2);
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                atomicBoolean2.set(z);
                if (!atomicBoolean2.get()) {
                    return abfuVar;
                }
                if (optional2.isPresent()) {
                    abfr abfrVar = (abfr) abfuVar.toBuilder();
                    String str = (String) optional2.get();
                    abfrVar.copyOnWrite();
                    abfu abfuVar2 = (abfu) abfrVar.instance;
                    abfuVar2.c = 3;
                    abfuVar2.d = str;
                    return (abfu) abfrVar.build();
                }
                abfr abfrVar2 = (abfr) abfuVar.toBuilder();
                abfrVar2.copyOnWrite();
                abfu abfuVar3 = (abfu) abfrVar2.instance;
                if (abfuVar3.c == 3) {
                    abfuVar3.c = 0;
                    abfuVar3.d = null;
                }
                return (abfu) abfrVar2.build();
            }
        };
        eosc eoscVar = this.b;
        return eiju.g(ecjhVar.b(ejvrVar, eoscVar)).h(new ejvr() { // from class: abgh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(atomicBoolean.get());
            }
        }, eoscVar);
    }

    @Override // defpackage.abfv
    public final eiju i(final abft abftVar) {
        ejvr ejvrVar = new ejvr() { // from class: abgc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abfr abfrVar = (abfr) ((abfu) obj).toBuilder();
                abfrVar.copyOnWrite();
                abfu abfuVar = (abfu) abfrVar.instance;
                abfuVar.g = abftVar.e;
                abfuVar.b |= 4;
                return (abfu) abfrVar.build();
            }
        };
        eosc eoscVar = this.b;
        return eiju.g(this.e.b(ejvrVar, eoscVar)).h(new ejvr() { // from class: abgd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.a.a(eijx.e(null), "PAIR_GAIA_ACCOUNT_STATE_KEY");
                return null;
            }
        }, eoscVar);
    }

    @Override // defpackage.abfv
    public final eiju j(final boolean z) {
        return !m() ? eijx.e(null) : eijx.f(new Runnable() { // from class: abgf
            @Override // java.lang.Runnable
            public final void run() {
                abgk abgkVar = this.a;
                abgkVar.c.set(z);
                abgkVar.a.a(eijx.e(null), "SHOW_FAIL_TO_LOAD_DIALOG_KEY");
            }
        }, this.b);
    }

    @Override // defpackage.abfv
    public final eiju k(final String str) {
        return !m() ? eijx.e(null) : eiju.g(this.e.b(new ejvr() { // from class: abfz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abfr abfrVar = (abfr) ((abfu) obj).toBuilder();
                abfrVar.copyOnWrite();
                abfu abfuVar = (abfu) abfrVar.instance;
                String str2 = str;
                str2.getClass();
                abfuVar.b |= 1;
                abfuVar.e = str2;
                return (abfu) abfrVar.build();
            }
        }, this.b));
    }

    public final boolean m() {
        return ((abjz) this.f.b()).a();
    }
}
