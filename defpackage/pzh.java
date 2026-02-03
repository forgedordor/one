package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzh {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private qlh g = new qlh((byte[]) null);
    private int i = 1;
    public long e = -1;
    public long f = -1;
    private final Set h = new LinkedHashSet();

    public final pzj a() {
        Set setAv = fcva.av(this.h);
        return new pzj(this.g, this.i, this.a, this.b, this.c, this.d, this.e, this.f, setAv);
    }

    public final void b(Uri uri, boolean z) {
        uri.getClass();
        this.h.add(new pzi(uri, z));
    }

    public final void c(int i) {
        this.i = i;
        this.g = new qlh((byte[]) null);
    }
}
