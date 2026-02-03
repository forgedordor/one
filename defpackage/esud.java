package defpackage;

import java.net.URI;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esud extends fbrv {
    public final ejxr a;

    public esud(ejxr ejxrVar) {
        this.a = ejxx.a(ejxrVar);
    }

    @Override // defpackage.fbrp
    public final fbru a(URI uri, fbrn fbrnVar) {
        if (uri.getScheme().equals("lazyserver")) {
            return new esuc(this);
        }
        return null;
    }

    @Override // defpackage.fbrp
    public final String b() {
        return "lazyserver";
    }

    @Override // defpackage.fbrv
    public final /* synthetic */ Collection c() {
        int i = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.fbrv
    public final void d() {
    }

    @Override // defpackage.fbrv
    public final void e() {
    }
}
