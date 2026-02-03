package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dddf extends ddde {
    public dddf(dcfq dcfqVar) {
        super(dcfqVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ dcfx a(Status status) {
        return status == null ? Status.c : status;
    }
}
