package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffaf {
    public final ffao a;
    public final fexe b;
    public final ffaj c;
    public ffar d;
    public ffas e;
    public int f;
    public int g;
    public int h;
    public fezl i;

    public ffaf(ffao ffaoVar, fexe fexeVar, ffaj ffajVar) {
        this.a = ffaoVar;
        this.b = fexeVar;
        this.c = ffajVar;
    }

    public final void a(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof ffda) && ((ffda) iOException).a == 8) {
            this.f++;
        } else if (iOException instanceof ffbo) {
            this.g++;
        } else {
            this.h++;
        }
    }

    public final boolean b(feyq feyqVar) {
        feyq feyqVar2 = this.b.i;
        return feyqVar.d == feyqVar2.d && fdbq.f(feyqVar.c, feyqVar2.c);
    }
}
