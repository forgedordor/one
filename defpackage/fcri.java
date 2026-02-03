package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcri implements fbqz {
    private final evuh a;

    public fcri(evuh evuhVar) {
        this.a = evuhVar;
    }

    @Override // defpackage.fbqz
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return this.a.getParserForType().l(bArr, fcrj.a);
        } catch (evtj e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.fbqz
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((evuh) obj).toByteArray();
    }
}
