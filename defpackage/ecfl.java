package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfl {
    public static final File a(Uri uri) throws ecge {
        if (!uri.getScheme().equals("file")) {
            throw new ecge("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new ecge("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new ecge("Did not expect uri to have authority");
    }
}
