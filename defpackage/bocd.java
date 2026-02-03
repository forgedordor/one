package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bocd extends dqye {
    public bocd() {
        super("conversation_participants");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bocc b() {
        ah();
        return new bocc(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(auej auejVar) {
        int iIntValue = bocg.d().intValue();
        int iIntValue2 = bocg.d().intValue();
        if (iIntValue2 < 58570) {
            dqru.x("rcs_group_join_status", iIntValue2);
        }
        if (iIntValue >= 58570) {
            if (auejVar == null) {
                this.a.putNull("rcs_group_join_status");
            } else {
                this.a.put("rcs_group_join_status", Integer.valueOf(auejVar.e));
            }
        }
    }
}
