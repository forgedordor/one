package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwrz {
    UNKNOWN(0),
    PLATFORM_DEFAULT_LIGHT(1),
    PLATFORM_DEFAULT_REGULAR(2),
    PLATFORM_DEFAULT_MEDIUM(3),
    PLATFORM_DEFAULT_BOLD(4),
    GOOGLE_SANS_REGULAR(5),
    GOOGLE_SANS_MEDIUM(6),
    GOOGLE_SANS_BOLD(7),
    ROBOTO_REGULAR(8);

    public final int j;

    dwrz(int i) {
        this.j = i;
    }

    public static dwrz a(final int i) {
        return (dwrz) ekeh.e(values()).a(new ejwm() { // from class: dwry
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dwrz) obj).j == i;
            }
        }).e(UNKNOWN);
    }
}
