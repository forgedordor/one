package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqaw {
    public static final eqax a;
    private static final Class c = eqax.class;
    public final eqay b;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqax.class);
        libraryLoad.getClass();
        a = (eqax) libraryLoad;
        Native.getNativeSize(eqay.class);
    }

    public eqaw(eqay eqayVar) {
        eqayVar.getClass();
        this.b = eqayVar;
        eqba eqbaVar = eqba.a;
        eqaz.a(eqayVar.result);
        eqbq eqbqVar = eqbq.a;
        eqbp.a(eqayVar.context);
    }
}
