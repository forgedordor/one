package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luo implements lvh {
    private final lun a;
    private final lvh b;

    public luo(lun lunVar, lvh lvhVar) {
        this.a = lunVar;
        this.b = lvhVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        switch (lvaVar.ordinal()) {
            case 0:
                this.a.gF(lvjVar);
                break;
            case 1:
                this.a.gG(lvjVar);
                break;
            case 2:
                this.a.d(lvjVar);
                break;
            case 3:
                this.a.c(lvjVar);
                break;
            case 4:
                this.a.f(lvjVar);
                break;
            case 5:
                this.a.fh(lvjVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new fctg();
        }
        lvh lvhVar = this.b;
        if (lvhVar != null) {
            lvhVar.gL(lvjVar, lvaVar);
        }
    }
}
