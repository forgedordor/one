package defpackage;

import java.security.Provider;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervl implements ervo {
    @Override // defpackage.ervo
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
