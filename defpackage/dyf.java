package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyf implements dwy {
    final /* synthetic */ dyk a;
    final /* synthetic */ dyh b;

    public dyf(dyk dykVar, dyh dyhVar) {
        this.a = dykVar;
        this.b = dyhVar;
    }

    @Override // defpackage.dwy
    public final float a(float f) {
        if (Math.abs(f) != 0.0f) {
            dyk dykVar = this.a;
            if ((f > 0.0f && !dykVar.a.h()) || ((f < 0.0f && !dykVar.a.g()) || !((Boolean) dykVar.g.invoke()).booleanValue())) {
                throw new dvk();
            }
        }
        dyk dykVar2 = this.a;
        return dykVar2.b(dykVar2.c(this.b.a(dykVar2.e(dykVar2.g(f)), 2)));
    }
}
