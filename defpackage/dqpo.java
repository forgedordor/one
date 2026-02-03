package defpackage;

import defpackage.dqpo;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqpo<R2 extends dqpo<R2>> implements dqxe {
    public final dqpt a;

    public dqpo(dqpt dqptVar) {
        this.a = dqptVar;
    }

    protected abstract dqwl a();

    @Override // defpackage.dqxe
    public final String ai(dqxp dqxpVar) {
        return ((dqoh) this.a).a;
    }

    @Override // defpackage.dqxe
    public final String aj(dqxp dqxpVar, List list) {
        return ((dqoh) this.a).a;
    }

    @Override // defpackage.dqxe
    public final void ak(dqpu dqpuVar) {
        String[] strArrSplit = ((dqoh) this.a).a.split("\\.", 2);
        dqpuVar.a(strArrSplit[0], strArrSplit[1]);
    }

    public final dqpo c() {
        Supplier supplier = ((dqoh) this.a).g;
        if (supplier == null) {
            return null;
        }
        return (dqpo) supplier.get();
    }

    public final String d() {
        String[] strArrSplit = ((dqoh) this.a).a.split("\\.", 2);
        if (strArrSplit.length > 1) {
            return strArrSplit[1];
        }
        return null;
    }

    public final String e() {
        return ((dqoh) this.a).a.split("\\.", 2)[0];
    }

    public final boolean g() {
        return ((dqoh) this.a).b;
    }

    public final boolean h() {
        return ((dqoh) this.a).c;
    }

    public final String toString() {
        return ((dqoh) this.a).a;
    }
}
