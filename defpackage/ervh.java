package defpackage;

import java.security.Provider;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervh implements ervo {
    @Override // defpackage.ervo
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
