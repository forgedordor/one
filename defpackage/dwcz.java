package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwcz implements fbqz {
    @Override // defpackage.fbqz
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return (ezqf) evsn.parseFrom(ezqf.a, bArr, evrr.a());
        } catch (evtj e) {
            dvhv.d("RpcErrorUtils", "Error parsing TachyonError", e);
            return ezqf.a;
        }
    }

    @Override // defpackage.fbqz
    public final /* synthetic */ byte[] b(Object obj) {
        return ((ezqf) obj).toByteArray();
    }
}
