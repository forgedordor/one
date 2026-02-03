package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqu extends rqh implements rht {
    public rqu(rqs rqsVar) {
        super(rqsVar);
    }

    @Override // defpackage.rhy
    public final int a() {
        rqz rqzVar = ((rqs) this.a).a.a;
        rck rckVar = (rck) rqzVar.a;
        return rckVar.a.limit() + rckVar.c.length + (rckVar.d.length * 4) + rqzVar.j;
    }

    @Override // defpackage.rhy
    public final Class b() {
        return rqs.class;
    }

    @Override // defpackage.rqh, defpackage.rht
    public final void d() {
        ((rqs) this.a).a().prepareToDraw();
    }

    @Override // defpackage.rhy
    public final void e() {
        rig rigVar;
        rqs rqsVar = (rqs) this.a;
        rqsVar.stop();
        rqsVar.b = true;
        rqz rqzVar = rqsVar.a.a;
        rqzVar.b.clear();
        rqzVar.d();
        rqzVar.f();
        rqw rqwVar = rqzVar.e;
        if (rqwVar != null) {
            rqzVar.c.l(rqwVar);
            rqzVar.e = null;
        }
        rqw rqwVar2 = rqzVar.g;
        if (rqwVar2 != null) {
            rqzVar.c.l(rqwVar2);
            rqzVar.g = null;
        }
        rqw rqwVar3 = rqzVar.i;
        if (rqwVar3 != null) {
            rqzVar.c.l(rqwVar3);
            rqzVar.i = null;
        }
        rck rckVar = (rck) rqzVar.a;
        rckVar.f = null;
        byte[] bArr = rckVar.c;
        if (bArr != null) {
            rckVar.j.b(bArr);
        }
        int[] iArr = rckVar.d;
        if (iArr != null && (rigVar = rckVar.j.b) != null) {
            rigVar.c(iArr);
        }
        Bitmap bitmap = rckVar.g;
        if (bitmap != null) {
            rckVar.j.a(bitmap);
        }
        rckVar.g = null;
        rckVar.a = null;
        rckVar.h = null;
        byte[] bArr2 = rckVar.b;
        if (bArr2 != null) {
            rckVar.j.b(bArr2);
        }
        rqzVar.f = true;
    }
}
