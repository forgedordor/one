package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecso extends ecvs {
    public ecso(exqd exqdVar) {
        this.a = exqdVar;
        this.b = 1;
    }

    @Override // defpackage.ecvs
    public final ea a(Integer num, int i) {
        exqd exqdVar = this.a;
        ecsq ecsqVar = new ecsq();
        ecsqVar.at(ecsq.a(exqdVar, num, i));
        return ecsqVar;
    }
}
