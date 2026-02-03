package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.aivj;
import defpackage.ajkv;
import defpackage.aqsx;
import defpackage.chwq;
import defpackage.chza;
import defpackage.cjyi;
import defpackage.ckzw;
import defpackage.cqbd;
import defpackage.cqbm;
import defpackage.cqce;
import defpackage.crma;
import defpackage.crqv;
import defpackage.crqx;
import defpackage.crsh;
import defpackage.dfir;
import defpackage.dggp;
import defpackage.dgic;
import defpackage.dhkl;
import defpackage.ecem;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiid;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.enwr;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.eygg;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RcsProvisioningEventReceiver extends ckzw {
    private static final cqce l = cqce.g("BugleRcsProvisioning", "RcsProvisioningEventReceiver");
    private static final ekrg m = ekrg.c("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public eygg f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public fcsu j;
    public fcsu k;

    @Override // defpackage.cldb
    protected final int a() {
        return 4;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.g.b()).c("RcsProvisioningEventReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver", "beginRootTrace", 87);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.ProvisioningEvent.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.ProvisioningEvent.Latency";
    }

    @Override // defpackage.clca
    protected final void g(Context context, Intent intent) {
        if (!((chwq) this.e.b()).y(intent)) {
            l.r("ProvisioningEvent not from an authorized source.");
        }
        if ("com.google.android.ims.provisioning.engine.provisioningEventAction".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key", -1);
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.ims.provisioning.engine.provisioning_event_bundle_key");
            cqce cqceVar = l;
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.A("Received ProvisioningEvent", dgic.a(intExtra));
            cqbdVarC.r();
            if (intExtra == 0) {
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST));
                return;
            }
            if (intExtra == 3) {
                if (bundleExtra == null) {
                    cqceVar.n("No extras for ProvisioningEvent.PROVISIONING_WELCOME_MESSAGE_KEY");
                    return;
                }
                byte[] byteArray = bundleExtra.getByteArray("com.google.android.ims.provisioning.enginge.welcome_message");
                if (byteArray == null) {
                    cqceVar.n("Message is not set for ProvisioningEvent.PROVISIONING_WELCOME_MESSAGE_KEY");
                    return;
                }
                try {
                    dfir dfirVar = (dfir) evsn.parseFrom(dfir.a, byteArray, evrr.a());
                    String string = bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key");
                    if (string == null) {
                        ((ekrd) ((ekrd) m.i()).h("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver", "handleProvisioningEvent", 204, "RcsProvisioningEventReceiver.java")).q("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_WELCOME_MESSAGE");
                        return;
                    } else {
                        ((cjyi) this.j.b()).h(new dggp(string), dfirVar);
                        context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE));
                        return;
                    }
                } catch (evtj e) {
                    l.o("Unable to parse Welcome Message", e);
                    return;
                }
            }
            int i = 1;
            if (intExtra == 5) {
                ((crqv) this.a.b()).h("should_show_google_tos_prompt", true);
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
                return;
            }
            if (intExtra == 9) {
                byte[] byteArray2 = bundleExtra != null ? bundleExtra.getByteArray("com.google.android.ims.provisioning.enginge.provisioning_alert_server_message") : null;
                if (byteArray2 == null) {
                    cqceVar.n("BugleServerMessage was not set for ProvisioningEvent.PROVISIONING_EVENT_TERMS_AND_CONDITIONS, can not set Terms and Conditions message.");
                    return;
                }
                try {
                    dfir dfirVar2 = (dfir) evsn.parseFrom(dfir.a, byteArray2);
                    String string2 = bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key");
                    if (string2 == null) {
                        ((ekrd) ((ekrd) m.i()).h("com/google/android/apps/messaging/shared/receiver/RcsProvisioningEventReceiver", "handleProvisioningEvent", 170, "RcsProvisioningEventReceiver.java")).q("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_TERMS_AND_CONDITIONS");
                        return;
                    } else {
                        ((cjyi) this.j.b()).g(new dggp(string2), dfirVar2);
                        context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST));
                        return;
                    }
                } catch (evtj e2) {
                    cqbd cqbdVarB = l.b();
                    cqbdVarB.I("Unable to parse Terms and Conditions BugleServerMessage from PEv2, event will be ignored");
                    cqbdVarB.s(e2);
                    return;
                }
            }
            if (intExtra == 15) {
                ((chwq) this.e.b()).r();
                return;
            }
            if (intExtra == 18) {
                if (bundleExtra == null) {
                    cqceVar.n("No extras for ProvisioningEvent.PROVISIONING_EVENT_SESSION_ID");
                    return;
                } else {
                    ((crqv) this.a.b()).l("provisioning_session_id", bundleExtra.getString("com.google.android.ims.provisioning.session.id.key"));
                    return;
                }
            }
            int i2 = 0;
            if (intExtra == 22) {
                crqv crqvVar = (crqv) ((crsh) this.h.b()).a.b();
                crqvVar.n("rcs_tos_state");
                crqvVar.h("fast_track_prompt_dismissed", false);
                crqvVar.h("did_show_google_tos_prompt", false);
                ((crqv) this.a.b()).h("should_show_google_tos_prompt", true);
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST));
                return;
            }
            if (intExtra == 24) {
                ((crqv) this.a.b()).h("should_show_rcs_default_on_prompt", true);
                context.sendBroadcast(new Intent(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST));
                return;
            }
            switch (intExtra) {
                case 11:
                    if (bundleExtra != null) {
                        int i3 = new int[]{1, 2, 3, 4}[bundleExtra.getInt("com.google.android.ims.provisioning.engine.update_provisioning_status_key")];
                        crqx crqxVar = (crqx) this.b.b();
                        if (i3 != 0) {
                            i = i3;
                            i2 = i;
                        }
                        crqxVar.a.j("rcs_provisioning_status_pev2", i - 1);
                        if (i2 == 3 || i2 == 4) {
                            aivj aivjVar = (aivj) this.c.b();
                            long jLongValue = dhkl.a().longValue();
                            if (!aivjVar.f().isPresent()) {
                                aivjVar.a.k("first_rcs_eligibility_time", jLongValue);
                            }
                        }
                        if (i2 == 4) {
                            aivj aivjVar2 = (aivj) this.c.b();
                            long jLongValue2 = dhkl.a().longValue();
                            if (!aivjVar2.d().isPresent()) {
                                aivjVar2.a.k("first_time_rcs_provisioned_millis", jLongValue2);
                                break;
                            }
                        }
                    } else {
                        cqceVar.n("No extras for ProvisioningEvent.PROVISIONING_EVENT_UPDATE_PROVISIONING_STATUS");
                        break;
                    }
                    break;
                case 12:
                    if (bundleExtra != null) {
                        enwr enwrVarB = enwr.b(bundleExtra.getInt("com.google.android.ims.provisioning.rcs.availability.update.key"));
                        String string3 = bundleExtra.getString("com.google.android.ims.provisioning.sim.id.key");
                        if (string3 != null) {
                            Optional.ofNullable(bundleExtra.getString("com.google.android.ims.provisioning.sim.iccid.key"));
                            cqbd cqbdVarC2 = cqceVar.c();
                            cqbdVarC2.A("Bugle receives rcs availability update to", enwrVarB);
                            cqbdVarC2.r();
                            if (((crma) this.i.b()).k()) {
                                ((ajkv) this.f.b()).e(enwrVarB, ((aqsx) this.k.b()).a() ? Optional.of(string3) : Optional.empty());
                            }
                            ((chza) ((cqbm) this.d.b()).a()).x();
                            break;
                        } else {
                            cqceVar.n("simId is not set for ProvisioningEvent.PROVISIONING_EVENT_RCS_AVAILABILITY_UPDATED");
                            break;
                        }
                    } else {
                        cqceVar.n("No extras for ProvisioningEvent.PROVISIONING_EVENT_RCS_AVAILABILITY_UPDATED");
                        break;
                    }
                case 13:
                    ecem.e(eiid.k(new Runnable() { // from class: clat
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((chza) ((cqbm) this.a.d.b()).a()).k();
                        }
                    }));
                    break;
                default:
                    cqceVar.n("Unknown provisioning event " + String.valueOf(intent.getSerializableExtra("com.google.android.ims.provisioning.engine.provisioning_event_code_key")) + " possible version mismatch?");
                    break;
            }
        }
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }
}
