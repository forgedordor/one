package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwsx implements dwdz {
    private final Context a;

    public dwsx(Context context) {
        this.a = context;
    }

    @Override // defpackage.dwdz
    public final dwdy a() {
        return new dwti(this.a);
    }

    @Override // defpackage.dwdz
    public final String b() {
        return "rich_card";
    }

    @Override // defpackage.dwdz
    public final void c(dwje dwjeVar, dwqw dwqwVar, dwhr dwhrVar) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(36);
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwnq dwnqVar = (dwnq) dwqwVar;
        dwhpVarR.p(dwnqVar.a);
        dwhpVarR.d(dwnqVar.c);
        dwhrVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwdz
    public final void d(dwje dwjeVar, dwqw dwqwVar, dwhr dwhrVar) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(35);
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(dwqwVar.r());
        dwhpVarR.d(dwqwVar.f());
        dwhrVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwdz
    public final void e() {
        eork.i(true);
    }

    @Override // defpackage.dwdz
    public final ListenableFuture f(dwqw dwqwVar) {
        return eork.i(dwqwVar);
    }
}
