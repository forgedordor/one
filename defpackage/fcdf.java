package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdf extends fbrv {
    private static final boolean a = fbtb.b(fcdf.class.getClassLoader());

    @Override // defpackage.fbrp
    public final fbru a(URI uri, fbrn fbrnVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        path.getClass();
        ejwl.i(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new fcde(strSubstring, fbrnVar, fcdy.o, new ejxm(), a);
    }

    @Override // defpackage.fbrp
    public final String b() {
        return "dns";
    }

    @Override // defpackage.fbrv
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.fbrv
    protected final void d() {
    }

    @Override // defpackage.fbrv
    public final void e() {
    }
}
