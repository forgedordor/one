package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crrq {
    private static final cqce a = cqce.g("BugleRcs", "MessageLogDecorator");

    public static elpg a(byte[] bArr) {
        try {
        } catch (evtj e) {
            a.s("Failed to parse the log data from additional message details.", e);
        }
        if (bArr != null) {
            return (elpg) evsn.parseFrom(elpg.b, bArr, evrr.a());
        }
        a.r("Could not find log data in additional message details.");
        return elpg.b;
    }
}
