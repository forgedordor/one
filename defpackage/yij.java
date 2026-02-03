package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yij extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ yik c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yij(yik yikVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = yikVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yij yijVar = new yij(this.c, (fcxy) obj3);
        yijVar.a = (ajlk) obj;
        yijVar.b = (Optional) obj2;
        return yijVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Uri uriA;
        fctl.b(obj);
        ?? r13 = this.a;
        final Optional optional = (Optional) this.b;
        if (optional.isEmpty() || (uriA = r13.a()) == null) {
            return null;
        }
        int i = 1;
        if (((anvx) optional.get()).e() != null && ((anvx) optional.get()).d() != null) {
            i = 2;
        }
        dkrk dkrkVar = new dkrk(new dkpf(uriA, null, null, i, null, 22), null, 0, 0, 0.0f, null, 62);
        String strC = ((anvx) optional.get()).c();
        final yik yikVar = this.c;
        return new dkug(dkrkVar, strC, new fdae() { // from class: yih
            @Override // defpackage.fdae
            public final Object invoke() {
                yik yikVar2 = yikVar;
                auvw.k(yikVar2.a, null, null, new yii(yikVar2, optional, null), 3);
                return fctx.a;
            }
        });
    }
}
