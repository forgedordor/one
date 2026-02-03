package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rj extends tu {
    final /* synthetic */ rq a;
    final /* synthetic */ ru b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(ru ruVar, View view, rq rqVar) {
        super(view);
        this.b = ruVar;
        this.a = rqVar;
    }

    @Override // defpackage.tu
    public final ot a() {
        return this.a;
    }

    @Override // defpackage.tu
    public final boolean b() {
        ru ruVar = this.b;
        if (ruVar.b.x()) {
            return true;
        }
        ruVar.b();
        return true;
    }
}
