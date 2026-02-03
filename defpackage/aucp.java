package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum aucp implements evst {
    UNKNOWN_TYPE(0),
    SUBJECT_UPDATE(1),
    REMOVE_PARTICIPANT_BY_ALL(2),
    REMOVE_PARTICIPANT_BY_ADMIN(3),
    ICON_UPDATE(4),
    INVITE_LINK_UPDATE(5);

    public final int g;

    aucp(int i) {
        this.g = i;
    }

    public static aucp b(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return SUBJECT_UPDATE;
        }
        if (i == 2) {
            return REMOVE_PARTICIPANT_BY_ALL;
        }
        if (i == 3) {
            return REMOVE_PARTICIPANT_BY_ADMIN;
        }
        if (i == 4) {
            return ICON_UPDATE;
        }
        if (i != 5) {
            return null;
        }
        return INVITE_LINK_UPDATE;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
