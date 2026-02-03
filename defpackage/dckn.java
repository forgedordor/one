package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckn {
    final /* synthetic */ dcii a;

    public dckn(dcii dciiVar) {
        this.a = dciiVar;
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.onConnectionFailed(connectionResult);
    }
}
