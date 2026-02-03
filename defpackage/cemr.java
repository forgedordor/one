package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cemr implements fbqz {
    @Override // defpackage.fbqz
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        if (bArr == null) {
            return ezqf.a;
        }
        try {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            return (ezqf) evsn.parseFrom(ezqf.a, bArr, evrr.a);
        } catch (evtj unused) {
            return ezqf.a;
        }
    }

    @Override // defpackage.fbqz
    public final /* synthetic */ byte[] b(Object obj) {
        return ((ezqf) obj).toByteArray();
    }
}
