package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vis implements vdy {
    public final Context a;
    public final afzc b;
    public final ajlu c;
    public final fdjx d;
    public final fdpl e;
    private final Set f;

    public vis(Context context, afzc afzcVar, fdpl fdplVar, fdpl fdplVar2, ajlu ajluVar, fdjx fdjxVar) {
        context.getClass();
        afzcVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        ajluVar.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = afzcVar;
        this.c = ajluVar;
        this.d = fdjxVar;
        this.e = new fdua(fdplVar2, fdplVar, new viq(this, null));
        this.f = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.f;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.e;
    }
}
