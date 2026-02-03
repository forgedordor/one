package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsnu extends fcyz implements fdat {
    int a;
    final /* synthetic */ evje b;
    final /* synthetic */ dsoa c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnu(evje evjeVar, dsoa dsoaVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = evjeVar;
        this.c = dsoaVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            evje evjeVar = this.b;
            if (evjeVar == evje.FETCH_REASON_UNSPECIFIED) {
                Objects.toString(evjeVar);
                return new dxfp("Invalid fetchReason - ".concat(String.valueOf(evjeVar)), 20);
            }
            ArrayList arrayList = new ArrayList();
            dsoa dsoaVar = this.c;
            dsnr dsnrVar = new dsnr(dsoaVar, null);
            fdjx fdjxVar = dsoaVar.j;
            arrayList.add(fdil.c(fdjxVar, null, dsnrVar, 3));
            String str = this.d;
            if (str == null && fbdp.c()) {
                arrayList.add(fdil.c(fdjxVar, null, new dsns(dsoaVar, evjeVar, null), 3));
            }
            if (str != null && fbdp.b()) {
                arrayList.add(fdil.c(fdjxVar, null, new dsnt(dsoaVar, str, evjeVar, null), 3));
            }
            this.a = 1;
            obj = fdii.a(arrayList, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return dxfv.a((List) obj, dsoa.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnu(this.b, this.c, this.d, fcxyVar);
    }
}
