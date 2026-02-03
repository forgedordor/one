package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.EnumMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgsy {
    public final Context c;
    public final fcsu d;
    public ecjh e;
    public String f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    private final ecjl j;
    private final deyu k;
    private final eosc l;
    private final fcsu m;
    private static final ListenableFuture h = eorv.a;
    private static final ListenableFuture i = eork.i(ewpd.NOT_SET);
    public static final ekgp a = ekmi.c(new EnumMap(ekgp.n(cqgk.UNKNOWN, ewpf.SMS_CONNECTION_AVAILABILITY_UNKNOWN, cqgk.AVAILABLE, ewpf.SMS_CONNECTION_AVAILABLE, cqgk.UNAVAILABLE, ewpf.SMS_CONNECTION_UNAVAILABLE)));
    public static final eksp b = eksp.c(dhin.a);

    public dgsy(Context context, ecjl ecjlVar, deyu deyuVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = context;
        this.j = ecjlVar;
        this.k = deyuVar;
        this.l = eoscVar;
        this.m = fcsuVar;
        this.d = fcsuVar2;
    }

    static ewqd b(ewqd ewqdVar, ewpp ewppVar) {
        int iA = dfpi.a();
        if (iA == 0) {
            return ewqdVar;
        }
        ewpu ewpuVar = ewqdVar.e;
        if (ewpuVar == null) {
            ewpuVar = ewpu.a;
        }
        ewpl ewplVar = (ewpl) ewpuVar.toBuilder();
        if (iA > 0) {
            ewpu ewpuVar2 = ewqdVar.e;
            if (ewpuVar2 == null) {
                ewpuVar2 = ewpu.a;
            }
            if (ewpuVar2.d.size() >= iA) {
                ewplVar.copyOnWrite();
                ewpu ewpuVar3 = (ewpu) ewplVar.instance;
                ewpuVar3.a();
                ewpuVar3.d.remove(0);
                Integer numValueOf = Integer.valueOf(dfpi.a());
                ewpu ewpuVar4 = ewqdVar.e;
                if (ewpuVar4 == null) {
                    ewpuVar4 = ewpu.a;
                }
                dhja.q("ProvisioningEvent exceeds max number %d, current size %d", numValueOf, Integer.valueOf(ewpuVar4.d.size()));
            }
        }
        ewplVar.copyOnWrite();
        ewpu ewpuVar5 = (ewpu) ewplVar.instance;
        ewppVar.getClass();
        ewpuVar5.a();
        ewpuVar5.d.add(ewppVar);
        ewqc ewqcVar = (ewqc) ewqdVar.toBuilder();
        ewpu ewpuVar6 = (ewpu) ewplVar.build();
        ewqcVar.copyOnWrite();
        ewqd ewqdVar2 = (ewqd) ewqcVar.instance;
        ewpuVar6.getClass();
        ewqdVar2.e = ewpuVar6;
        ewqdVar2.b |= 4;
        return (ewqd) ewqcVar.build();
    }

    public static boolean i() {
        if (dfpi.H()) {
            return (dfpi.K() || dfpi.D()) ? false : true;
        }
        return true;
    }

    private final boolean t(String str) {
        return ((dgsz) this.m.b()).J(str);
    }

    public final ListenableFuture a() {
        ecjh ecjhVar = this.e;
        return ecjhVar != null ? ecjhVar.a() : eork.h(new NullPointerException());
    }

    public final ewqd c(ewqd ewqdVar) {
        if ((ewqdVar.b & 4) == 0) {
            return ewqdVar;
        }
        ewpu ewpuVar = ewqdVar.e;
        if (ewpuVar == null) {
            ewpuVar = ewpu.a;
        }
        ewps ewpsVarB = ewps.b(ewpuVar.c);
        if (ewpsVarB == null) {
            ewpsVarB = ewps.UNKNOWN_PROVISIONING_STAGE;
        }
        dhja.c("finishProvisioningStageInternal, append %s", ewpsVarB);
        if (dfpi.L()) {
            deyu deyuVar = this.k;
            Context context = this.c;
            ewpj ewpjVar = (ewpj) ewpk.a.createBuilder();
            ewpu ewpuVar2 = ewqdVar.e;
            if (ewpuVar2 == null) {
                ewpuVar2 = ewpu.a;
            }
            ewpjVar.copyOnWrite();
            ewpk ewpkVar = (ewpk) ewpjVar.instance;
            ewpuVar2.getClass();
            ewpkVar.c = ewpuVar2;
            ewpkVar.b |= 1;
            ewpg ewpgVar = ewqdVar.f;
            if (ewpgVar == null) {
                ewpgVar = ewpg.a;
            }
            ewox ewoxVar = (ewox) ewpgVar.toBuilder();
            ewoxVar.copyOnWrite();
            ewpg ewpgVar2 = (ewpg) ewoxVar.instance;
            ewpgVar2.b &= -65537;
            ewpgVar2.t = 0L;
            ewoxVar.copyOnWrite();
            ewpg ewpgVar3 = (ewpg) ewoxVar.instance;
            ewpgVar3.b &= -32769;
            ewpgVar3.s = 0L;
            ewpg ewpgVar4 = (ewpg) ewoxVar.build();
            ewpjVar.copyOnWrite();
            ewpk ewpkVar2 = (ewpk) ewpjVar.instance;
            ewpgVar4.getClass();
            ewpkVar2.d = ewpgVar4;
            ewpkVar2.b |= 2;
            deyuVar.e(context, (ewpk) ewpjVar.build());
        }
        ewqc ewqcVar = (ewqc) ewqdVar.toBuilder();
        Integer num = (Integer) dfpi.t().a.G.a();
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            ewow ewowVar = ((ewqd) ewqcVar.instance).d;
            if (ewowVar == null) {
                ewowVar = ewow.a;
            }
            ewou ewouVar = (ewou) ewowVar.toBuilder();
            if (iIntValue > 0) {
                ewow ewowVar2 = ((ewqd) ewqcVar.instance).d;
                if (ewowVar2 == null) {
                    ewowVar2 = ewow.a;
                }
                if (ewowVar2.c.size() >= iIntValue) {
                    ewouVar.copyOnWrite();
                    ewow ewowVar3 = (ewow) ewouVar.instance;
                    ewowVar3.a();
                    ewowVar3.c.remove(0);
                    ewow ewowVar4 = ((ewqd) ewqcVar.instance).d;
                    if (ewowVar4 == null) {
                        ewowVar4 = ewow.a;
                    }
                    dhja.q("ProvisioningStage exceeds max number %d, current stage count %d ", num, Integer.valueOf(ewowVar4.c.size()));
                }
            }
            ewouVar.a(ewpuVar);
            ewow ewowVar5 = (ewow) ewouVar.build();
            ewqcVar.copyOnWrite();
            ewqd ewqdVar2 = (ewqd) ewqcVar.instance;
            ewowVar5.getClass();
            ewqdVar2.d = ewowVar5;
            ewqdVar2.b |= 2;
        }
        ewqcVar.copyOnWrite();
        ewqd ewqdVar3 = (ewqd) ewqcVar.instance;
        ewqdVar3.e = null;
        ewqdVar3.b &= -5;
        return (ewqd) ewqcVar.build();
    }

    public final ewqd d(ewqd ewqdVar, String str, Optional optional) {
        boolean zT = t((String) optional.orElse(this.f));
        ewox ewoxVar = (ewox) ewpg.a.createBuilder();
        ewpd ewpdVar = zT ? ewpd.TRUE : ewpd.FALSE;
        ewoxVar.copyOnWrite();
        ewpg ewpgVar = (ewpg) ewoxVar.instance;
        ewpgVar.c = ewpdVar.d;
        ewpgVar.b |= 1;
        ewoxVar.copyOnWrite();
        ewpg ewpgVar2 = (ewpg) ewoxVar.instance;
        ewpgVar2.h = 3;
        ewpgVar2.b |= 32;
        String str2 = deyn.c;
        ewoxVar.copyOnWrite();
        ewpg ewpgVar3 = (ewpg) ewoxVar.instance;
        str2.getClass();
        ewpgVar3.b |= 2;
        ewpgVar3.d = str2;
        optional.isPresent();
        enpl enplVarB = ((dexw) this.d.b()).b(new dggp((String) optional.get()));
        ewoxVar.copyOnWrite();
        ewpg ewpgVar4 = (ewpg) ewoxVar.instance;
        enplVarB.getClass();
        ewpgVar4.z = enplVarB;
        ewpgVar4.b |= 4194304;
        if (str != null) {
            ewoxVar.copyOnWrite();
            ewpg ewpgVar5 = (ewpg) ewoxVar.instance;
            ewpgVar5.b |= 1048576;
            ewpgVar5.x = str;
        }
        ewqc ewqcVar = (ewqc) ewqdVar.toBuilder();
        ewpg ewpgVar6 = (ewpg) ewoxVar.build();
        ewqcVar.copyOnWrite();
        ewqd ewqdVar2 = (ewqd) ewqcVar.instance;
        ewpgVar6.getClass();
        ewqdVar2.f = ewpgVar6;
        ewqdVar2.b |= 8;
        return (ewqd) ewqcVar.build();
    }

    public final String e(Optional optional) {
        return (String) optional.orElse(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(Context context, ewrp ewrpVar, deyo deyoVar, String str, dggn dggnVar) {
        ListenableFuture listenableFutureF;
        try {
            ecjh ecjhVar = (ecjh) this.g.get(dggo.a(dggnVar).a);
            if (ecjhVar == null) {
                listenableFutureF = i;
            } else {
                ListenableFuture listenableFutureA = ecjhVar.a();
                ejvr ejvrVar = new ejvr() { // from class: dgsc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ewpg ewpgVar = ((ewqd) obj).f;
                        return ewpgVar == null ? ewpg.a : ewpgVar;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                listenableFutureF = eooq.f(eoqt.t(eooq.f(listenableFutureA, ejvrVar, eoqgVar)), new ejvr() { // from class: dgsd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ewpd ewpdVarB = ewpd.b(((ewpg) obj).g);
                        return ewpdVarB == null ? ewpd.NOT_SET : ewpdVarB;
                    }
                }, eoqgVar);
            }
            deyoVar.g(context, ewrpVar, ((ewpd) listenableFutureF.get(1L, TimeUnit.SECONDS)) != ewpd.FALSE, str, dggnVar);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            dhja.q("Timeout when reading RcsProvisioningProtoDataStorage", new Object[0]);
        }
    }

    public final void g(String str) {
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(this.c);
        ecfaVar.f("provisioningmetrics");
        ecfaVar.g(String.format("%s.pb", str));
        Uri uriA = ecfaVar.a();
        ecji ecjiVarH = ecjj.h();
        ecjiVarH.f(uriA);
        ecjiVarH.e(ewqd.a);
        this.e = this.j.a(ecjiVarH.a());
        dhja.k("Created new RcsProvisioningProtoDataStorage for sim %s", dhiz.SIM_ID.c(str));
        this.f = str;
        this.g.put(str, this.e);
    }

    public final boolean h(String str) {
        return ((dgsz) this.m.b()).I(str);
    }

    public final boolean j(String str) {
        if (dfpi.H()) {
            return !(dfpi.K() || dfpi.L() || dfpi.D()) || h(str);
        }
        return true;
    }

    public final void k(ewps ewpsVar, final String str, final Boolean bool, final String str2) {
        dhja.c("enterProvisioningStage, provisioningSessionId=%s, provisioningStage=%s, simId=%s", str, ewpsVar.name(), dhiz.SIM_ID.c(str2));
        if (j(str2)) {
            return;
        }
        m(ewpsVar, str2);
        o(2);
        r(new dgsx() { // from class: dgru
            /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
            @Override // defpackage.dgsx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.ewox r8) {
                /*
                    r7 = this;
                    dgsy r0 = r7.a
                    android.content.Context r1 = r0.c
                    java.lang.String r2 = "connectivity"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                    android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
                    boolean r2 = j$.util.Objects.isNull(r1)
                    r3 = 1
                    if (r2 == 0) goto L19
                L17:
                    r1 = r3
                    goto L28
                L19:
                    int r2 = r1.getType()
                    if (r2 != r3) goto L21
                    r1 = 2
                    goto L28
                L21:
                    int r1 = r1.getType()
                    if (r1 != 0) goto L17
                    r1 = 3
                L28:
                    java.lang.Boolean r2 = r3
                    java.lang.String r4 = r2
                    r8.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r5 = r8.instance
                    ewpg r5 = (defpackage.ewpg) r5
                    ewpg r6 = defpackage.ewpg.a
                    int r1 = r1 + (-1)
                    r5.e = r1
                    int r1 = r5.b
                    r1 = r1 | 4
                    r5.b = r1
                    r8.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r1 = r8.instance
                    ewpg r1 = (defpackage.ewpg) r1
                    int r5 = r1.b
                    r6 = 1048576(0x100000, float:1.469368E-39)
                    r5 = r5 | r6
                    r1.b = r5
                    java.lang.String r4 = defpackage.ejwk.b(r4)
                    r1.x = r4
                    boolean r1 = r2.booleanValue()
                    if (r1 == 0) goto L5c
                    ewpd r1 = defpackage.ewpd.TRUE
                    goto L5e
                L5c:
                    ewpd r1 = defpackage.ewpd.FALSE
                L5e:
                    java.lang.String r2 = r4
                    r8.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r4 = r8.instance
                    ewpg r4 = (defpackage.ewpg) r4
                    int r1 = r1.d
                    r4.c = r1
                    int r1 = r4.b
                    r1 = r1 | r3
                    r4.b = r1
                    fcsu r0 = r0.d
                    java.lang.Object r0 = r0.b()
                    dexw r0 = (defpackage.dexw) r0
                    dggp r1 = new dggp
                    r1.<init>(r2)
                    enpl r0 = r0.b(r1)
                    r8.copyOnWrite()
                    MessageType extends evsn<MessageType, BuilderType> r8 = r8.instance
                    ewpg r8 = (defpackage.ewpg) r8
                    r0.getClass()
                    r8.z = r0
                    int r0 = r8.b
                    r1 = 4194304(0x400000, float:5.877472E-39)
                    r0 = r0 | r1
                    r8.b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dgru.a(ewox):void");
            }
        }, str2);
    }

    public final void l(final dgid dgidVar, Optional optional) {
        if (j(e(optional))) {
            return;
        }
        r(new dgsx() { // from class: dgrz
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                dgid dgidVar2 = dgidVar;
                ewpgVar.j = dgidVar2.a.N;
                ewpgVar.b |= 128;
                ewpd ewpdVar = dgidVar2.e() ? ewpd.TRUE : ewpd.FALSE;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar3 = (ewpg) ewoxVar.instance;
                ewpgVar3.k = ewpdVar.d;
                ewpgVar3.b |= 256;
            }
        }, e(optional));
    }

    public final void m(final ewps ewpsVar, String str) {
        dhja.c("startProvisioningStage, provisioningStageType=%s", ewpsVar);
        if (j(str)) {
            return;
        }
        s(new ejvr() { // from class: dgsh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ewqd ewqdVarC = (ewqd) obj;
                if ((ewqdVarC.b & 4) != 0) {
                    ewqdVarC = this.a.c(ewqdVarC);
                }
                ewps ewpsVar2 = ewpsVar;
                ewqc ewqcVar = (ewqc) ewqdVarC.toBuilder();
                ewpl ewplVar = (ewpl) ewpu.a.createBuilder();
                ewplVar.copyOnWrite();
                ewpu ewpuVar = (ewpu) ewplVar.instance;
                ewpuVar.c = ewpsVar2.A;
                ewpuVar.b |= 1;
                ewpu ewpuVar2 = (ewpu) ewplVar.build();
                ewqcVar.copyOnWrite();
                ewqd ewqdVar = (ewqd) ewqcVar.instance;
                ewpuVar2.getClass();
                ewqdVar.e = ewpuVar2;
                ewqdVar.b |= 4;
                return (ewqd) ewqcVar.build();
            }
        }, Optional.of(str));
    }

    public final ewqd n(ewqd ewqdVar, int i2, String str) {
        if ((ewqdVar.b & 2) == 0) {
            return ewqdVar;
        }
        ewqd ewqdVarC = c(ewqdVar);
        ewow ewowVar = ewqdVarC.d;
        if (ewowVar == null) {
            ewowVar = ewow.a;
        }
        ewou ewouVar = (ewou) ewowVar.toBuilder();
        ewpg ewpgVar = ewqdVarC.f;
        if (ewpgVar == null) {
            ewpgVar = ewpg.a;
        }
        ewpg ewpgVar2 = (ewpg) ((ewox) ewpgVar.toBuilder()).build();
        ewouVar.copyOnWrite();
        ewow ewowVar2 = (ewow) ewouVar.instance;
        ewpgVar2.getClass();
        ewowVar2.d = ewpgVar2;
        ewowVar2.b |= 1;
        ewouVar.copyOnWrite();
        ewow ewowVar3 = (ewow) ewouVar.instance;
        ewowVar3.g = i2 - 1;
        ewowVar3.b |= 8;
        evvp evvpVarC = evxc.c(dhkl.a().longValue());
        ewouVar.copyOnWrite();
        ewow ewowVar4 = (ewow) ewouVar.instance;
        evvpVarC.getClass();
        ewowVar4.f = evvpVarC;
        ewowVar4.b |= 4;
        ewow ewowVar5 = (ewow) ewouVar.build();
        if (dfpi.K()) {
            this.k.d(this.c, ewowVar5);
        }
        ewqc ewqcVar = (ewqc) ewqdVarC.toBuilder();
        if (dfpi.D()) {
            ewpg ewpgVar3 = ewqdVarC.f;
            if (ewpgVar3 == null) {
                ewpgVar3 = ewpg.a;
            }
            String strE = e(Optional.of(str));
            if (dfpi.Q() && ewpgVar3.t < 8 && !t(strE)) {
                ewqcVar.copyOnWrite();
                ewqd ewqdVar2 = (ewqd) ewqcVar.instance;
                ewowVar5.getClass();
                ewqdVar2.c = ewowVar5;
                ewqdVar2.b |= 1;
            }
            ewqcVar.copyOnWrite();
            ewqd ewqdVar3 = (ewqd) ewqcVar.instance;
            ewowVar5.getClass();
            ewqdVar3.d = ewowVar5;
            ewqdVar3.b |= 2;
        } else {
            ewqcVar.copyOnWrite();
            ewqd ewqdVar4 = (ewqd) ewqcVar.instance;
            ewqdVar4.d = null;
            ewqdVar4.b &= -3;
            ewqcVar.copyOnWrite();
            ewqd ewqdVar5 = (ewqd) ewqcVar.instance;
            ewqdVar5.f = null;
            ewqdVar5.b &= -9;
        }
        return (ewqd) ewqcVar.build();
    }

    public final void o(int i2) {
        q(i2, -1, Optional.empty());
    }

    public final void p(int i2, String str) {
        q(i2, -1, Optional.of(str));
    }

    public final void q(int i2, int i3, Optional optional) {
        if (j(this.f)) {
            return;
        }
        long jLongValue = dhkl.a().longValue();
        final ewpm ewpmVar = (ewpm) ewpp.a.createBuilder();
        ewpmVar.copyOnWrite();
        ewpp ewppVar = (ewpp) ewpmVar.instance;
        ewppVar.c = i2 - 1;
        ewppVar.b |= 1;
        ewpmVar.copyOnWrite();
        ewpp ewppVar2 = (ewpp) ewpmVar.instance;
        ewppVar2.b |= 2;
        ewppVar2.d = jLongValue;
        if (i3 >= 0) {
            ewpmVar.copyOnWrite();
            ewpp ewppVar3 = (ewpp) ewpmVar.instance;
            ewppVar3.b |= 4;
            ewppVar3.e = i3;
        }
        s(new ejvr() { // from class: dgse
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgp ekgpVar = dgsy.a;
                return dgsy.b((ewqd) obj, (ewpp) ewpmVar.build());
            }
        }, optional);
    }

    public final void r(final dgsx dgsxVar, String str) {
        s(new ejvr() { // from class: dgsq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ewqd ewqdVar = (ewqd) obj;
                ekgp ekgpVar = dgsy.a;
                ewpg ewpgVar = ewqdVar.f;
                if (ewpgVar == null) {
                    ewpgVar = ewpg.a;
                }
                dgsx dgsxVar2 = dgsxVar;
                ewox ewoxVar = (ewox) ewpgVar.toBuilder();
                dgsxVar2.a(ewoxVar);
                ewqc ewqcVar = (ewqc) ewqdVar.toBuilder();
                ewpg ewpgVar2 = (ewpg) ewoxVar.build();
                ewqcVar.copyOnWrite();
                ewqd ewqdVar2 = (ewqd) ewqcVar.instance;
                ewpgVar2.getClass();
                ewqdVar2.f = ewpgVar2;
                ewqdVar2.b |= 8;
                return (ewqd) ewqcVar.build();
            }
        }, Optional.of(str));
    }

    public final void s(final ejvr ejvrVar, Optional optional) {
        if (((Boolean) optional.map(new Function() { // from class: dgsb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(!this.a.g.containsKey((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(Boolean.valueOf(this.e == null))).booleanValue()) {
            if (!optional.isPresent()) {
                throw new IllegalStateException("updateStorage called before ProvisioningEngineMetricsStorage fully initialized");
            }
            g((String) optional.get());
        }
        ecjh ecjhVar = optional.isPresent() ? (ecjh) this.g.get(optional.get()) : this.e;
        if (ecjhVar == null) {
            return;
        }
        eork.r(ecjhVar.b(new ejvr() { // from class: dgsr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ewqd ewqdVar = (ewqd) obj;
                if (ewqdVar != null) {
                    return (ewqd) ejvrVar.apply(ewqdVar);
                }
                dhja.g("Failed to read RcsProvisioningProtoDataStorage for sim %s", dhiz.SIM_ID.c(this.a.f));
                return null;
            }
        }, this.l), new dgsw(), eoqg.a);
    }
}
