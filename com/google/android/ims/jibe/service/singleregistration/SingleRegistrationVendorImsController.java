package com.google.android.ims.jibe.service.singleregistration;

import android.telephony.ims.ImsException;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.dfip;
import defpackage.dgfw;
import defpackage.dgfx;
import defpackage.dheq;
import defpackage.dhja;
import defpackage.ewgx;
import defpackage.ewjk;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SingleRegistrationVendorImsController extends ISingleRegistrationVendorImsController.Stub {
    private final dheq a;
    private final dgfx b;
    private final Map c = new ConcurrentHashMap();

    public SingleRegistrationVendorImsController(dheq dheqVar, dgfx dgfxVar) {
        this.a = dheqVar;
        this.b = dgfxVar;
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
        Optional optionalH = this.a.a.h(i);
        if (optionalH.isEmpty()) {
            dhja.q("[SR]: SimId was not found in SimInfoProvider for subId: %d", Integer.valueOf(i));
            return new SingleRegistrationVendorImsServiceResult(28);
        }
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        dgfw dgfwVarA = (dgfw) map.get(numValueOf);
        Object obj = optionalH.get();
        if (dgfwVarA == null) {
            dgfwVarA = this.b.a((String) obj, i);
        }
        try {
            dgfwVarA.b(new dfip(map, i, dgfwVarA));
            this.c.put(numValueOf, dgfwVarA);
            dhja.k("[SR]: Vendor IMS was setup successfully for subId: %d", numValueOf);
            return new SingleRegistrationVendorImsServiceResult(0);
        } catch (ImsException e) {
            dhja.i(e, "[SR]: Failed to setup Vendor IMS for subId: %d", Integer.valueOf(i));
            return new SingleRegistrationVendorImsServiceResult(30, ewgx.b(e.getCode()));
        } catch (SecurityException e2) {
            dhja.i(e2, "[SR]: Failed to setup Vendor IMS for subId: %d", Integer.valueOf(i));
            return new SingleRegistrationVendorImsServiceResult(30, ewjk.FAILURE_REASON_SECURITY_EXCEPTION);
        }
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
        Map map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        dgfw dgfwVar = (dgfw) map.remove(numValueOf);
        if (dgfwVar != null) {
            try {
                dgfwVar.a();
                dhja.k("[SR]: Vendor IMS was setup for subId: %d. Terminated the callback.", numValueOf);
            } catch (ImsException e) {
                dhja.i(e, "[SR]: Failed to terminate Vendor IMS for subId: %d", Integer.valueOf(i));
                return new SingleRegistrationVendorImsServiceResult(30, ewgx.b(e.getCode()));
            } catch (SecurityException e2) {
                dhja.i(e2, "[SR]: Failed to terminate Vendor IMS for subId: %d", Integer.valueOf(i));
                return new SingleRegistrationVendorImsServiceResult(30, ewjk.FAILURE_REASON_SECURITY_EXCEPTION);
            }
        } else {
            dhja.k("[SR]: Vendor IMS was not setup for subId: %d.", numValueOf);
        }
        return new SingleRegistrationVendorImsServiceResult(0);
    }
}
