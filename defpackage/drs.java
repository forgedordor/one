package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drs implements dwy {
    final /* synthetic */ drv a;
    final /* synthetic */ dsc b;

    public drs(drv drvVar, dsc dscVar) {
        this.a = drvVar;
        this.b = dscVar;
    }

    @Override // defpackage.dwy
    public final float a(float f) {
        drv drvVar = this.a;
        float fB = drvVar.a.b(f);
        float fA = fB - drvVar.a.a();
        drb.a(this.b, fB);
        return fA;
    }
}
