package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efon extends efoo {
    static final ejvj a = new efpp();
    static final ejvj b = new efqw();
    private final Context c;

    public efon(Context context) {
        this.c = context;
    }

    @Override // defpackage.efoo
    public final void a(cjgh cjghVar, efbb efbbVar) {
        evqe evqeVar = cjghVar.c;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        efbbVar.d(evqeVar.c);
    }

    @Override // defpackage.efoo
    public final void b(cjgh cjghVar, efbb efbbVar) {
        if (cjghVar.e.isEmpty()) {
            throw new IllegalArgumentException("user required in request");
        }
        efbbVar.e((RcsDestinationId) b.fM((cjju) cjghVar.e.get(0)));
    }

    @Override // defpackage.efoo
    public final void c(efbb efbbVar) {
        Context context = this.c;
        Intent intent = new Intent(context, getClass());
        ClipData clipData = ebsn.a;
        PendingIntent pendingIntentG = ebsn.g(context, intent);
        pendingIntentG.getClass();
        efbbVar.c(pendingIntentG);
    }
}
