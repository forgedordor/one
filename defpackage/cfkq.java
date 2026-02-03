package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfkq {
    private static final cczi b = cdag.c(cdag.b, "ditto_max_percent_of_max_message_size", 0.8d);
    public static final cczi a = cdag.e(cdag.b, "ditto_server_max_message_size_bytes", 204800);

    public static int a() {
        return (int) (((Double) b.e()).doubleValue() * ((Integer) a.e()).intValue());
    }
}
