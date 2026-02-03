package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msx implements msj {
    public final nei a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public msx(nep nepVar, boolean z) {
        this.a = new nei(nepVar, z);
    }

    @Override // defpackage.msj
    public final mcl a() {
        return this.a.d;
    }

    @Override // defpackage.msj
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
