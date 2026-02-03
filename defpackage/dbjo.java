package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjo extends dcko {
    public dbjo(Context context, Looper looper, dcke dckeVar, dcgy dcgyVar, dcii dciiVar) {
        super(context, looper, 19, dckeVar, dcgyVar, dciiVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return ILightweightAppDataSearch.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }
}
