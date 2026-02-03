package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsq {
    public final fduf a;
    public final fdvc b;
    private final Context c;
    private final OrientationEventListener d;

    public dmsq(Context context) {
        context.getClass();
        this.c = context;
        fduf fdufVarA = fdvf.a(dmso.a);
        this.a = fdufVarA;
        this.b = new fduh(fdufVarA);
        this.d = new dmsp(this, context);
    }

    public final void a() {
        this.d.enable();
    }

    public final void b() {
        this.d.disable();
    }
}
