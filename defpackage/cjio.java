package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjio implements fcsc {
    private final cjil a;
    private final int b;

    public cjio(cjil cjilVar, int i) {
        this.a = cjilVar;
        this.b = i;
    }

    @Override // defpackage.fcsc
    public final void a(Object obj, fcsf fcsfVar) {
        switch (this.b) {
            case 0:
                this.a.f((cjjl) obj, fcsfVar);
                break;
            case 1:
                this.a.e((cjjh) obj, fcsfVar);
                break;
            case 2:
                this.a.i((cjlc) obj, fcsfVar);
                break;
            case 3:
                this.a.l(fcsfVar);
                break;
            case 4:
                this.a.h((cjkm) obj, fcsfVar);
                break;
            case 5:
                this.a.d((cjgt) obj, fcsfVar);
                break;
            case 6:
                this.a.c((cjgd) obj, fcsfVar);
                break;
            case 7:
                this.a.g((cjjy) obj, fcsfVar);
                break;
            case 8:
                this.a.k((cjlw) obj, fcsfVar);
                break;
            default:
                this.a.j((cjlo) obj, fcsfVar);
                break;
        }
    }
}
