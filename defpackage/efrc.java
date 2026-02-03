package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efrc extends efpg {
    static final ejvj a = new efpp();
    private final Context b;

    public efrc(Context context) {
        this.b = context;
    }

    @Override // defpackage.efpg
    public final void b(cjma cjmaVar, efgj efgjVar) {
        evqe evqeVar = cjmaVar.c;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        efgjVar.d(evqeVar.c);
    }

    @Override // defpackage.efpg
    public final void c(efgj efgjVar) {
        Context context = this.b;
        Intent intent = new Intent(context, getClass());
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentG = ebsn.g(context, intent);
        pendingIntentG.getClass();
        efgjVar.c(pendingIntentG);
    }
}
