package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpfn extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bpfm(this);
    }

    public final void b(String str) {
        ap(new dqpj("emergency_sessions.emergency_destination", 1, String.valueOf(str)));
    }

    public final void c(amrb amrbVar) {
        ap(new dqty("emergency_sessions.type", 1, Integer.valueOf(amrbVar == null ? 0 : amrbVar.ordinal())));
    }
}
