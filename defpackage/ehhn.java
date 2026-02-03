package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhn implements eora {
    final /* synthetic */ String a;

    public ehhn(String str) {
        this.a = str;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        th.getClass();
        Log.e("MendelPackageState", this.a, th);
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
