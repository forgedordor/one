package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum djit implements evst {
    VOICE_BUTTON_BACKGROUND_DEFAULT(0),
    VOICE_BUTTON_BACKGROUND_PRIMARY(1),
    VOICE_BUTTON_BACKGROUND_TERTIARY_CONTAINER(2),
    UNRECOGNIZED(-1);

    private final int f;

    djit(int i) {
        this.f = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
