package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfh implements fdau {
    final /* synthetic */ hsf a;

    public yfh(hsf hsfVar) {
        this.a = hsfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eih) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            Object objA = this.a.a();
            objA.getClass();
            dkuf.d((dkug) objA, joj.a(egq.d(ics.e, 1.0f), BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER), hmlVar, 48);
        }
        return fctx.a;
    }
}
