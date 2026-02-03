package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbh {
    public static final eqbi a;
    private static final Class b = eqbi.class;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqbi.class);
        libraryLoad.getClass();
        a = (eqbi) libraryLoad;
        Native.getNativeSize(eqbj.class);
    }
}
