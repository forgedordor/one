package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyrp extends dytw {
    public dyyb a;
    public dyrj b;
    private dyue d;
    private dyax e;
    private ExecutorService f;
    private dxyj g;
    private dywb h;
    private dtah i;
    private final ejwi j = ejud.a;

    @Override // defpackage.dytw
    public final dtah a() {
        dtah dtahVar = this.i;
        if (dtahVar != null) {
            return dtahVar;
        }
        throw new IllegalStateException("Property \"vePrimitives\" has not been set");
    }

    @Override // defpackage.dytw
    public final dyrj b() {
        dyrj dyrjVar = this.b;
        if (dyrjVar != null) {
            return dyrjVar;
        }
        throw new IllegalStateException("Property \"accountLayer\" has not been set");
    }

    @Override // defpackage.dytw
    public final dytx c() {
        dyax dyaxVar;
        ExecutorService executorService;
        dxyj dxyjVar;
        dywb dywbVar;
        dtah dtahVar;
        dyyb dyybVar;
        dyrj dyrjVar;
        dyue dyueVar = this.d;
        if (dyueVar != null && (dyaxVar = this.e) != null && (executorService = this.f) != null && (dxyjVar = this.g) != null && (dywbVar = this.h) != null && (dtahVar = this.i) != null && (dyybVar = this.a) != null && (dyrjVar = this.b) != null) {
            return new dyrq(dyueVar, dyaxVar, executorService, dxyjVar, dywbVar, dtahVar, dyybVar, dyrjVar, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" limitedAvailableAccountsModel");
        }
        if (this.e == null) {
            sb.append(" internalAccountsModel");
        }
        if (this.f == null) {
            sb.append(" backgroundExecutor");
        }
        if (this.g == null) {
            sb.append(" avatarImageLoader");
        }
        if (this.h == null) {
            sb.append(" oneGoogleEventLogger");
        }
        if (this.i == null) {
            sb.append(" vePrimitives");
        }
        if (this.a == null) {
            sb.append(" visualElements");
        }
        if (this.b == null) {
            sb.append(" accountLayer");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dytw
    public final ejwi d() {
        ExecutorService executorService = this.f;
        return executorService == null ? ejud.a : ejwi.j(executorService);
    }

    @Override // defpackage.dytw
    public final ejwi e() {
        dywb dywbVar = this.h;
        return dywbVar == null ? ejud.a : ejwi.j(dywbVar);
    }

    @Override // defpackage.dytw
    public final void f(dxyj dxyjVar) {
        this.g = dxyjVar;
    }

    @Override // defpackage.dytw
    public final void g(ExecutorService executorService) {
        if (executorService == null) {
            throw new NullPointerException("Null backgroundExecutor");
        }
        this.f = executorService;
    }

    @Override // defpackage.dytw
    public final void h(dyax dyaxVar) {
        this.e = dyaxVar;
    }

    @Override // defpackage.dytw
    public final void i(dyue dyueVar) {
        this.d = dyueVar;
    }

    @Override // defpackage.dytw
    public final void j(dywb dywbVar) {
        this.h = dywbVar;
    }

    @Override // defpackage.dytw
    public final void k(dtah dtahVar) {
        if (dtahVar == null) {
            throw new NullPointerException("Null vePrimitives");
        }
        this.i = dtahVar;
    }

    @Override // defpackage.dytw
    public final void l(dyyb dyybVar) {
        this.a = dyybVar;
    }
}
