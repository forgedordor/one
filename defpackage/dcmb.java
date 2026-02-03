package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.service.IClientTelemetryService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcmb extends dcko {
    private final dcls a;

    public dcmb(Context context, Looper looper, dcke dckeVar, dcls dclsVar, dcgy dcgyVar, dcii dciiVar) {
        super(context, looper, 270, dckeVar, dcgyVar, dciiVar);
        this.a = dclsVar;
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IClientTelemetryService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle g() {
        Bundle bundle = new Bundle();
        String str = this.a.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return dcbx.b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean i() {
        return true;
    }
}
