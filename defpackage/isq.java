package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class isq extends fdbr implements fdap {
    final /* synthetic */ iss a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isq(iss issVar) {
        super(1);
        this.a = issVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.d().invoke((MotionEvent) obj);
        return fctx.a;
    }
}
