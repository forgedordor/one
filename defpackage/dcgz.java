package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgz implements dcfr {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ dchb b;

    public dcgz(dchb dchbVar, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        this.b = dchbVar;
    }

    @Override // defpackage.dcfr
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
