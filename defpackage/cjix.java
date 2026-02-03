package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cjix implements evst {
    MESSAGING_METHOD_UNKNOWN(0),
    MESSAGING_METHOD_CHAT(1),
    MESSAGING_METHOD_SLM(2);

    public final int d;

    cjix(int i) {
        this.d = i;
    }

    public static cjix b(int i) {
        if (i == 0) {
            return MESSAGING_METHOD_UNKNOWN;
        }
        if (i == 1) {
            return MESSAGING_METHOD_CHAT;
        }
        if (i != 2) {
            return null;
        }
        return MESSAGING_METHOD_SLM;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
