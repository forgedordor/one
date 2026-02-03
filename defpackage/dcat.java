package defpackage;

import com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcat extends DefaultClearcutLoggerCallbacks {
    final /* synthetic */ dcau a;
    private final dcbb b;

    public dcat(dcau dcauVar, dcbb dcbbVar) {
        this.a = dcauVar;
        this.b = dcbbVar;
    }

    @Override // com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks, com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
    public final void onLogEvent(Status status) {
        try {
            if (status.d()) {
                dcau dcauVar = this.a;
                dcbc.c(dcauVar.a.c).e();
                dcauVar.d();
            } else {
                if (dcbc.c(this.a.a.c).b() != null) {
                    dcaz dcazVarB = dcaz.b();
                    dcbb dcbbVar = this.b;
                    String str = dcbbVar.a.a.f;
                    int i = dcbbVar.b;
                    dcazVarB.c(new LogErrorParcelable(str, 1003, 1));
                }
            }
        } finally {
            dcav.a.set(false);
        }
    }
}
