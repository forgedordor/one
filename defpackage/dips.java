package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dips implements fdau {
    final /* synthetic */ dipk a;
    final /* synthetic */ fddm b;

    public dips(dipk dipkVar, fddm fddmVar) {
        this.a = dipkVar;
        this.b = fddmVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(1451363959);
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            objF = new itc();
            hmlVar.y(objF);
        }
        final itc itcVar = (itc) objF;
        hmlVar.o();
        hmlVar.v(-1746271574);
        final dipk dipkVar = this.a;
        boolean zD = hmlVar.D(dipkVar);
        final fddm fddmVar = this.b;
        boolean zD2 = zD | hmlVar.D(fddmVar) | hmlVar.F(itcVar);
        Object objF2 = hmlVar.f();
        if (zD2 || objF2 == obj4) {
            objF2 = new fdap() { // from class: dipr
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
                
                    if (r2 != 3) goto L20;
                 */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
                @Override // defpackage.fdap
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r6) {
                    /*
                        r5 = this;
                        android.view.MotionEvent r6 = (android.view.MotionEvent) r6
                        r6.getClass()
                        dipk r0 = r1
                        r1 = 0
                        if (r0 != 0) goto Lb
                        goto L68
                    Lb:
                        int r2 = r6.getAction()
                        r3 = 1
                        if (r2 == 0) goto L22
                        if (r2 == r3) goto L1b
                        r4 = 2
                        if (r2 == r4) goto L22
                        r6 = 3
                        if (r2 == r6) goto L1b
                        goto L68
                    L1b:
                        fdae r6 = r0.c
                        r6.invoke()
                    L20:
                        r1 = r3
                        goto L68
                    L22:
                        fddm r2 = r2
                        if (r2 == 0) goto L68
                        float r4 = r6.getX()
                        java.lang.Float r4 = java.lang.Float.valueOf(r4)
                        boolean r4 = r2.d(r4)
                        if (r4 == 0) goto L68
                        itc r1 = r3
                        float r6 = r6.getX()
                        java.lang.Comparable r4 = r2.c()
                        java.lang.Number r4 = (java.lang.Number) r4
                        float r4 = r4.floatValue()
                        float r6 = r6 - r4
                        java.lang.Comparable r4 = r2.b()
                        java.lang.Number r4 = (java.lang.Number) r4
                        float r4 = r4.floatValue()
                        java.lang.Comparable r2 = r2.c()
                        java.lang.Number r2 = (java.lang.Number) r2
                        float r2 = r2.floatValue()
                        float r4 = r4 - r2
                        fdap r0 = r0.b
                        float r6 = r6 / r4
                        java.lang.Float r6 = java.lang.Float.valueOf(r6)
                        r0.invoke(r6)
                        r1.a(r3)
                        goto L20
                    L68:
                        java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dipr.invoke(java.lang.Object):java.lang.Object");
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        ics icsVarB = isx.b(icsVar, itcVar, (fdap) objF2);
        hmlVar.o();
        return icsVarB;
    }
}
