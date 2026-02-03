package defpackage;

import androidx.car.app.AppManager;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clw implements cmo {
    public final Deque a = new ArrayDeque();
    public final clg b;
    public final lvc c;

    protected clw(clg clgVar, lvc lvcVar) {
        this.b = clgVar;
        this.c = lvcVar;
        lvcVar.c(new clv(this));
    }

    public static final void c(clu cluVar, boolean z) {
        lvb lvbVar = cluVar.a.c;
        if (lvbVar.a(lvb.e)) {
            cluVar.b(lva.ON_PAUSE);
        }
        if (lvbVar.a(lvb.d)) {
            cluVar.b(lva.ON_STOP);
        }
        if (z) {
            cluVar.b(lva.ON_DESTROY);
        }
    }

    public final clu a() {
        csb.a();
        clu cluVar = (clu) this.a.peek();
        cluVar.getClass();
        return cluVar;
    }

    public final void b(clu cluVar, boolean z) {
        this.a.push(cluVar);
        if (z && ((lvn) this.c).c.a(lvb.c)) {
            cluVar.b(lva.ON_CREATE);
        }
        if (cluVar.a.c.a(lvb.c) && ((lvn) this.c).c.a(lvb.d)) {
            ((AppManager) this.b.a(AppManager.class)).a();
            cluVar.b(lva.ON_START);
        }
    }
}
