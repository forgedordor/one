package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqy extends fbrb {
    private final fbqz e;

    public fbqy(String str, fbqz fbqzVar) {
        super(str, false, fbqzVar);
        ejwl.i(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        ejwl.b(str.length() > 4, "empty key name");
        fbqzVar.getClass();
        this.e = fbqzVar;
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
