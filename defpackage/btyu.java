package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btyu extends dqye {
    public btyu() {
        super("self_participants");
    }

    public final int a(int i) {
        String[] strArr = btyx.a;
        btyw btywVar = new btyw();
        btywVar.b(i);
        return ae(new btyv(btywVar), "self_participants-buildAndUpdateForSubId");
    }

    @Override // defpackage.dqye
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final btyt b() {
        ah();
        return new btyt(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void d(int i) {
        this.a.put("sim_slot_index", Integer.valueOf(i));
    }

    public final void e(int i) {
        this.a.put("sub_id", Integer.valueOf(i));
    }

    public final void f(int i) {
        this.a.put("subscription_color", Integer.valueOf(i));
    }

    public final void g(btyw btywVar) {
        af(new btyv(btywVar));
    }
}
