package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxh extends lxl {
    public static lxh a;
    public static final lyo b = new lxg();
    private final Application e;

    public lxh(Application application) {
        this.e = application;
    }

    private static final lxd d(Class cls, Application application) {
        if (!luh.class.isAssignableFrom(cls)) {
            return lza.a(cls);
        }
        try {
            lxd lxdVar = (lxd) cls.getConstructor(Application.class).newInstance(application);
            lxdVar.getClass();
            return lxdVar;
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
        } catch (NoSuchMethodException e3) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
        } catch (InvocationTargetException e4) {
            Objects.toString(cls);
            throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
        }
    }

    @Override // defpackage.lxl, defpackage.lxk
    public final lxd a(Class cls) {
        Application application = this.e;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.lxl, defpackage.lxk
    public final lxd b(Class cls, lyp lypVar) {
        if (this.e != null) {
            return a(cls);
        }
        Application application = (Application) lypVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (luh.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return lza.a(cls);
    }

    public lxh() {
        this(null);
    }
}
