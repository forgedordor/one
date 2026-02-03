package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tix {
    private final eg a;

    public tix(eg egVar) {
        this.a = egVar;
    }

    public final String a(String str, Optional optional, Optional optional2, boolean z) {
        int i;
        if (!z && optional.isPresent() && optional2.isPresent()) {
            ejwl.i(((Boolean) optional.get()).booleanValue() == ((Boolean) optional2.get()).booleanValue(), "Both block & spam statuses were set, but the updated values were inconsistent. Values were block: %s spam: %s", optional.get(), optional2.get());
        }
        if (optional.isPresent() && optional2.isPresent()) {
            i = ((Boolean) optional.get()).booleanValue() ? R.string.blocked_and_reported_toast_message : R.string.unblock_and_report_not_spam_snackbar_message;
        } else if (optional.isPresent()) {
            i = ((Boolean) optional.get()).booleanValue() ? R.string.blocked_toast_message : R.string.unblock_snackbar_message;
        } else {
            ejwl.l(optional2.isPresent());
            i = ((Boolean) optional2.get()).booleanValue() ? R.string.report_spam_snackbar_message : R.string.report_not_spam_snackbar_message;
        }
        return this.a.getString(i, new Object[]{str});
    }

    public final void b(tiw tiwVar) {
        c(tiwVar, false);
    }

    public final void c(final tiw tiwVar, boolean z) {
        eg egVar = this.a;
        if (egVar.isFinishing()) {
            return;
        }
        tis tisVar = (tis) tiwVar;
        String strA = a(tisVar.a, tisVar.b, tisVar.c, z);
        View rootView = egVar.getWindow().getDecorView().getRootView();
        View viewFindViewById = egVar.findViewById(tisVar.e);
        if (!tisVar.d.isPresent()) {
            Snackbar snackbarQ = Snackbar.q(rootView, strA, 0);
            snackbarQ.m(viewFindViewById);
            snackbarQ.i();
        } else {
            Snackbar snackbarQ2 = Snackbar.q(rootView, strA, 0);
            snackbarQ2.v(R.string.snack_bar_undo, new View.OnClickListener() { // from class: tiu
                /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Runnable] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((tis) tiwVar).d.get().run();
                }
            });
            snackbarQ2.m(viewFindViewById);
            snackbarQ2.i();
        }
    }
}
