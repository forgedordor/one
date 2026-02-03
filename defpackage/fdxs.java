package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxs {
    public static final ListenableFuture a(final fdkf fdkfVar) {
        final fdxl fdxlVar = new fdxl(fdkfVar);
        fdkfVar.hK(new fdap() { // from class: fdxn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdxl fdxlVar2 = fdxlVar;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    fdxlVar2.a(fdkfVar.d());
                } else {
                    fdxlVar2.c(th);
                }
                return fctx.a;
            }
        });
        return fdxlVar;
    }

    public static final ListenableFuture b(fdjx fdjxVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar) {
        if (fdjzVar.b()) {
            Objects.toString(fdjzVar);
            throw new IllegalArgumentException(String.valueOf(fdjzVar).concat(" start is not supported"));
        }
        fdxm fdxmVar = new fdxm(fdjn.b(fdjxVar, fcyhVar));
        fdjzVar.a(fdatVar, fdxmVar, fdxmVar);
        return fdxmVar.b;
    }

    public static final Object c(ListenableFuture listenableFuture, fcxy fcxyVar) {
        try {
            if (listenableFuture.isDone()) {
                return eote.a(listenableFuture);
            }
            fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar.B();
            listenableFuture.b(new fdxt(listenableFuture, fdiuVar), eoqg.a);
            fdiuVar.d(new fdxr(listenableFuture));
            Object objM = fdiuVar.m();
            if (objM == fcyl.a) {
                fcxyVar.getClass();
            }
            return objM;
        } catch (ExecutionException e) {
            throw d(e);
        }
    }

    public static final Throwable d(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fdkf e(final ListenableFuture listenableFuture) {
        Throwable thJ;
        if ((listenableFuture instanceof eotf) && (thJ = ((eotf) listenableFuture).j()) != null) {
            fdjd fdjdVar = new fdjd();
            fdjdVar.a(thJ);
            return fdjdVar;
        }
        if (!listenableFuture.isDone()) {
            fdjd fdjdVar2 = new fdjd();
            eork.r(listenableFuture, new fdxp(fdjdVar2), eoqg.a);
            fdjdVar2.hK(new fdap() { // from class: fdxo
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    listenableFuture.cancel(false);
                    return fctx.a;
                }
            });
            return new fdxq(fdjdVar2);
        }
        try {
            return fdje.a(eote.a(listenableFuture));
        } catch (CancellationException e) {
            fdjd fdjdVar3 = new fdjd();
            fdjdVar3.t(e);
            return fdjdVar3;
        } catch (ExecutionException e2) {
            fdjd fdjdVar4 = new fdjd();
            fdjdVar4.a(d(e2));
            return fdjdVar4;
        }
    }
}
