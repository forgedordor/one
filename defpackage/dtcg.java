package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcg {
    public final CopyOnWriteArrayList a;
    public final cvw b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public final dtbz g;
    private final dtch h;

    public dtcg(dtcd... dtcdVarArr) {
        dtce dtceVar = new dtce(this);
        this.h = dtceVar;
        this.g = new dtcf(this);
        this.a = new CopyOnWriteArrayList(dtcdVarArr);
        cvw cvwVar = new cvw(1);
        this.b = cvwVar;
        this.c = 1;
        dtcdVarArr[0].d(dtceVar);
        cvwVar.put(dtcdVarArr[0], true);
    }

    public final void a() {
        if (this.f || !this.e || this.c == 0) {
            return;
        }
        this.f = true;
        dtcb.c().a(this.g);
    }
}
