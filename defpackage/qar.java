package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qar extends qas {
    public final int a;

    public qar(int i) {
        this.a = i;
    }

    @Override // defpackage.qas
    public final void a(String str, String str2) {
        if (this.a <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // defpackage.qas
    public final void b(String str, String str2, Throwable th) {
        if (this.a <= 3) {
            Log.d(str, str2, th);
        }
    }
}
