package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbsy extends dqye {
    public cbsy() {
        super("conversation_encryption");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbsx b() {
        ah();
        return new cbsx(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(cbqx cbqxVar) {
        if (cbqxVar == null) {
            this.a.putNull("encryption_id");
        } else {
            this.a.put("encryption_id", cbqx.a(cbqxVar));
        }
    }

    public final void d(cbqz cbqzVar) {
        this.a.put("encryption_protocol", Long.valueOf(cbqy.a(cbqzVar)));
    }

    public final void e(cbta cbtaVar) {
        af(new cbsz(cbtaVar));
    }
}
