package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xjl extends fcyz implements fdat {
    final /* synthetic */ xjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjl(xjo xjoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xjoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xjl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final xjo xjoVar = this.a;
        xjoVar.g.d(true, new fdap() { // from class: xjj
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                final ahat ahatVar = (ahat) obj2;
                xjo xjoVar2 = xjoVar;
                String string = xjoVar2.j.a() ? xjoVar2.c.getString(R.string.lcoation_shortcut_satellite_failed_error) : xjoVar2.c.getString(R.string.location_shortcut_attach_current_error);
                string.getClass();
                String string2 = xjoVar2.c.getString(android.R.string.ok);
                string2.getClass();
                return new djmj(string, null, null, null, false, false, new dktq(string2, new fdae() { // from class: xjk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar.a();
                        return fctx.a;
                    }
                }), null, null, 446);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xjl(this.a, fcxyVar);
    }
}
