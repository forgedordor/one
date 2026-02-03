package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgo extends fbou {
    final /* synthetic */ drgs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drgo(fbng fbngVar, drgs drgsVar) {
        super(fbngVar);
        this.a = drgsVar;
    }

    @Override // defpackage.fbrz, defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        drgs drgsVar = this.a;
        synchronized (drgsVar.a) {
            if (!drgsVar.c) {
                drgsVar.c = true;
                drgq drgqVar = drgsVar.b;
                if (drgqVar == null) {
                    dzrm dzrmVar = drgsVar.d;
                    dzrmVar.s = status.getCode().value();
                    dzfj.a().g(dzrmVar);
                } else {
                    synchronized (drgqVar.a) {
                        dzrm dzrmVar2 = drgqVar.b;
                        dzrmVar2.b(drgqVar.d, drgqVar.e);
                        dzrmVar2.s = status.getCode().value();
                        dzfj.a().g(dzrmVar2);
                        drgqVar.c = true;
                    }
                }
            }
        }
        super.a(status, fbrgVar);
    }
}
