package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avby implements egsc {
    public static final eksp a = eksp.c("BugleContacts");
    public final fcsu b;
    private final fdjx c;

    public avby(fdjx fdjxVar, fcsu fcsuVar) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.c = fdjxVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        ((eksl) a.h()).q("Starting periodic contacts import.");
        return auvw.c(this.c, fcyi.a, fdjz.a, new avbx(this, null));
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
