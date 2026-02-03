package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cygu extends fcyz implements fdap {
    int a;
    final /* synthetic */ cyha b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cygu(cyha cyhaVar, boolean z, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = cyhaVar;
        this.c = z;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cyha cyhaVar = this.b;
            boolean z = this.c;
            this.a = 1;
            cygf cygfVar = cyhaVar.a.a;
            obj = fdin.a(eicg.a(cygfVar.a), new cyge(null, cygfVar, z), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        cygh.c(this.b.b.a, (Uri) obj, true);
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cygu(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
