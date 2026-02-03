package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepx {
    public static int a(Context context, int i, int i2) {
        TypedValue typedValueB = b(context, i);
        return (typedValueB == null || typedValueB.type != 16) ? i2 : typedValueB.data;
    }

    public static TypedValue b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue c(Context context, int i, String str) {
        TypedValue typedValueB = b(context, i);
        if (typedValueB != null) {
            return typedValueB;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean d(Context context, int i, boolean z) {
        TypedValue typedValueB = b(context, i);
        return (typedValueB == null || typedValueB.type != 18) ? z : typedValueB.data != 0;
    }

    public static int e(Context context, String str) {
        return c(context, R.attr.materialCalendarStyle, str).data;
    }
}
