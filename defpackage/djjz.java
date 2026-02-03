package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjz implements fdap {
    final /* synthetic */ fdae a;

    public djjz(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iqh) obj).a;
        keyEvent.getClass();
        if (iqg.a(iqj.b(keyEvent), iqg.n) && iqi.a(iqj.a(keyEvent), 2)) {
            this.a.invoke();
        }
        return false;
    }
}
