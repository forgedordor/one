package defpackage;

import java.lang.reflect.AccessibleObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class etaq {
    public static final etaq b;

    static {
        etaq etaoVar = null;
        if (etab.a()) {
            try {
                etaoVar = new etao(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (etaoVar == null) {
            etaoVar = new etap();
        }
        b = etaoVar;
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
