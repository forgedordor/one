package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vky implements vdy {
    public final Context a;
    public final afzc b;
    public final fdpl c;
    private final Set d;

    public vky(Context context, afzc afzcVar, fdpl fdplVar, fdpl fdplVar2) {
        context.getClass();
        afzcVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        this.a = context;
        this.b = afzcVar;
        this.c = new fdua(fdplVar2, fdplVar, new vkx(this, null));
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
