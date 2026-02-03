package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbuc extends fbor {
    public final fbuy a;
    private final fchf b;

    public fbuc(fbty fbtyVar, Context context, fbud fbudVar) {
        fbuy fbuyVar = new fbuy();
        context.getClass();
        fbuyVar.a = context;
        fbuyVar.c = fbudVar;
        this.a = fbuyVar;
        this.b = new fchf(fbtyVar, fbtyVar.d(), fbuyVar);
        h(60L, TimeUnit.SECONDS);
    }

    public static fbuc t(fbty fbtyVar, Context context) {
        return new fbuc(fbtyVar, context, new fbud());
    }

    @Override // defpackage.fboq, defpackage.fbqo
    public final fbqm a() {
        fchy fchyVar = this.b.e;
        fchyVar.getClass();
        this.a.b = fchyVar;
        return super.a();
    }

    @Override // defpackage.fbor, defpackage.fboq
    protected final fbqo b() {
        return this.b;
    }

    @Override // defpackage.fbor
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void h(long j, TimeUnit timeUnit) {
        ejwl.m(true, "Idle timeouts are not supported when strict lifecycle management is enabled");
        super.h(j, timeUnit);
    }

    public final void v(Executor executor) {
        executor.getClass();
        this.a.d = executor;
    }

    public final void w(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a.e = new fcdj(scheduledExecutorService);
    }

    public final void x(fbur fburVar) {
        this.a.f = fburVar;
    }

    public final void y(fbub fbubVar) {
        this.a.g = fbubVar;
    }
}
