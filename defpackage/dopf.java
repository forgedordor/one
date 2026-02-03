package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dopf implements eyif {
    public static fbnd a(Application application, final dopg dopgVar, fbty fbtyVar, fbur fburVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        fbub fbubVar = dopd.a;
        executor.getClass();
        scheduledExecutorService.getClass();
        executor2.getClass();
        fbuc fbucVarT = fbuc.t(fbtyVar, application);
        fbucVarT.g(executor);
        fbucVarT.v(executor2);
        fbucVarT.k(scheduledExecutorService);
        fbucVarT.w(scheduledExecutorService);
        fbucVarT.y(dopd.a);
        fbucVarT.x(fburVar);
        return fbnk.b(fbucVarT.a(), new drgt(new ejxr() { // from class: dopc
            @Override // defpackage.ejxr
            public final Object get() {
                fbub fbubVar2 = dopd.a;
                return Boolean.valueOf(dopgVar.a);
            }
        }));
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
