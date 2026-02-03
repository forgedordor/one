package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btik extends dqye {
    public btik() {
        super("reminders");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btij b() {
        ah();
        return new btij(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(bvdw bvdwVar) {
        if (bvdwVar == null) {
            this.a.putNull("status");
        } else {
            this.a.put("status", Integer.valueOf(bvdwVar.ordinal()));
        }
    }

    public final void d(btim btimVar) {
        af(new btil(btimVar));
    }
}
