package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erpv {
    public static final erpv a = new erpv("SHA256");
    public static final erpv b = new erpv("SHA384");
    public static final erpv c = new erpv("SHA512");
    private final String d;

    private erpv(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
