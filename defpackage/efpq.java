package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpq extends efor {
    static final ejvj a = new efqw();
    private final Context b;

    public efpq(Context context) {
        this.b = context;
    }

    @Override // defpackage.efor
    public final void b(cjgx cjgxVar, efdl efdlVar) {
        cjjr cjjrVar = cjgxVar.d;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        efdlVar.b(cjjrVar.c);
    }

    @Override // defpackage.efor
    public final void c(cjgx cjgxVar, efdl efdlVar) {
        evqe evqeVar = cjgxVar.c;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        efdlVar.e(evqeVar.c);
    }

    @Override // defpackage.efor
    public final void d(efdl efdlVar) {
        Context context = this.b;
        Intent intent = new Intent(context, getClass());
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentG = ebsn.g(context, intent);
        pendingIntentG.getClass();
        efdlVar.c(pendingIntentG);
    }
}
