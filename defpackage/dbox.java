package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.internal.ICredentialsService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbox extends dcko {
    private final dbod a;

    public dbox(Context context, Looper looper, dcke dckeVar, dbod dbodVar, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 68, dckeVar, dcfoVar, dcfpVar);
        dboc dbocVar = new dboc(dbodVar == null ? dbod.a : dbodVar);
        dbocVar.b = dddu.a();
        this.a = new dbod(dbocVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ICredentialsService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        dbod dbodVar = this.a;
        bundle.putBoolean("force_save_dialog", dbodVar.c);
        bundle.putString("log_session_id", dbodVar.d);
        return bundle;
    }
}
