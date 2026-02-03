package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxba implements dwyf {
    public static final ekgp a = ekgp.o("tel", 1, "mailto", 2, "http", 3, "https", 3);
    public final dwhr b;
    public final Set c = new HashSet();
    public final ekgb d;
    private final dwpx e;
    private final dwje f;

    public dxba(dwpx dwpxVar, dwje dwjeVar, dwhr dwhrVar) {
        new HashSet();
        int i = ekgb.d;
        this.d = ekoe.a;
        this.e = dwpxVar;
        this.f = dwjeVar;
        this.b = dwhrVar;
    }

    @Override // defpackage.dwyf
    public final void a() {
        d(124);
    }

    public final dwhp b(int i) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(i);
        dwje dwjeVar = this.f;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.d(this.e);
        return dwhpVarR;
    }

    public final void c(int i) {
        this.b.b(b(i).a());
    }

    public final void d(int i) {
        this.b.b(b(i).a());
    }
}
