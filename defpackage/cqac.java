package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqac<T> implements Supplier<T> {
    public Object b;
    private final Supplier d;
    public final Object a = new Object();
    public boolean c = false;

    public cqac(Supplier supplier) {
        this.d = supplier;
    }

    @Override // java.util.function.Supplier
    public final T get() {
        T t;
        synchronized (this.a) {
            if (!this.c) {
                this.b = this.d.get();
                this.c = true;
            }
            t = (T) this.b;
            t.getClass();
        }
        return t;
    }
}
