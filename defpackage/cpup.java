package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpup {
    public static final eksp a = eksp.c("BugleCmsPrimaryDevice");
    public final cgbn b;
    public final cpmi c;
    public final efwo d;
    public final aurx e;
    public final eosc f;

    public cpup(cgbn cgbnVar, cpmi cpmiVar, aurx aurxVar, efwo efwoVar, eosc eoscVar) {
        this.b = cgbnVar;
        this.c = cpmiVar;
        this.e = aurxVar;
        this.d = efwoVar;
        this.f = eoscVar;
    }

    public final eiju a(final int i) {
        return this.e.k().i(new eooz() { // from class: cpuo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eiju eijuVarD;
                final cpup cpupVar = this.a;
                final aumq aumqVar = (aumq) obj;
                if (cpyl.a()) {
                    aurw aurwVar = cpupVar.e.m;
                    if (!aurw.g(aumqVar)) {
                        ((eksl) ((eksl) cpup.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableCmsFeature", 64, "CmsPrimaryDeviceEnforcement.java")).q("CMS feature is already off");
                        return eijx.e(true);
                    }
                    ((eksl) ((eksl) cpup.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableBackupAndRestore", 113, "CmsPrimaryDeviceEnforcement.java")).q("Turning off CMS feature to enforce primary device");
                    eijuVarD = cpupVar.c.c(cpupVar.d, 2);
                } else {
                    if (!aumqVar.e) {
                        ((eksl) ((eksl) cpup.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableCmsFeature", 74, "CmsPrimaryDeviceEnforcement.java")).q("MultiDevice is already off");
                        return eijx.e(true);
                    }
                    ((eksl) ((eksl) cpup.a.h()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceEnforcement", "disableMultiDevice", 105, "CmsPrimaryDeviceEnforcement.java")).q("Turning off MultiDevice to enforce primary device");
                    eijuVarD = cpupVar.c.d(cpupVar.d, 2, 2);
                }
                final int i2 = i;
                return eijuVarD.h(new ejvr() { // from class: cpun
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cpup cpupVar2 = cpupVar;
                        cpyb cpybVar = cpyb.MULTI_DEVICE;
                        if (cpyl.a()) {
                            auml aumlVarB = auml.b(aumqVar.l);
                            if (aumlVarB == null) {
                                aumlVarB = auml.UNSPECIFIED_STATUS;
                            }
                            aurw aurwVar2 = cpupVar2.e.m;
                            if (!aurw.f(aumlVarB)) {
                                cpybVar = cpyb.BACKUP_AND_RESTORE;
                            }
                        }
                        cpupVar2.b.K(cpybVar, i2);
                        return true;
                    }
                }, cpupVar.f);
            }
        }, this.f);
    }
}
