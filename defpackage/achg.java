package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achg implements achf {
    private final achu a;
    private final dakl b;

    public achg(achu achuVar, dakl daklVar) {
        this.a = achuVar;
        this.b = daklVar;
    }

    @Override // defpackage.achf
    public final void a(Activity activity) {
        this.b.i(R.string.conversation_list_dismiss_toast);
    }

    @Override // defpackage.achf
    public final void b(Activity activity) {
        this.a.d(activity, "deregister_imessage");
    }
}
