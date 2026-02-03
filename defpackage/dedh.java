package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.search.queries.internal.ISearchQueriesService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedh extends debh<ISearchQueriesService> {
    public dedh(Context context, Looper looper, dcke dckeVar, dcgy dcgyVar, dcii dciiVar, deaq deaqVar) {
        super(context, looper, 32, dckeVar, dcgyVar, dciiVar, deaqVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ISearchQueriesService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.search.queries.internal.ISearchQueriesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return dddr.f;
    }

    public dedh(Context context, dcke dckeVar, dcgy dcgyVar, dcii dciiVar, deaq deaqVar) {
        super(context, context.getMainLooper(), 32, dckeVar, dcgyVar, dciiVar, deaqVar);
    }
}
