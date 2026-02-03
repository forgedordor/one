package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbf {
    public final juo a;
    public final jyq b;
    public final boolean c;
    public final int d = 1;
    public final kio e;
    public final kbi f;
    public final List g;
    private jvf h;
    private kji i;

    public /* synthetic */ fbf(juo juoVar, jyq jyqVar, boolean z, kio kioVar, kbi kbiVar, List list) {
        this.a = juoVar;
        this.b = jyqVar;
        this.c = z;
        this.e = kioVar;
        this.f = kbiVar;
        this.g = list;
    }

    public final int a() {
        return fbg.a(b().a());
    }

    public final jvf b() {
        jvf jvfVar = this.h;
        if (jvfVar != null) {
            return jvfVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final void c(kji kjiVar) {
        jvf jvfVar = this.h;
        if (jvfVar == null || kjiVar != this.i || jvfVar.c()) {
            this.i = kjiVar;
            jvfVar = new jvf(this.a, jyr.b(this.b, kjiVar), this.g, this.e, this.f);
        }
        this.h = jvfVar;
    }
}
