package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dejs extends dceu {
    @Override // defpackage.dceu
    public final /* synthetic */ dcfc b(Context context, Looper looper, dcke dckeVar, Object obj, dcfo dcfoVar, dcfp dcfpVar) {
        return new UsageReportingClientImpl(context, looper, dckeVar, dcfoVar, dcfpVar);
    }
}
