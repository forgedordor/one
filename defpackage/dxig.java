package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxig {
    public static final eksp a = eksp.c("GnpSdk");

    public static final /* synthetic */ evih a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (evih) evsn.parseFrom(evih.a, bArr, evrr.a());
        } catch (evtj e) {
            ((eksl) ((eksl) a.i()).g(e)).q("Failed to parse AndroidPayload proto.");
            return null;
        }
    }
}
