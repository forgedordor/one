package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzkg {
    public static final eksp a = eksp.c("BugleCmsBatchBackup");
    static final cczi b = cdag.f(cdag.b, "retry_delay_millis_cms_batch_backup_work_handler", 10000);
    public final bzip c;
    public final eosc d;
    public final bzmy e;
    public final bzho f;
    public final aurx g;
    public final cden h;
    public final caqw i;
    public final apqd j;
    public final cogw k;
    public final eosc l;
    public final apqc m;
    public final bzim n;

    public bzkg(bzim bzimVar, bzip bzipVar, bzmy bzmyVar, bzho bzhoVar, aurx aurxVar, cden cdenVar, apqc apqcVar, caqw caqwVar, apqd apqdVar, cogw cogwVar, eosc eoscVar, eosc eoscVar2) {
        this.n = bzimVar;
        this.c = bzipVar;
        this.e = bzmyVar;
        this.f = bzhoVar;
        this.g = aurxVar;
        this.k = cogwVar;
        this.h = cdenVar;
        this.m = apqcVar;
        this.d = eoscVar;
        this.i = caqwVar;
        this.j = apqdVar;
        this.l = eoscVar2;
    }

    public static String b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public final eiju a(final eiju eijuVar, final carg cargVar, final ekgb ekgbVar) {
        final eiju eijuVarK = this.g.k();
        return eijx.m(eijuVar, eijuVarK).b(new eooy() { // from class: bzkc
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final cbcw cbcwVar = (cbcw) eork.q(eijuVar);
                final aumq aumqVar = (aumq) eork.q(eijuVarK);
                Exception excD = cbcwVar.d();
                final bzkg bzkgVar = this.a;
                carc carcVar = (carc) bzkgVar.i;
                eiju eijuVarC = auvw.c(carcVar.e, fcyi.a, fdjz.a, new carb(carcVar, cargVar, excD, null));
                ekgb ekgbVarC = cbcwVar.c();
                if (ekgbVarC == null || ekgbVarC.isEmpty()) {
                    final ekgb ekgbVar2 = ekgbVar;
                    eijuVarC = eijuVarC.h(new ejvr() { // from class: bzjs
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            int i = ekgb.d;
                            ekgb ekgbVar3 = ekoe.a;
                            ekgb ekgbVar4 = ekgbVar2;
                            bzkg bzkgVar2 = bzkgVar;
                            if (bzkgVar2.f.a(ekgbVar3, ekgbVar4)) {
                                aumq aumqVar2 = aumqVar;
                                aumf aumfVar = aumqVar2.t;
                                if (aumfVar == null) {
                                    aumfVar = aumf.a;
                                }
                                String str = aumqVar2.j;
                                cogw cogwVar = bzkgVar2.k;
                                Duration durationOfSeconds = Duration.ofSeconds(cogwVar.f().minusSeconds(aumfVar.f).getEpochSecond());
                                caqw caqwVar = bzkgVar2.i;
                                String str2 = "\n\nbackupStart: " + bzkg.b(aumfVar.f * 1000) + " in UTC\nbackupEnd:" + bzkg.b(cogwVar.f().toEpochMilli()) + " in UTC\nbackupDuration: " + String.valueOf(durationOfSeconds) + "\nsessionId: " + str;
                                carr carrVar = ((carc) caqwVar).b;
                                cqby cqbyVar = carrVar.b;
                                if (cqbyVar != null) {
                                    cqbyVar.b(4, "BugleCmsBackupTiming", str2);
                                }
                                cqby cqbyVar2 = carrVar.b;
                                if (cqbyVar2 != null) {
                                    cqbyVar2.close();
                                }
                                carrVar.b = null;
                            }
                            return fctx.a;
                        }
                    }, bzkgVar.l);
                }
                return eijuVarC.h(new ejvr() { // from class: bzjx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eksp ekspVar = bzkg.a;
                        return cbcwVar;
                    }
                }, bzkgVar.d);
            }
        }, this.d);
    }
}
