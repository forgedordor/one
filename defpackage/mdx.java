package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdx {
    public static final String a = mgb.O(0);
    public static final String b = mgb.O(1);
    public static final String c = mgb.O(2);
    public static final String d = mgb.O(3);
    public static final String e = mgb.O(4);

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(obj));
        bundle2.putInt(b, spanned.getSpanEnd(obj));
        bundle2.putInt(c, spanned.getSpanFlags(obj));
        bundle2.putInt(d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
