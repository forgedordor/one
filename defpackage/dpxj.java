package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dpxj extends dphz {
    public final dpxe a;

    public dpxj(dpxe dpxeVar) {
        this.a = dpxeVar;
    }

    public final dpxo c(fr frVar) {
        ea eaVarH = frVar.h(this.a.name());
        if (eaVarH instanceof dpxo) {
            return (dpxo) eaVarH;
        }
        return null;
    }
}
