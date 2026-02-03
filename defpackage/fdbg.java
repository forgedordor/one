package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdbg implements Serializable, fddx {
    public static final Object f = fdbf.a;
    private transient fddx a;
    private final Class b;
    private final boolean c;
    protected final Object g;
    public final String h;
    public final String i;

    protected fdbg(Object obj, Class cls, String str, String str2, boolean z) {
        this.g = obj;
        this.b = cls;
        this.h = str;
        this.i = str2;
        this.c = z;
    }

    @Override // defpackage.fddx
    public final String b() {
        return this.h;
    }

    public final fddx c() {
        fddx fddxVar = this.a;
        if (fddxVar != null) {
            return fddxVar;
        }
        g();
        this.a = this;
        return this;
    }

    public final fddz e() {
        Class cls = this.b;
        if (cls == null) {
            return null;
        }
        if (this.c) {
            int i = fdcj.a;
            return new fdbx(cls);
        }
        int i2 = fdcj.a;
        return new fdbi(cls);
    }

    @Override // defpackage.fddx
    public final Object f() {
        throw null;
    }

    protected abstract void g();
}
