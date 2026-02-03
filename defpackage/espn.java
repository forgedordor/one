package defpackage;

import android.content.pm.PackageManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espn extends fbtz {
    final /* synthetic */ ejxr a;
    final /* synthetic */ PackageManager b;
    final /* synthetic */ ekhx c;
    final /* synthetic */ Executor d;

    public espn(ejxr ejxrVar, PackageManager packageManager, ekhx ekhxVar, Executor executor) {
        this.a = ejxrVar;
        this.b = packageManager;
        this.c = ekhxVar;
        this.d = executor;
    }

    @Override // defpackage.fbtz
    public final ListenableFuture b(final int i) {
        final ejxr ejxrVar = this.a;
        final PackageManager packageManager = this.b;
        final ekhx ekhxVar = this.c;
        return eork.m(new Callable() { // from class: espm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new espl(packageManager, ekhxVar, (dcer) ejxrVar.get()).a(i);
            }
        }, this.d);
    }
}
