package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxox implements dxns {
    final /* synthetic */ List a;

    public dxox(List list) {
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
