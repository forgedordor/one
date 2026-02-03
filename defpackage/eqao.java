package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqao {
    public static final eqap a;
    private static final Class b = eqap.class;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqap.class);
        libraryLoad.getClass();
        a = (eqap) libraryLoad;
    }

    public final void finalize() {
    }
}
