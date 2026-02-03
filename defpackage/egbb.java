package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbb {
    private final Activity a;

    public egbb(Activity activity) {
        this.a = activity;
    }

    static void b(Intent intent, boolean z) {
        intent.putExtra("$tiktok$canRestartAccountSelector", z);
    }

    private final void d(Intent intent) {
        efxb efxbVar;
        Activity activity = this.a;
        if (efxc.a(activity.getIntent())) {
            Intent intent2 = activity.getIntent();
            intent2.getClass();
            if (!efxc.a(intent2)) {
                throw new IllegalStateException("AccountOperationContext not stored in the intent");
            }
            Object objA = kxl.a(intent2, "tiktok_account_operation_contexts", efxb.class);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            efxbVar = (efxb) objA;
        } else {
            efxbVar = null;
        }
        if (efxbVar != null) {
            intent.getClass();
            intent.putExtra("tiktok_account_operation_contexts", efxbVar);
        }
    }

    public final void a() {
        Intent intentPutExtra = new Intent().putExtra("account_error", new efyn());
        d(intentPutExtra);
        Activity activity = this.a;
        activity.setResult(0, intentPutExtra);
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    public final void c(efwo efwoVar) {
        Intent intentPutExtra = new Intent().putExtra("new_account_id", efwoVar.a());
        d(intentPutExtra);
        Activity activity = this.a;
        activity.setResult(-1, intentPutExtra);
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
