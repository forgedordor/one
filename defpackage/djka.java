package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djka implements fdap {
    final /* synthetic */ fdae a;

    public djka(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((iqh) obj).a;
        keyEvent.getClass();
        if (iqg.a(iqj.b(keyEvent), iqg.n)) {
            this.a.invoke();
        }
        return false;
    }
}
