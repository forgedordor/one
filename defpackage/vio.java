package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vio implements vdy {
    public final Context a;
    public final ajmh b;
    public final cssw c;
    public final dalj d;
    public final xtq e;
    private final fdpl f;
    private final Set g;

    public vio(Context context, zqm zqmVar, ajmh ajmhVar, xtq xtqVar, cssw csswVar, dalj daljVar) {
        context.getClass();
        zqmVar.getClass();
        ajmhVar.getClass();
        xtqVar.getClass();
        csswVar.getClass();
        daljVar.getClass();
        this.a = context;
        this.b = ajmhVar;
        this.e = xtqVar;
        this.c = csswVar;
        this.d = daljVar;
        this.f = new vin(zqmVar.a(), this);
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
}
