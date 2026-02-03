package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzv implements fdav {
    final /* synthetic */ List a;
    final /* synthetic */ hox b;

    public zzv(List list, hox hoxVar) {
        this.a = list;
        this.b = hoxVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5 = (eih) obj;
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        boolean z = true;
        if ((iIntValue2 & 6) == 0) {
            i = (true != hmlVar.D(obj5) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if (hmlVar.J((i & 147) != 146, i & 1)) {
            zzn zznVar = (zzn) this.a.get(iIntValue);
            hmlVar.v(-856205624);
            String str = zznVar.a;
            String str2 = zznVar.b;
            djrr djrrVar = zznVar.d;
            hox hoxVar = this.b;
            boolean z2 = iIntValue == ((Number) hoxVar.a()).intValue();
            hmlVar.v(-1746271574);
            if ((((i & 112) ^ 48) <= 32 || !hmlVar.B(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean zF = hmlVar.F(zznVar) | z;
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new zzt(iIntValue, zznVar, hoxVar);
                hmlVar.y(objF);
            }
            hmlVar.o();
            djzv.a(new djzw(str, str2, djrrVar, z2, (fdae) objF), null, hmlVar, 0, 2);
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
