package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajga {
    public final dzuc a;

    public ajga(dzuc dzucVar) {
        this.a = dzucVar;
    }

    public final eiju a(final dzub dzubVar, eiju eijuVar, final dzfh dzfhVar) {
        ejvr ejvrVar = new ejvr() { // from class: ajfy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.a.f(dzubVar, dzfhVar, null, dzua.SUCCESS);
                return obj;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVar.h(ejvrVar, eoqgVar).f(Throwable.class, new eooz() { // from class: ajfz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.a.f(dzubVar, dzfhVar, null, dzua.ERROR);
                return eijx.d((Throwable) obj);
            }
        }, eoqgVar);
    }
}
