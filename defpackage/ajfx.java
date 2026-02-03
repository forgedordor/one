package defpackage;

import android.os.Trace;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajfx {
    public final dzuc a;
    private final Set b = ekpg.i();

    public ajfx(dzuc dzucVar) {
        this.a = dzucVar;
    }

    public final void a(dzfh dzfhVar, int i) {
        this.a.e(dzfhVar);
        b(dzfhVar, i);
    }

    public final void b(dzfh dzfhVar, int i) {
        if (craf.c && this.b.add(new ajen(dzfhVar, i))) {
            Trace.beginAsyncSection(dzfhVar.a, i);
        }
    }

    public final void c(dzfh dzfhVar, int i) {
        d(dzfhVar, i, null);
    }

    public final void d(dzfh dzfhVar, int i, feeg feegVar) {
        e(dzfhVar, i, feegVar, dzua.SUCCESS);
    }

    public final void e(dzfh dzfhVar, int i, feeg feegVar, dzua dzuaVar) {
        f(dzfhVar, i);
        this.a.g(dzfhVar, null, feegVar, dzuaVar);
    }

    public final void f(dzfh dzfhVar, int i) {
        if (craf.c && this.b.remove(new ajen(dzfhVar, i))) {
            Trace.endAsyncSection(dzfhVar.a, i);
        }
    }
}
