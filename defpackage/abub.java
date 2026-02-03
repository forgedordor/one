package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abub implements ehsl {
    final /* synthetic */ abuc a;
    final /* synthetic */ ehsm b;

    public abub(abuc abucVar, ehsm ehsmVar) {
        this.a = abucVar;
        this.b = ehsmVar;
    }

    @Override // defpackage.ehsl
    public final ejwi a() {
        return ejwi.i(null);
    }

    @Override // defpackage.ehsl
    public final ListenableFuture c() {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        fcyh fcyhVarA = eicg.a(fcyiVar);
        abuc abucVar = this.a;
        return fdxs.b(abucVar.b, fcyhVarA, fdjzVar, new abua(null, abucVar, this, this.b));
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ ehsj e() {
        return ehsk.a();
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ehsl
    public final /* synthetic */ void d() {
    }
}
