package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rsh implements rvc {
    final /* synthetic */ Context a;

    public rsh(Context context) {
        this.a = context;
    }

    @Override // defpackage.rvc
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
