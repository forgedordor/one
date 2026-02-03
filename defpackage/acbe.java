package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acbe implements egps<Void, String> {
    final /* synthetic */ acbj a;

    public acbe(acbj acbjVar) {
        this.a = acbjVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        View view = this.a.c.Q;
        view.getClass();
        Snackbar.p(view, R.string.bugle_add_account_error, 0).i();
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
