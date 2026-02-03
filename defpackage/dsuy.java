package defpackage;

import android.app.Activity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsuy extends dsuz {
    private final ejvr d;
    private final dsxb e;
    private final dsvx f;

    public dsuy(dsvc dsvcVar, ejvr ejvrVar, dsxb dsxbVar, dsvx dsvxVar) {
        super(dsvcVar);
        this.d = ejvrVar;
        this.e = dsxbVar;
        this.f = dsvxVar;
    }

    @Deprecated
    public final dsvd a() {
        return (dsvd) this.d.apply(e(this.e));
    }

    @Deprecated
    public final dsvd b(View view) {
        dsvx dsvxVar = this.f;
        dsvxVar.getClass();
        return dsvxVar.b(view, this);
    }

    @Deprecated
    public final void c(View view) {
        dsvx dsvxVar = this.f;
        dsvxVar.getClass();
        dsvxVar.e(view, this);
    }

    @Deprecated
    public final void d(Activity activity) {
        dsvx dsvxVar = this.f;
        dsvxVar.getClass();
        dsvxVar.f(activity, this);
    }
}
