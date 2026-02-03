package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ih {
    public static Object a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return bundle.getParcelable(str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList b(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT >= 34 ? bundle.getParcelableArrayList(str, cls) : bundle.getParcelableArrayList(str);
    }
}
