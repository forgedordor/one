package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwrs {
    UNKNOWN(0),
    INDENTATION(1),
    BULLET(2);

    public final int d;

    dwrs(int i) {
        this.d = i;
    }

    public static dwrs a(final int i) {
        return (dwrs) ekeh.e(values()).a(new ejwm() { // from class: dwrr
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dwrs) obj).d == i;
            }
        }).e(UNKNOWN);
    }
}
