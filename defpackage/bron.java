package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bron extends dqws {
    public bron(String[] strArr) {
        super("parent_disallowed_conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brom b() {
        l();
        return new brom(this.a.a());
    }

    public final void c(broc... brocVarArr) {
        int iIntValue = bros.c().intValue();
        for (broc brocVar : brocVarArr) {
            if (((Integer) bros.b.getOrDefault(brocVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(brocVarArr);
    }
}
