package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxol implements dxns {
    final /* synthetic */ List a;

    public dxol(List list) {
        this.a = list;
    }

    @Override // defpackage.dxns
    public final int a(dxhe dxheVar) {
        dxheVar.getClass();
        if (this.a.contains(dxheVar.s())) {
            return 3;
        }
        if (dxheVar.b() == 5) {
            return 6;
        }
        return dxheVar.b();
    }
}
