package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xah {
    public static final Object a(xak xakVar, Uri uri, fcxy fcxyVar) {
        if (!cqmu.b(uri)) {
            return uri;
        }
        if (cqmu.b(uri)) {
            return fdin.a(eicg.a(xakVar.b), new xaj(null, uri, xakVar), fcxyVar);
        }
        Objects.toString(uri);
        throw new IllegalArgumentException(String.valueOf(uri).concat(" is not a remote uri."));
    }
}
