package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmq {
    public final fdjx a;
    public final fdat b;
    public final fdoa c = fdod.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    public final ljp d = new ljp();

    public lmq(fdjx fdjxVar, final fdap fdapVar, final fdat fdatVar, fdat fdatVar2) {
        this.a = fdjxVar;
        this.b = fdatVar2;
        fdlr fdlrVar = (fdlr) fdjxVar.hE().get(fdlr.c);
        if (fdlrVar != null) {
            fdlrVar.hK(new fdap() { // from class: lmo
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    fdapVar.invoke(th);
                    fdoa fdoaVar = this.c;
                    fdoaVar.e(th);
                    while (true) {
                        Object objA = fdog.a(fdoaVar.m());
                        if (objA == null) {
                            return fctx.a;
                        }
                        fdatVar.a(objA, th);
                    }
                }
            });
        }
    }
}
