package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aian {
    DATABASE_RESTORE(2),
    RESTORE_ATTACHMENT(3),
    NOTIFY_LISTENERS(4),
    FINALIZE_RESTORE(5),
    REFRESH_CONVERSATIONS(7),
    CLOUD_RESTORE_SCHEDULING_REQUEST(8),
    MESSAGESRESTOREWORKTYPE_NOT_SET(0);

    public final int h;

    aian(int i2) {
        this.h = i2;
    }

    public static aian a(int i2) {
        if (i2 == 0) {
            return MESSAGESRESTOREWORKTYPE_NOT_SET;
        }
        if (i2 == 2) {
            return DATABASE_RESTORE;
        }
        if (i2 == 3) {
            return RESTORE_ATTACHMENT;
        }
        if (i2 == 4) {
            return NOTIFY_LISTENERS;
        }
        if (i2 == 5) {
            return FINALIZE_RESTORE;
        }
        if (i2 == 7) {
            return REFRESH_CONVERSATIONS;
        }
        if (i2 != 8) {
            return null;
        }
        return CLOUD_RESTORE_SCHEDULING_REQUEST;
    }
}
