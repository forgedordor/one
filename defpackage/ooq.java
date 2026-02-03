package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooq {
    public final opv a = new opv();
    public final fdue b;
    public final fduj c;
    public final fdlr d;
    public final fdpl e;

    public ooq(fdpl fdplVar, fdjx fdjxVar) {
        fdue fdueVarD = fdun.d(1, Alert.DURATION_SHOW_INDEFINITELY, 1);
        this.b = fdueVarD;
        this.c = new fdvl(fdueVarD, new oop(this, null));
        fdlr fdlrVarD = fdil.d(fdjxVar, null, fdjz.b, new ooo(fdplVar, this, null), 1);
        fdlrVarD.hK(new fdap() { // from class: ooh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                this.a.b.h(null);
                return fctx.a;
            }
        });
        this.d = fdlrVarD;
        this.e = new fdui(new ool(this, null));
    }
}
