package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ese {
    public static final dzo a(final etv etvVar, eti etiVar, dep depVar, ddz ddzVar, hml hmlVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            etiVar = new etj();
        }
        if ((i2 & 4) != 0) {
            depVar = ddi.a(hmlVar);
        }
        boolean z = true;
        if ((i2 & 8) != 0) {
            ihu ihuVar = djm.a;
            ddzVar = dea.b(0.0f, 400.0f, Float.valueOf(1.0f), 1);
        }
        kio kioVar = (kio) hmlVar.e(jmh.e);
        final kji kjiVar = (kji) hmlVar.e(jmh.j);
        boolean zD = ((((i & 14) ^ 6) > 4 && hmlVar.D(etvVar)) || (i & 6) == 4) | hmlVar.D(depVar) | hmlVar.D(ddzVar);
        if ((((i & 112) ^ 48) <= 32 || !hmlVar.D(etiVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean zD2 = zD | z | hmlVar.D(kioVar) | hmlVar.B(kjiVar.ordinal());
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD2 || objS == hmk.a) {
            ean eanVar = new ean(new eaf(etvVar, new fdau() { // from class: esd
                @Override // defpackage.fdau
                public final Object a(Object obj, Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj).floatValue();
                    float fFloatValue2 = ((Float) obj2).floatValue();
                    float fFloatValue3 = ((Float) obj3).floatValue();
                    etv etvVar2 = etvVar;
                    boolean zB = eag.b(etvVar2, fFloatValue);
                    if (etvVar2.x().e != dwm.a && kjiVar != kji.a) {
                        zB = !zB;
                    }
                    int i3 = etvVar2.x().b;
                    float fA = i3 == 0 ? 0.0f : eag.a(etvVar2) / i3;
                    int iA = eae.a(etvVar2.o, fFloatValue);
                    if (eab.a(iA, 0)) {
                        fFloatValue2 = Math.abs(fA - ((float) ((int) fA))) > 0.5f ? fFloatValue3 : fFloatValue3;
                    } else if (!eab.a(iA, 1)) {
                        if (!eab.a(iA, 2)) {
                            fFloatValue2 = 0.0f;
                        }
                    }
                    return Float.valueOf(fFloatValue2);
                }
            }, etiVar), depVar, ddzVar);
            hmwVar.af(eanVar);
            objS = eanVar;
        }
        return (dzo) objS;
    }

    public static final iqp b(etv etvVar, dwm dwmVar, hml hmlVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !hmlVar.D(etvVar)) && (i & 6) != 4) {
            z = false;
        }
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (z || objS == hmk.a) {
            objS = new erh(etvVar, dwmVar);
            hmwVar.af(objS);
        }
        return (erh) objS;
    }
}
