package defpackage;

import android.os.Build;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhud implements dhuh {
    private final dhuj a;
    private final dhtz b;
    private final Optional c;
    private final Optional d;
    private final Optional e;
    private final List f;

    public dhud(dhuj dhujVar, dhtz dhtzVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = dhujVar;
        this.b = dhtzVar;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        dhuh[] dhuhVarArr = new dhuh[2];
        dhuhVarArr[0] = (Build.VERSION.SDK_INT < 30 || !((Boolean) fdct.a(optional, false)).booleanValue()) ? null : dhujVar;
        dhuhVarArr[1] = true != ((Boolean) fdct.a(optional2, true)).booleanValue() ? null : dhtzVar;
        this.f = fcur.K(dhuhVarArr);
    }

    @Override // defpackage.dhuh
    public final void a(dhnv dhnvVar, dhwj dhwjVar, sfp sfpVar) {
        dhwjVar.getClass();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dhuh) it.next()).a(dhnvVar, dhwjVar, sfpVar);
        }
    }

    @Override // defpackage.dhuh
    public final void b(dhnv dhnvVar, evqs evqsVar, sep sepVar) {
        dhnvVar.getClass();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dhuh) it.next()).b(dhnvVar, evqsVar, sepVar);
        }
    }

    @Override // defpackage.dhuh
    public final void c(dhnv dhnvVar, evqs evqsVar, ser serVar) {
        dhnvVar.getClass();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dhuh) it.next()).c(dhnvVar, evqsVar, serVar);
        }
    }

    @Override // defpackage.dhuh
    public final void d(dhnv dhnvVar, evqs evqsVar, long j, dhuo dhuoVar, int i, int i2) {
        dhnvVar.getClass();
        evqsVar.getClass();
        dhuoVar.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dhuh) it.next()).d(dhnvVar, evqsVar, j, dhuoVar, i, i2);
        }
    }

    @Override // defpackage.dhuh
    public final void e(dhnv dhnvVar, long j, evqs evqsVar, int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((dhuh) it.next()).e(dhnvVar, j, evqsVar, i, i2);
        }
    }

    @Override // defpackage.dhuh
    public final void f(dhnv dhnvVar, int i) {
        if (((Boolean) fdct.a(this.e, false)).booleanValue()) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((dhuh) it.next()).f(dhnvVar, i);
            }
        }
    }
}
