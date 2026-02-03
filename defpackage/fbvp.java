package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvp implements fbso {
    @Override // defpackage.fbso
    public final fbsl a(fbsm fbsmVar, fbrg fbrgVar, fbsn fbsnVar) {
        ListenableFuture listenableFutureH;
        Status statusWithDescription;
        fbvr fbvrVar = (fbvr) fbsmVar.f().a(fbvs.a);
        fbrk fbrkVarD = fbsmVar.d();
        String str = fbrkVarD.c;
        boolean z = fbrkVarD.f;
        if (!z || (listenableFutureH = (ListenableFuture) fbvrVar.b.get(str)) == null) {
            fbue fbueVar = fbvrVar.d;
            int i = fbvrVar.a;
            fbut fbutVar = fbueVar.a;
            fbur fburVar = (fbur) fbutVar.b.getOrDefault(str, fbutVar.a);
            if (fburVar instanceof fbtz) {
                listenableFutureH = ((fbtz) fburVar).b(i);
            } else {
                try {
                    listenableFutureH = eork.i(fburVar.a(i));
                } catch (Exception e) {
                    listenableFutureH = eork.h(e);
                }
            }
            if (z) {
                fbvrVar.b.putIfAbsent(str, listenableFutureH);
                eork.r(listenableFutureH, new fbvq(fbvrVar, str, listenableFutureH), eoqg.a);
            }
        }
        if (!listenableFutureH.isDone()) {
            Executor executor = fbvrVar.c;
            fbwy fbwyVar = new fbwy();
            eork.r(listenableFutureH, new fbvo(fbsmVar, fbwyVar, fbrgVar, fbsnVar), executor);
            return fbwyVar;
        }
        try {
            statusWithDescription = (Status) eork.q(listenableFutureH);
        } catch (CancellationException | ExecutionException e2) {
            Status statusD = Status.o.d(e2);
            String message = e2.getMessage();
            statusWithDescription = message != null ? statusD.withDescription(message) : statusD;
        }
        if (statusWithDescription.f()) {
            return fbsnVar.a(fbsmVar, fbrgVar);
        }
        fbsmVar.a(statusWithDescription, new fbrg());
        return new fbvn();
    }
}
