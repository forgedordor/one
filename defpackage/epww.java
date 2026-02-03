package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epww {
    public static final epwx a;
    private static final Class b = epwx.class;

    static {
        Library libraryLoad = Native.load("zinnia_jni", epwx.class, Collections.singletonMap(Library.OPTION_ALLOW_OBJECTS, true));
        libraryLoad.getClass();
        a = (epwx) libraryLoad;
    }
}
