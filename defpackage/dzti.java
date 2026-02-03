package defpackage;

import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzti extends dztg implements dzlo, dzix {
    private final dzjd a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final AtomicBoolean e = new AtomicBoolean();
    private final fcsu f;
    private final fcsu g;

    public dzti(dzjd dzjdVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, final eygg eyggVar) {
        this.g = fcsuVar4;
        this.a = dzjdVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.f = new fcsu() { // from class: dzth
            @Override // defpackage.fcsu
            public final Object b() {
                return false;
            }
        };
    }

    private static long a(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static feft b(dzst dzstVar, boolean z) {
        fefs fefsVar = (fefs) feft.a.createBuilder();
        if (dzstVar.a != null) {
            String str = dzstVar.a;
            fefsVar.copyOnWrite();
            feft feftVar = (feft) fefsVar.instance;
            str.getClass();
            feftVar.b |= 1;
            feftVar.c = str;
        }
        if (dzstVar.b != null) {
            long jC = dzstVar.b.c(false);
            fefsVar.copyOnWrite();
            feft feftVar2 = (feft) fefsVar.instance;
            feftVar2.b |= 2;
            feftVar2.d = jC;
        }
        if (dzstVar.c != null) {
            long jC2 = dzstVar.c.c(false);
            fefsVar.copyOnWrite();
            feft feftVar3 = (feft) fefsVar.instance;
            feftVar3.b |= 4;
            feftVar3.e = jC2;
        }
        if (dzstVar.d != null) {
            long jC3 = dzstVar.d.c(false);
            fefsVar.copyOnWrite();
            feft feftVar4 = (feft) fefsVar.instance;
            feftVar4.b |= 8;
            feftVar4.f = jC3;
        }
        return (feft) fefsVar.build();
    }

    @Override // defpackage.dzix
    public final void i(dzfh dzfhVar) {
        Long lValueOf;
        this.a.b(this);
        dztc dztcVar = dztc.a;
        dzlw dzlwVar = dztcVar.i;
        dzlw dzlwVar2 = dztcVar.j;
        fcsu fcsuVar = this.f;
        ((Boolean) fcsuVar.b()).booleanValue();
        if ((dzlwVar == null || dzlwVar.c(false) <= 0) && (dzlwVar2 == null || dzlwVar2.c(false) <= 0)) {
            ((ekrd) ((ekrd) dzfq.a.h()).h("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 297, "StartupMetricServiceImpl.java")).q("missing firstDraw timestamp");
            return;
        }
        fcsu fcsuVar2 = this.g;
        dzlw dzlwVar3 = dztcVar.f(((Long) fcsuVar2.b()).longValue()) ? dztcVar.b : dztcVar.g;
        if (dzlwVar3 == null) {
            return;
        }
        long jC = dzlwVar3.c(false);
        if (jC > 0) {
            if ((dzlwVar == null || dzlwVar.c(false) < jC) && (dzlwVar2 == null || dzlwVar2.c(false) < jC)) {
                return;
            }
            ((Boolean) fcsuVar.b()).booleanValue();
            final fefu fefuVar = (fefu) fefy.a.createBuilder();
            boolean zF = dztcVar.f(((Long) fcsuVar2.b()).longValue());
            fefuVar.copyOnWrite();
            fefy fefyVar = (fefy) fefuVar.instance;
            fefyVar.b |= 65536;
            fefyVar.r = zF;
            int i = true != zF ? 3 : 2;
            fefuVar.copyOnWrite();
            fefy fefyVar2 = (fefy) fefuVar.instance;
            fefyVar2.s = i - 1;
            fefyVar2.b |= 131072;
            dzlw dzlwVar4 = dztcVar.b;
            dzlw dzlwVar5 = null;
            if (dzlwVar4 != null) {
                long jC2 = dzlwVar4.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar3 = (fefy) fefuVar.instance;
                fefyVar3.b |= 16;
                fefyVar3.f = jC2;
                lValueOf = Long.valueOf(jC2);
            } else {
                lValueOf = null;
            }
            dzlw dzlwVar6 = dztcVar.c;
            if (dzlwVar6 != null) {
                long jC3 = dzlwVar6.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar4 = (fefy) fefuVar.instance;
                fefyVar4.b |= 128;
                fefyVar4.i = jC3;
                lValueOf = Long.valueOf(a(lValueOf, jC3));
            }
            dzlw dzlwVar7 = dztcVar.d;
            dzlw dzlwVar8 = dztcVar.e;
            dzlw dzlwVar9 = dztcVar.f;
            dzlw dzlwVar10 = dztcVar.g;
            if (dzlwVar10 != null) {
                long jC4 = dzlwVar10.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar5 = (fefy) fefuVar.instance;
                fefyVar5.b |= 512;
                fefyVar5.k = jC4;
                lValueOf = Long.valueOf(a(lValueOf, jC4));
            }
            dzlw dzlwVar11 = dztcVar.j;
            dzlw dzlwVar12 = dztcVar.k;
            dzlw dzlwVar13 = dztcVar.i;
            dzlw dzlwVar14 = dztcVar.h;
            int iIntValue = ((Long) this.d.b()).intValue();
            if (iIntValue == 1) {
                dzlwVar5 = dzlwVar11;
            } else if (iIntValue == 2) {
                dzlwVar5 = dzlwVar12;
            } else if (iIntValue == 3) {
                dzlwVar5 = dzlwVar13;
            } else if (iIntValue == 4) {
                dzlwVar5 = dzlwVar14;
            }
            if (dzlwVar5 != null) {
                long jC5 = dzlwVar5.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar6 = (fefy) fefuVar.instance;
                fefyVar6.b |= 1024;
                fefyVar6.l = jC5;
                lValueOf = Long.valueOf(a(lValueOf, jC5));
            }
            if (dzlwVar13 != null) {
                long jC6 = dzlwVar13.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar7 = (fefy) fefuVar.instance;
                fefyVar7.b |= 8192;
                fefyVar7.o = jC6;
                lValueOf = Long.valueOf(a(lValueOf, jC6));
            }
            if (dzlwVar14 != null) {
                long jC7 = dzlwVar14.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar8 = (fefy) fefuVar.instance;
                fefyVar8.b |= 16384;
                fefyVar8.p = jC7;
                lValueOf = Long.valueOf(a(lValueOf, jC7));
            }
            if (dzlwVar11 != null) {
                long jC8 = dzlwVar11.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar9 = (fefy) fefuVar.instance;
                fefyVar9.b |= 2048;
                fefyVar9.m = jC8;
                lValueOf = Long.valueOf(a(lValueOf, jC8));
            }
            if (dzlwVar12 != null) {
                long jC9 = dzlwVar12.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar10 = (fefy) fefuVar.instance;
                fefyVar10.b |= 4096;
                fefyVar10.n = jC9;
                lValueOf = Long.valueOf(a(lValueOf, jC9));
            }
            dzlw dzlwVar15 = dztcVar.l;
            if (dzlwVar15 != null) {
                long jC10 = dzlwVar15.c(false);
                fefuVar.copyOnWrite();
                fefy fefyVar11 = (fefy) fefuVar.instance;
                fefyVar11.b |= 32768;
                fefyVar11.q = jC10;
                lValueOf = Long.valueOf(a(lValueOf, jC10));
            }
            dzst dzstVar = dztcVar.n;
            if (dzstVar.b != null) {
                feft feftVarB = b(dzstVar, false);
                fefuVar.copyOnWrite();
                fefy fefyVar12 = (fefy) fefuVar.instance;
                feftVarB.getClass();
                fefyVar12.u = feftVarB;
                fefyVar12.b |= 524288;
                if ((feftVarB.b & 2) != 0) {
                    lValueOf = Long.valueOf(a(lValueOf, feftVarB.d));
                }
                if ((feftVarB.b & 4) != 0) {
                    lValueOf = Long.valueOf(a(lValueOf, feftVarB.e));
                }
                if ((feftVarB.b & 8) != 0) {
                    lValueOf = Long.valueOf(a(lValueOf, feftVarB.f));
                }
            }
            dzst dzstVar2 = dztcVar.o;
            if (dzstVar2.b != null) {
                feft feftVarB2 = b(dzstVar2, false);
                fefuVar.copyOnWrite();
                fefy fefyVar13 = (fefy) fefuVar.instance;
                feftVarB2.getClass();
                fefyVar13.v = feftVarB2;
                fefyVar13.b |= 1048576;
                if ((feftVarB2.b & 2) != 0) {
                    lValueOf = Long.valueOf(a(lValueOf, feftVarB2.d));
                }
                if ((feftVarB2.b & 4) != 0) {
                    lValueOf = Long.valueOf(a(lValueOf, feftVarB2.e));
                }
                if ((feftVarB2.b & 8) != 0) {
                    lValueOf = Long.valueOf(a(lValueOf, feftVarB2.f));
                }
            }
            ejwi ejwiVarA = dztj.a();
            if (ejwiVarA.g()) {
                Long l = (Long) ejwiVarA.c();
                long jLongValue = l.longValue();
                fefuVar.copyOnWrite();
                fefy fefyVar14 = (fefy) fefuVar.instance;
                fefyVar14.b |= 2;
                fefyVar14.d = jLongValue;
                lValueOf = Long.valueOf(a(lValueOf, l.longValue()));
            }
            long startElapsedRealtime = Process.getStartElapsedRealtime();
            fefuVar.copyOnWrite();
            fefy fefyVar15 = (fefy) fefuVar.instance;
            fefyVar15.b |= 4;
            fefyVar15.e = startElapsedRealtime;
            long jA = a(lValueOf, startElapsedRealtime);
            Long lValueOf2 = Long.valueOf(jA);
            fefuVar.copyOnWrite();
            fefy fefyVar16 = (fefy) fefuVar.instance;
            fefyVar16.b |= 262144;
            fefyVar16.t = true;
            lValueOf2.getClass();
            boolean zBooleanValue = ((Boolean) this.c.b()).booleanValue();
            if (jA != 0) {
                if (!zBooleanValue) {
                    fefuVar.copyOnWrite();
                    fefy fefyVar17 = (fefy) fefuVar.instance;
                    fefyVar17.b |= 1;
                    fefyVar17.c = jA;
                }
                fefy fefyVar18 = (fefy) fefuVar.instance;
                if ((fefyVar18.b & 16) != 0) {
                    long j = fefyVar18.f - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar19 = (fefy) fefuVar.instance;
                    fefyVar19.b |= 16;
                    fefyVar19.f = j;
                }
                fefy fefyVar20 = (fefy) fefuVar.instance;
                if ((fefyVar20.b & 128) != 0) {
                    long j2 = fefyVar20.i - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar21 = (fefy) fefuVar.instance;
                    fefyVar21.b |= 128;
                    fefyVar21.i = j2;
                }
                fefy fefyVar22 = (fefy) fefuVar.instance;
                if ((fefyVar22.b & 256) != 0) {
                    long j3 = fefyVar22.j - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar23 = (fefy) fefuVar.instance;
                    fefyVar23.b |= 256;
                    fefyVar23.j = j3;
                }
                fefy fefyVar24 = (fefy) fefuVar.instance;
                if ((fefyVar24.b & 32) != 0) {
                    long j4 = fefyVar24.g - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar25 = (fefy) fefuVar.instance;
                    fefyVar25.b |= 32;
                    fefyVar25.g = j4;
                }
                fefy fefyVar26 = (fefy) fefuVar.instance;
                if ((fefyVar26.b & 64) != 0) {
                    long j5 = fefyVar26.h - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar27 = (fefy) fefuVar.instance;
                    fefyVar27.b |= 64;
                    fefyVar27.h = j5;
                }
                fefy fefyVar28 = (fefy) fefuVar.instance;
                if ((fefyVar28.b & 512) != 0) {
                    long j6 = fefyVar28.k - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar29 = (fefy) fefuVar.instance;
                    fefyVar29.b |= 512;
                    fefyVar29.k = j6;
                }
                fefy fefyVar30 = (fefy) fefuVar.instance;
                if ((fefyVar30.b & 1024) != 0) {
                    long j7 = fefyVar30.l - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar31 = (fefy) fefuVar.instance;
                    fefyVar31.b |= 1024;
                    fefyVar31.l = j7;
                }
                fefy fefyVar32 = (fefy) fefuVar.instance;
                if ((fefyVar32.b & 2048) != 0) {
                    long j8 = fefyVar32.m - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar33 = (fefy) fefuVar.instance;
                    fefyVar33.b |= 2048;
                    fefyVar33.m = j8;
                }
                fefy fefyVar34 = (fefy) fefuVar.instance;
                if ((fefyVar34.b & 4096) != 0) {
                    long j9 = fefyVar34.n - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar35 = (fefy) fefuVar.instance;
                    fefyVar35.b |= 4096;
                    fefyVar35.n = j9;
                }
                fefy fefyVar36 = (fefy) fefuVar.instance;
                if ((fefyVar36.b & 8192) != 0) {
                    long j10 = fefyVar36.o - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar37 = (fefy) fefuVar.instance;
                    fefyVar37.b |= 8192;
                    fefyVar37.o = j10;
                }
                fefy fefyVar38 = (fefy) fefuVar.instance;
                if ((fefyVar38.b & 16384) != 0) {
                    long j11 = fefyVar38.p - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar39 = (fefy) fefuVar.instance;
                    fefyVar39.b |= 16384;
                    fefyVar39.p = j11;
                }
                fefy fefyVar40 = (fefy) fefuVar.instance;
                if ((fefyVar40.b & 32768) != 0) {
                    long j12 = fefyVar40.q - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar41 = (fefy) fefuVar.instance;
                    fefyVar41.b = 32768 | fefyVar41.b;
                    fefyVar41.q = j12;
                }
                fefy fefyVar42 = (fefy) fefuVar.instance;
                if ((fefyVar42.b & 524288) != 0) {
                    feft feftVar = fefyVar42.u;
                    if (feftVar == null) {
                        feftVar = feft.a;
                    }
                    feft feftVarA = dztk.a(feftVar, jA);
                    fefuVar.copyOnWrite();
                    fefy fefyVar43 = (fefy) fefuVar.instance;
                    feftVarA.getClass();
                    fefyVar43.u = feftVarA;
                    fefyVar43.b |= 524288;
                }
                fefy fefyVar44 = (fefy) fefuVar.instance;
                if ((fefyVar44.b & 1048576) != 0) {
                    feft feftVar2 = fefyVar44.v;
                    if (feftVar2 == null) {
                        feftVar2 = feft.a;
                    }
                    feft feftVarA2 = dztk.a(feftVar2, jA);
                    fefuVar.copyOnWrite();
                    fefy fefyVar45 = (fefy) fefuVar.instance;
                    feftVarA2.getClass();
                    fefyVar45.v = feftVarA2;
                    fefyVar45.b |= 1048576;
                }
                fefy fefyVar46 = (fefy) fefuVar.instance;
                if ((fefyVar46.b & 4) != 0) {
                    long j13 = fefyVar46.e - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar47 = (fefy) fefuVar.instance;
                    fefyVar47.b |= 4;
                    fefyVar47.e = j13;
                }
                fefy fefyVar48 = (fefy) fefuVar.instance;
                if ((fefyVar48.b & 2) != 0) {
                    long j14 = fefyVar48.d - jA;
                    fefuVar.copyOnWrite();
                    fefy fefyVar49 = (fefy) fefuVar.instance;
                    fefyVar49.b |= 2;
                    fefyVar49.d = j14;
                }
            }
            dzfh dzfhVar2 = dztcVar.m;
            if (this.e.getAndSet(true)) {
                ListenableFuture listenableFuture = eorv.a;
                return;
            }
            final dztf dztfVar = (dztf) this.b.b();
            final String strD = dzfh.d(dzfhVar2);
            eork.n(new eooy() { // from class: dzte
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    int iA;
                    final dztf dztfVar2 = dztfVar;
                    if (!dztfVar2.a.c(null)) {
                        return eorv.a;
                    }
                    final fefu fefuVar2 = fefuVar;
                    fefy fefyVar50 = (fefy) fefuVar2.instance;
                    int i2 = fefyVar50.s;
                    int iA2 = fefx.a(i2);
                    if (((iA2 != 0 && iA2 == 3) || ((iA = fefx.a(i2)) != 0 && iA == 2)) && (fefyVar50.b & 16) == 0) {
                        return eorv.a;
                    }
                    final String str = strD;
                    dzsq dzsqVar = (dzsq) dztfVar2.b.b();
                    dzsqVar.d();
                    ejud ejudVar = ejud.a;
                    final ListenableFuture listenableFutureI = eork.i(ejudVar);
                    dzsqVar.e();
                    final ListenableFuture listenableFutureI2 = eork.i(ejudVar);
                    return eork.b(listenableFutureI, listenableFutureI2).b(new eooy() { // from class: dztd
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            ListenableFuture listenableFuture2 = listenableFutureI;
                            fefu fefuVar3 = fefuVar2;
                            try {
                                Map map = (Map) ((ejwi) eork.q(listenableFuture2)).f();
                                if (map != null) {
                                    long j15 = ((fefy) fefuVar3.instance).c;
                                    for (Map.Entry entry : map.entrySet()) {
                                        Integer num = (Integer) entry.getKey();
                                        num.intValue();
                                        long jLongValue2 = ((Long) entry.getValue()).longValue() - j15;
                                        fefuVar3.copyOnWrite();
                                        fefy fefyVar51 = (fefy) fefuVar3.instance;
                                        evub evubVar = fefyVar51.w;
                                        if (!evubVar.b) {
                                            fefyVar51.w = evubVar.a();
                                        }
                                        fefyVar51.w.put(num, Long.valueOf(jLongValue2));
                                    }
                                }
                            } catch (Exception e) {
                                ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).q("Failed to get custom timestamps future");
                            }
                            String str2 = str;
                            ListenableFuture listenableFuture3 = listenableFutureI2;
                            dztf dztfVar3 = dztfVar2;
                            dzle dzleVarN = dzlf.n();
                            feiw feiwVar = (feiw) feix.a.createBuilder();
                            fefm fefmVar = (fefm) fefo.a.createBuilder();
                            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                            fefmVar.copyOnWrite();
                            fefo fefoVar = (fefo) fefmVar.instance;
                            fefoVar.b |= 1;
                            fefoVar.c = leastSignificantBits;
                            fefmVar.copyOnWrite();
                            fefo fefoVar2 = (fefo) fefmVar.instance;
                            fefoVar2.d = 2;
                            fefoVar2.b = 2 | fefoVar2.b;
                            fefmVar.copyOnWrite();
                            fefo fefoVar3 = (fefo) fefmVar.instance;
                            fefy fefyVar52 = (fefy) fefuVar3.build();
                            fefyVar52.getClass();
                            fefoVar3.f = fefyVar52;
                            fefoVar3.b |= 16;
                            feiwVar.copyOnWrite();
                            feix feixVar = (feix) feiwVar.instance;
                            fefo fefoVar4 = (fefo) fefmVar.build();
                            fefoVar4.getClass();
                            feixVar.m = fefoVar4;
                            feixVar.b |= 2048;
                            dzleVarN.f((feix) feiwVar.build());
                            feeg feegVar = (feeg) ((ejwi) eork.q(listenableFuture3)).f();
                            dzkw dzkwVar = (dzkw) dzleVarN;
                            dzkwVar.b = feegVar;
                            dzkwVar.c = str2;
                            dzleVarN.d(true);
                            return dztfVar3.a.b(dzleVarN.a());
                        }
                    }, eoqg.a);
                }
            }, dztfVar.c);
        }
    }

    @Override // defpackage.dzlo
    public final void n() {
        this.a.a(this);
    }

    @Override // defpackage.dzix
    public final /* synthetic */ void j(dzfh dzfhVar) {
    }
}
