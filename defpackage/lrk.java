package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lrk extends lpu implements Runnable {
    private final Reference a;

    public lrk(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.lpu
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        lrl.a((EditText) this.a.get(), 1);
    }
}
