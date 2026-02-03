package defpackage;

import java.security.KeyFactory;
import java.security.Provider;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervj implements ervo {
    @Override // defpackage.ervo
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
