package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvf extends lvd implements lvh {
    public final lvc a;
    private final fcyh b;

    public lvf(lvc lvcVar, fcyh fcyhVar) {
        fcyhVar.getClass();
        this.a = lvcVar;
        this.b = fcyhVar;
        if (lvcVar.a() == lvb.a) {
            fdlw.d(fcyhVar, null);
        }
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        lvc lvcVar = this.a;
        if (lvcVar.a().compareTo(lvb.a) <= 0) {
            lvcVar.d(this);
            fdlw.d(this.b, null);
        }
    }

    @Override // defpackage.fdjx
    public final fcyh hE() {
        return this.b;
    }
}
