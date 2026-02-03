package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceak {
    public int a;
    public int b;
    final /* synthetic */ ceal c;

    public ceak(ceal cealVar) {
        this.c = cealVar;
    }

    final int a() {
        int i = this.b;
        ceal cealVar = this.c;
        if (i == cealVar.c.a) {
            return cealVar.b - this.a;
        }
        throw new RuntimeException("BUG: Invalid call to getLength()");
    }
}
