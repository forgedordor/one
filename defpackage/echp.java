package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class echp implements echo {
    @Override // defpackage.echo
    public final long a(Uri uri) {
        return r().a(q(uri));
    }

    @Override // defpackage.echo
    public Pair b(Uri uri) {
        throw null;
    }

    @Override // defpackage.echo
    public final ecgd c() {
        return ((ecfn) r()).a;
    }

    @Override // defpackage.echo
    public /* synthetic */ File d(Uri uri) {
        throw null;
    }

    @Override // defpackage.echo
    public InputStream e(Uri uri) {
        throw null;
    }

    @Override // defpackage.echo
    public final OutputStream f(Uri uri) {
        return r().f(q(uri));
    }

    @Override // defpackage.echo
    public final OutputStream g(Uri uri) {
        return r().g(q(uri));
    }

    @Override // defpackage.echo
    public final Iterable h(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Iterator it = r().h(q(uri)).iterator();
        while (it.hasNext()) {
            arrayList.add(p((Uri) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.echo
    public final void j(Uri uri) {
        r().j(q(uri));
    }

    @Override // defpackage.echo
    public final void k(Uri uri) {
        r().k(q(uri));
    }

    @Override // defpackage.echo
    public final void l(Uri uri) {
        r().l(q(uri));
    }

    @Override // defpackage.echo
    public final void m(Uri uri, Uri uri2) {
        r().m(q(uri), q(uri2));
    }

    @Override // defpackage.echo
    public boolean n(Uri uri) {
        throw null;
    }

    @Override // defpackage.echo
    public final boolean o(Uri uri) {
        return r().o(q(uri));
    }

    protected Uri p(Uri uri) {
        throw null;
    }

    protected Uri q(Uri uri) {
        throw null;
    }

    protected abstract echo r();
}
