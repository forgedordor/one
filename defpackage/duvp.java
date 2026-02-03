package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvp implements echs, dxfa, duve {
    public final Executor a;
    public final HashMap b;
    public final HashMap c;
    public final duag d;
    private final duup e;

    public duvp(diep diepVar, Executor executor) {
        duag duagVar = new duag(diepVar);
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = duagVar;
        this.a = new eoss(executor);
        this.e = new duup(duagVar, executor);
    }

    @Override // defpackage.echs
    public final echr a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.echs
    public final echr b(Uri uri) {
        synchronized (duvp.class) {
            String str = (String) this.b.get(uri);
            if (str == null) {
                return this.e.b(uri);
            }
            HashMap map = this.c;
            if (map.get(str) == null) {
                durt.c("%s: Can't find file group for uri: %s. DownloadListener was not added.", "DownloadProgressMonitor", uri);
                return null;
            }
            return (echr) map.get(str);
        }
    }

    @Override // defpackage.dxfa
    public final void e() {
        synchronized (duvp.class) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                ((duvo) ((ecgv) it.next()).a).a.b();
            }
            this.e.e();
        }
    }

    @Override // defpackage.duve
    public final void f(Uri uri) {
        this.e.f(uri);
    }

    @Override // defpackage.duve
    public final void g(Uri uri, bxov bxovVar) {
        this.e.g(uri, bxovVar);
    }

    public final void i(String str, long j) {
        synchronized (duvp.class) {
            HashMap map = this.c;
            if (map.containsKey(str)) {
                ((ecgv) map.get(str)).a.a(j);
            }
        }
    }

    public final void j(String str) {
        synchronized (duvp.class) {
            this.c.remove(str);
        }
    }

    @Override // defpackage.dxfa
    public final void c() {
    }

    @Override // defpackage.dxfa
    public final void d() {
    }

    @Override // defpackage.echs
    public final void h() {
    }
}
