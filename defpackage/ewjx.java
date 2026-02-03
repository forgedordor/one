package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewjx implements evst {
    UNKNOWN_SERVICE(0),
    UNEXPECTED_SERVICE(1),
    CPM_SESSION_SERVICE(2),
    CPM_PAGER_MODE_SERVICE(3),
    CPM_LARGE_MESSAGE_MODE_SERVICE(4);

    public final int f;

    ewjx(int i) {
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
