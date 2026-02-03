package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzoh implements bznn {
    public static final cqce a = cqce.g("BugleCms", "SyncCmsKeyStep");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/keysync/SyncCmsKeyStep");
    static final cczi c = cdag.e(cdag.b, "cms_sync_cms_key_step_max_retry", 22);
    public final bypt d;
    public final eosc e;
    public final eosc f;
    private final aurx g;
    private final cpmc h;

    public bzoh(Map map, bypq bypqVar, aurx aurxVar, cpmc cpmcVar, eosc eoscVar, eosc eoscVar2) {
        this.g = aurxVar;
        this.h = cpmcVar;
        this.e = eoscVar;
        this.f = eoscVar2;
        this.d = (bypt) Map.EL.getOrDefault(map, 7, bypqVar);
    }

    public final eiju a(final bnar bnarVar, int i, final int i2) {
        eiju eijuVarA;
        boolean zIsEmpty = TextUtils.isEmpty(bnarVar.p());
        Boolean boolValueOf = Boolean.valueOf(zIsEmpty);
        if (cpyl.a()) {
            cqce cqceVar = a;
            cqceVar.m("isCmsBackupAndRestoreEnabled flag on");
            if (i != 2) {
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.y("keyType", i);
                cqbdVarC.A("cmsIdEmpty", boolValueOf);
                Objects.toString(boolValueOf);
                cqbdVarC.I("Should process key: ".concat(boolValueOf.toString()));
                cqbdVarC.r();
                eijuVarA = eijx.e(boolValueOf);
            } else {
                boolValueOf.getClass();
                if (zIsEmpty) {
                    cqceVar.p("Should process key: true, for BACKUP_KEY with empty CMS ID.");
                    eijuVarA = eijx.e(true);
                } else {
                    final String strP = bnarVar.p();
                    strP.getClass();
                    aurx aurxVar = this.g;
                    cpmc cpmcVar = this.h;
                    final eiju eijuVarH = aurxVar.h();
                    final eiju eijuVarQ = cpmcVar.q(strP);
                    eijuVarA = eijx.m(eijuVarH, eijuVarQ).a(new Callable() { // from class: bznx
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cqce cqceVar2 = bzoh.a;
                            aumj aumjVar = (aumj) eork.q(eijuVarH);
                            eqnd eqndVar = (eqnd) eork.q(eijuVarQ);
                            aumj aumjVar2 = aumj.ENCRYPTION_STATUS_ENCRYPTED;
                            boolean z = true;
                            if ((!aumjVar.equals(aumjVar2) || !eqndVar.h.contains("backup_key")) && (aumjVar.equals(aumjVar2) || !eqndVar.h.contains("encrypted_backup_key"))) {
                                z = false;
                            }
                            String str = strP;
                            cqbd cqbdVarC2 = bzoh.a.c();
                            cqbdVarC2.A("CmsId", str);
                            cqbdVarC2.A("localEncryptionStatus", aumjVar.name());
                            cqbdVarC2.A("cmsKeyObjectLabels", eqndVar.h);
                            cqbdVarC2.B("shouldProcessKey", z);
                            cqbdVarC2.I("Checking if the BACKUP_KEY with cms ID should be updated.");
                            cqbdVarC2.r();
                            return Boolean.valueOf(z);
                        }
                    }, this.f);
                }
            }
        } else {
            cqbd cqbdVarC2 = a.c();
            cqbdVarC2.y("keyType", i);
            cqbdVarC2.A("cmsIdEmpty", boolValueOf);
            Objects.toString(boolValueOf);
            cqbdVarC2.I("Should process key: ".concat(boolValueOf.toString()));
            cqbdVarC2.r();
            eijuVarA = eijx.e(boolValueOf);
        }
        return eijuVarA.i(new eooz() { // from class: bznz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(true);
                }
                int i3 = i2;
                bnar bnarVar2 = bnarVar;
                bzoh bzohVar = this.a;
                return bzohVar.d.c("workItemId", String.valueOf(bnarVar2.k()), i3);
            }
        }, this.e);
    }
}
