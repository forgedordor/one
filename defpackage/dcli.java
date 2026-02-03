package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcli extends Exception {
    public final ConnectionResult a;

    public dcli(ConnectionResult connectionResult) {
        dclh.b(connectionResult.b(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = connectionResult;
    }
}
