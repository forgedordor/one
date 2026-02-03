package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jph extends fcyz implements fdat {
    int a;
    final /* synthetic */ hqq b;
    final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jph(hqq hqqVar, View view, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hqqVar;
        this.c = view;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jph) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                hqq hqqVar = this.b;
                this.a = 1;
                Object objB = fdtc.b(hqqVar.q, new hqk(null), this);
                if (objB != obj2) {
                    objB = fctx.a;
                }
                if (objB == obj2) {
                    return obj2;
                }
            }
            View view = this.c;
            if (jpq.a(view) == this.b) {
                jpq.b(view, null);
            }
            return fctx.a;
        } catch (Throwable th) {
            View view2 = this.c;
            if (jpq.a(view2) == this.b) {
                jpq.b(view2, null);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new jph(this.b, this.c, fcxyVar);
    }
}
