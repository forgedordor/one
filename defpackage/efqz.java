package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqz extends efpd {
    static final ejvj a = new efra();
    static final ejvj b = new efqg();
    static final ejvj c = new efqs();
    static final ejvj d = new efpp();
    static final ejvj e = new efqt();
    private final Context f;

    public efqz(Context context) {
        this.f = context;
    }

    @Override // defpackage.efpd
    public final void b(cjlg cjlgVar, effw effwVar) {
        evqe evqeVar = cjlgVar.c;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        effwVar.g(evqeVar.c);
    }

    @Override // defpackage.efpd
    public final void c(effw effwVar) {
        Context context = this.f;
        Intent intent = new Intent(context, getClass());
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentG = ebsn.g(context, intent);
        pendingIntentG.getClass();
        effwVar.c(pendingIntentG);
    }
}
