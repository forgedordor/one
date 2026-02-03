package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ryp extends ryt {
    public float b;
    public float c;
    final /* synthetic */ ryv d;

    public ryp(ryv ryvVar, float f, float f2) {
        this.d = ryvVar;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.ryt
    public void a(String str) {
        ryv ryvVar = this.d;
        if (ryvVar.i()) {
            ryr ryrVar = ryvVar.d;
            if (ryrVar.b) {
                ryvVar.a.drawText(str, this.b, this.c, ryrVar.d);
            }
            ryr ryrVar2 = ryvVar.d;
            if (ryrVar2.c) {
                ryvVar.a.drawText(str, this.b, this.c, ryrVar2.e);
            }
        }
        this.b += ryvVar.d.d.measureText(str);
    }
}
