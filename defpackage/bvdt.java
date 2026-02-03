package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bvdt {
    SUCCEEDED(0),
    FAILED(1),
    TOO_LARGE(2),
    PENDING(3);

    public final int e;

    bvdt(int i) {
        this.e = i;
    }

    public final boolean a() {
        return this.e > 0;
    }
}
