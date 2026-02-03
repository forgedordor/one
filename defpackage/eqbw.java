package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbw {
    public static final eqbx a;
    private static final Class d = eqbx.class;
    public final Pointer b;
    public boolean c;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqbx.class);
        libraryLoad.getClass();
        a = (eqbx) libraryLoad;
    }

    public eqbw(Pointer pointer) {
        pointer.getClass();
        this.b = pointer;
        this.c = false;
    }

    public final void finalize() {
        if (this.c) {
            a.Zinnia_ZinniaFileEncryptor_destroy(this.b);
        }
    }
}
