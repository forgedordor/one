package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecmf {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;

    public ecmf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final ecmd a(final String str, ecnr ecnrVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.b();
        scheduledExecutorService.getClass();
        ecnf ecnfVar = (ecnf) this.c.b();
        ecnfVar.getClass();
        eooy eooyVar = new eooy() { // from class: ecme
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eork.i(str);
            }
        };
        ecnrVar.getClass();
        return new ecmd(new ecng(context, scheduledExecutorService, ecnfVar, eooyVar, ecnrVar));
    }
}
