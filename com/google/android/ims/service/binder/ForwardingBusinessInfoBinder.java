package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import defpackage.dhfp;
import defpackage.dhfq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ForwardingBusinessInfoBinder extends IBusinessInfo.Stub implements dhfq<IBusinessInfo> {
    private IBusinessInfo a;
    private final Context b;

    public ForwardingBusinessInfoBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.dhfq
    public synchronized void clear() {
        this.a = null;
    }

    @Override // defpackage.dhfq
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return dhfp.a(this);
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
    public void retrieveBusinessInfo(String str) {
        ((IBusinessInfo) getDelegate()).retrieveBusinessInfo(str);
    }

    @Override // defpackage.dhfq
    public synchronized void set(IBinder iBinder) {
        this.a = (IBusinessInfo) iBinder;
    }

    @Override // defpackage.dhfq
    public synchronized IBusinessInfo getInterface() {
        return this.a;
    }
}
