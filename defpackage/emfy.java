package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum emfy implements evst {
    UNKNOWN_MESSAGE_TYPE(0),
    BASIC_MESSAGE(1),
    REACTION(2),
    REPLY(3);

    public final int e;

    emfy(int i) {
        this.e = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
