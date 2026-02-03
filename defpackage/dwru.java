package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dwru {
    UNKNOWN(0),
    TITLE(1),
    SUBTITLE(2),
    BODY_TEXT(3),
    CAPTION_TEXT(4),
    LABEL_TEXT(5);

    public final int g;

    dwru(int i) {
        this.g = i;
    }

    public static dwru a(final int i) {
        return (dwru) ekeh.e(values()).a(new ejwm() { // from class: dwrt
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dwru) obj).g == i;
            }
        }).e(UNKNOWN);
    }
}
