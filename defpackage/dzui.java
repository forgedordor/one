package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzui extends dzuc implements dzlo, dztw {
    private static final Callable a = new Callable() { // from class: dzuh
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }
    };
    private final dzug b;
    private final dzut c;

    /* JADX WARN: Type inference failed for: r1v1, types: [fcsu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [dzut, java.lang.Object] */
    public dzui(dzug dzugVar, ejwi ejwiVar) {
        this.b = dzugVar;
        this.c = ((ejwt) ejwiVar).a.b();
    }

    private static ListenableFuture h(ListenableFuture... listenableFutureArr) {
        return eork.d(listenableFutureArr).a(a, eoqg.a);
    }

    private final ListenableFuture i(dzub dzubVar, String str, String str2) {
        if (dzubVar == null || dzub.e(dzubVar)) {
            return eorv.a;
        }
        if (dzubVar.d) {
            return this.c.a(str, str2);
        }
        dzut dzutVar = this.c;
        dzlv dzlvVar = dzubVar.b;
        dzutVar.c(str, ((dzky) dzlvVar.a).a, dzubVar.a());
        return eorv.a;
    }

    private final void j(dzub dzubVar, String str) {
        if (!dzub.e(dzubVar) && this.c.d(str)) {
            dzubVar.d = true;
        }
    }

    @Override // defpackage.dztw
    public final ListenableFuture a(dzfh dzfhVar, long j, long j2, feeg feegVar) {
        return this.b.a(dzfhVar, j, j2, feegVar);
    }

    @Override // defpackage.dztw
    public final ListenableFuture b(dzfh dzfhVar, long j, long j2, dzua dzuaVar) {
        return this.b.b(dzfhVar, j, j2, dzuaVar);
    }

    @Override // defpackage.dzuc
    public final synchronized dzub c(dzfh dzfhVar) {
        dzub dzubVarC;
        dzubVarC = this.b.c(dzfhVar);
        if (!dzub.e(dzubVarC) && dzubVarC.d) {
            this.c.b();
        }
        return dzubVarC;
    }

    @Override // defpackage.dzuc
    public final synchronized dzub d() {
        dzub dzubVarD;
        dzubVarD = this.b.d();
        j(dzubVarD, "");
        return dzubVarD;
    }

    @Override // defpackage.dzuc
    public final dzub e(dzfh dzfhVar) {
        dzub dzubVarE = this.b.e(dzfhVar);
        j(dzubVarE, dzfhVar.a);
        return dzubVarE;
    }

    @Override // defpackage.dzuc
    public final ListenableFuture f(dzub dzubVar, dzfh dzfhVar, feeg feegVar, dzua dzuaVar) {
        return h(this.b.f(dzubVar, dzfhVar, feegVar, dzuaVar), i(dzubVar, dzfhVar.a, null));
    }

    @Override // defpackage.dzuc
    public final ListenableFuture g(dzfh dzfhVar, dzfh dzfhVar2, feeg feegVar, dzua dzuaVar) {
        dzug dzugVar = this.b;
        ConcurrentHashMap concurrentHashMap = dzugVar.c;
        String str = dzfhVar.a;
        return h(dzugVar.g(dzfhVar, dzfhVar2, feegVar, dzuaVar), i((dzub) concurrentHashMap.get(str), str, dzfh.d(dzfhVar2)));
    }

    @Override // defpackage.dzlo
    public final /* synthetic */ void n() {
    }
}
