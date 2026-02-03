package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azcd extends dqws {
    public azcd(String[] strArr) {
        super("message_captions_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azcc b() {
        l();
        return new azcc(this.a.a());
    }

    public final void c(azbs... azbsVarArr) {
        int iA = azcg.b().a();
        Integer.valueOf(iA).getClass();
        for (azbs azbsVar : azbsVarArr) {
            if (((Integer) azcg.b.getOrDefault(azbsVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(azbsVarArr);
    }
}
