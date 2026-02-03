package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egob implements eora {
    final /* synthetic */ String a;

    public egob(String str) {
        this.a = str;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof TimeoutException) {
            ((ekrd) ((ekrd) ((ekrd) egoc.a.j()).g(th)).h("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 192, "AndroidFutures.java")).t("exceeded timeout: %s", this.a);
        }
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
