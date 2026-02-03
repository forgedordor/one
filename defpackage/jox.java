package defpackage;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jox {
    public static final void a(View view) {
        try {
            if (!joy.c) {
                joy.c = true;
                if (Build.VERSION.SDK_INT < 28) {
                    joy.a = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    joy.b = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    joy.a = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    joy.b = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = joy.a;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = joy.b;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = joy.b;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = joy.a;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            joy.d = true;
        }
    }
}
