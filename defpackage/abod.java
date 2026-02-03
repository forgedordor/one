package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abod {
    public static final cqce a = cqce.g("Bugle", "FluentJsBridgeRequestSender");
    public long b = Math.max(((Long) abmt.g.e()).longValue(), 500L);
    public TimeUnit c = TimeUnit.MILLISECONDS;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    private final abpk g;
    private final abdy h;
    private final eosc i;

    public abod(abpk abpkVar, abdy abdyVar, eosc eoscVar) {
        this.g = abpkVar;
        this.h = abdyVar;
        this.i = eoscVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju a(final defpackage.abou r7, final defpackage.eppi r8) {
        /*
            r6 = this;
            boolean r0 = r6.f
            r1 = 0
            if (r0 == 0) goto L2b
            abou r0 = defpackage.abou.FOREGROUND
            if (r7 == r0) goto L23
            abpk r0 = r6.g
            boolean r0 = r0.h(r7)
            if (r0 != 0) goto L2b
            abdy r0 = r6.h
            eiju r0 = r0.b()
            abnw r2 = new abnw
            r2.<init>()
            eosc r3 = r6.i
            eiju r0 = r0.h(r2, r3)
            goto L2f
        L23:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Cannot apply startBackgroundHandlerIfNecessary to requests targeted at BridgeHostType.FOREGROUND"
            r7.<init>(r8)
            throw r7
        L2b:
            eiju r0 = defpackage.eijx.e(r1)
        L2f:
            boolean r2 = r6.d
            if (r2 == 0) goto L58
            abpk r2 = r6.g
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            boolean r4 = r2.h(r7)
            if (r4 == 0) goto L42
            eiju r1 = defpackage.eijx.e(r1)
            goto L5c
        L42:
            abor r1 = new abor
            r1.<init>()
            com.google.common.util.concurrent.ListenableFuture r1 = defpackage.kol.a(r1)
            eiju r1 = defpackage.eiju.g(r1)
            r4 = 30000(0x7530, double:1.4822E-319)
            eosd r2 = r2.e
            eiju r1 = r1.j(r4, r3, r2)
            goto L5c
        L58:
            eiju r1 = defpackage.eijx.e(r1)
        L5c:
            r2 = 2
            com.google.common.util.concurrent.ListenableFuture[] r2 = new com.google.common.util.concurrent.ListenableFuture[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            eijw r0 = defpackage.eijx.m(r2)
            abny r1 = new abny
            r1.<init>()
            eosc r2 = r6.i
            eiju r0 = r0.a(r1, r2)
            abnz r1 = new abnz
            r1.<init>()
            eiju r0 = r0.i(r1, r2)
            aboa r1 = new aboa
            r1.<init>()
            java.lang.Class<java.lang.Exception> r7 = java.lang.Exception.class
            eiju r7 = r0.e(r7, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abod.a(abou, eppi):eiju");
    }

    public final eiju b(abou abouVar, eppi eppiVar) {
        return a(abouVar, eppiVar).h(new ejvr() { // from class: abnx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (optional == null || !optional.isPresent()) {
                    throw new abob();
                }
                return (eppl) optional.get();
            }
        }, this.i);
    }

    public final eiju c(final abou abouVar, final eppi eppiVar, int i) throws abpi {
        Optional optionalEmpty;
        final abou abouVar2;
        Pair pairCreate;
        final eppi eppiVar2;
        if (i < 0) {
            return eijx.d(new aboc());
        }
        try {
            final abpk abpkVar = this.g;
            long j = this.b;
            TimeUnit timeUnit = this.c;
            if (abouVar == abou.AGNOSTIC) {
                try {
                    synchronized (abpk.b) {
                        Map.Entry entry = null;
                        for (Map.Entry entry2 : abpkVar.i.entrySet()) {
                            if (((abpg) entry2.getValue()).c().e() && !((abpg) entry2.getValue()).g() && (entry == null || ((abou) entry2.getKey()).d > ((abou) entry.getKey()).d)) {
                                entry = entry2;
                            }
                        }
                        if (entry == null) {
                            throw new abpi();
                        }
                        pairCreate = Pair.create((abou) entry.getKey(), (abpg) entry.getValue());
                    }
                    optionalEmpty = Optional.of((abou) pairCreate.first);
                } catch (abpi unused) {
                    optionalEmpty = Optional.empty();
                }
                abouVar2 = (abou) optionalEmpty.orElseThrow(new Supplier() { // from class: abop
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new abpi();
                    }
                });
            } else {
                abouVar2 = abouVar;
            }
            if (!abpkVar.h(abouVar2)) {
                throw new abpi();
            }
            if (eppiVar.d.isEmpty()) {
                eppg eppgVar = (eppg) eppi.a.createBuilder(eppiVar);
                String string = UUID.randomUUID().toString();
                eppgVar.copyOnWrite();
                eppi eppiVar3 = (eppi) eppgVar.instance;
                string.getClass();
                eppiVar3.d = string;
                eppiVar2 = (eppi) eppgVar.build();
            } else {
                eppiVar2 = eppiVar;
            }
            final String str = eppiVar2.d;
            eopk eopkVar = new eopk() { // from class: aboh
                @Override // defpackage.eopk
                public final eopy a(final eopt eoptVar) {
                    final abpk abpkVar2 = abpkVar;
                    final eppi eppiVar4 = eppiVar2;
                    final String str2 = str;
                    final abou abouVar3 = abouVar2;
                    return eijs.c(kol.a(new koi() { // from class: abok
                        @Override // defpackage.koi
                        public final Object a(kog kogVar) {
                            abpk abpkVar3 = abpkVar2;
                            Map map = abpkVar3.j;
                            String str3 = str2;
                            abou abouVar4 = abouVar3;
                            synchronized (map) {
                                if (map.containsKey(str3)) {
                                    throw new IllegalStateException(a.v(str3, "Duplicated requestId: "));
                                }
                                map.put(str3, kogVar);
                            }
                            eopt eoptVar2 = eoptVar;
                            eppi eppiVar5 = eppiVar4;
                            eoptVar2.a(eiid.i(new abow(abpkVar3, str3, kogVar)), abpkVar3.e);
                            ((abdl) abpkVar3.g.b()).g(eppiVar5.d, epph.b(epph.c(eppiVar5.b)));
                            synchronized (abpk.b) {
                                abpg abpgVar = (abpg) abpkVar3.i.get(abouVar4);
                                if (abpgVar == null) {
                                    throw new abpi();
                                }
                                abpgVar.c().a(abpk.a(eppiVar5));
                            }
                            return null;
                        }
                    })).a;
                }
            };
            eosd eosdVar = abpkVar.e;
            eiju eijuVarE = eijs.e(eopkVar, eosdVar).h().h(new ejvr() { // from class: aboi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Optional.of((eppl) obj);
                }
            }, eosdVar).j(j, timeUnit, eosdVar).e(Exception.class, new ejvr() { // from class: aboj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    abpk abpkVar2 = abpkVar;
                    Map map = abpkVar2.j;
                    String str2 = str;
                    Exception exc = (Exception) obj;
                    synchronized (map) {
                        map.remove(str2);
                    }
                    eppi eppiVar4 = eppiVar2;
                    if (exc instanceof TimeoutException) {
                        ((abdl) abpkVar2.g.b()).h(eppiVar4.d, epph.b(epph.c(eppiVar4.b)), exmt.DEADLINE_EXCEEDED);
                        return Optional.empty();
                    }
                    ((abdl) abpkVar2.g.b()).h(eppiVar4.d, epph.b(epph.c(eppiVar4.b)), exmt.UNKNOWN);
                    if (exc instanceof RuntimeException) {
                        throw ((RuntimeException) exc);
                    }
                    throw new ejyc(exc);
                }
            }, eosdVar);
            eooz eoozVar = new eooz() { // from class: abnu
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    eppi eppiVar4 = eppiVar;
                    Optional optional = (Optional) obj;
                    if (optional != null && optional.isPresent()) {
                        cqbd cqbdVarC = abod.a.c();
                        cqbdVarC.I("Request completed successfully");
                        int iC = epph.c(eppiVar4.b);
                        if (iC == 0) {
                            throw null;
                        }
                        cqbdVarC.A("requestType", epph.a(iC));
                        cqbdVarC.y("remainingRetries", 0);
                        cqbdVarC.r();
                        return eijx.e(optional);
                    }
                    cqbd cqbdVarC2 = abod.a.c();
                    cqbdVarC2.I("Received an empty response. Retrying.");
                    int iC2 = epph.c(eppiVar4.b);
                    if (iC2 == 0) {
                        throw null;
                    }
                    abou abouVar3 = abouVar;
                    abod abodVar = this.a;
                    cqbdVarC2.A("requestType", epph.a(iC2));
                    cqbdVarC2.y("remainingRetries", 0);
                    cqbdVarC2.r();
                    return abodVar.c(abouVar3, eppiVar4, -1);
                }
            };
            eosc eoscVar = this.i;
            return eijuVarE.i(eoozVar, eoscVar).f(Exception.class, new eooz() { // from class: abnv
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Exception exc = (Exception) obj;
                    cqbd cqbdVarC = abod.a.c();
                    cqbdVarC.I("Received a response error. Retrying.");
                    eppi eppiVar4 = eppiVar;
                    int iC = epph.c(eppiVar4.b);
                    if (iC == 0) {
                        throw null;
                    }
                    abou abouVar3 = abouVar;
                    abod abodVar = this.a;
                    cqbdVarC.A("requestType", epph.a(iC));
                    cqbdVarC.y("remainingRetries", 0);
                    cqbdVarC.s(exc);
                    return abodVar.c(abouVar3, eppiVar4, -1);
                }
            }, eoscVar);
        } catch (abpi e) {
            return eijx.d(e);
        }
    }

    public final void d(abou abouVar, eppi eppiVar) {
        a(abouVar, eppiVar).k(auvh.b(), this.i);
    }

    public final void e() {
        this.b = Math.max(((Long) abmt.h.e()).longValue(), 500L);
        this.c = TimeUnit.MILLISECONDS;
    }
}
