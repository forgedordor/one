package defpackage;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nnm {
    private final nnl a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public nnm(nnl nnlVar) {
        this.a = nnlVar;
    }

    public final nnr a(Object... objArr) {
        Constructor constructorA;
        AtomicBoolean atomicBoolean = this.b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    constructorA = this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (nnr) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
