package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnaf extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dnbo c;
    final /* synthetic */ dnau d;
    final /* synthetic */ ujf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnaf(dnbo dnboVar, ujf ujfVar, dnau dnauVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnboVar;
        this.e = ujfVar;
        this.d = dnauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnaf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        View view = null;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dnbo dnboVar = this.c;
            this.a = dnboVar;
            this.b = 1;
            if (fcylVar == null) {
                return null;
            }
            obj2 = dnboVar;
            obj = null;
        }
        View view2 = (View) obj;
        if (view2 != null) {
            this.d.bi(true);
            view = view2;
        }
        ((dnbo) obj2).e.d(dnbo.a[0], view);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnaf(this.c, this.e, this.d, fcxyVar);
    }
}
