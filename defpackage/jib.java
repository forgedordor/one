package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jib extends fdbr implements fdap {
    final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jib(AndroidComposeView androidComposeView) {
        super(1);
        this.a = androidComposeView;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AndroidComposeView androidComposeView = this.a;
        final fdae fdaeVar = (fdae) obj;
        Handler handler = androidComposeView.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            fdaeVar.invoke();
        } else {
            Handler handler2 = androidComposeView.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: jia
                    @Override // java.lang.Runnable
                    public final void run() {
                        fdaeVar.invoke();
                    }
                });
            }
        }
        return fctx.a;
    }
}
