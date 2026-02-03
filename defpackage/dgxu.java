package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxu {
    public final fcsu a;
    public final dhfs b;
    private final fcsu c;
    private final fcsu d;

    public dgxu(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dhfs dhfsVar) {
        this.a = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.b = dhfsVar;
    }

    public final dhmg a(String str, dhly dhlyVar, dhlw dhlwVar) {
        dhmg dhmgVar = (dhmg) this.c.b();
        dhmf dhmfVar = (dhmf) this.d.b();
        dhmfVar.a = dhlyVar;
        dhmgVar.b = dhmfVar;
        dhmgVar.c = dhlwVar;
        dhmgVar.d = new dhlz(str);
        return dhmgVar;
    }
}
