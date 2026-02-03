package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.firebase.appindexing.internal.IAppIndexingService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esay extends dcko {
    static final dcfe a;
    private static final dcfd v;
    private static final dceu w;

    static {
        dcfd dcfdVar = new dcfd();
        v = dcfdVar;
        esax esaxVar = new esax();
        w = esaxVar;
        a = new dcfe("AppIndexing.API", esaxVar, dcfdVar);
    }

    public esay(Context context, Looper looper, dcke dckeVar, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 113, dckeVar, dcfoVar, dcfpVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IAppIndexingService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }
}
