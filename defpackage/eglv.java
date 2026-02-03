package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eglv implements efzg, efzh {
    private final Context a;

    public eglv(Context context) {
        this.a = context;
    }

    @Override // defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        return eork.i(new Intent(this.a, (Class<?>) ExpressSignInActivity.class));
    }

    @Override // defpackage.efzg
    public final /* synthetic */ ListenableFuture b(Intent intent) {
        return eork.i(intent);
    }
}
