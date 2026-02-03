package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwu {
    public static final epyz a;
    private static final Class b = epyz.class;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) epyz.class);
        libraryLoad.getClass();
        a = (epyz) libraryLoad;
    }
}
