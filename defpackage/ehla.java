package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehla {
    public static Throwable a(Throwable th) {
        if (th instanceof dqzo) {
            throw null;
        }
        if (th instanceof dqzk) {
            String message = th.getMessage();
            Intent intent = ((dqzk) th).a;
            return new UserRecoverableAuthException(message, intent != null ? new Intent(intent) : null);
        }
        if (th instanceof dqzp) {
            th.getMessage();
            throw null;
        }
        if (!(th instanceof dqzn)) {
            return th;
        }
        return new dcen(0);
    }
}
