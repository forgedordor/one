package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzz extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ anhj b;
    final /* synthetic */ zaa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzz(boolean z, anhj anhjVar, zaa zaaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = z;
        this.b = anhjVar;
        this.c = zaaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yzz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && this.a) {
            anhj anhjVar = this.b;
            zaa zaaVar = this.c;
            boolean zF = fdbq.f(anhjVar, zaaVar.s);
            boolean zF2 = fdbq.f(anhjVar, zaaVar.t);
            if (zF2 && ((Boolean) crbf.ao.e()).booleanValue()) {
                ((afzc) zaaVar.h.b()).h(new agbb(null));
            } else if (zF || zF2) {
                ((dakl) zaaVar.i.b()).p(R.string.feedback_confirmation);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yzz(this.a, this.b, this.c, fcxyVar);
    }
}
