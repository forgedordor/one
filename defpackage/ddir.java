package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.kids.internal.IParentalControlsService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddir extends dcko {
    private static final dckv a = new dckv("ParentalControlsClient");

    public ddir(Context context, Looper looper, dcke dckeVar, dcgy dcgyVar, dcii dciiVar) {
        super(context, looper, 42, dckeVar, dcgyVar, dciiVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        iBinder.getClass();
        return IParentalControlsService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.kids.internal.IParentalControlsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.kids.parentalcontrols.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return new Feature[]{ddhp.a, ddhp.b};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String y() {
        if (dcni.c()) {
            if (((DevicePolicyManager) this.c.getSystemService(DevicePolicyManager.class)).isProfileOwnerApp("com.google.android.gms.supervision")) {
                a.b("Start service package com.google.android.gms.supervision");
                return "com.google.android.gms.supervision";
            }
            a.b("Start service package com.google.android.gms");
        }
        return "com.google.android.gms";
    }
}
