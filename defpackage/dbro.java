package defpackage;

import com.google.android.gms.auth.api.signin.internal.ISignInService;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbro extends dbrp {
    public dbro(dcfq dcfqVar) {
        super(dcfqVar);
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        dbrk dbrkVar = (dbrk) dcevVar;
        ((ISignInService) dbrkVar.w()).revokeAccessFromGoogle(new dbrn(this), dbrkVar.a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ dcfx a(Status status) {
        return status;
    }
}
