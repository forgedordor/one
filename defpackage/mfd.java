package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfd implements mfe {
    @Override // defpackage.mfe
    public final void a(String str, String str2, Throwable th) {
        Log.d(str, mff.a(str2, th));
    }

    @Override // defpackage.mfe
    public final void b(String str, String str2, Throwable th) {
        Log.e(str, mff.a(str2, th));
    }

    @Override // defpackage.mfe
    public final void c(String str, String str2, Throwable th) {
        Log.w(str, mff.a(str2, th));
    }
}
