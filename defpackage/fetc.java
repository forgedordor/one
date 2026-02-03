package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetc extends feno {
    private static final long serialVersionUID = -2445932592596993470L;
    private final URI b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetc(String str) throws URISyntaxException {
        super("ALTREP");
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
