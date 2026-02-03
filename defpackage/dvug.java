package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dvug {
    UNKNOWN(0),
    PHONE_NUMBER(1),
    EMAIL(2),
    HANDLER(3),
    GROUP(4),
    DEVICE_ID(5);

    public final int g;

    dvug(int i) {
        this.g = i;
    }

    public static dvug a(final int i) {
        return (dvug) ekeh.e(values()).a(new ejwm() { // from class: dvuf
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dvug) obj).g == i;
            }
        }).e(UNKNOWN);
    }
}
