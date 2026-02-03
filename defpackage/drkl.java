package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drkl implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ drkm c;

    public drkl(drkm drkmVar, String str, ListenableFuture listenableFuture) {
        this.a = str;
        this.b = listenableFuture;
        this.c = drkmVar;
    }

    private final void c() {
        drkm drkmVar = this.c;
        synchronized (drkmVar) {
            HashMap map = drkmVar.b;
            String str = this.a;
            if (((ListenableFuture) map.get(str)) == this.b) {
                map.remove(str);
            }
        }
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        c();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        c();
    }
}
