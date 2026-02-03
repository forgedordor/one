package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eino {
    private final cvw a = new cvw();

    public final eine a(einb einbVar) {
        cvw cvwVar = this.a;
        if (!cvwVar.isEmpty()) {
            Class<?> cls = einbVar.getClass();
            for (int i = 0; i < cvwVar.d; i++) {
                Class cls2 = (Class) cvwVar.d(i);
                eind eindVar = (eind) cvwVar.g(i);
                if (cls2.isAssignableFrom(cls)) {
                    return eindVar.a(einbVar);
                }
            }
        }
        return eine.b;
    }

    public final void b(Class cls, eind eindVar) {
        int i = 0;
        while (true) {
            cvw cvwVar = this.a;
            if (i >= cvwVar.d) {
                cvwVar.put(cls, eindVar);
                return;
            }
            Class<?> cls2 = (Class) cvwVar.d(i);
            ejwl.f(!cls.equals(cls2), "Class %s is already registered as a listener. Are you adding the same listener twice?", cls.getSimpleName());
            ejwl.i(!cls.isAssignableFrom(cls2), "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName());
            ejwl.i(!cls2.isAssignableFrom(cls), "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName());
            i++;
        }
    }

    public final void c() {
        this.a.clear();
    }
}
