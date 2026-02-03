package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrd implements vdy {
    public final Context a;
    public final ahax b;
    public final xre c;
    public final fdpl d;
    private final fdpl e;
    private final Set f;

    public xrd(fdpl fdplVar, Context context, ahax ahaxVar, xre xreVar) {
        fdplVar.getClass();
        context.getClass();
        ahaxVar.getClass();
        xreVar.getClass();
        this.a = context;
        this.b = ahaxVar;
        this.c = xreVar;
        fdpl fdplVarA = fdqq.a(new xqz(fdplVar));
        this.e = fdplVarA;
        this.d = new xrc(fdplVarA, this);
        this.f = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.d;
    }
}
