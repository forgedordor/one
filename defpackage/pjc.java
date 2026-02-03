package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class pjc {
    public static final void a(Bundle bundle, String str) {
        bundle.putString(str, null);
    }

    public static final void b(Bundle bundle, String str, Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    public static final void c(Bundle bundle, String str, List list) {
        bundle.putParcelableArrayList(str, pjd.a(list));
    }

    public static final void d(Bundle bundle, String str, String str2) {
        str.getClass();
        bundle.putString(str, str2);
    }

    public static final void e(Bundle bundle, String str, String[] strArr) {
        strArr.getClass();
        bundle.putStringArray(str, strArr);
    }

    public static final void f(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, pjd.a(list));
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
