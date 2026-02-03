package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxj {
    public final fcsu a;
    public final fduf b;
    private final fdjx c;

    public daxj(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.c = fdjxVar;
        this.b = fdvf.a(chnc.SHARE_TO_UNKNOWN);
        auvw.m(fdjxVar, null, new daxi(this, null), 3);
    }

    public final void a(chnc chncVar) {
        chncVar.getClass();
        if (chncVar == chnc.SHARE_TO_UNKNOWN) {
            chncVar = chnc.SHARE_TO_EVERYONE;
        }
        this.b.f(chncVar);
    }
}
