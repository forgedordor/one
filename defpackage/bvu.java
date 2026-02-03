package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvu extends bkl {
    public final bvj a;

    public bvu(bin binVar, bvj bvjVar) {
        super(binVar);
        this.a = bvjVar;
    }

    @Override // defpackage.bkl, defpackage.bin
    public final ListenableFuture l(final List list, int i, int i2) {
        lcg.b(list.size() == 1, "Only support one capture config.");
        final ListenableFuture listenableFutureJ = J(i);
        return bqk.a(Collections.singletonList(bqk.g(bqk.g(bqk.g(bpw.a(listenableFutureJ), new bpr() { // from class: bvr
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                return ((bep) listenableFutureJ.get()).b();
            }
        }, bpc.a()), new bpr() { // from class: bvs
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                List list2 = list;
                Integer num = (Integer) ((bjl) list2.get(0)).e.n(bjl.b, 100);
                num.getClass();
                int iIntValue = num.intValue();
                Integer num2 = (Integer) ((bjl) list2.get(0)).e.n(bjl.a, 0);
                num2.getClass();
                int iIntValue2 = num2.intValue();
                bug bugVar = this.a.a.a.b;
                return bugVar != null ? bugVar.a.c(iIntValue, iIntValue2) : new bql(new Exception("Failed to take picture: pipeline is not ready."));
            }
        }, bpc.a()), new bpr() { // from class: bvt
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                return ((bep) listenableFutureJ.get()).a();
            }
        }, bpc.a())));
    }
}
