package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmlp implements fdap {
    final /* synthetic */ fdae a;

    public dmlp(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEvent = ((iqh) obj).a;
        keyEvent.getClass();
        if (iqg.a(iqj.b(keyEvent), iqg.j) || iqg.a(iqj.b(keyEvent), iqg.i)) {
            this.a.invoke();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
