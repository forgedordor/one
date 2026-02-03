package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chz {
    public lcb a;

    final ListenableFuture a(final Object obj) {
        box.b();
        return kol.a(new koi() { // from class: chy
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                chz chzVar = this.a;
                lcb lcbVar = chzVar.a;
                if (lcbVar != null) {
                    kog kogVar2 = (kog) lcbVar.a;
                    kogVar2.getClass();
                    kogVar2.d();
                }
                Object obj2 = obj;
                chzVar.a = new lcb(kogVar, obj2);
                Objects.toString(obj2);
                return "PendingValue ".concat(obj2.toString());
            }
        });
    }

    final void b(akv akvVar) {
        box.b();
        lcb lcbVar = this.a;
        if (lcbVar != null) {
            ListenableFuture listenableFuture = (ListenableFuture) akvVar.a(lcbVar.b);
            kog kogVar = (kog) this.a.a;
            kogVar.getClass();
            bqk.j(listenableFuture, kogVar);
            this.a = null;
        }
    }
}
