package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszu {
    private final Map a;
    private final List b;

    public eszu(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    static /* synthetic */ Object b(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw etcv.b(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.a(etcv.c(constructor), "Failed to invoke constructor '", "' with no args"), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(a.a(etcv.c(constructor), "Failed to invoke constructor '", "' with no args"), e3.getCause());
        }
    }

    static String c(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(String.valueOf(cls.getName()));
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + etat.a("r8-abstract-class");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.etan a(defpackage.etcz r11, boolean r12) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eszu.a(etcz, boolean):etan");
    }

    public final String toString() {
        return this.a.toString();
    }
}
