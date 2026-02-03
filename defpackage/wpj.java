package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpj extends fcyz implements fdat {
    int a;
    final /* synthetic */ wpk b;
    final /* synthetic */ vvr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpj(wpk wpkVar, vvr vvrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wpkVar;
        this.c = vvrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wpk wpkVar = this.b;
            this.a = 1;
            obj = wpkVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            vvr vvrVar = this.c;
            vvq vvqVar = vvrVar.b;
            if (vvqVar.e == null) {
                fdci fdciVar = new fdci();
                vvrVar.getClass();
                Uri uri = vvqVar.c;
                dltd dltdVar = vvrVar.a;
                doif doifVarC = vvt.c(dltdVar);
                if (uri == null) {
                    uri = dltdVar instanceof dltn ? Uri.parse(((dltn) dltdVar).f()) : null;
                }
                if (uri != null) {
                    fdciVar.a = this.b.b(doifVarC, uri);
                }
                Object obj2 = fdciVar.a;
                if (obj2 == null) {
                    return null;
                }
                return vvr.b(vvrVar, vvq.a(vvqVar, null, null, null, (fdkf) obj2, 47));
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wpj(this.b, this.c, fcxyVar);
    }
}
