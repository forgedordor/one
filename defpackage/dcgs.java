package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgs extends dchr {
    final /* synthetic */ Dialog a;
    final /* synthetic */ dcgt b;

    public dcgs(dcgt dcgtVar, Dialog dialog) {
        this.a = dialog;
        this.b = dcgtVar;
    }

    @Override // defpackage.dchr
    public final void a() {
        this.b.a.b();
        Dialog dialog = this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
