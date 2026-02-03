package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dytw {
    public Context c;

    public abstract dtah a();

    public abstract dyrj b();

    public abstract dytx c();

    public abstract ejwi d();

    public abstract ejwi e();

    public abstract void f(dxyj dxyjVar);

    public abstract void g(ExecutorService executorService);

    public abstract void h(dyax dyaxVar);

    public abstract void i(dyue dyueVar);

    public abstract void j(dywb dywbVar);

    public abstract void k(dtah dtahVar);

    public abstract void l(dyyb dyybVar);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    public final dytx m() {
        if (!d().g()) {
            g(Executors.newCachedThreadPool(dyql.a()));
        }
        ?? C = d().c();
        dyax dyaxVar = new dyax(((dyrm) b()).a);
        h(dyaxVar);
        i(new dyue(dyaxVar, ((dyrm) b()).a));
        dxyj dxyjVar = ((dyrm) b()).c;
        if (dxyjVar == null) {
            ((dyrm) b()).b.getClass();
            f(new dxyw(this.c, C, ((dyrm) b()).a, ((dyrm) b()).b));
        } else {
            f(dxyjVar);
        }
        if (!e().g()) {
            j(new dywa(((dyrm) b()).a, this.c));
        }
        dtah dtahVarA = a();
        if (!(dtahVarA instanceof dtag)) {
            l(new dyye(((dyrm) b()).a, dyaxVar, dtahVarA, new ejxr() { // from class: dyyc
                @Override // defpackage.ejxr
                public final Object get() {
                    return null;
                }
            }));
        }
        return c();
    }
}
