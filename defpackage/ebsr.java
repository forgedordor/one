package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebsr extends ebsz {
    final /* synthetic */ String a;

    public ebsr(String str) {
        this.a = str;
    }

    @Override // defpackage.ebsz
    protected final int a(Context context, ebsy ebsyVar, boolean z) {
        ProviderInfo providerInfo = ebsyVar.b;
        if (context.getPackageName().equals(providerInfo.packageName)) {
            return z ? 1 : 2;
        }
        if (z) {
            return 2;
        }
        return !this.a.equals(providerInfo.packageName) ? 3 : 1;
    }
}
