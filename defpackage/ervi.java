package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervi implements ervo {
    @Override // defpackage.ervo
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
