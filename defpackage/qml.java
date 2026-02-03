package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qml extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ qaq d;
    final /* synthetic */ qgr e;
    final /* synthetic */ qjn f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qml(qaq qaqVar, qgr qgrVar, qjn qjnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = qaqVar;
        this.e = qgrVar;
        this.f = qjnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qml) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r1v5, types: [fdlr] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        ListenableFuture listenableFuture;
        ?? r4;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.c;
        try {
            try {
                if (r1 != 0) {
                    Object obj2 = this.b;
                    r4 = this.a;
                    atomicInteger = (AtomicInteger) this.g;
                    try {
                        fctl.b(obj);
                        r1 = obj2;
                        r4 = r4;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        listenableFuture = r4;
                        String str = qmt.a;
                        qaq qaqVar = this.d;
                        qas.c().b(str, "Delegated worker " + qaqVar.getClass() + " was cancelled", cancellationException);
                        int i = atomicInteger.get();
                        if (listenableFuture.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                } else {
                    fctl.b(obj);
                    fdjx fdjxVar = (fdjx) this.g;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    ListenableFuture listenableFutureB = this.d.b();
                    listenableFutureB.getClass();
                    fdlr fdlrVarD = fdil.d(fdjxVar, null, null, new qmk(this.e, this.f, atomicInteger2, listenableFutureB, null), 3);
                    try {
                        this.g = atomicInteger2;
                        this.a = listenableFutureB;
                        this.b = fdlrVarD;
                        this.c = 1;
                        obj = koo.a(listenableFutureB, this);
                        if (obj == fcylVar) {
                            return fcylVar;
                        }
                        atomicInteger = atomicInteger2;
                        r4 = listenableFutureB;
                        r1 = fdlrVarD;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        atomicInteger = atomicInteger2;
                        listenableFuture = listenableFutureB;
                        String str2 = qmt.a;
                        qaq qaqVar2 = this.d;
                        qas.c().b(str2, "Delegated worker " + qaqVar2.getClass() + " was cancelled", cancellationException);
                        int i2 = atomicInteger.get();
                        if (listenableFuture.isCancelled() || i2 == -256) {
                            throw cancellationException;
                        }
                        throw new qmh(atomicInteger.get());
                    }
                }
                qap qapVar = (qap) obj;
                r1.t(null);
                return qapVar;
            } catch (Throwable th) {
                String str3 = qmt.a;
                qaq qaqVar3 = this.d;
                qas.c().b(str3, "Delegated worker " + qaqVar3.getClass() + " threw exception in startWork.", th);
                throw th;
            }
        } catch (Throwable th2) {
            r1.t(null);
            throw th2;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        qml qmlVar = new qml(this.d, this.e, this.f, fcxyVar);
        qmlVar.g = obj;
        return qmlVar;
    }
}
