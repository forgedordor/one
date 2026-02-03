package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouz implements fdap {
    final /* synthetic */ ova a;
    private boolean b = true;

    public ouz(ova ovaVar) {
        this.a = ovaVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fdap fdapVar;
        opc opcVar = (opc) obj;
        opcVar.getClass();
        if (this.b) {
            this.b = false;
        } else if (opcVar.d.b instanceof oro) {
            ova ovaVar = this.a;
            ova.l(ovaVar);
            oog oogVar = ovaVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList = oogVar.l;
            copyOnWriteArrayList.remove(this);
            if (copyOnWriteArrayList.isEmpty() && (fdapVar = (fdap) oogVar.k.get()) != null) {
                oogVar.g.e.a.a.remove(fdapVar);
            }
        }
        return fctx.a;
    }
}
