package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deah extends dcko {
    public deah(Context context, Looper looper, dcke dckeVar, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 38, dckeVar, dcfoVar, dcfpVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 9410000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IPseudonymousIdService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.pseudonymous.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return ddzy.b;
    }
}
