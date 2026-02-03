package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qgv extends fdbr implements fdae {
    final /* synthetic */ qgy a;
    final /* synthetic */ qgw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgv(qgy qgyVar, qgw qgwVar) {
        super(0);
        this.a = qgyVar;
        this.b = qgwVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        qhp qhpVar = this.a.a;
        Object obj = qhpVar.b;
        qgw qgwVar = this.b;
        synchronized (obj) {
            LinkedHashSet linkedHashSet = qhpVar.c;
            if (linkedHashSet.remove(qgwVar) && linkedHashSet.isEmpty()) {
                qhpVar.e();
            }
        }
        return fctx.a;
    }
}
