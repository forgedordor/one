package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyzn implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        Log.e("OneGoogle", "Failed to grant account access to app");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.w("OneGoogle", "Failed to grant account access to app", th);
    }
}
