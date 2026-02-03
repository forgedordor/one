package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vft implements vdy {
    public final cssw a;
    private final fdpl b;
    private final Set c;

    public vft(Context context, zqm zqmVar, cssw csswVar) {
        context.getClass();
        zqmVar.getClass();
        csswVar.getClass();
        this.a = csswVar;
        this.b = new vfs(zqmVar.a(), context, this, zqmVar);
        this.c = fcwm.d(zqx.b, zqx.c);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.b;
    }
}
