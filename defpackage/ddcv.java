package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddcv extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ ddcw a;

    public ddcv(ddcw ddcwVar) {
        this.a = ddcwVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onAsyncPsbdSaved() {
        this.a.m(Status.a);
    }
}
