package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iso extends fdbr implements fdap {
    final /* synthetic */ isr a;
    final /* synthetic */ iss b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iso(isr isrVar, iss issVar) {
        super(1);
        this.a = isrVar;
        this.b = issVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        if (motionEvent.getActionMasked() == 0) {
            this.a.d = true != ((Boolean) this.b.d().invoke(motionEvent)).booleanValue() ? 3 : 2;
        } else {
            this.b.d().invoke(motionEvent);
        }
        return fctx.a;
    }
}
