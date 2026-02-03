package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.inappreach.internal.IInAppReachService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddhg extends dcko {
    protected ddhg(Context context, Looper looper, dcke dckeVar, dcgy dcgyVar, dcii dciiVar) {
        super(context, looper, 315, dckeVar, dcgyVar, dciiVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IInAppReachService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.inappreach.internal.IInAppReachService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.inappreach.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return ddeu.d;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final boolean i() {
        return true;
    }
}
