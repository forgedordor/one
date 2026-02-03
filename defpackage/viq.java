package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class viq extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vis c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viq(vis visVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = visVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        viq viqVar = new viq(this.c, (fcxy) obj3);
        viqVar.a = (ajlk) obj;
        viqVar.b = (ekgb) obj2;
        return viqVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final ?? r1 = this.a;
        Object obj2 = this.b;
        if (!r1.r()) {
            return null;
        }
        final vis visVar = this.c;
        String string = visVar.a.getString(R.string.group_name);
        string.getClass();
        final ekgb ekgbVar = (ekgb) obj2;
        return new dihq(string, djrr.aV, false, false, false, false, null, false, null, new fdae() { // from class: vip
            @Override // defpackage.fdae
            public final Object invoke() {
                vis visVar2 = visVar;
                auvw.k(visVar2.d, null, null, new vir(visVar2, r1, ekgbVar, null), 3);
                return fctx.a;
            }
        }, 1020);
    }
}
