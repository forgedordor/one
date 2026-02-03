package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwxg extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwxf b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwxg(fcxy fcxyVar, cwxf cwxfVar, List list) {
        super(2, fcxyVar);
        this.b = cwxfVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwxg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean zBooleanValue;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                cwxf cwxfVar = this.b;
                ains ainsVar = cwxfVar.e;
                ainsVar.c("Bugle.UI.LeaveRcsGroup.Click");
                List list = this.c;
                ainsVar.e("Bugle.UI.LeaveRcsGroup.LeftGroupCount", list.size());
                eiju eijuVarS = ((ajln) cwxfVar.c.b()).s(ekfv.a(list));
                eijuVarS.getClass();
                this.a = 1;
                obj = fdxs.c(eijuVarS, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            obj.getClass();
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (UnsupportedOperationException e) {
            ((eksl) ((eksl) cwxf.a.i()).g(e)).q("Failed to leave one or more groups, exception thrown");
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            cwxf.a.n().q("Successfully left one or more groups");
            this.b.e.c("Bugle.UI.LeaveRcsGroup.Success");
        } else {
            cwxf.a.n().q("Failed to leave one or more groups");
            this.b.e.c("Bugle.UI.LeaveRcsGroup.Failure");
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cwxg cwxgVar = new cwxg(fcxyVar, this.b, this.c);
        cwxgVar.d = obj;
        return cwxgVar;
    }
}
