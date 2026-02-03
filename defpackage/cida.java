package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cida {
    public final fcsu a;
    public final fcsu b;
    public final fdjx c;
    public final fcsu d;

    public cida(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fdjxVar;
        this.d = fcsuVar3;
    }

    public static final int a(Integer num) {
        if (num != null && num.intValue() == 2) {
            return 4;
        }
        if (num != null && num.intValue() == 1) {
            return 3;
        }
        return (num != null && num.intValue() == 0) ? 2 : 1;
    }
}
