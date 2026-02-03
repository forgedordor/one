package defpackage;

import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrp extends egrk {
    public egrp(ProviderInfo providerInfo, Throwable th) {
        super("Provider exists, but could not be obtained: ".concat(providerInfo.toString()), th);
    }
}
