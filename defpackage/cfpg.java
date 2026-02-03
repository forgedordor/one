package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cfpg implements eooz {
    public final /* synthetic */ cfpk a;

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        final cfpk cfpkVar = this.a;
        String str = cfpkVar.g;
        final ezns eznsVar = (ezns) obj;
        ekvr ekvrVarA = ekvw.a();
        ekvrVarA.c(new ekwe("PullHandler", str));
        try {
            return (eiju) new ekvq(ekvrVarA, new Callable() { // from class: cfph
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cfpkVar.c(eznsVar);
                }
            }).call();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException("checked exception caught during context call", e2);
        }
    }
}
