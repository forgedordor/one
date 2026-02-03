package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgi {
    private final eddp a;

    public edgi(eddp eddpVar) {
        this.a = eddpVar;
    }

    public static boolean b(Throwable th) {
        return (th instanceof UserRecoverableAuthException) || (th instanceof dbmz);
    }

    public final edhe a(Throwable th) {
        return !this.a.a() ? edhe.OFFLINE : b(th) ? edhe.RETRYABLE : edhe.NON_RETRYABLE;
    }
}
