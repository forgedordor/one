package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayur extends dqws {
    public ayur(String[] strArr) {
        super("conversation_participants_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ayuq b() {
        l();
        return new ayuq(this.a.a());
    }

    public final void c(ayub... ayubVarArr) {
        int iIntValue = ayuu.c().intValue();
        for (ayub ayubVar : ayubVarArr) {
            if (((Integer) ayuu.b.getOrDefault(ayubVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(ayubVarArr);
    }
}
