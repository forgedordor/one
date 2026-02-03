package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayze extends dqws {
    public ayze(String[] strArr) {
        super("conversations_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ayzd b() {
        l();
        return new ayzd(this.a.a());
    }

    public final void c(ayya... ayyaVarArr) {
        int iIntValue = ayzh.c().intValue();
        for (ayya ayyaVar : ayyaVarArr) {
            if (((Integer) ayzh.b.getOrDefault(ayyaVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(ayyaVarArr);
    }
}
