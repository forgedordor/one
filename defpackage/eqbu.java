package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbu {
    public static final eqbv a;
    private static final Class d = eqbv.class;
    public final Pointer b;
    public boolean c;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqbv.class);
        libraryLoad.getClass();
        a = (eqbv) libraryLoad;
    }

    public eqbu(Pointer pointer) {
        pointer.getClass();
        this.b = pointer;
        this.c = false;
    }

    public final void finalize() {
        if (this.c) {
            a.Zinnia_ZinniaFileDecryptor_destroy(this.b);
        }
    }
}
