package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrc extends fbrb {
    private final fbra e;

    public fbrc(String str, fbra fbraVar) {
        super(str, false, fbraVar);
        ejwl.i(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        ejwl.b(str.length() > 4, "empty key name");
        this.e = fbraVar;
    }

    @Override // defpackage.fbrb
    public final Object a(byte[] bArr) {
        return this.e.b(new ByteArrayInputStream(bArr));
    }

    @Override // defpackage.fbrb
    public final byte[] b(Object obj) {
        return fbrg.l(this.e.a(obj));
    }

    @Override // defpackage.fbrb
    public final boolean c() {
        return true;
    }
}
