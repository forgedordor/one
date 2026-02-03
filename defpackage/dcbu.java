package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbu extends dcko {
    public dcbu(Context context, Looper looper, dcke dckeVar, dcgy dcgyVar, dcii dciiVar) {
        super(context, looper, 414, dckeVar, dcgyVar, dciiVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 250200000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IClearcutLoggerSamplingService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.clearcut.sampler.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return new Feature[]{dbzu.b};
    }
}
