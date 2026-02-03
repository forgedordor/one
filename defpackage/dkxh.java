package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkxh implements ixm {
    final /* synthetic */ int a;

    public dkxh(int i) {
        this.a = i;
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixl.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixl.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixl.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixl.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        float f;
        float fC;
        ixpVar.getClass();
        ixk ixkVar = (ixk) list.get(0);
        ixk ixkVar2 = (ixk) list.get(1);
        ixk ixkVar3 = (ixk) list.get(2);
        ixk ixkVar4 = (ixk) list.get(3);
        ixk ixkVar5 = (ixk) list.get(4);
        ixk ixkVar6 = (ixk) list.get(5);
        ixk ixkVar7 = (ixk) list.get(6);
        int i = this.a;
        if (i == 0) {
            fC = 0.0f;
            f = 0.0f;
        } else {
            float fEn = ixpVar.en(2.0f);
            f = fEn;
            fC = (((ixkVar6.c(kil.b(j)) - ixpVar.en(8.0f)) - ixpVar.en(4.0f)) - ((i - 1) * fEn)) / i;
        }
        dkxm dkxmVar = new dkxm(j, ixkVar, ixkVar2, ixkVar3, ixkVar4, ixkVar5, ixkVar7, ixkVar6, fC, f, i);
        return dkxj.a(ixpVar, dkxj.b(dkxmVar, dkxk.a(dkxj.c(dkxmVar))));
    }
}
