package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbd {
    public static final eqbe a;
    private static final Class c = eqbe.class;
    public final eqbf b;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqbe.class);
        libraryLoad.getClass();
        a = (eqbe) libraryLoad;
        Native.getNativeSize(eqbf.class);
    }

    public eqbd(eqbf eqbfVar) {
        eqbfVar.getClass();
        this.b = eqbfVar;
        eqba eqbaVar = eqba.a;
        eqaz.a(eqbfVar.result);
        eqbq eqbqVar = eqbq.a;
        eqbp.a(eqbfVar.context);
    }
}
