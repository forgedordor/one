package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwt extends jco {
    final /* synthetic */ iwy a;
    final /* synthetic */ fdat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwt(iwy iwyVar, fdat fdatVar, String str) {
        super(str);
        this.a = iwyVar;
        this.b = fdatVar;
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        iwy iwyVar = this.a;
        iwq iwqVar = iwyVar.h;
        iwqVar.a = ixpVar.q();
        iwqVar.b = ixpVar.ed();
        iwqVar.c = ixpVar.ee();
        if (ixpVar.ev() || iwyVar.a.j == null) {
            iwyVar.d = 0;
            ixn ixnVar = (ixn) this.b.a(iwqVar, new kil(j));
            return new iws(ixnVar, iwyVar, iwyVar.d, ixnVar);
        }
        iwyVar.e = 0;
        ixn ixnVar2 = (ixn) this.b.a(iwyVar.i, new kil(j));
        return new iwr(ixnVar2, iwyVar, iwyVar.e, ixnVar2);
    }
}
