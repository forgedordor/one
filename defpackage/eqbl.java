package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbl {
    public static final eqbm a;
    private static final Class c = eqbm.class;
    public final eqbn b;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqbm.class);
        libraryLoad.getClass();
        a = (eqbm) libraryLoad;
        Native.getNativeSize(eqbn.class);
    }

    public eqbl(eqbn eqbnVar) {
        eqbnVar.getClass();
        this.b = eqbnVar;
        eqbnVar.value.m440toULongsVKNKU();
        eqba eqbaVar = eqba.a;
        eqaz.a(eqbnVar.result);
        eqbq eqbqVar = eqbq.a;
        eqbp.a(eqbnVar.context);
    }
}
