package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfq {
    public static final hsf a(dfm dfmVar, float f, float f2, dff dffVar, hml hmlVar) {
        return c(dfmVar, Float.valueOf(f), Float.valueOf(f2), diu.a, dffVar, hmlVar, 33208);
    }

    public static final dfm b(hml hmlVar) {
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new dfm();
            hmlVar.y(objF);
        }
        dfm dfmVar = (dfm) objF;
        dfmVar.a(hmlVar, 0);
        return dfmVar;
    }

    public static final hsf c(dfm dfmVar, Object obj, Object obj2, dib dibVar, dff dffVar, hml hmlVar, int i) {
        final dfm dfmVar2;
        final Object obj3;
        final Object obj4;
        final dff dffVar2;
        Object objF = hmlVar.f();
        Object obj5 = hmk.a;
        if (objF == obj5) {
            dfmVar2 = dfmVar;
            obj3 = obj;
            obj4 = obj2;
            dffVar2 = dffVar;
            dfh dfhVar = new dfh(dfmVar2, obj3, obj4, dibVar, dffVar2);
            hmlVar.y(dfhVar);
            objF = dfhVar;
        } else {
            dfmVar2 = dfmVar;
            obj3 = obj;
            obj4 = obj2;
            dffVar2 = dffVar;
        }
        final dfh dfhVar2 = (dfh) objF;
        boolean z = true;
        if ((((i & 112) ^ 48) <= 32 || !hmlVar.F(obj3)) && (i & 48) != 32) {
            z = false;
        }
        boolean zF = hmlVar.F(dffVar2) | z;
        Object objF2 = hmlVar.f();
        if (zF || objF2 == obj5) {
            objF2 = new fdae() { // from class: dfn
                @Override // defpackage.fdae
                public final Object invoke() {
                    dfh dfhVar3 = dfhVar2;
                    Object obj6 = obj3;
                    boolean zF2 = fdbq.f(obj6, dfhVar3.a);
                    Object obj7 = obj4;
                    if (!zF2 || !fdbq.f(obj7, dfhVar3.b)) {
                        dff dffVar3 = dffVar2;
                        dfhVar3.a = obj6;
                        dfhVar3.b = obj7;
                        dfhVar3.c = dffVar3;
                        dfhVar3.d = new dgw(dffVar3, dfhVar3.i, obj6, obj7);
                        dfhVar3.h.b(true);
                        dfhVar3.e = false;
                        dfhVar3.f = true;
                    }
                    return fctx.a;
                }
            };
            hmlVar.y(objF2);
        }
        hob.i((fdae) objF2, hmlVar);
        boolean zF2 = hmlVar.F(dfmVar2);
        Object objF3 = hmlVar.f();
        if (zF2 || objF3 == obj5) {
            objF3 = new fdap() { // from class: dfo
                @Override // defpackage.fdap
                public final Object invoke(Object obj6) {
                    dfm dfmVar3 = dfmVar2;
                    hum humVar = dfmVar3.a;
                    dfh dfhVar3 = dfhVar2;
                    humVar.n(dfhVar3);
                    dfmVar3.b(true);
                    return new dfp(dfmVar3, dfhVar3);
                }
            };
            hmlVar.y(objF3);
        }
        hob.c(dfhVar2, (fdap) objF3, hmlVar);
        return dfhVar2;
    }
}
