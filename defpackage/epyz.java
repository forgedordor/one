package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface epyz extends Library {
    Pointer diplomat_buffer_write_create(long j);

    void diplomat_buffer_write_destroy(Pointer pointer);

    Pointer diplomat_buffer_write_get_bytes(Pointer pointer);

    long diplomat_buffer_write_len(Pointer pointer);
}
