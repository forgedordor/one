package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feth extends feno {
    private static final long serialVersionUID = -8581904779721020689L;
    private final URI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feth(String str) throws URISyntaxException {
        super("DIR");
        URI uriB = fexd.b(fexb.e(str));
        int i = feop.a;
        this.b = uriB;
    }

    @Override // defpackage.fenc
    public final String a() {
        String strF = fexb.f(this.b);
        int i = fexd.a;
        return strF;
    }
}
