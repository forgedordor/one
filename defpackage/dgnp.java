package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgnp implements dhho {
    private final dglm a;

    public dgnp(dglm dglmVar) {
        this.a = dglmVar;
    }

    @Override // defpackage.dhho
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cjty cjtyVar = (cjty) obj;
        if (cjtyVar != null) {
            dglo dgloVar = this.a.a;
            dgng dgngVar = dgloVar.a;
            int i = cjtyVar.d;
            int i2 = dgngVar.i;
            if (i == i2 || (dgngVar.ac() && dgngVar.I.r(i, i2))) {
                dgngVar.N(dgib.MSG_RECEIVED_OTP, cjtyVar.c);
                return;
            }
            String str = (String) dgngVar.I.g(cjtyVar.d, false).map(new Function() { // from class: dgln
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return dggo.a((dggn) obj2).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse("");
            String str2 = dgngVar.h;
            if (str2.isEmpty()) {
                ekrw ekrwVarJ = dgng.e.j();
                ekrwVarJ.X(eksq.a, "BugleRcsProvisioning");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$InProgressState", "storeManuallyEnteredMsisdnAndOtpForOtherSim", 2266, "ProvisioningEngineStateMachine.java")).q("PESM: No SimId found for subId of the provisioning OTP when storing manually entered MSISDN.");
            } else {
                dgrs dgrsVar = dgngVar.u;
                String strO = dgrsVar.o(str2);
                if (strO == null) {
                    strO = "";
                }
                try {
                    dgrsVar.b.j("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str)), strO, "bugle");
                } catch (dhhd e) {
                    dhja.j(e, dgrs.a, "Error while storing manually entered MSISDN from Bugle's ContentProvider", new Object[0]);
                }
                ((dgsz) dgrsVar.d.b()).v(str, strO);
                dgloVar.a.u.w(str, cjtyVar);
            }
            dgng dgngVar2 = dgloVar.a;
            dgrs dgrsVar2 = dgngVar2.u;
            String str3 = dgngVar2.h;
            try {
                dgrsVar2.b.j("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str3)), "", "bugle");
            } catch (dhhd e2) {
                dgrsVar2.K(6);
                dhja.j(e2, dgrs.a, "Error while clearing manually entered MSISDN from Bugle's ContentProvider", new Object[0]);
            }
            ((dgsz) dgrsVar2.d.b()).v(str3, "");
            dgng dgngVar3 = dgloVar.a;
            dgngVar3.u.w(dgngVar3.h, cjty.a);
        }
    }
}
