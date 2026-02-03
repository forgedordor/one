package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duuk {
    public static Uri a(Context context, Uri uri) throws IOException, ErrnoException {
        try {
            String str = Os.readlink(new ecfc(context).a(uri).getAbsolutePath());
            if (str == null) {
                throw new IOException("Unable to read symlink");
            }
            Pattern pattern = ecfb.a;
            ecfa ecfaVar = new ecfa(context);
            ecfaVar.b(str);
            return ecfaVar.a();
        } catch (ErrnoException | ecge e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) throws IOException, ErrnoException {
        try {
            ecfc ecfcVar = new ecfc(context);
            Os.symlink(ecfcVar.a(uri2).getAbsolutePath(), ecfcVar.a(uri).getAbsolutePath());
        } catch (ErrnoException | ecge e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
