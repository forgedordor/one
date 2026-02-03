package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azuq extends dqws {
    public azuq(String[] strArr) {
        super("participants_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azup b() {
        l();
        return new azup(this.a.a());
    }

    public final void c(azto... aztoVarArr) {
        int iIntValue = azut.c().intValue();
        for (azto aztoVar : aztoVarArr) {
            if (((Integer) azut.b.getOrDefault(aztoVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(aztoVarArr);
    }
}
