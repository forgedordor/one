package defpackage;

import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkg extends fdcy {
    final /* synthetic */ KeyboardDetectorViewInsetsListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkg(Object obj, KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener) {
        super(obj);
        this.a = keyboardDetectorViewInsetsListener;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpke dpkeVar = (dpke) obj2;
        dpke dpkeVar2 = (dpke) obj;
        if (dpkeVar2 instanceof dpkc) {
            ((dpkc) dpkeVar2).a.P().d(this.a);
        }
        if (!(dpkeVar instanceof dpkc)) {
            KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
            dpku dpkuVar = keyboardDetectorViewInsetsListener.b;
            dpkuVar.setOnApplyWindowInsetsListener(null);
            dpkuVar.setWindowInsetsAnimationCallback(null);
            dpkuVar.a.remove(keyboardDetectorViewInsetsListener);
            return;
        }
        lvc lvcVarP = ((dpkc) dpkeVar).a.P();
        KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener2 = this.a;
        lvcVarP.c(keyboardDetectorViewInsetsListener2);
        dpku dpkuVar2 = keyboardDetectorViewInsetsListener2.b;
        dpkuVar2.setOnApplyWindowInsetsListener(keyboardDetectorViewInsetsListener2);
        dpkuVar2.setWindowInsetsAnimationCallback(keyboardDetectorViewInsetsListener2);
        dpkuVar2.a.add(keyboardDetectorViewInsetsListener2);
        dpkuVar2.requestApplyInsets();
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
