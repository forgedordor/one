package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqni extends dqnl {
    public final Context a;
    public final ejwi b;
    private final ejwi c;
    private final ejwi d;

    public dqni(Context context, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.a = context;
        this.c = ejwiVar;
        this.d = ejwiVar2;
        this.b = ejwiVar3;
    }

    @Override // defpackage.dqnl
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.dqnl
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dqnl
    public final ejwi c() {
        return this.b;
    }

    @Override // defpackage.dqnl
    public final ejwi d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqnl) {
            dqnl dqnlVar = (dqnl) obj;
            if (this.a.equals(dqnlVar.a()) && this.c.equals(dqnlVar.b()) && this.d.equals(dqnlVar.d())) {
                dqnlVar.e();
                if (this.b.equals(dqnlVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CollectionBasisContext{context=" + this.a.toString() + ", accountNames=Optional.absent(), stacktrace=" + String.valueOf(this.d) + ", googlerOverridesCheckbox=false, executor=Optional.absent()}";
    }

    @Override // defpackage.dqnl
    public final void e() {
    }
}
