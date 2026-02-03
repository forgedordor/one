package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvd {
    public static final dsvk a = new dsvk() { // from class: dsuw
        @Override // defpackage.dsvk
        public final void a(dsvd dsvdVar) {
            dsvdVar.b();
        }
    };
    public static final dsvk b = new dsvk() { // from class: dsux
        @Override // defpackage.dsvk
        public final void a(dsvd dsvdVar) {
            dsvdVar.c();
        }
    };
    public final dsvp c;
    public final dsvk d;
    public final dsxb e;
    public dsxa f;
    public int g = -1;

    public dsvd(dsvp dsvpVar, dsvk dsvkVar, dsxb dsxbVar) {
        this.c = dsvpVar;
        this.d = dsvkVar;
        this.e = dsxbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dsvq a() {
        return (dsvq) this.c.build();
    }

    final void b() {
        boolean zO = this.f.o();
        if (zO) {
            this.e.c(this);
        }
        this.c.clear();
        if (zO) {
            this.e.b(this);
        }
    }

    final void c() {
        this.f.g();
        ejwl.l(!this.f.o());
        this.f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void d(dsvd dsvdVar) {
        ejwl.l(dsvdVar.f == null);
        ejwl.l(!e());
        ejwl.l(this.d == dsvdVar.d);
        boolean zO = this.f.o();
        if (zO) {
            this.e.c(this);
        }
        dsvp dsvpVar = this.c;
        dsvpVar.clear();
        dsvpVar.mergeFrom((dsvp) dsvdVar.c.build());
        if (zO) {
            this.e.b(this);
        }
    }

    public final boolean e() {
        eohx eohxVar = ((dsvq) this.c.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        return (eohxVar.b & 8) != 0;
    }

    public final boolean f() {
        eohx eohxVar = ((dsvq) this.c.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        return (eohxVar.b & 2048) != 0;
    }

    public final void g() {
        Set set = this.e.a;
        if (!set.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "ImpressionCleared: ".concat(toString()));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((dswy) it.next()).a(this);
            }
        }
        dsvp dsvpVar = this.c;
        eohx eohxVar = ((dsvq) dsvpVar.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        eohw eohwVar = (eohw) eohxVar.toBuilder();
        eohwVar.copyOnWrite();
        eohx eohxVar2 = (eohx) eohwVar.instance;
        eohxVar2.e = null;
        eohxVar2.b &= -2049;
        eohwVar.copyOnWrite();
        eohx eohxVar3 = (eohx) eohwVar.instance;
        eohxVar3.b &= -2;
        eohxVar3.c = -1;
        eohx eohxVar4 = (eohx) eohwVar.build();
        dsvpVar.copyOnWrite();
        dsvq dsvqVar = (dsvq) dsvpVar.instance;
        eohxVar4.getClass();
        dsvqVar.d = eohxVar4;
        dsvqVar.b |= 1;
    }

    public final int h() {
        return this.f.t();
    }

    public final void i(int i) {
        if (i != 1) {
            i = 2;
        }
        ejwl.b(true, "Repressed visibility is not yet supported.");
        this.f.u(i);
    }

    public final String toString() {
        dsxa dsxaVar = this.f;
        String strConcat = dsxaVar != null ? ".".concat(String.valueOf(dsxaVar.getClass().getSimpleName())) : "";
        eohx eohxVar = ((dsvq) this.c.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        return "CVE" + strConcat + "#" + eohxVar.d + " [" + Integer.toHexString(hashCode()) + "]";
    }
}
