package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpl {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;
    public final dfoa e;

    public dfpl(dfpm dfpmVar) {
        this.a = dfpmVar.g("sim_state_changed_delay_seconds", 0L);
        this.b = dfpmVar.g("sim_state_changed_delay_max_attempts", 1L);
        this.c = dfpmVar.g("multi_sim_state_changed_delay_seconds", 0L);
        this.d = dfpmVar.i("enable_iccid_binding", false);
        this.e = dfpmVar.i("enable_logging_subscription_changed_event", false);
    }
}
