package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxa implements fdpm {
    final /* synthetic */ fdci a;
    final /* synthetic */ swy b;
    final /* synthetic */ sxe c;
    final /* synthetic */ Uri d;

    public sxa(fdci fdciVar, swy swyVar, sxe sxeVar, Uri uri) {
        this.a = fdciVar;
        this.b = swyVar;
        this.c = sxeVar;
        this.d = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        swi swiVar = (swi) obj;
        if (swiVar instanceof swg) {
            ((fdlr) this.a.a).z();
        } else {
            if (!(swiVar instanceof swh)) {
                throw new fctg();
            }
            exxu exxuVar = ((swh) swiVar).a.b;
            if (exxuVar == null) {
                exxuVar = exxu.a;
            }
            swy swyVar = this.b;
            sxe sxeVar = this.c;
            Uri uri = this.d;
            int i = exxuVar.b;
            if (i == 2) {
                exxo exxoVar = (exxo) exxuVar.c;
                exxoVar.getClass();
                swyVar.b();
                String str = (String) exxoVar.b.get(0);
                StringBuilder sb = swyVar.b;
                if (sb.length() > 0) {
                    sb.append(" ");
                    sb.append(str);
                    swyVar.c = str.length() + 1;
                } else {
                    sb.append(str);
                    swyVar.c = str.length();
                }
                exyc exycVar = exxoVar.c;
                if (exycVar == null) {
                    exycVar = exyc.a;
                }
                swyVar.d = eoob.c(exycVar.b);
                sxeVar.a(uri, swyVar);
            } else if (i == 1) {
                exxh exxhVar = (exxh) exxuVar.c;
                exxhVar.getClass();
                swyVar.b();
                swyVar.b.append((String) exxhVar.b.get(0));
                exyc exycVar2 = exxhVar.c;
                if (exycVar2 == null) {
                    exycVar2 = exyc.a;
                }
                swyVar.d = eoob.c(exycVar2.b);
                sxeVar.a(uri, swyVar);
            }
        }
        return fctx.a;
    }
}
