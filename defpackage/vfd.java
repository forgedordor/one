package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfd implements vdy {
    public final Context a;
    public final fdjx b;
    public final ajln c;
    public final cqdn d;
    public final afzc e;
    private final fdpl f;
    private final Set g;

    public vfd(Context context, fdjx fdjxVar, ajln ajlnVar, cqdn cqdnVar, afzc afzcVar, fdpl fdplVar) {
        context.getClass();
        fdjxVar.getClass();
        ajlnVar.getClass();
        cqdnVar.getClass();
        afzcVar.getClass();
        fdplVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = ajlnVar;
        this.d = cqdnVar;
        this.e = afzcVar;
        this.f = new vfb(fdplVar, this);
        this.g = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.f;
    }
}
