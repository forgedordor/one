package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkyu implements fdau {
    final /* synthetic */ dkya a;

    public dkyu(dkya dkyaVar) {
        this.a = dkyaVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Number) obj).floatValue();
        hml hmlVar = (hml) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            int iEn = (int) ((kio) hmlVar.e(jmh.e)).en(30.0f);
            Uri uri = Uri.parse(this.a.a);
            iva ivaVar = iuz.b;
            ics icsVarC = egq.c(ics.e, 1.0f);
            Integer numValueOf = Integer.valueOf(iEn);
            djrv.a(uri, "Penpal reaction", icsVarC, null, null, null, ivaVar, null, 0.0f, numValueOf, numValueOf, null, null, null, null, null, hmlVar, 12583344, 0, 518008);
        }
        return fctx.a;
    }
}
