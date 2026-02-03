package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drhy {
    public static evuh a(evuh evuhVar, byte[] bArr) {
        try {
            return evuhVar.toBuilder().mergeFrom(bArr, evrr.a()).build();
        } catch (evtj e) {
            throw new IllegalStateException(e);
        }
    }
}
