package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbs extends Exception {
    public static final eqbt a;
    private static final Class c = eqbt.class;
    public final Pointer b;
    private boolean d;

    static {
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqbt.class);
        libraryLoad.getClass();
        a = (eqbt) libraryLoad;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eqbs(Pointer pointer) {
        super("Rust error result for ZinniaErrorWithSource");
        pointer.getClass();
        this.b = pointer;
        this.d = false;
    }

    public final Object a() {
        epzn epznVarZinnia_ZinniaErrorWithSource_get_zinnia_error = a.Zinnia_ZinniaErrorWithSource_get_zinnia_error(this.b);
        if (epznVarZinnia_ZinniaErrorWithSource_get_zinnia_error.isOk != 1) {
            return fctl.a(new eqbo());
        }
        eqbq eqbqVar = eqbq.a;
        return eqbp.a(epznVarZinnia_ZinniaErrorWithSource_get_zinnia_error.union.ok);
    }

    public final void b() {
        this.d = true;
    }

    public final void finalize() {
        if (this.d) {
            a.Zinnia_ZinniaErrorWithSource_destroy(this.b);
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        epyz epyzVar = epwu.a;
        epyz epyzVar2 = epwu.a;
        Pointer pointerDiplomat_buffer_write_create = epyzVar2.diplomat_buffer_write_create(0L);
        a.Zinnia_ZinniaErrorWithSource_to_string(this.b, pointerDiplomat_buffer_write_create);
        pointerDiplomat_buffer_write_create.getClass();
        try {
            Pointer pointerDiplomat_buffer_write_get_bytes = epyzVar2.diplomat_buffer_write_get_bytes(pointerDiplomat_buffer_write_create);
            if (pointerDiplomat_buffer_write_get_bytes == null) {
                throw new OutOfMemoryError();
            }
            byte[] byteArray = pointerDiplomat_buffer_write_get_bytes.getByteArray(0L, (int) epyzVar2.diplomat_buffer_write_len(pointerDiplomat_buffer_write_create));
            byteArray.getClass();
            return new String(byteArray, fdfy.a);
        } finally {
            epwu.a.diplomat_buffer_write_destroy(pointerDiplomat_buffer_write_create);
        }
    }
}
