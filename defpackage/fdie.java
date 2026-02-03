package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdie extends fdlx {
    public fdks a;
    public final fdhz b = new fdhz(null, fdia.a);
    final /* synthetic */ fdig c;
    private final fdis h;

    public fdie(fdig fdigVar, fdis fdisVar) {
        this.c = fdigVar;
        this.h = fdisVar;
    }

    @Override // defpackage.fdlx
    public final void a(Throwable th) {
        if (th != null) {
            fdis fdisVar = this.h;
            fdzi fdziVarJ = ((fdiu) fdisVar).J(new fdjg(th), null);
            if (fdziVarJ != null) {
                fdisVar.c(fdziVarJ);
                fdif fdifVar = (fdif) this.b.a;
                if (fdifVar != null) {
                    fdifVar.a();
                    return;
                }
                return;
            }
            return;
        }
        fdig fdigVar = this.c;
        if (fdigVar.b.a() == 0) {
            fdis fdisVar2 = this.h;
            fdkf[] fdkfVarArr = fdigVar.a;
            ArrayList arrayList = new ArrayList(fdkfVarArr.length);
            for (fdkf fdkfVar : fdkfVarArr) {
                arrayList.add(fdkfVar.d());
            }
            fdisVar2.w(arrayList);
        }
    }

    @Override // defpackage.fdlx
    public final boolean b() {
        return false;
    }
}
