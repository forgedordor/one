package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcds extends ddmy {
    final /* synthetic */ dcdt a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcds(dcdt dcdtVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = dcdtVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        dcdt dcdtVar = this.a;
        Context context = this.b;
        int iG = dcdtVar.g(context);
        if (dceq.g(iG)) {
            dcdtVar.b(context, iG);
        }
    }
}
