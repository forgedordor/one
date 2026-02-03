package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duup implements echs, dxfa, duve {
    public final Executor a;
    public final HashMap b = new HashMap();
    public final duag c;

    public duup(duag duagVar, Executor executor) {
        this.c = duagVar;
        this.a = new eoss(executor);
    }

    @Override // defpackage.echs
    public final echr a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.echs
    public final echr b(Uri uri) {
        synchronized (duup.class) {
            HashMap map = this.b;
            if (map.get(uri) == null) {
                return null;
            }
            return (echr) map.get(uri);
        }
    }

    @Override // defpackage.dxfa
    public final void e() {
        synchronized (duup.class) {
            Iterator it = this.b.values().iterator();
            while (it.hasNext()) {
                bxov bxovVar = ((duuo) it.next()).c;
                cqbd cqbdVarC = bxox.a.c();
                cqbdVarC.I("onPausedForConnectivity");
                cqbdVarC.N("url", bxovVar.c);
                cqbdVarC.r();
            }
        }
    }

    @Override // defpackage.duve
    public final void f(Uri uri) {
        synchronized (duup.class) {
            this.b.remove(uri);
        }
    }

    @Override // defpackage.duve
    public final void g(Uri uri, bxov bxovVar) {
        synchronized (duup.class) {
            HashMap map = this.b;
            if (!map.containsKey(uri)) {
                map.put(uri, new duuo(this, uri, bxovVar));
            }
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
