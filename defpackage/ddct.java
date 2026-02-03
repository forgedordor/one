package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddct extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ ddcu a;

    public ddct(ddcu ddcuVar) {
        this.a = ddcuVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onAsyncPsdSaved() {
        this.a.m(Status.a);
    }
}
