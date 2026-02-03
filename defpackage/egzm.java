package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egzm {
    public static final egzm a = new egzm(egzk.LOCAL_STATE_CHANGE);
    public static final egzm b = new egzm(egzk.REMOTE_STATE_CHANGE);
    public final egzk c;

    private egzm(egzk egzkVar) {
        this.c = egzkVar;
    }

    public final String toString() {
        return "ResultPropagator.Update for CallReason ".concat(String.valueOf(String.valueOf(this.c)));
    }
}
