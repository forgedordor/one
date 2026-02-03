package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auvw {
    public static final eiju a(fdkf fdkfVar) {
        eiju eijuVarG = eiju.g(fdxs.a(fdkfVar));
        eijuVarG.getClass();
        return eijuVarG;
    }

    public static final eiju b(fdap fdapVar, fdjx fdjxVar) {
        fcyi fcyiVar = fcyi.a;
        return a(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new auvn(null, fdapVar)));
    }

    public static final eiju c(fdjx fdjxVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar) {
        fdjxVar.getClass();
        fdjzVar.getClass();
        if (fdjzVar != fdjz.b) {
            return a(fdin.b(fdjxVar, eicg.a(fcyhVar), fdjzVar, new auvo(fdatVar, null)));
        }
        throw new IllegalArgumentException("CoroutineStart.LAZY is not supported for asyncFuture(). Split into separate async {} and asFuture() calls.");
    }

    public static final Object d(ListenableFuture listenableFuture, fcxy fcxyVar) {
        return fdxs.c(listenableFuture, fcxyVar);
    }

    public static final fdkf e(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return fdxs.e(listenableFuture);
    }

    public static final fdpl f(eiju eijuVar) {
        return new fdui(new auvm(eijuVar, null));
    }

    public static final fdpl g(fdae fdaeVar) {
        return new fdui(new auvq(fdaeVar, null));
    }

    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$4(ClassGen.java:364)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:365)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
     */
    public static /* synthetic */ eiju h(fdjx fdjxVar, fdat fdatVar) {
        return c(fdjxVar, fcyi.a, fdjz.a, fdatVar);
    }

    public static /* synthetic */ eiju i(fdjx fdjxVar, fdat fdatVar) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        fdjzVar.getClass();
        if (fdjzVar != fdjz.b) {
            return a(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new auvp(fdatVar, null))).h(new ejvr() { // from class: auvj
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return null;
                }
            }, eoqg.a);
        }
        throw new IllegalArgumentException("CoroutineStart.LAZY is not supported for asyncFuture(). Split into separate async {} and asFuture() calls.");
    }

    public static /* synthetic */ eopy j(fdjx fdjxVar, fdat fdatVar) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        fdjzVar.getClass();
        return new eopy(c(fdjxVar, fcyiVar, fdjzVar, fdatVar));
    }

    public static /* synthetic */ fdlr k(fdjx fdjxVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar, int i) {
        if ((i & 1) != 0) {
            fcyhVar = fcyi.a;
        }
        if ((i & 2) != 0) {
            fdjzVar = fdjz.a;
        }
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjzVar.getClass();
        fdatVar.getClass();
        return o(fdjxVar, auvs.a, fcyhVar, fdjzVar, fdatVar);
    }

    public static /* synthetic */ fdlr l(fdjx fdjxVar, fdat fdatVar) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        fdjzVar.getClass();
        return o(fdjxVar, new fdaw() { // from class: auvl
            @Override // defpackage.fdaw
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                fdjx fdjxVar2 = (fdjx) obj;
                fcyh fcyhVar = (fcyh) obj3;
                fdjz fdjzVar2 = (fdjz) obj4;
                fdjxVar2.getClass();
                ((eieg) obj2).getClass();
                fcyhVar.getClass();
                fdjzVar2.getClass();
                return fdin.c(fdjxVar2, fcyhVar, fdjzVar2, new eich((fdat) obj5, null));
            }
        }, fcyiVar, fdjzVar, fdatVar);
    }

    public static /* synthetic */ fdlr m(fdjx fdjxVar, fcyh fcyhVar, fdat fdatVar, int i) {
        if ((i & 1) != 0) {
            fcyhVar = fcyi.a;
        }
        fdjz fdjzVar = fdjz.a;
        fdjxVar.getClass();
        fcyhVar.getClass();
        fdjzVar.getClass();
        return o(fdjxVar, auvu.a, fcyhVar, fdjzVar, fdatVar);
    }

    public static /* synthetic */ void n(eiju eijuVar) {
        Level level = Level.WARNING;
        level.getClass();
        eijuVar.k(new auvv(level), eoqg.a);
    }

    private static final fdlr o(fdjx fdjxVar, fdaw fdawVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar) {
        final auws auwsVar = new auws();
        fdlr fdlrVar = (fdlr) fdawVar.a(fdjxVar, eieg.a, fcyhVar, fdjzVar, fdatVar);
        fdlrVar.hK(new fdap() { // from class: auvi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException)) {
                    final Throwable thInitCause = auwsVar.initCause(th);
                    thInitCause.getClass();
                    ecem.a().post(new Runnable() { // from class: auvk
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            throw thInitCause;
                        }
                    });
                }
                return fctx.a;
            }
        });
        return fdlrVar;
    }
}
