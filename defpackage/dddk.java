package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dddk extends dcko {
    public final ddce a;

    public dddk(Context context, Looper looper, dcke dckeVar, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 63, dckeVar, dcfoVar, dcfpVar);
        this.a = new dddg();
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IGoogleHelpService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }
}
