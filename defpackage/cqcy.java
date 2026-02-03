package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqcy {
    public static final ekri a(final Uri uri) {
        uri.getClass();
        return new ekri() { // from class: cqcx
            @Override // defpackage.ekri
            public final Object a() {
                return cqcy.d(uri);
            }
        };
    }

    public static final ekri b(final CharSequence charSequence) {
        charSequence.getClass();
        return new ekri() { // from class: cqcw
            @Override // defpackage.ekri
            public final Object a() {
                return cqcy.c(charSequence);
            }
        };
    }

    public static final CharSequence c(CharSequence charSequence) {
        charSequence.getClass();
        String strE = cqcv.e(charSequence);
        strE.getClass();
        return strE;
    }

    public static final String d(Uri uri) {
        uri.getClass();
        if (cqmu.b(uri)) {
            return cqcv.d(uri);
        }
        String string = uri.toString();
        string.getClass();
        return string;
    }
}
