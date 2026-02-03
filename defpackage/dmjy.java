package defpackage;

import android.app.admin.DevicePolicyManager;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmjy implements dmiw {
    public final eg a;
    private adj b;
    private final fctc c;

    public dmjy(eg egVar) {
        egVar.getClass();
        this.a = egVar;
        this.c = fctd.a(new fdae() { // from class: dmjw
            @Override // defpackage.fdae
            public final Object invoke() {
                Object systemService = this.a.a.getSystemService("device_policy");
                systemService.getClass();
                return (DevicePolicyManager) systemService;
            }
        });
    }

    @Override // defpackage.dmiw
    public final void a(View view) {
        if (this.b == null) {
            throw new IllegalStateException("onCreate() must be called before launch() is invoked");
        }
        if (((DevicePolicyManager) this.c.a()).getCameraDisabled(null)) {
            dpgx.g(this.a, R.string.camera_disabled_by_device_policy);
            return;
        }
        kun kunVarB = kun.b(view, view.getWidth(), view.getHeight());
        adj adjVar = this.b;
        if (adjVar == null) {
            fdbq.c("launcher");
            adjVar = null;
        }
        adjVar.a(null, kunVarB);
    }

    @Override // defpackage.dmiw
    public final void b(final fdap fdapVar) {
        this.b = this.a.h.b("compose_launch_camera_activity", dmjx.a, new adi() { // from class: dmjv
            @Override // defpackage.adi
            public final void a(Object obj) {
                dojw dojwVar = (dojw) obj;
                if (dojwVar != null) {
                    fdapVar.invoke(dojwVar);
                }
            }
        });
    }
}
