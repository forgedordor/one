package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqdr extends fcyz implements fdap {
    int a;
    final /* synthetic */ dqee b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqdr(dqee dqeeVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dqeeVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Uri uri;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            uri = (Uri) obj;
        } else {
            dqee dqeeVar = this.b;
            dqdp dqdpVar = (dqdp) dqeeVar.m.c();
            if (dqdpVar instanceof dqdn) {
                this.a = 1;
                obj = dqeeVar.h(true, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                uri = (Uri) obj;
            } else if (dqdpVar instanceof dqdo) {
                uri = Uri.parse(((dqdo) dqdpVar).a.b);
            } else {
                if (!(dqdpVar instanceof dqdm) && !(dqdpVar instanceof dqdl)) {
                    throw new fctg();
                }
                uri = null;
            }
        }
        if (uri != null) {
            this.b.i(uri);
        }
        this.b.j();
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqdr(this.b, (fcxy) obj).b(fctx.a);
    }
}
