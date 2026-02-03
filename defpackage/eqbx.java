package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface eqbx extends Library {
    void Zinnia_ZinniaFileEncryptor_destroy(Pointer pointer);

    epzp Zinnia_ZinniaFileEncryptor_encrypt_chunk(Pointer pointer, eqau eqauVar);

    epzp Zinnia_ZinniaFileEncryptor_encrypt_finalize(Pointer pointer);

    epzp Zinnia_ZinniaFileEncryptor_init(eqau eqauVar);
}
