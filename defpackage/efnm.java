package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnm implements efoe {
    private final efof a;

    public efnm(efof efofVar) {
        this.a = efofVar;
    }

    @Override // defpackage.efoe
    public final eflb a(efnd efndVar) {
        return this.a.a(efndVar.a()).a(efndVar);
    }

    @Override // defpackage.efoe
    public final efnd b(eflb eflbVar) throws efoc {
        efnl efnlVar = new efnl(this.a);
        eflbVar.hl(efnlVar);
        boolean z = true;
        if (!efnlVar.a() && !efnlVar.b.isPresent()) {
            z = false;
        }
        ejwl.l(z);
        if (efnlVar.a()) {
            return (efnd) efnlVar.a.get();
        }
        throw new efoc("Error serializing message.", (Throwable) efnlVar.b.get());
    }
}
