package defpackage;

import android.os.IBinder;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbvj implements eora {
    final /* synthetic */ IBinder a;
    final /* synthetic */ fbvk b;

    public fbvj(fbvk fbvkVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = fbvkVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.g(this.a, (Status) obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.b.f(th);
    }
}
