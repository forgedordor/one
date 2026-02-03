package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evuc {
    public static final evtz a(Object obj) {
        return ((evua) obj).a;
    }

    public static final boolean b(Object obj) {
        return !((evub) obj).b;
    }

    public static final Object c(Object obj, Object obj2) {
        evub evubVarA = (evub) obj;
        evub evubVar = (evub) obj2;
        if (!evubVar.isEmpty()) {
            if (!evubVarA.b) {
                evubVarA = evubVarA.a();
            }
            evubVarA.b();
            if (!evubVar.isEmpty()) {
                evubVarA.putAll(evubVar);
            }
        }
        return evubVarA;
    }

    public static final Object d() {
        return evub.a.a();
    }
}
