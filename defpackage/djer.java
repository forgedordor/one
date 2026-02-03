package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djer implements fdau {
    final /* synthetic */ djdm a;
    final /* synthetic */ djcy b;
    final /* synthetic */ hox c;

    public djer(djdm djdmVar, djcy djcyVar, hox hoxVar) {
        this.a = djdmVar;
        this.b = djcyVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ede edeVar = (ede) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edeVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djdm djdmVar = this.a;
            if (djdmVar.f) {
                hmlVar.v(-1280402660);
                djes.e(this.b.d, hmlVar, 0);
                hmlVar.o();
            } else {
                hmlVar.v(-1280343326);
                djcy djcyVar = this.b;
                hox hoxVar = this.c;
                boolean z = false;
                djew djewVar = djcyVar.d;
                if (!djewVar.g.a || djcyVar.a()) {
                    z = true;
                }
                djes.a(edeVar, djewVar, djdmVar, hoxVar, z, hmlVar, iIntValue & 14);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
