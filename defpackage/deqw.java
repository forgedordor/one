package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deqw {
    public static final dcfs a(dcfq dcfqVar, Uri uri, int i) {
        dcjr.a(uri, "uri must not be null");
        if (i != 0) {
            i = 1;
        }
        dclh.b(true, "invalid filter type");
        deqr deqrVar = new deqr(dcfqVar, uri, i);
        dcfqVar.b(deqrVar);
        return deqrVar;
    }
}
