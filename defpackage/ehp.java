package defpackage;

import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehp implements fdau {
    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(359872873);
        WeakHashMap weakHashMap = ehg.a;
        ehg ehgVarB = ehf.b(hmlVar);
        boolean zD = hmlVar.D(ehgVarB);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new efi(ehgVarB.g);
            hmlVar.y(objF);
        }
        efi efiVar = (efi) objF;
        hmlVar.o();
        return efiVar;
    }
}
