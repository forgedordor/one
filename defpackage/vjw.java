package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjw implements vdy {
    public final fdjx a;
    public final fdpl b;
    private final fdpl c;
    private final Set d;

    public vjw(Context context, afzc afzcVar, fdjx fdjxVar, fdpl fdplVar) {
        context.getClass();
        afzcVar.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        this.a = fdjxVar;
        this.c = fdplVar;
        this.b = new vjv(fdplVar, context, this, afzcVar);
        this.d = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.b;
    }
}
