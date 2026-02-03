package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dll extends dkd {
    public dll(ebk ebkVar, dnk dnkVar, boolean z, boolean z2, String str, jrw jrwVar, fdae fdaeVar) {
        super(ebkVar, dnkVar, z, z2, str, jrwVar, fdaeVar);
    }

    @Override // defpackage.dkd
    protected final void B(KeyEvent keyEvent) {
        ((dkd) this).c.invoke();
    }

    @Override // defpackage.dkd
    public final Object b(isn isnVar, fcxy fcxyVar) {
        Object objC = dzm.c(isnVar, new dlk(this, null), new fdap() { // from class: dlj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dll dllVar = this.a;
                if (((dkd) dllVar).b) {
                    ((dkd) dllVar).c.invoke();
                }
                return fctx.a;
            }
        }, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.dkd
    protected final boolean v(KeyEvent keyEvent) {
        return false;
    }
}
