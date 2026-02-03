package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhj implements cgxk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportSerializingInterceptor");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final arys e;
    private final cgxm f;

    public chhj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, arys arysVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = arysVar;
        this.f = new cgxm("SendRcsReportSerializingInterceptor");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.f;
    }

    @Override // defpackage.cgxk
    public final /* synthetic */ Object c(Object obj, fcxy fcxyVar) {
        chhb chhbVar;
        MessageReceipt messageReceiptM;
        chhb chhbVar2 = (chhb) obj;
        if (chhbVar2 instanceof chgz) {
            ekrw ekrwVarH = cgxj.a.h();
            ekrwVarH.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Interceptor.kt");
            cgxm cgxmVar = this.f;
            int i = fdcj.a;
            ekrdVar.D("Running Interceptor %s. Subject is expected type %s", cgxmVar.a, new fdbi(chgz.class).c());
            chhbVar = chhbVar2;
        } else {
            ekrw ekrwVarH2 = cgxj.a.h();
            ekrwVarH2.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion", "checkSubjectType", 110, "Interceptor.kt");
            cgxm cgxmVar2 = this.f;
            int i2 = fdcj.a;
            ekrdVar2.I("Skipping Interceptor %s. Expected type is %s but received subject of type %s", cgxmVar2.a, new fdbi(chgz.class).c(), new fdbi(chhbVar2.getClass()).c());
            chhbVar = null;
        }
        chgz chgzVar = (chgz) chhbVar;
        if (chgzVar == null) {
            return chhbVar2;
        }
        chgt chgtVar = chgzVar.a;
        if (chgtVar.l != null) {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleSending");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportSerializingInterceptor", "execute", 52, "SendRcsReportSerializingInterceptor.kt")).q("SendRcsReportSerializingInterceptor skipping because already serialized");
            return chgzVar;
        }
        if (!this.e.a() ? chgtVar.j : !fdbq.f(chgtVar.k, cbqz.a)) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleSending");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportSerializingInterceptor", "execute", 67, "SendRcsReportSerializingInterceptor.kt")).t("Sending IMDN plaintext receipt, since it wasn't pre-serialized: %s", chgtVar.g);
        }
        basd basdVar = chgtVar.g;
        Instant instant = chgtVar.d;
        Object objB = this.d.b();
        objB.getClass();
        dflp dflpVar = (dflp) objB;
        int iOrdinal = chgtVar.h.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Unsupported receipt type: UNKNOWN_RECEIPT_TYPE");
        }
        if (iOrdinal == 1) {
            efia efiaVar = new efia();
            efkk efkkVar = efkk.DELIVERY;
            efiaVar.l(efkkVar);
            efiaVar.j(efkkVar.f);
            efiaVar.i(basd.e(basdVar));
            efiaVar.k(instant);
            efiaVar.a = dflpVar;
            messageReceiptM = efiaVar.m();
        } else if (iOrdinal == 2) {
            efia efiaVar2 = new efia();
            efkk efkkVar2 = efkk.DISPLAY;
            efiaVar2.l(efkkVar2);
            efiaVar2.j(efkkVar2.f);
            efiaVar2.i(basd.e(basdVar));
            efiaVar2.k(instant);
            efiaVar2.a = dflpVar;
            messageReceiptM = efiaVar2.m();
        } else {
            if (iOrdinal != 3) {
                throw new fctg();
            }
            efia efiaVar3 = new efia();
            efiaVar3.l(efkk.DELIVERY);
            efiaVar3.j("failed");
            efiaVar3.i(basd.e(basdVar));
            efiaVar3.k(instant);
            efiaVar3.a = dflpVar;
            messageReceiptM = efiaVar3.m();
        }
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleSending");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportSerializingInterceptor", "execute", 77, "SendRcsReportSerializingInterceptor.kt")).t("SendRcsReportSerializingInterceptor serializing receipt for %s", basdVar);
        try {
            return new chgz(chgt.a(chgtVar, null, (aubt) ((atak) this.c.b()).fM(((efob) this.b.b()).b(MessageReceipt.class).b(messageReceiptM)), null, null, 63487));
        } catch (efoc e) {
            ekrw ekrwVarJ2 = a.j();
            ekrwVarJ2.X(eksq.a, "BugleSending");
            ((ekrd) ((ekrd) ekrwVarJ2).g(e).h("com/google/android/apps/messaging/shared/pipeline/rcs/send/report/SendRcsReportSerializingInterceptor", "execute", 89, "SendRcsReportSerializingInterceptor.kt")).q("Failed to serialize imdn receipt");
            return chhc.a(chgtVar, new cmph(e));
        }
    }
}
