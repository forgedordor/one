package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqam {
    private static final Class a = eqan.class;
    private static final eqan b;
    private final Pointer c;
    private boolean d;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqan.class);
        libraryLoad.getClass();
        b = (eqan) libraryLoad;
    }

    public /* synthetic */ eqam(Pointer pointer) {
        pointer.getClass();
        this.c = pointer;
        this.d = false;
    }

    public final void a() {
        this.d = true;
    }

    public final byte[] b() {
        return epzk.b(b.Zinnia_RustOwnedBytes_get_as_bytes(this.c));
    }

    public final void finalize() {
        if (this.d) {
            b.Zinnia_RustOwnedBytes_destroy(this.c);
        }
    }
}
