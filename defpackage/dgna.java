package defpackage;

import android.os.Message;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgna extends dgmn {
    final /* synthetic */ dgng a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgna(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n() {
        dgng dgngVar = this.a;
        dgngVar.K();
        dgngVar.at(24);
        dgrs dgrsVar = dgngVar.u;
        String str = dgngVar.h;
        try {
            dhhc dhhcVar = dgrsVar.b;
            cjrw cjrwVar = (cjrw) cjsb.a.createBuilder();
            evvp evvpVarC = evxc.c(Instant.now().toEpochMilli());
            cjrwVar.copyOnWrite();
            cjsb cjsbVar = (cjsb) cjrwVar.instance;
            evvpVarC.getClass();
            cjsbVar.e = evvpVarC;
            cjsbVar.b |= 4;
            cjrwVar.copyOnWrite();
            cjsb cjsbVar2 = (cjsb) cjrwVar.instance;
            cjsbVar2.c = cjrz.a(3);
            cjsbVar2.b |= 1;
            cjrwVar.copyOnWrite();
            cjsb cjsbVar3 = (cjsb) cjrwVar.instance;
            cjsbVar3.d = cjrx.a(3);
            cjsbVar3.b |= 2;
            dhhcVar.o(dhhc.g("phone_number_input_ui_event_key_for_sim_", str), cjrwVar.build());
            dhja.l(dgrs.a, "requestPhoneNumberInputUI for sim %s", dhiz.SIM_ID.c(str));
        } catch (dhhd e) {
            dhja.j(e, dgrs.a, "Error while putting PhoneNumberInputUIEvent in bugle storage", new Object[0]);
        }
        if (((Boolean) dgng.b.a()).booleanValue()) {
            dgic.c(this.a.m, 13, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean o() {
        /*
            r7 = this;
            dgng r0 = r7.a
            boolean r1 = r0.V()
            r2 = 1
            if (r1 != 0) goto La
            goto L3e
        La:
            boolean r1 = r0.Z()
            if (r1 != 0) goto L3e
            j$.util.Optional r1 = r0.m()
            boolean r3 = r1.isPresent()
            r4 = 0
            if (r3 == 0) goto L30
            dgkh r3 = r0.E
            java.lang.String r5 = r0.h
            java.lang.Object r1 = r1.get()
            int r6 = defpackage.dfog.d()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.a(r5, r1, r6)
            if (r1 != 0) goto L30
            goto L31
        L30:
            r2 = r4
        L31:
            dgke r0 = r0.z
            java.lang.String r1 = "Should attempt verification using sim number: "
            java.lang.String r1 = defpackage.a.r(r2, r1)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r0.d(r1, r3)
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgna.o():boolean");
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "WaitingForManualMsisdnEntryState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        dgng dgngVar = this.a;
        dgngVar.A(ewps.MANUAL_MSISDN_ENTRY_STAGE);
        if (dgngVar.aj()) {
            if (dgngVar.Z()) {
                dgngVar.z.d("UPI - found manually entered msisdn, go straight to VerifyMsisdnState", new Object[0]);
                dgngVar.T(dgngVar.aj);
                return;
            }
            dgngVar.z.d("UPI - manually entered msisdn not found, requesting phone number input UI", new Object[0]);
            ekrw ekrwVarJ = dgng.e.j();
            ekrwVarJ.X(eksq.a, "BugleRcsProvisioning");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 4770, "ProvisioningEngineStateMachine.java")).q("UPI - manually entered msisdn not found, requesting phone number input UI");
            n();
            dgngVar.J.ifPresent(new Consumer() { // from class: dgmy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((dgie) obj).o(5, this.a.a.h);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        if (dgngVar.aa() && o()) {
            p(dgngVar.au, ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE);
            return;
        }
        if (!dgngVar.aa()) {
            ekrw ekrwVarJ2 = dgng.e.j();
            ekrwVarJ2.X(eksq.a, "BugleRcsProvisioning");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 4783, "ProvisioningEngineStateMachine.java")).q("No msisdn found, requesting phone number input UI");
        }
        if (!o()) {
            ekrw ekrwVarJ3 = dgng.e.j();
            ekrwVarJ3.X(eksq.a, "BugleRcsProvisioning");
            ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 4786, "ProvisioningEngineStateMachine.java")).q("Does not have manual entered msisdn or sim msisdn reached max threshold, requesting phone number input UI");
        }
        n();
        dgngVar.J.ifPresent(new Consumer() { // from class: dgmz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dgie) obj).o(5, this.a.a.h);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_WAITING_FOR_MANUAL_MSISDN;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean i() {
        dgng dgngVar = this.a;
        if (dgngVar.X() || dgngVar.aj()) {
            return false;
        }
        super.i();
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return this.a.X();
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        dgng dgngVar = this.a;
        dgngVar.F("WaitingForManualMsisdnEntryState", message);
        if (dgng.al(message).ordinal() != 8) {
            return super.q(message, dgibVar);
        }
        if (!dgngVar.X()) {
            return super.q(message, dgibVar);
        }
        dgngVar.at(49);
        dgngVar.aq(11);
        dgngVar.ap();
        dgngVar.T(dgngVar.ae);
        return true;
    }

    @Override // defpackage.dgmn
    public final Duration l() {
        return this.a.X() ? Duration.ofMillis(dfpi.p()) : super.l();
    }
}
