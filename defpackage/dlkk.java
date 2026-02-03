package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkk {
    public static final fdat a = dlkj.a;
    public static final hpt b = new hnz(hsi.a, new fdae() { // from class: dljy
        @Override // defpackage.fdae
        public final Object invoke() {
            fdat fdatVar = dlkk.a;
            return new khm(Integer.MIN_VALUE);
        }
    });

    public static final void a(gda gdaVar, gsa gsaVar, hcr hcrVar, fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        gda gdaVar2;
        final fdat fdatVar2;
        final hcr hcrVar2;
        final gsa gsaVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-484509055);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(gdaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(gsaVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(hcrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            gdaVar2 = gdaVar;
            fdatVar2 = fdatVar;
            hcrVar2 = hcrVar;
            gsaVar2 = gsaVar;
        } else {
            int i4 = i2 & 14;
            if (((Boolean) dljt.b(hmlVarC).m.invoke()).booleanValue()) {
                hmlVarC.v(1376079266);
                int i5 = i2 << 3;
                gdaVar2 = gdaVar;
                dtfb.a(gdaVar2, null, gsaVar, hcrVar, fdatVar, hmlVarC, i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
                gsaVar2 = gsaVar;
                hcrVar2 = hcrVar;
                fdatVar2 = fdatVar;
                hmlVarC = hmlVarC;
                ((hmw) hmlVarC).ab();
            } else {
                gdaVar2 = gdaVar;
                fdatVar2 = fdatVar;
                hcrVar2 = hcrVar;
                gsaVar2 = gsaVar;
                hmlVarC.v(1376242636);
                dtff.a(gdaVar2, gsaVar2, hcrVar2, fdatVar2, hmlVarC, i2 & 8190, 0);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final gda gdaVar3 = gdaVar2;
            hpxVarL.d = new fdat() { // from class: dljv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    gda gdaVar4 = gdaVar3;
                    gsa gsaVar3 = gsaVar2;
                    int i6 = i;
                    dlkk.a(gdaVar4, gsaVar3, hcrVar2, fdatVar2, hmlVar2, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dlim dlimVar, final dlkl dlklVar, final dljn dljnVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-830660712);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlimVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(dlklVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(dljnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hnj.b(new hpu[]{dlio.a.c(dlimVar), dlkn.a.c(dlklVar), dljs.a.c(dljnVar)}, fdatVar, hmlVarC, ((i2 >> 6) & 112) | 8);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dljz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    hml hmlVar2 = (hml) obj;
                    ((Integer) obj2).intValue();
                    dlim dlimVar2 = dlimVar;
                    dlkl dlklVar2 = dlklVar;
                    int i4 = i;
                    dlkk.b(dlimVar2, dlklVar2, dljnVar, fdatVar, hmlVar2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.fdat r88, defpackage.fdat r89, defpackage.fdat r90, defpackage.fdau r91, defpackage.fdat r92, defpackage.fdau r93, defpackage.fdax r94, defpackage.fdau r95, defpackage.fdat r96, boolean r97, defpackage.fdap r98, int r99, final defpackage.fdat r100, defpackage.hml r101, final int r102, final int r103, final int r104) {
        /*
            Method dump skipped, instructions count: 1944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlkk.c(fdat, fdat, fdat, fdau, fdat, fdau, fdax, fdau, fdat, boolean, fdap, int, fdat, hml, int, int, int):void");
    }
}
