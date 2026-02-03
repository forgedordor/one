package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxom implements dxns {
    final /* synthetic */ List a;

    public dxom(List list) {
        this.a = list;
    }

    @Override // defpackage.dxns
    public final int a(dxhe dxheVar) {
        dxheVar.getClass();
        if (this.a.contains(dxheVar.s())) {
            return 2;
        }
        return dxheVar.b() == 4 ? 4 : 5;
    }
}
