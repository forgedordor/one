package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnca extends adz {
    final /* synthetic */ eg a;
    final /* synthetic */ dnbx b;

    public dnca(eg egVar, dnbx dnbxVar) {
        this.a = egVar;
        this.b = dnbxVar;
    }

    @Override // defpackage.adz, defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return a(context, (String) obj);
    }

    @Override // defpackage.adz
    /* renamed from: d */
    public final Intent a(Context context, String str) {
        str.getClass();
        eg egVar = this.a;
        Intent intentA = super.a(context, str);
        egVar.getPackageManager().getClass();
        intentA.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.b.a.toArray(new String[0]));
        return intentA;
    }
}
