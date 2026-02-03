package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbre extends fbrb {
    private final fbrf e;

    public fbre(String str, boolean z, fbrf fbrfVar) {
        super(str, z, fbrfVar);
        ejwl.i(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        fbrfVar.getClass();
        this.e = fbrfVar;
    }

    @Override // defpackage.fbrb
    public final Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.fbrb
    public final byte[] b(Object obj) {
        byte[] bArrB = this.e.b(obj);
        bArrB.getClass();
        return bArrB;
    }
}
