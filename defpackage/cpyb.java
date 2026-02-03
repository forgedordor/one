package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cpyb {
    UNDEFINED(0),
    MULTI_DEVICE(1),
    BACKUP_AND_RESTORE(2);

    public final int d;

    cpyb(int i) {
        this.d = i;
    }

    public static cpyb a(int i) {
        if (i == 0 || i == 1) {
            return MULTI_DEVICE;
        }
        if (i == 2) {
            return BACKUP_AND_RESTORE;
        }
        throw new IllegalArgumentException(a.g(i, "Unrecognized feature Id value: "));
    }
}
