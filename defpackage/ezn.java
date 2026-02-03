package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezn implements fdau {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ jyq c;

    public ezn(int i, int i2, jyq jyqVar) {
        this.a = i;
        this.b = i2;
        this.c = jyqVar;
    }

    private static final Object b(hsf hsfVar) {
        return hsfVar.a();
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(408240218);
        int i = this.a;
        int i2 = this.b;
        ezo.a(i, i2);
        if (i == 1) {
            if (i2 == Integer.MAX_VALUE) {
                ico icoVar = ics.e;
                hmlVar.o();
                return icoVar;
            }
            i = 1;
        }
        kio kioVar = (kio) hmlVar.e(jmh.e);
        kbi kbiVar = (kbi) hmlVar.e(jmh.g);
        kji kjiVar = (kji) hmlVar.e(jmh.j);
        jyq jyqVar = this.c;
        boolean zD = hmlVar.D(jyqVar) | hmlVar.B(kjiVar.ordinal());
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = jyr.b(jyqVar, kjiVar);
            hmlVar.y(objF);
        }
        jyq jyqVar2 = (jyq) objF;
        boolean zD2 = hmlVar.D(kbiVar) | hmlVar.D(jyqVar2);
        Object objF2 = hmlVar.f();
        if (zD2 || objF2 == hmk.a) {
            kbj kbjVarN = jyqVar2.n();
            kcc kccVarQ = jyqVar2.q();
            if (kccVarQ == null) {
                kccVarQ = kcc.e;
            }
            kbw kbwVarO = jyqVar2.o();
            int i3 = kbwVarO != null ? kbwVarO.a : 0;
            kbx kbxVarP = jyqVar2.p();
            objF2 = kbiVar.a(kbjVarN, kccVarQ, i3, kbxVarP != null ? kbxVarP.a : 65535);
            hmlVar.y(objF2);
        }
        hsf hsfVar = (hsf) objF2;
        boolean zD3 = hmlVar.D(b(hsfVar)) | hmlVar.D(kioVar) | hmlVar.D(kbiVar) | hmlVar.D(jyqVar) | hmlVar.B(kjiVar.ordinal());
        Object objF3 = hmlVar.f();
        if (zD3 || objF3 == hmk.a) {
            j = 4294967295L;
            objF3 = Integer.valueOf((int) (fbp.a(jyqVar2, kioVar, kbiVar, fbp.a, 1) & 4294967295L));
            hmlVar.y(objF3);
        } else {
            j = 4294967295L;
        }
        int iIntValue = ((Number) objF3).intValue();
        boolean zB = hmlVar.B(kjiVar.ordinal()) | hmlVar.D(jyqVar) | hmlVar.D(kioVar) | hmlVar.D(kbiVar) | hmlVar.D(b(hsfVar));
        Object objF4 = hmlVar.f();
        if (zB || objF4 == hmk.a) {
            StringBuilder sb = new StringBuilder();
            String str = fbp.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objF4 = Integer.valueOf((int) (fbp.a(jyqVar2, kioVar, kbiVar, sb.toString(), 2) & j));
            hmlVar.y(objF4);
        }
        int iIntValue2 = ((Number) objF4).intValue() - iIntValue;
        Integer numValueOf = i == 1 ? null : Integer.valueOf(((i - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i2 - 1))) : null;
        ics icsVarF = egq.f(ics.e, numValueOf != null ? kioVar.el(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? kioVar.el(numValueOf2.intValue()) : Float.NaN);
        hmlVar.o();
        return icsVarF;
    }
}
