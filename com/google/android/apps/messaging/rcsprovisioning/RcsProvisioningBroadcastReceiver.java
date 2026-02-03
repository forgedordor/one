package com.google.android.apps.messaging.rcsprovisioning;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.ahfb;
import defpackage.apvb;
import defpackage.aqax;
import defpackage.auvh;
import defpackage.cazj;
import defpackage.cbcu;
import defpackage.chtr;
import defpackage.ckhg;
import defpackage.ckky;
import defpackage.ckkz;
import defpackage.ckla;
import defpackage.cozn;
import defpackage.cqbd;
import defpackage.cqbe;
import defpackage.cqce;
import defpackage.craf;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.enxe;
import defpackage.fcsu;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsProvisioningBroadcastReceiver extends ahfb {
    private static final cqce j = cqce.g("Bugle", "RcsProvisioningBroadcastReceiver");
    private static final ekrg k = ekrg.c("com/google/android/apps/messaging/rcsprovisioning/RcsProvisioningBroadcastReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;
    public fcsu i;

    private static String m(Intent intent) {
        return o(intent, RcsIntents.EXTRA_PREVIOUS_SIM_ID);
    }

    private static String n(Intent intent) {
        return o(intent, RcsIntents.EXTRA_SIM_ID);
    }

    private static String o(Intent intent, String str) {
        Bundle extras = intent.getExtras();
        return extras != null ? Objects.toString(extras.getString(str), "") : "";
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 17;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("RcsProvisioningBroadcastReceiver Receive broadcast", "com/google/android/apps/messaging/rcsprovisioning/RcsProvisioningBroadcastReceiver", "beginRootTrace", 79);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.Provisioning.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.Provisioning.Latency";
    }

    @Override // defpackage.clca
    protected final void g(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if (RcsIntents.ACTION_RCS_CONFIG_REFRESH.equals(action)) {
            ((ckhg) this.b.b()).e(n(intent), Duration.ZERO, enxe.CSLIB_PHENOTYPE_UPDATE);
            return;
        }
        if (((aqax) this.g.b()).a() && action.equals("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING")) {
            if (craf.h) {
                ((chtr) this.d.b()).h(intent.getIntExtra("sub_id", -1));
                return;
            }
            ekrw ekrwVarH = k.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/rcsprovisioning/RcsProvisioningBroadcastReceiver", "handleIntentProcessing", 144, "RcsProvisioningBroadcastReceiver.java")).q("RCS Provisioning cannot be scheduled for Fi sim with this intent because it is not supported on SDK versions less than U");
            return;
        }
        if (RcsIntents.ACTION_RCS_CANCEL_PROVISIONING_WORK.equals(action)) {
            ((ckhg) this.b.b()).a(enxe.CSLIB_PHENOTYPE_UPDATE).k(auvh.b(), (Executor) this.c.b());
            return;
        }
        if (RcsIntents.ACTION_RCS_SIM_SWAP.equals(action)) {
            ((chtr) this.d.b()).m(m(intent), n(intent));
            return;
        }
        if (action.equals(RcsIntents.ACTION_DEFAULT_VOICE_SIM_REMOVED)) {
            ((chtr) this.d.b()).l(m(intent));
            return;
        }
        if (RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED.equals(action)) {
            if (!((apvb) this.h.b()).a() || ((Integer) cozn.a.e()).intValue() == 1) {
                ((chtr) this.d.b()).k(enxe.SIP_403_RESPONSE);
                return;
            }
            return;
        }
        if (RcsIntents.ACTION_RCS_SYSTEM_BINDING.equals(action)) {
            Iterable$EL.forEach((Set) this.f.b(), new Consumer() { // from class: ahfc
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((devu) obj).u();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (!action.equals(RcsIntents.ACTION_JIBE_DEPROVISION)) {
            if (action.equals(RcsIntents.ACTION_RCS_SIM_REMOVED)) {
                ((chtr) this.d.b()).l(m(intent));
                return;
            }
            return;
        }
        cqbd cqbdVarC = j.c();
        cqbdVarC.I("[SR]: Enqueueing UnregisterGoogleRcs Work Handler.");
        cqbdVarC.r();
        ckla cklaVar = (ckla) this.e.b();
        ckky ckkyVar = (ckky) ckkz.a.createBuilder();
        int intExtra = intent.getIntExtra(RcsIntents.EXTRA_SUB_ID, -1);
        ckkyVar.copyOnWrite();
        ckkz ckkzVar = (ckkz) ckkyVar.instance;
        ckkzVar.b = 1 | ckkzVar.b;
        ckkzVar.c = intExtra;
        String strN = n(intent);
        ckkyVar.copyOnWrite();
        ckkz ckkzVar2 = (ckkz) ckkyVar.instance;
        strN.getClass();
        ckkzVar2.b |= 2;
        ckkzVar2.d = strN;
        ((cazj) cklaVar.a.b()).a(cbcu.f("unregister_google_rcs_call", (ckkz) ckkyVar.build()));
    }

    @Override // defpackage.clca
    protected final boolean h(Context context, Intent intent) {
        String sentFromPackage;
        if (((aqax) this.g.b()).a()) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return false;
            }
            if (action.equals("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING") && craf.h) {
                if (!cqbe.h() && ((sentFromPackage = getSentFromPackage()) == null || !sentFromPackage.equals("com.google.android.apps.tycho"))) {
                    return false;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("acknowledged_broadcast", true);
                setResultExtras(bundle);
            }
        }
        return true;
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }
}
