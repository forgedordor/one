package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egqp extends fcyz implements fdat {
    int a;
    final /* synthetic */ egqq b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egqp(egqq egqqVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = egqqVar;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egqp) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fdos fdosVar = (fdos) this.d;
            final egqr egqrVar = new egqr(new fdat() { // from class: egqn
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    if (((Boolean) obj2).booleanValue()) {
                        throw new IllegalStateException("This ContentObserver should not propagate changes itself.");
                    }
                    fdos fdosVar2 = fdosVar;
                    fctx fctxVar = fctx.a;
                    if (fdog.c(fdosVar2.b(fctxVar))) {
                        return fctxVar;
                    }
                    throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
                }
            });
            final egqq egqqVar = this.b;
            egqqVar.a.registerContentObserver(this.c, true, egqrVar);
            if (!fdog.c(fdosVar.b(fctx.a))) {
                throw new IllegalStateException("trySend should always succeed due to conflated buffer.");
            }
            fdae fdaeVar = new fdae() { // from class: egqo
                @Override // defpackage.fdae
                public final Object invoke() {
                    egqqVar.a.unregisterContentObserver(egqrVar);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egqp egqpVar = new egqp(this.b, this.c, fcxyVar);
        egqpVar.d = obj;
        return egqpVar;
    }
}
