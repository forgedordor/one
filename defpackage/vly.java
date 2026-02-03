package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vly implements vdy {
    public final Context a;
    public final fdjx b;
    public final zqm c;
    public final vvx d;
    public final zvz e;
    private final fdpl f;
    private final Set g;

    public vly(Context context, fdjx fdjxVar, zqm zqmVar, vvx vvxVar, zvz zvzVar) {
        context.getClass();
        fdjxVar.getClass();
        zqmVar.getClass();
        vvxVar.getClass();
        zvzVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = zqmVar;
        this.d = vvxVar;
        this.e = zvzVar;
        this.f = fdsn.a(zqmVar.a(), new vlw(this, null));
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
