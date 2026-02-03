package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zk implements View.OnClickListener {
    final nm a;
    final /* synthetic */ zm b;

    public zk(zm zmVar) {
        this.b = zmVar;
        this.a = new nm(zmVar.a.getContext(), zmVar.d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zm zmVar = this.b;
        Window.Callback callback = zmVar.e;
        if (callback == null || !zmVar.f) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
