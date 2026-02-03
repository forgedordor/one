package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhef extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;
    final /* synthetic */ BroadcastReceiver.PendingResult c;
    final /* synthetic */ dheg d;

    public dhef(dheg dhegVar, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.a = context;
        this.b = intent;
        this.c = pendingResult;
        this.d = dhegVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.d.c(this.a, this.b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
        BroadcastReceiver.PendingResult pendingResult = this.c;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
