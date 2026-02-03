package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface eqbv extends Library {
    epzp Zinnia_ZinniaFileDecryptor_decrypt_unverified_chunk(Pointer pointer, eqau eqauVar);

    void Zinnia_ZinniaFileDecryptor_destroy(Pointer pointer);

    epzr Zinnia_ZinniaFileDecryptor_finalize_and_verify(Pointer pointer);

    epzp Zinnia_ZinniaFileDecryptor_init(eqau eqauVar, eqau eqauVar2);
}
