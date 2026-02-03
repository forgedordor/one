package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhv {
    public final int a;
    public final eosc b;
    public final diep c;
    public final Set d;
    public final ehgc e;
    public final fcsu f;
    public final fcsu g;
    public final dzyn h;
    public final fcsu i;
    public final ehig j;
    public final ehhs k;
    public final String l;
    public final dqme m;
    public final fdat n;
    public final fcsu o;
    public final Executor p;
    public final ejxr q;
    public final ecjh r;
    public final fcsu s;
    public final eooy t;
    public final fdae u;
    public final egpe v;
    public final String w;
    public final fctc x;
    public final fctc y;
    private final fctc z;

    public ehhv(int i, eosc eoscVar, diep diepVar, Set set, ehgc ehgcVar, fcsu fcsuVar, fcsu fcsuVar2, dzyn dzynVar, fcsu fcsuVar3, ehig ehigVar, ehhs ehhsVar, String str, final dqme dqmeVar, fdat fdatVar, fcsu fcsuVar4, Executor executor, ejxr ejxrVar, ecjh ecjhVar, fcsu fcsuVar5, eooy eooyVar, fdae fdaeVar) {
        eoscVar.getClass();
        diepVar.getClass();
        set.getClass();
        fcsuVar2.getClass();
        dzynVar.getClass();
        ehhsVar.getClass();
        str.getClass();
        this.a = i;
        this.b = eoscVar;
        this.c = diepVar;
        this.d = set;
        this.e = ehgcVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = dzynVar;
        this.i = fcsuVar3;
        this.j = ehigVar;
        this.k = ehhsVar;
        this.l = str;
        this.m = dqmeVar;
        this.n = fdatVar;
        this.o = fcsuVar4;
        this.p = executor;
        this.q = ejxrVar;
        this.r = ecjhVar;
        this.s = fcsuVar5;
        this.t = eooyVar;
        this.u = fdaeVar;
        Boolean bool = true;
        bool.getClass();
        this.v = new egpe(new eooy() { // from class: ehgx
            /* JADX WARN: Removed duplicated region for block: B:24:0x0141  */
            @Override // defpackage.eooy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ehgx.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, new Executor() { // from class: ehgy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                dqmeVar.d(runnable);
            }
        });
        String strB = dzyc.b(str);
        strB.getClass();
        this.w = strB;
        this.x = fctd.a(new fdae() { // from class: ehgz
            @Override // defpackage.fdae
            public final Object invoke() {
                ehhv ehhvVar = this.a;
                return Boolean.valueOf(ehhvVar.d.contains(ehhvVar.w));
            }
        });
        this.z = fctd.a(new fdae() { // from class: ehha
            @Override // defpackage.fdae
            public final Object invoke() {
                ehhv ehhvVar = this.a;
                return ehhvVar.h.f.a(ehhvVar.e.a(ehhvVar.l));
            }
        });
        this.y = fctd.a(new fdae() { // from class: ehhb
            @Override // defpackage.fdae
            public final Object invoke() {
                return ekrg.c("com/google/apps/tiktok/experiments/phenotype/MendelPackageState");
            }
        });
    }

    public final eaet a() {
        Object objA = this.z.a();
        objA.getClass();
        return (eaet) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekgp b(defpackage.ekik r13, java.util.Set r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehhv.b(ekik, java.util.Set):ekgp");
    }

    public final ekgp c(ehdh ehdhVar) {
        ehds ehdsVarC;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object objB = this.o.b();
        objB.getClass();
        ehdt ehdtVar = (ehdt) objB;
        for (final ehdl ehdlVar : ehdhVar.f) {
            final ehds ehdsVarA = ehdtVar.a(ehdlVar.e);
            if (ehdsVarA != null) {
                int i = ehdlVar.c;
                if (ehdk.b(i) != ehdsVarA.b) {
                    throw new IllegalStateException("Attempting to set a " + ehdsVarA + " type flag with a " + ((Object) ehdk.a(ehdk.b(i))) + " value");
                }
                String str = ehdlVar.e;
                ehdlVar.getClass();
                int iB = ehdk.b(i);
                if (iB == 0) {
                    throw null;
                }
                switch (iB - 1) {
                    case 0:
                        ehdsVarC = ehdr.c(i == 1 ? ((Long) ehdlVar.d).longValue() : 0L);
                        break;
                    case 1:
                        ehdsVarC = ehdr.a(i == 2 ? ((Boolean) ehdlVar.d).booleanValue() : false);
                        break;
                    case 2:
                        ehdsVarC = ehdr.b(i == 3 ? ((Double) ehdlVar.d).doubleValue() : 0.0d);
                        break;
                    case 3:
                        String str2 = i == 4 ? (String) ehdlVar.d : "";
                        str2.getClass();
                        ehdsVarC = ehdr.e(str2);
                        break;
                    case 4:
                        ehdsVarC = new ehds(new fdae() { // from class: ehhk
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                ehdl ehdlVar2 = ehdlVar;
                                evqs evqsVar = ehdlVar2.c == 5 ? (evqs) ehdlVar2.d : evqs.b;
                                evqsVar.getClass();
                                return evqsVar;
                            }
                        }, 5);
                        break;
                    case 5:
                        fdae fdaeVar = new fdae() { // from class: ehhl
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                ehds ehdsVar = ehdsVarA;
                                ehdl ehdlVar2 = ehdlVar;
                                try {
                                    evuh evuhVar = ehdsVar.a;
                                    evuhVar.getClass();
                                    evuh evuhVarBuild = evuhVar.newBuilderForType().mergeFrom(ehdlVar2.c == 6 ? (evqs) ehdlVar2.d : evqs.b).build();
                                    evuhVarBuild.getClass();
                                    return evuhVarBuild;
                                } catch (evtj e) {
                                    Log.e("MendelPackageState", "Failed to parse flag", e);
                                    return ehdsVar.c();
                                } catch (RuntimeException e2) {
                                    Log.e("MendelPackageState", "Failed to parse flag", e2);
                                    return ehdsVar.c();
                                }
                            }
                        };
                        evuh evuhVar = ehdsVarA.a;
                        evuhVar.getClass();
                        ehdsVarC = ehdr.d(fdaeVar, evuhVar);
                        break;
                    case 6:
                        throw new IllegalStateException("No known flag type");
                    default:
                        throw new fctg();
                }
                linkedHashMap.put(str, ehdsVarC);
            }
        }
        ekqg ekqgVarListIterator = ehdtVar.b().listIterator();
        ekqgVarListIterator.getClass();
        while (ekqgVarListIterator.hasNext()) {
            String str3 = (String) ekqgVarListIterator.next();
            if (!linkedHashMap.containsKey(str3)) {
                ehds ehdsVarA2 = ehdtVar.a(str3);
                ehdsVarA2.getClass();
                linkedHashMap.put(str3, ehdsVarA2);
            }
        }
        return ekfv.e(linkedHashMap);
    }

    public final ListenableFuture d() {
        egpe egpeVar = this.v;
        return egpeVar.e() ? egpeVar.c() : this.m.a(this.b, new eooy() { // from class: ehgw
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.v.c();
            }
        });
    }

    public final void e(dzzn dzznVar) {
        if (a().d) {
            String str = this.l;
            dzznVar.copyOnWrite();
            dzzs dzzsVar = (dzzs) dzznVar.instance;
            dzzs dzzsVar2 = dzzs.a;
            dzzsVar.b |= 4;
            dzzsVar.e = str;
        }
    }

    public final boolean f() {
        try {
            egpe egpeVar = this.v;
            if (egpeVar.e()) {
                return ((ehgf) eork.q(egpeVar.c())).d();
            }
            return false;
        } catch (ExecutionException unused) {
            return false;
        }
    }

    public final ehhp g(int i) {
        dzzn dzznVar = (dzzn) dzzs.a.createBuilder();
        dzzo dzzoVar = (dzzo) dzzr.a.createBuilder();
        dzzoVar.copyOnWrite();
        dzzr dzzrVar = (dzzr) dzzoVar.instance;
        dzzrVar.c = dzzq.a(3);
        dzzrVar.b |= 1;
        dzzoVar.copyOnWrite();
        dzzr dzzrVar2 = (dzzr) dzzoVar.instance;
        dzzrVar2.d = dzzp.a(i);
        dzzrVar2.b |= 2;
        dzznVar.copyOnWrite();
        dzzs dzzsVar = (dzzs) dzznVar.instance;
        dzzr dzzrVar3 = (dzzr) dzzoVar.build();
        dzzrVar3.getClass();
        dzzsVar.d = dzzrVar3;
        dzzsVar.b |= 2;
        e(dzznVar);
        ekoo ekooVar = ekoo.c;
        ekooVar.getClass();
        ekgp ekgpVarB = b(ekooVar, fcvq.a);
        evqs evqsVar = evqs.b;
        long epochMilli = this.c.f().toEpochMilli();
        evsn evsnVarBuild = dzznVar.build();
        evsnVarBuild.getClass();
        return new ehhp((ehgf) this.n.a(ekgpVarB, new ehhr("", evqsVar, epochMilli, (dzzs) evsnVarBuild)), i);
    }
}
