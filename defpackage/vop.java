package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vop implements vdy {
    public final vok a;
    public final fcsu b;
    public final fdpl c;
    private final Set d;

    public vop(Context context, vok vokVar, fdpl fdplVar, fcsu fcsuVar) {
        context.getClass();
        fdplVar.getClass();
        fcsuVar.getClass();
        this.a = vokVar;
        this.b = fcsuVar;
        this.c = new voo(fdplVar, context, this);
        this.d = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.c;
    }
}
