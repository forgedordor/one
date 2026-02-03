package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evja implements evst {
    CUSTOM_UI_TYPE_UNKNOWN(0),
    CUSTOM_UI_TYPE_GROWTH_CATALOG_DIALOG(1),
    GROWTH_CATALOG_IOS_CUSTOM_UI_ID(2),
    CUSTOM_UI_TYPE_UI_TESTING_ID(3),
    CUSTOM_UI_TYPE_ANDROID_DESKTOP_GROWTH_NUDGE(4);

    public final int f;

    evja(int i) {
        this.f = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
