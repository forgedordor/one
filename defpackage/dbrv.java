package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbrv implements lzf {
    final /* synthetic */ SignInHubActivity a;

    public dbrv(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // defpackage.lzf
    public final lzp a(int i, Bundle bundle) {
        return new dbrj(this.a, dcfq.a());
    }

    @Override // defpackage.lzf
    public final /* bridge */ /* synthetic */ void b(lzp lzpVar, Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.n, signInHubActivity.o);
        signInHubActivity.finish();
    }

    @Override // defpackage.lzf
    public final void c(lzp lzpVar) {
    }
}
