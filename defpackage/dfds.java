package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfds {
    public static final AtomicReference a = new AtomicReference();

    public static Object a(Class cls) {
        Supplier supplierM180m = aky$$ExternalSyntheticApiModelOutline0.m180m(a.get());
        supplierM180m.getClass();
        Object obj = supplierM180m.get();
        obj.getClass();
        ejwl.f(cls.isInstance(obj), "SingletonEntryPoints (i.e SingletonComponent) does not implement %s", cls.getName());
        return cls.cast(obj);
    }
}
