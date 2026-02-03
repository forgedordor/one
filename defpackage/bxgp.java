package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxgp {
    public final bxgz a;
    public final boolean b;
    final /* synthetic */ bxgr c;
    private final List d;

    public bxgp(bxgr bxgrVar, bxgz bxgzVar, boolean z, List list) {
        this.c = bxgrVar;
        this.a = bxgzVar;
        this.b = z;
        this.d = list;
    }

    public final void a() {
        for (bxgk bxgkVar : this.d) {
            bxgr bxgrVar = this.c;
            bxgrVar.e(bxgkVar, bxgrVar.a);
        }
    }
}
