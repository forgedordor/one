package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.ims.ImsException;
import android.telephony.ims.ProvisioningManager;
import android.telephony.ims.RcsClientConfiguration;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chzl implements chyy {
    static final ejxr a = cdag.w(202332654, "enable_vendor_ims_master_switch_broadcast");
    public static final cqce b = cqce.g("BugleRcsProvisioning", "SingleRegistrationVendorImsAvailabilityNotifier");
    static final cczi c = cdag.e(cdag.b, "single_registration_vendor_ims_availability_notifier_debounce_millis", 50);
    private final Context d;
    private final chzk e;
    private final ains f;
    private final dgfv g;

    public chzl(Context context, chzk chzkVar, ains ainsVar, dgfv dgfvVar) {
        this.d = context;
        this.e = chzkVar;
        this.f = ainsVar;
        this.g = dgfvVar;
    }

    private static boolean b(chyz chyzVar) {
        return chyx.USER_SETTING_ENABLED.equals(chyzVar.a());
    }

    public final void a(chyz chyzVar) {
        int iIntValue = ((Integer) chyzVar.d().get()).intValue();
        boolean zB = b(chyzVar);
        if (!craf.f) {
            cqbd cqbdVarA = b.a();
            cqbdVarA.I("[SR]: broadcasting RCS master switch change event to VendorIMS");
            cqbdVarA.B("isEnabled", zB);
            cqbdVarA.m(iIntValue);
            cqbdVarA.r();
            Intent intent = new Intent(RcsIntents.ACTION_TOGGLE_RCS_MASTER_SWITCH);
            intent.putExtra(RcsIntents.EXTRA_SUBSCRIPTION_ID, iIntValue);
            intent.putExtra(RcsIntents.EXTRA_RCS_MASTER_SWITCH_STATE, zB ? 1 : 0);
            this.d.sendBroadcast(intent, "android.permission.READ_PRIVILEGED_PHONE_STATE");
            this.f.c("Bugle.RcsEngine.SingleRegistration.VendorImsMasterSwitchBroadcast.Count");
            return;
        }
        if (zB) {
            return;
        }
        try {
            ProvisioningManager provisioningManagerA = this.g.a(iIntValue);
            RcsClientConfiguration rcsClientConfiguration = new RcsClientConfiguration(dfog.t(), dfog.s(), dfog.q(), dfog.r(), false);
            cqbd cqbdVarA2 = b.a();
            cqbdVarA2.I("[SR]: disabling RCS by setting RCS configuration using ProvisioningManager");
            cqbdVarA2.m(iIntValue);
            cqbdVarA2.r();
            provisioningManagerA.setRcsClientConfiguration(rcsClientConfiguration);
        } catch (ImsException e) {
            b.o("[SR]: ImsException caught while setting RCS client configuration", e);
        }
    }

    @Override // defpackage.chyy
    public final void c(final chyz chyzVar) {
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            chyzVar.d().isPresent();
            if (chyx.USER_SETTING_DISABLED.equals(chyzVar.a()) || b(chyzVar)) {
                final chzk chzkVar = this.e;
                final Runnable runnable = new Runnable() { // from class: chzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(chyzVar);
                    }
                };
                final chxz chxzVar = new chxz(chyzVar, chzkVar.c.f().toEpochMilli(), UUID.randomUUID());
                eijx.f(new Runnable() { // from class: chzh
                    @Override // java.lang.Runnable
                    public final void run() {
                        AtomicReference atomicReference = chzkVar.b;
                        chzj chzjVar = (chzj) atomicReference.get();
                        chzj chzjVar2 = chxzVar;
                        if (chzjVar != null) {
                            chxz chxzVar2 = (chxz) chzjVar2;
                            long j = chxzVar2.b;
                            ejwl.b(chzjVar.a() <= j, "prevExecution should not have a later trigger time than nextExecution");
                            long jA = j - chzjVar.a();
                            long jIntValue = ((Integer) chzl.c.e()).intValue();
                            if (chzjVar.b().equals(chxzVar2.a) && jA <= jIntValue) {
                                cqbd cqbdVarE = chzl.b.e();
                                cqbdVarE.I("[SR]: skipping processing duplicate RcsAvailabilityUpdate");
                                cqbdVarE.A("execId", chxzVar2.c);
                                cqbdVarE.r();
                                return;
                            }
                        }
                        Runnable runnable2 = runnable;
                        cqbd cqbdVarC = chzl.b.c();
                        cqbdVarC.I("[SR]: processing RcsAvailabilityUpdate for VendorIms broadcast");
                        cqbdVarC.A("execId", ((chxz) chzjVar2).c);
                        cqbdVarC.r();
                        runnable2.run();
                        atomicReference.set(chzjVar2);
                    }
                }, chzkVar.a).k(auvh.c(new Consumer() { // from class: chzi
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cqbd cqbdVarA = chzl.b.a();
                        cqbdVarA.I("[SR]: completed future for RcsAvailabilityUpdate");
                        cqbdVarA.A("execId", ((chxz) chxzVar).c);
                        cqbdVarA.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), eoqg.a);
            }
        }
    }
}
