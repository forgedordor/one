package defpackage;

import android.os.Bundle;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcvk {
    public dcvl a;
    public Bundle b;
    public LinkedList c;
    private final dcvc d = new dcvc(this);

    public final void a(int i) {
        while (!this.c.isEmpty() && ((dcvj) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    public final void b(Bundle bundle, dcvj dcvjVar) {
        if (this.a != null) {
            dcvjVar.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(dcvjVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        c(this.d);
    }

    protected abstract void c(dcvc dcvcVar);
}
