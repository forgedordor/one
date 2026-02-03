package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwrx {
    UNKNOWN(0),
    BOLD(1),
    ITALIC(2),
    UNDERLINE(3),
    STRIKETHROUGH(4),
    SUPERSCRIPT(5),
    SUBSCRIPT(6),
    COLOR(7),
    BACKGROUND_COLOR(8),
    SIZE(9),
    TYPEFACE_LIST(10),
    HORIZONTAL_ALIGNMENT(11),
    HYPER_LINK(12);

    public final int n;

    dwrx(int i) {
        this.n = i;
    }

    public static dwrx a(final int i) {
        return (dwrx) ekeh.e(values()).a(new ejwm() { // from class: dwrw
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dwrx) obj).n == i;
            }
        }).e(UNKNOWN);
    }
}
