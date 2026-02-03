package defpackage;

import android.app.Activity;
import android.os.UserManager;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.PermissionCheckActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujw extends cujx {
    public TextView a;
    public TextView b;
    public final cmwj c;
    public final cldx d;
    public final UserManager e;
    public final Activity f;
    public final caxb g;
    private final crma i;
    private final fcsu j;
    private final avmp k;
    private final cukm l;

    public cujw(cmwj cmwjVar, crma crmaVar, fcsu fcsuVar, avmp avmpVar, cldx cldxVar, cukm cukmVar, UserManager userManager, PermissionCheckActivity permissionCheckActivity, caxb caxbVar) {
        this.c = cmwjVar;
        this.i = crmaVar;
        this.j = fcsuVar;
        this.k = avmpVar;
        this.d = cldxVar;
        this.l = cukmVar;
        this.e = userManager;
        this.f = permissionCheckActivity;
        this.g = caxbVar;
    }

    public final void a() {
        Activity activity = this.f;
        if (activity.isFinishing()) {
            return;
        }
        this.k.i(activity);
        activity.finish();
        activity.setTitle("");
    }

    public final void b() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        Activity activity = this.f;
        ((TextView) activity.findViewById(R.id.enable_permission_title)).setText(R.string.required_permissions_no_promptable_title);
        ((TextView) activity.findViewById(R.id.enable_permission_procedure)).setText(R.string.required_permissions_no_promptable_promo);
    }

    public final void c() {
        if (this.i.j()) {
            a();
        } else {
            ((crmg) this.j.b()).f(new cujv(this));
        }
    }

    public final boolean d() {
        if (this.l.d()) {
            return false;
        }
        a();
        return true;
    }
}
