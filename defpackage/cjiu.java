package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjiu implements fcsc {
    private final cjir a;
    private final int b;

    public cjiu(cjir cjirVar, int i) {
        this.a = cjirVar;
        this.b = i;
    }

    @Override // defpackage.fcsc
    public final void a(Object obj, fcsf fcsfVar) {
        switch (this.b) {
            case 0:
                this.a.f((cjlg) obj, fcsfVar);
                break;
            case 1:
                this.a.e((cjky) obj, fcsfVar);
                break;
            case 2:
                this.a.i();
                break;
            case 3:
                this.a.c((cjgx) obj, fcsfVar);
                break;
            case 4:
                this.a.b((cjgh) obj, fcsfVar);
                break;
            case 5:
                this.a.d((cjkc) obj, fcsfVar);
                break;
            case 6:
                this.a.h((cjma) obj, fcsfVar);
                break;
            default:
                this.a.g((cjls) obj, fcsfVar);
                break;
        }
    }
}
