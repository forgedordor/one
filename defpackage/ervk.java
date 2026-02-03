package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervk implements ervo {
    @Override // defpackage.ervo
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
