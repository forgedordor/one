package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.dhfp;
import defpackage.dhfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ForwardingSingleRegistrationVendorImsControllerBinder extends ISingleRegistrationVendorImsController.Stub implements dhfq<ISingleRegistrationVendorImsController> {
    private ISingleRegistrationVendorImsController a;
    private final Context b;

    public ForwardingSingleRegistrationVendorImsControllerBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.dhfq
    public void clear() {
        this.a = null;
    }

    @Override // defpackage.dhfq
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return dhfp.a(this);
    }

    @Override // defpackage.dhfq
    public synchronized ISingleRegistrationVendorImsController getInterface() {
        return this.a;
    }

    @Override // defpackage.dhfq
    public void set(IBinder iBinder) {
        this.a = (ISingleRegistrationVendorImsController) iBinder;
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
        return ((ISingleRegistrationVendorImsController) getDelegate()).setupVendorIms(i);
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
        return ((ISingleRegistrationVendorImsController) getDelegate()).terminateVendorIms(i);
    }
}
