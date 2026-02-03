package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkco implements fdat {
    final /* synthetic */ dkcw a;

    public dkco(dkcw dkcwVar) {
        this.a = dkcwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !hmlVar.I()) {
            dkcw dkcwVar = this.a;
            for (dkcx dkcxVar : dkcwVar.b) {
                if (fdbq.f(dkcxVar.a, dkcwVar.a)) {
                    dthx.b(dkcxVar.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131070);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        hmlVar.s();
        return fctx.a;
    }
}
