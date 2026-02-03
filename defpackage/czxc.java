package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czxc extends czxd {
    private final czxo a;

    public czxc(czxo czxoVar) {
        this.a = czxoVar;
    }

    @Override // defpackage.czxd
    public final czxo a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czxd) {
            return this.a.equals(((czxd) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReminderDateTimePickerEvent{reminderDialogData=" + this.a.toString() + "}";
    }
}
