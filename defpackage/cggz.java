package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggz extends cglc {
    private final String a = "incoming_message_group_key";

    @Override // defpackage.cglc
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cglc) {
            return this.a.equals(((cglc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "NotificationSummaryBuilderInfo{groupKey=" + this.a + "}";
    }
}
