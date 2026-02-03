package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efrb extends efpf {
    static final ejvj a = new efpp();
    private final Context b;

    public efrb(Context context) {
        this.b = context;
    }

    @Override // defpackage.efpf
    public final void b(cjls cjlsVar, efge efgeVar) {
        evqe evqeVar = cjlsVar.c;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        efgeVar.d(evqeVar.c);
    }

    @Override // defpackage.efpf
    public final void c(efge efgeVar) {
        Context context = this.b;
        Intent intent = new Intent(context, getClass());
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentG = ebsn.g(context, intent);
        pendingIntentG.getClass();
        efgeVar.c(pendingIntentG);
    }
}
