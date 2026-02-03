package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avki implements egsc {
    public static final avkf a = new avkf();
    public static final eksp b = eksp.c("BugleContacts");
    public final avjl c;
    public final fcsu d;
    public final egsh e;
    public final fcsu f;
    public final fcsu g;
    private final fdjx h;

    public avki(fdjx fdjxVar, avjl avjlVar, fcsu fcsuVar, egsh egshVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        avjlVar.getClass();
        fcsuVar.getClass();
        egshVar.getClass();
        fcsuVar3.getClass();
        this.h = fdjxVar;
        this.c = avjlVar;
        this.d = fcsuVar;
        this.e = egshVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final /* bridge */ /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        workerParameters.getClass();
        return auvw.c(this.h, fcyi.a, fdjz.a, new avkh(this, null));
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
