package defpackage;

import android.animation.AnimatorSet;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dytt implements eora {
    final WeakReference a;

    public dytt(dytu dytuVar) {
        this.a = new WeakReference(dytuVar);
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        final dytu dytuVar = (dytu) this.a.get();
        if (dytuVar != null) {
            if (bool.booleanValue()) {
                dytuVar.d();
            } else {
                dyrf.a(new Runnable() { // from class: dysy
                    @Override // java.lang.Runnable
                    public final void run() {
                        dytu dytuVar2 = dytuVar;
                        AnimatorSet animatorSet = dytuVar2.y;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        dytuVar2.h(true);
                    }
                });
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e(dytu.a, "ContinueWithAccountListener execution threw an exception", th);
    }
}
