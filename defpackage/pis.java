package defpackage;

import android.os.Bundle;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class pis {
    public static final int a(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final Bundle b(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final String c(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final List d(Bundle bundle, String str) {
        int i = fdcj.a;
        ArrayList arrayListB = ih.b(bundle, str, fdab.a(new fdbi(Bundle.class)));
        if (arrayListB != null) {
            return arrayListB;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final List e(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final Map f(Bundle bundle) {
        fcxe fcxeVar = new fcxe(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            fcxeVar.put(str, bundle.get(str));
        }
        return fcwa.b(fcxeVar);
    }

    public static final boolean g(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static final boolean h(Bundle bundle, String str) {
        return g(bundle, str) && bundle.get(str) == null;
    }

    public static final float[] i(Bundle bundle, String str) {
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final int[] j(Bundle bundle, String str) {
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final long[] k(Bundle bundle, String str) {
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final String[] l(Bundle bundle, String str) {
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        pit.a(str);
        throw new fcta();
    }

    public static final boolean[] m(Bundle bundle, String str) {
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        pit.a(str);
        throw new fcta();
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
