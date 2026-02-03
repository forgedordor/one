package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekse {
    public static final ekse c = new eksa();
    public static final ekse d = new eksa();

    protected ekse() {
    }

    static ekse b(ekse ekseVar, ekse ekseVar2) {
        ekse ekseVar3;
        ekse ekseVar4;
        if (ekseVar != null) {
            if (ekseVar2 == null || ekseVar == (ekseVar3 = c) || ekseVar2 == (ekseVar4 = d)) {
                return ekseVar;
            }
            if (ekseVar2 != ekseVar3 && ekseVar != ekseVar4) {
                return new eksb(ekseVar, ekseVar2);
            }
        }
        return ekseVar2;
    }

    protected abstract void a();
}
