package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhjq implements ebla {
    private final Set a;

    public dhjq(Set set) {
        this.a = set;
    }

    @Override // defpackage.ebla
    public final void a(ebqq ebqqVar) {
        ebpc ebpcVar = ebqqVar.a;
        String strB = ejwk.b(ebpcVar.i());
        boolean zS = ebpcVar.s();
        if (this.a.contains(strB) && zS) {
            ebqqVar.t("Session-Expires");
            ebqqVar.t("Min-SE");
        }
    }
}
