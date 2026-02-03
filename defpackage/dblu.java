package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.audit.internal.IAuditService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblu extends dcko {
    public dblu(Context context, Looper looper, dcke dckeVar, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 154, dckeVar, dcfoVar, dcfpVar);
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12200000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IAuditService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.audit.internal.IAuditService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.audit.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }
}
