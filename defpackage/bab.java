package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bab implements bbm {
    protected final bbm a;
    private final Object b = new Object();
    private final Set c = new HashSet();

    protected bab(bbm bbmVar) {
        this.a = bbmVar;
    }

    @Override // defpackage.bbm
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.bbm
    public int b() {
        return this.a.b();
    }

    @Override // defpackage.bbm
    public int c() {
        return this.a.c();
    }

    @Override // defpackage.bbm, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.a.close();
        synchronized (this.b) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((baa) it.next()).k(this);
        }
    }

    @Override // defpackage.bbm
    public final Image d() {
        return this.a.d();
    }

    @Override // defpackage.bbm
    public bbh e() {
        return this.a.e();
    }

    @Override // defpackage.bbm
    public final bbl[] f() {
        return this.a.f();
    }

    public final void g(baa baaVar) {
        synchronized (this.b) {
            this.c.add(baaVar);
        }
    }
}
