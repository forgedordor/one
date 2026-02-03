package defpackage;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class por {
    final cvw a;
    final cvw b;
    final cvw c;

    public por(cvw cvwVar, cvw cvwVar2, cvw cvwVar3) {
        this.a = cvwVar;
        this.b = cvwVar2;
        this.c = cvwVar3;
    }

    private final Class E(Class cls) throws ClassNotFoundException {
        cvw cvwVar = this.c;
        Class cls2 = (Class) cvwVar.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        cvwVar.put(cls.getName(), cls3);
        return cls3;
    }

    public abstract boolean A(int i);

    public abstract byte[] B();

    public final pot C(pot potVar) {
        return !A(1) ? potVar : f();
    }

    public final void D(pot potVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l(1);
        x(potVar);
    }

    protected abstract int a();

    public final int b(int i, int i2) {
        return !A(i2) ? i : a();
    }

    protected abstract Parcelable c();

    public final Parcelable d(Parcelable parcelable, int i) {
        return !A(i) ? parcelable : c();
    }

    protected abstract por e();

    public final pot f() throws NoSuchMethodException, SecurityException {
        String strI = i();
        if (strI == null) {
            return null;
        }
        por porVarE = e();
        try {
            cvw cvwVar = this.a;
            Method declaredMethod = (Method) cvwVar.get(strI);
            if (declaredMethod == null) {
                declaredMethod = Class.forName(strI, false, por.class.getClassLoader()).getDeclaredMethod("read", por.class);
                cvwVar.put(strI, declaredMethod);
            }
            return (pot) declaredMethod.invoke(null, porVarE);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }

    protected abstract CharSequence g();

    public final CharSequence h(CharSequence charSequence, int i) {
        return !A(i) ? charSequence : g();
    }

    protected abstract String i();

    public final String j(String str, int i) {
        return !A(i) ? str : i();
    }

    protected abstract void k();

    public abstract void l(int i);

    protected abstract void m(boolean z);

    public final void n(boolean z, int i) {
        l(i);
        m(z);
    }

    public abstract void o(byte[] bArr);

    protected abstract void p(CharSequence charSequence);

    public final void q(CharSequence charSequence, int i) {
        l(i);
        p(charSequence);
    }

    protected abstract void r(int i);

    public final void s(int i, int i2) {
        l(i2);
        r(i);
    }

    protected abstract void t(Parcelable parcelable);

    public final void u(Parcelable parcelable, int i) {
        l(i);
        t(parcelable);
    }

    protected abstract void v(String str);

    public final void w(String str, int i) {
        l(i);
        v(str);
    }

    public final void x(pot potVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (potVar == null) {
            v(null);
            return;
        }
        try {
            v(E(potVar.getClass()).getName());
            por porVarE = e();
            try {
                Class<?> cls = potVar.getClass();
                cvw cvwVar = this.b;
                Method declaredMethod = (Method) cvwVar.get(cls.getName());
                if (declaredMethod == null) {
                    declaredMethod = E(cls).getDeclaredMethod("write", cls, por.class);
                    cvwVar.put(cls.getName(), declaredMethod);
                }
                declaredMethod.invoke(null, potVar, porVarE);
                porVarE.k();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e4);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(String.valueOf(potVar.getClass().getSimpleName()).concat(" does not have a Parcelizer"), e5);
        }
    }

    protected abstract boolean y();

    public final boolean z(boolean z, int i) {
        return !A(i) ? z : y();
    }
}
