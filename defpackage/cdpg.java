package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cdpg {
    HOME(0),
    ARCHIVED(1),
    SPAM_FOLDER(2);

    public final int d;

    cdpg(int i) {
        this.d = i;
    }

    public final bcvf a() {
        bcvf bcvfVarN = bcvg.n();
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            ((bbmq) bcvfVarN).a = true;
            return bcvfVarN;
        }
        if (iOrdinal != 2) {
            ((bbmq) bcvfVarN).b = true;
            return bcvfVarN;
        }
        ((bbmq) bcvfVarN).c = true;
        return bcvfVarN;
    }

    public final boolean b() {
        return this == HOME;
    }
}
