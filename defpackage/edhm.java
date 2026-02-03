package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class edhm {
    public static edhm e(Object obj) {
        ejwi ejwiVarJ = ejwi.j(obj);
        ejud ejudVar = ejud.a;
        int i = ekgb.d;
        return new edhd(3, ejwiVarJ, ejudVar, ekoe.a);
    }

    public static edhm f(edhe edheVar, ekgb ekgbVar) {
        return new edhd(5, ejud.a, ejwi.j(edheVar), ekgbVar);
    }

    public static edhm g() {
        ejud ejudVar = ejud.a;
        int i = ekgb.d;
        return new edhd(1, ejudVar, ejudVar, ekoe.a);
    }

    public static edhm h() {
        ejud ejudVar = ejud.a;
        int i = ekgb.d;
        return new edhd(2, ejudVar, ejudVar, ekoe.a);
    }

    public static edhm i(Object obj, ekgb ekgbVar) {
        return new edhd(4, ejwi.j(obj), ejud.a, ekgbVar);
    }

    public abstract ejwi a();

    public abstract ejwi b();

    public abstract ekgb c();

    public abstract int d();
}
