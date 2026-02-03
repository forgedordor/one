package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.internal.PeopleClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddxk extends dduv {
    final /* synthetic */ ddul a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddxk(dcfq dcfqVar, ddul ddulVar) {
        super(dcfqVar);
        this.a = ddulVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dcfx a(Status status) {
        return new ddxj(status);
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        ((PeopleClientImpl) dcevVar).P(this, this.a.a);
    }
}
