package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import com.google.android.rcs.client.provisioning.singleregistration.SingleRegistrationVendorImsService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ahgd extends cayv {
    public final dggj b;
    private final eosd d;
    private final crru e;
    private final BiFunction f;
    private final boolean g;
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/rcsprovisioning/singleregistration/workhandler/VendorImsCallWorkItemHandler");
    static final cczv a = cdag.e(cdag.b, "vendor_ims_service_call_retry_delay_seconds", 10);

    public ahgd(eosd eosdVar, BiFunction biFunction, crru crruVar, dggj dggjVar, fcsu fcsuVar) {
        this.d = eosdVar;
        this.f = biFunction;
        this.e = crruVar;
        this.b = dggjVar;
        this.g = ((arhf) fcsuVar.b()).a();
    }

    public static cbcw k(Exception exc) {
        dhja.i(exc, "[SR]: %s was raised while waiting to connect to SingleRegistrationVendorImsService.", exc.getClass().getSimpleName());
        return cbcw.m();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WAKELOCK);
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.f(pza.b);
        caxzVarL.g(((Integer) a.e()).intValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("VendorImsCallWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ahfu.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ahfu ahfuVar = (ahfu) evuhVar;
        if (this.g) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/rcsprovisioning/singleregistration/workhandler/VendorImsCallWorkItemHandler", "processPendingWorkItemAsync", 112, "VendorImsCallWorkItemHandler.java")).q("VendorImsCallWorkItemHandler#processPendingWorkItemAsync is deprecated, do not remove unless this is never logged to primes-crash");
            return eijx.e(cbcw.l(new UnsupportedOperationException("Single-Registration Vendor IMS Jibe Connection is deprecated.")));
        }
        ewjo ewjoVarB = ewjo.b(ahfuVar.d);
        if (ewjoVarB == null) {
            ewjoVarB = ewjo.OPERATION_TYPE_UNKNOWN;
        }
        final ahgc ahgcVar = ewjo.OPERATION_TYPE_SETUP_VENDOR_IMS.equals(ewjoVarB) ? new ahgc() { // from class: ahfw
            @Override // defpackage.ahgc
            public final SingleRegistrationVendorImsServiceResult a(SingleRegistrationVendorImsService singleRegistrationVendorImsService, int i) {
                return singleRegistrationVendorImsService.setupVendorIms(i);
            }
        } : new ahgc() { // from class: ahfx
            @Override // defpackage.ahgc
            public final SingleRegistrationVendorImsServiceResult a(SingleRegistrationVendorImsService singleRegistrationVendorImsService, int i) {
                return singleRegistrationVendorImsService.terminateVendorIms(i);
            }
        };
        final int i = ((caxm) cayyVar.a()).c;
        Integer numValueOf = Integer.valueOf(ahfuVar.c);
        ewjo ewjoVarB2 = ewjo.b(ahfuVar.d);
        if (ewjoVarB2 == null) {
            ewjoVarB2 = ewjo.OPERATION_TYPE_UNKNOWN;
        }
        dhja.c("[SR] Executing Vendor IMS call. subId: %d, operation: %s, runAttemptCount: %d", numValueOf, ewjoVarB2, Integer.valueOf(i));
        final int i2 = ahfuVar.c;
        ewjo ewjoVarB3 = ewjo.b(ahfuVar.d);
        if (ewjoVarB3 == null) {
            ewjoVarB3 = ewjo.OPERATION_TYPE_UNKNOWN;
        }
        final ewjo ewjoVar = ewjoVarB3;
        ewjm ewjmVarB = ewjm.b(ahfuVar.e);
        if (ewjmVarB == null) {
            ewjmVarB = ewjm.TRIGGER_UNKNOWN;
        }
        final ewjm ewjmVar = ewjmVarB;
        if (i2 < 0) {
            dhja.g("[SR]: invalid subscriptionId value. No retry expected.", new Object[0]);
            this.b.i(ewjoVar, ewjmVar, ewjk.FAILURE_REASON_INVALID_SUBSCRIPTION_ID, i);
            return eijx.e(cbcw.k());
        }
        eiju eijuVarA = this.e.a(this.f, SingleRegistrationVendorImsService.class);
        ejvr ejvrVar = new ejvr() { // from class: ahfy
            /* JADX WARN: Removed duplicated region for block: B:18:0x01dc A[Catch: efao -> 0x0243, TryCatch #0 {efao -> 0x0243, blocks: (B:3:0x0012, B:5:0x001c, B:18:0x01dc, B:20:0x01fd, B:22:0x0203, B:24:0x020f, B:26:0x0217, B:28:0x0223, B:7:0x0027, B:9:0x0031, B:10:0x00e2, B:12:0x00ea, B:13:0x00f3, B:15:0x00fd, B:16:0x01d3), top: B:33:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x01fd A[Catch: efao -> 0x0243, TryCatch #0 {efao -> 0x0243, blocks: (B:3:0x0012, B:5:0x001c, B:18:0x01dc, B:20:0x01fd, B:22:0x0203, B:24:0x020f, B:26:0x0217, B:28:0x0223, B:7:0x0027, B:9:0x0031, B:10:0x00e2, B:12:0x00ea, B:13:0x00f3, B:15:0x00fd, B:16:0x01d3), top: B:33:0x0012 }] */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 597
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ahfy.apply(java.lang.Object):java.lang.Object");
            }
        };
        eosd eosdVar = this.d;
        return eijuVarA.h(ejvrVar, eosdVar).e(SecurityException.class, new ejvr() { // from class: ahfz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                SecurityException securityException = (SecurityException) obj;
                this.a.b.j(ewjoVar, ewjmVar, ewjk.FAILURE_REASON_SECURITY_EXCEPTION, securityException.getMessage(), i);
                return ahgd.k(securityException);
            }
        }, eosdVar).e(TimeoutException.class, new ejvr() { // from class: ahga
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                TimeoutException timeoutException = (TimeoutException) obj;
                this.a.b.j(ewjoVar, ewjmVar, ewjk.FAILURE_REASON_TIMEOUT_EXCEPTION, timeoutException.getMessage(), i);
                return ahgd.k(timeoutException);
            }
        }, eosdVar).e(crsk.class, new ejvr() { // from class: ahgb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                crsk crskVar = (crsk) obj;
                this.a.b.j(ewjoVar, ewjmVar, ewjk.FAILURE_REASON_RCS_SERVICE_CONNECTION_EXCEPTION, crskVar.getMessage(), i);
                return ahgd.k(crskVar);
            }
        }, eosdVar);
    }
}
