package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epze {
    private static final Class a = epzf.class;
    private static final epzf b;
    private final Pointer c;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) epzf.class);
        libraryLoad.getClass();
        b = (epzf) libraryLoad;
    }

    public final void a(byte[] bArr) {
        fcti fctiVarC = epzk.c(bArr);
        Object obj = fctiVarC.b;
        b.Zinnia_ForeignBytes_set_bytes(this.c, (eqau) obj);
    }

    public final void finalize() {
    }
}
