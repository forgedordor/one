package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isw extends fdbr implements fdap {
    final /* synthetic */ kkt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isw(kkt kktVar) {
        super(1);
        this.a = kktVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = this.a.dispatchTouchEvent(motionEvent);
                break;
            default:
                zDispatchTouchEvent = this.a.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
