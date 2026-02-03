package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkm implements efze, efzf {
    public egkm() {
        Boolean bool = false;
        bool.getClass();
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        ListenableFuture listenableFutureI;
        eieu eieuVarK = eiiy.k("Get Intent Account");
        try {
            Intent intent = ((egal) efziVar).a;
            if (efyp.d(intent)) {
                int intExtra = intent.getIntExtra("account_id", -1);
                if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    ((ekrd) ((ekrd) efyp.a.i()).h("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 106, "AccountIntents.java")).q("AccountId was manually propagated. Use AccountIntents instead.");
                }
                listenableFutureI = eork.i(intExtra != -1 ? efwo.b(intExtra) : null);
            } else {
                listenableFutureI = eork.i(null);
            }
            eieuVarK.close();
            return listenableFutureI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        return eork.i(null);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }
}
