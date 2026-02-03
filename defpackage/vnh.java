package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vnh implements vdy {
    public final Context a;
    public final ajmh b;
    public final fdjx c;
    public final zqm d;
    public final aaft e;
    private final fdpl f;
    private final Set g;

    public vnh(Context context, ajmh ajmhVar, fdjx fdjxVar, zqm zqmVar, aaft aaftVar) {
        context.getClass();
        ajmhVar.getClass();
        fdjxVar.getClass();
        zqmVar.getClass();
        aaftVar.getClass();
        this.a = context;
        this.b = ajmhVar;
        this.c = fdjxVar;
        this.d = zqmVar;
        this.e = aaftVar;
        this.f = new vne(zqmVar.a(), this);
        this.g = fcwm.b(zqx.b);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.g;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.f;
    }

    public final void c(ajlt ajltVar) {
        auvw.k(this.c, null, null, new vnf(this, ajltVar, null), 3);
    }
}
