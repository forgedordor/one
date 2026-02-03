package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azkz extends dqws {
    public azkz(String[] strArr) {
        super("messages_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azkx b() {
        l();
        return new azkx(this.a.a());
    }

    public final void c(azjj... azjjVarArr) {
        int iIntValue = azlc.c().intValue();
        for (azjj azjjVar : azjjVarArr) {
            if (((Integer) azlc.b.getOrDefault(azjjVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(azjjVarArr);
    }

    public final void d(azlb azlbVar) {
        k(new azla(azlbVar));
    }
}
