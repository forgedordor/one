package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzc {
    public static final epzd a;
    private static final Class d = epzd.class;
    public final Pointer b;
    public boolean c;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) epzd.class);
        libraryLoad.getClass();
        a = (epzd) libraryLoad;
    }

    public epzc(Pointer pointer) {
        pointer.getClass();
        this.b = pointer;
        this.c = false;
    }

    public final Object a(byte[] bArr) {
        fcti fctiVarC = epzk.c(bArr);
        Object obj = fctiVarC.a;
        Object obj2 = fctiVarC.b;
        Memory memory = (Memory) obj;
        epzp epzpVarZinnia_FfiClient_process_message = a.Zinnia_FfiClient_process_message(this.b, (eqau) obj2);
        if (epzpVarZinnia_FfiClient_process_message.isOk == 1) {
            eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_process_message.union.ok);
            eqamVar.a();
            if (memory != null) {
                memory.close();
            }
            return eqamVar;
        }
        eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_process_message.union.err);
        eqbsVar.b();
        if (memory != null) {
            memory.close();
        }
        return fctl.a(eqbsVar);
    }

    public final void finalize() {
        if (this.c) {
            a.Zinnia_FfiClient_destroy(this.b);
        }
    }
}
