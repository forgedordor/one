package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqw extends fbrb {
    private final fbqx e;

    public fbqw(String str, fbqx fbqxVar) {
        super(str, false, fbqxVar);
        ejwl.i(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        fbqxVar.getClass();
        this.e = fbqxVar;
    }

    @Override // defpackage.fbrb
    public final Object a(byte[] bArr) {
        return this.e.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.fbrb
    public final byte[] b(Object obj) {
        return this.e.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
