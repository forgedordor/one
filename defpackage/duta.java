package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duta implements duru {
    public static final /* synthetic */ int e = 0;
    private static final TimeZone f = DesugarTimeZone.getTimeZone("UTC");
    public final ecjh a;
    public final Executor b;
    public final Random c;
    public final duag d;

    public duta(ecjh ecjhVar, duag duagVar, Executor executor, Random random) {
        this.a = ecjhVar;
        this.d = duagVar;
        this.b = executor;
        this.c = random;
    }

    public static long h(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override // defpackage.duru
    public final ListenableFuture a() {
        return this.a.b(new ejvr() { // from class: dusl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = duta.e;
                return dtsb.a;
            }
        }, eoqg.a);
    }

    @Override // defpackage.duru
    public final ListenableFuture b() {
        int i = ekgb.d;
        final AtomicReference atomicReference = new AtomicReference(ekoe.a);
        ejvr ejvrVar = new ejvr() { // from class: dusy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsb dtsbVar = (dtsb) obj;
                int i2 = duta.e;
                atomicReference.set(dtsbVar.d);
                dtrz dtrzVar = (dtrz) dtsbVar.toBuilder();
                dtrzVar.copyOnWrite();
                ((dtsb) dtrzVar.instance).d = dtsb.emptyProtobufList();
                return (dtsb) dtrzVar.build();
            }
        };
        ecjh ecjhVar = this.a;
        Executor executor = this.b;
        return eika.j(ecjhVar.b(ejvrVar, executor), eiid.a(new ejvr() { // from class: dusm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i2 = duta.e;
                return (List) atomicReference.get();
            }
        }), executor);
    }

    @Override // defpackage.duru
    public final ListenableFuture c() {
        final AtomicReference atomicReference = new AtomicReference(ejud.a);
        ejvr ejvrVar = new ejvr() { // from class: dusv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsb dtsbVar = (dtsb) obj;
                long jA = this.a.d.a();
                Long lValueOf = Long.valueOf(jA);
                evvp evvpVar = dtsbVar.c;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                long jA2 = evxc.a(evvpVar);
                Long lValueOf2 = Long.valueOf(jA2);
                dtrz dtrzVar = (dtrz) dtsbVar.toBuilder();
                lValueOf.getClass();
                evvp evvpVarC = evxc.c(jA);
                dtrzVar.copyOnWrite();
                dtsb dtsbVar2 = (dtsb) dtrzVar.instance;
                evvpVarC.getClass();
                dtsbVar2.c = evvpVarC;
                dtsbVar2.b |= 1;
                dtsb dtsbVar3 = (dtsb) dtrzVar.build();
                if ((dtsbVar.b & 1) != 0) {
                    AtomicReference atomicReference2 = atomicReference;
                    lValueOf.getClass();
                    long jH = duta.h(jA);
                    lValueOf2.getClass();
                    atomicReference2.set(ejwi.j(Integer.valueOf(eonc.f(TimeUnit.MILLISECONDS.toDays(jH - duta.h(jA2))))));
                }
                return dtsbVar3;
            }
        };
        ecjh ecjhVar = this.a;
        eoqg eoqgVar = eoqg.a;
        return eika.j(ecjhVar.b(ejvrVar, eoqgVar), new ejvr() { // from class: dusw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = duta.e;
                return (ejwi) atomicReference.get();
            }
        }, eoqgVar);
    }

    @Override // defpackage.duru
    public final ListenableFuture d(final String str) {
        final AtomicReference atomicReference = new AtomicReference(ejud.a);
        ejvr ejvrVar = new ejvr() { // from class: dusq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsb dtsbVar = (dtsb) obj;
                long jA = this.a.d.a();
                ejwi ejwiVarJ = ejud.a;
                Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(dtsbVar.g);
                String str2 = str;
                if (mapUnmodifiableMap.containsKey(str2)) {
                    ejwiVarJ = ejwi.j(Long.valueOf(evxc.a((evvp) DesugarCollections.unmodifiableMap(dtsbVar.g).get(str2))));
                }
                dtrz dtrzVar = (dtrz) dtsbVar.toBuilder();
                evvp evvpVarC = evxc.c(jA);
                evvpVarC.getClass();
                dtrzVar.copyOnWrite();
                dtsb dtsbVar2 = (dtsb) dtrzVar.instance;
                evub evubVar = dtsbVar2.g;
                if (!evubVar.b) {
                    dtsbVar2.g = evubVar.a();
                }
                dtsbVar2.g.put(str2, evvpVarC);
                dtrzVar.copyOnWrite();
                dtsb dtsbVar3 = (dtsb) dtrzVar.instance;
                dtsbVar3.c = null;
                dtsbVar3.b &= -2;
                dtsb dtsbVar4 = (dtsb) dtrzVar.build();
                if (ejwiVarJ.g()) {
                    atomicReference.set(ejwi.j(Long.valueOf(TimeUnit.MILLISECONDS.toHours(jA - ((Long) ejwiVarJ.c()).longValue()))));
                }
                return dtsbVar4;
            }
        };
        ecjh ecjhVar = this.a;
        eoqg eoqgVar = eoqg.a;
        return eika.j(ecjhVar.b(ejvrVar, eoqgVar), new ejvr() { // from class: dusr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = duta.e;
                return (ejwi) atomicReference.get();
            }
        }, eoqgVar);
    }

    @Override // defpackage.duru
    public final ListenableFuture e() {
        return eika.k(this.a.a(), new eooz() { // from class: dusx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                int i = duta.e;
                ekgi ekgiVar = new ekgi();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(((dtsb) obj).g).entrySet()) {
                    ekgiVar.i((String) entry.getKey(), evwz.d((evvp) entry.getValue()));
                }
                return eork.i(ekgiVar.c());
            }
        }, this.b);
    }

    @Override // defpackage.duru
    public final ListenableFuture f() {
        return eika.k(this.a.a(), new eooz() { // from class: dusp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsb dtsbVar = (dtsb) obj;
                dtsf dtsfVar = dtsbVar.f;
                if (dtsfVar == null) {
                    dtsfVar = dtsf.a;
                }
                if ((dtsfVar.b & 1) != 0) {
                    dtsf dtsfVar2 = dtsbVar.f;
                    if (dtsfVar2 == null) {
                        dtsfVar2 = dtsf.a;
                    }
                    return eork.i(dtsfVar2);
                }
                final duta dutaVar = this.a;
                ejvr ejvrVar = new ejvr() { // from class: duss
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        dtsb dtsbVar2 = (dtsb) obj2;
                        dtsf dtsfVar3 = dtsbVar2.f;
                        if (dtsfVar3 == null) {
                            dtsfVar3 = dtsf.a;
                        }
                        if ((dtsfVar3.b & 1) != 0) {
                            return dtsbVar2;
                        }
                        duta dutaVar2 = dutaVar;
                        long jNextLong = dutaVar2.c.nextLong();
                        dtrz dtrzVar = (dtrz) dtsbVar2.toBuilder();
                        dtsf dtsfVar4 = dtsbVar2.f;
                        if (dtsfVar4 == null) {
                            dtsfVar4 = dtsf.a;
                        }
                        dtse dtseVar = (dtse) dtsfVar4.toBuilder();
                        dtseVar.copyOnWrite();
                        dtsf dtsfVar5 = (dtsf) dtseVar.instance;
                        dtsfVar5.b |= 1;
                        dtsfVar5.c = jNextLong;
                        evvp evvpVarC = evxc.c(dutaVar2.d.a());
                        dtseVar.copyOnWrite();
                        dtsf dtsfVar6 = (dtsf) dtseVar.instance;
                        evvpVarC.getClass();
                        dtsfVar6.d = evvpVarC;
                        dtsfVar6.b |= 2;
                        dtrzVar.copyOnWrite();
                        dtsb dtsbVar3 = (dtsb) dtrzVar.instance;
                        dtsf dtsfVar7 = (dtsf) dtseVar.build();
                        dtsfVar7.getClass();
                        dtsbVar3.f = dtsfVar7;
                        dtsbVar3.b |= 4;
                        return (dtsb) dtrzVar.build();
                    }
                };
                ecjh ecjhVar = dutaVar.a;
                Executor executor = dutaVar.b;
                return dvaq.e(ecjhVar.b(ejvrVar, executor)).g(new eooz() { // from class: dust
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return dutaVar.a.a();
                    }
                }, executor).f(new ejvr() { // from class: dusu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        dtsf dtsfVar3 = ((dtsb) obj2).f;
                        return dtsfVar3 == null ? dtsf.a : dtsfVar3;
                    }
                }, executor);
            }
        }, this.b);
    }

    @Override // defpackage.duru
    public final ListenableFuture g(final dtro dtroVar) {
        return this.a.b(new ejvr() { // from class: dusn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtsb dtsbVar = (dtsb) obj;
                int i = duta.e;
                evtg evtgVar = dtsbVar.d;
                final dtro dtroVar2 = dtroVar;
                int iA = ekis.a(evtgVar, new ejwm() { // from class: duso
                    @Override // defpackage.ejwm
                    public final boolean a(Object obj2) {
                        dtro dtroVar3 = (dtro) obj2;
                        int i2 = duta.e;
                        dtro dtroVar4 = dtroVar2;
                        dtrw dtrwVar = dtroVar4.c;
                        if (dtrwVar == null) {
                            dtrwVar = dtrw.a;
                        }
                        dtrw dtrwVar2 = dtroVar3.c;
                        if (dtrwVar2 == null) {
                            dtrwVar2 = dtrw.a;
                        }
                        return dtrwVar.equals(dtrwVar2) && dtroVar4.f == dtroVar3.f && dtroVar4.d == dtroVar3.d;
                    }
                });
                if (iA == -1) {
                    dtrz dtrzVar = (dtrz) dtsbVar.toBuilder();
                    dtrzVar.copyOnWrite();
                    dtsb dtsbVar2 = (dtsb) dtrzVar.instance;
                    dtroVar2.getClass();
                    dtsbVar2.a();
                    dtsbVar2.d.add(dtroVar2);
                    return (dtsb) dtrzVar.build();
                }
                dtro dtroVar3 = (dtro) dtsbVar.d.get(iA);
                dtrn dtrnVar = (dtrn) dtroVar3.toBuilder();
                long j = dtroVar3.g + dtroVar2.g;
                dtrnVar.copyOnWrite();
                dtro dtroVar4 = (dtro) dtrnVar.instance;
                dtroVar4.b |= 16;
                dtroVar4.g = j;
                long j2 = dtroVar3.h + dtroVar2.h;
                dtrnVar.copyOnWrite();
                dtro dtroVar5 = (dtro) dtrnVar.instance;
                dtroVar5.b |= 32;
                dtroVar5.h = j2;
                dtro dtroVar6 = (dtro) dtrnVar.build();
                dtrz dtrzVar2 = (dtrz) dtsbVar.toBuilder();
                dtrzVar2.copyOnWrite();
                dtsb dtsbVar3 = (dtsb) dtrzVar2.instance;
                dtroVar6.getClass();
                dtsbVar3.a();
                dtsbVar3.d.set(iA, dtroVar6);
                return (dtsb) dtrzVar2.build();
            }
        }, this.b);
    }
}
