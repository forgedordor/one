package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bofo extends dqye {
    public bofo() {
        super("conversation_suggestions");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bofn b() {
        ah();
        return new bofn(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c() {
        int iIntValue = bofr.c().intValue();
        int iIntValue2 = bofr.c().intValue();
        if (iIntValue2 < 12000) {
            dqru.x("read", iIntValue2);
        }
        if (iIntValue >= 12000) {
            this.a.put("read", (Boolean) true);
        }
    }
}
