package com.google.android.rcs.client.provisioning.singleregistration;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efaj;
import defpackage.efao;
import defpackage.efaq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SingleRegistrationVendorImsService extends efaj<ISingleRegistrationVendorImsController> {
    public static final dfny h = dfnv.b("single_registration_vendor_ims_service_connection_deprecated");

    public SingleRegistrationVendorImsService(Context context, efaq efaqVar) {
        super(ISingleRegistrationVendorImsController.class, context, efaqVar, 1, Optional.empty());
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "RcsSingleRegistrationVendomImsServiceVersions";
    }

    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) throws efao {
        b();
        try {
            return ((ISingleRegistrationVendorImsController) a()).setupVendorIms(i);
        } catch (RemoteException | IllegalStateException e) {
            throw new efao("Error while notifying location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) throws efao {
        b();
        try {
            return ((ISingleRegistrationVendorImsController) a()).terminateVendorIms(i);
        } catch (RemoteException | IllegalStateException e) {
            throw new efao("Error while notifying location: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
