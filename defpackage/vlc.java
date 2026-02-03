package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlc implements vdy {
    public final Context a;
    public final fdjx b;
    public final ajvr c;
    public final fdpl d;
    private final Set e;

    public vlc(Context context, fdjx fdjxVar, ajvr ajvrVar, fdpl fdplVar, fdpl fdplVar2) {
        context.getClass();
        fdjxVar.getClass();
        ajvrVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = ajvrVar;
        this.d = new fdua(fdplVar2, fdplVar, new vla(this, null));
        this.e = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.d;
    }
}
