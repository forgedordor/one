package com.google.android.ims.jibe.service.businessinfo;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import defpackage.dewk;
import defpackage.dhff;
import defpackage.dhja;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoEngine extends IBusinessInfo.Stub {
    private final Context a;
    private final dewk b;

    public BusinessInfoEngine(Context context, dewk dewkVar) {
        this.a = context;
        this.b = dewkVar;
    }

    @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
    public void retrieveBusinessInfo(String str) throws RemoteException {
        dhff.d(this.a, Binder.getCallingUid());
        dhja.c("Retrieving business information for: %s", dhja.a(str));
        this.b.g(str, null);
    }
}
