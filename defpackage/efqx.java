package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqx extends efpb {
    static final ejvj a = new efpp();
    static final ejvj b = new efqw();
    private final Context c;

    public efqx(Context context) {
        this.c = context;
    }

    @Override // defpackage.efpb
    public final void b(cjkc cjkcVar, effl efflVar) {
        evqe evqeVar = cjkcVar.c;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        efflVar.d(evqeVar.c);
    }

    @Override // defpackage.efpb
    public final void c(cjkc cjkcVar, effl efflVar) {
        if (cjkcVar.e.isEmpty()) {
            throw new IllegalArgumentException("user required in request");
        }
        efflVar.e((RcsDestinationId) b.fM((cjju) cjkcVar.e.get(0)));
    }

    @Override // defpackage.efpb
    public final void d(effl efflVar) {
        Context context = this.c;
        Intent intent = new Intent(context, getClass());
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentG = ebsn.g(context, intent);
        pendingIntentG.getClass();
        efflVar.c(pendingIntentG);
    }
}
