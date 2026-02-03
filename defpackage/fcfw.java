package defpackage;

import io.grpc.Status;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcfw extends fckp {
    final /* synthetic */ fbrk a;
    final /* synthetic */ fbnc b;
    final /* synthetic */ fbog c;
    final /* synthetic */ fcfx d;

    /* JADX WARN: Illegal instructions before constructor call */
    public fcfw(fcfx fcfxVar, fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fckq fckqVar, fcdz fcdzVar, fbog fbogVar) {
        this.a = fbrkVar;
        this.b = fbncVar;
        this.c = fbogVar;
        this.d = fcfxVar;
        fcgx fcgxVar = fcfxVar.b;
        super(fbrkVar, fbrgVar, fcgxVar.O, fcgxVar.P, fcgxVar.Q, fcgxVar.h(fbncVar), fcgxVar.i.c(), fckqVar, fcdzVar, fcfxVar.a);
    }

    @Override // defpackage.fckp
    public final Status p() {
        fcgw fcgwVar = this.d.b.A;
        synchronized (fcgwVar.a) {
            Status status = fcgwVar.c;
            if (status != null) {
                return status;
            }
            fcgwVar.b.add(this);
            return null;
        }
    }

    @Override // defpackage.fckp
    public final fcan q(fbrg fbrgVar, fbnl fbnlVar, int i, boolean z) {
        fbnc fbncVarG = this.b.g(fbnlVar);
        fbnm[] fbnmVarArrL = fcdy.l(fbncVarG);
        fbog fbogVarA = this.c.a();
        try {
            return this.d.b.z.d(this.a, fbrgVar, fbncVarG, fbnmVarArrL);
        } finally {
            this.c.f(fbogVarA);
        }
    }

    @Override // defpackage.fckp
    public final void r() {
        Status status;
        fcgw fcgwVar = this.d.b.A;
        synchronized (fcgwVar.a) {
            fcgwVar.b.remove(this);
            if (fcgwVar.b.isEmpty()) {
                status = fcgwVar.c;
                fcgwVar.b = new HashSet();
            } else {
                status = null;
            }
        }
        if (status != null) {
            fcgwVar.d.z.n(status);
        }
    }
}
