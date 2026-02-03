package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebyc {
    public final ebyd a;
    public final Object b = new Object();
    public final Object c = new Object();
    public ebxz d;
    public ebxz e;

    public ebyc(ebyd ebydVar) {
        this.a = ebydVar;
    }

    public static final void b() {
        throw new IllegalStateException("metadataVersion == null. ExpressiveStickerClient#maybeSyncWithServer() must be invoked first.");
    }

    public final String a() {
        String str;
        synchronized (this.b) {
            ebxz ebxzVar = this.d;
            str = ebxzVar == null ? null : ebxzVar.c;
        }
        return str;
    }
}
