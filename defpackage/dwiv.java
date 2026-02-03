package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwiv extends dwrj {
    private ekgb a;

    @Override // defpackage.dwrj
    public final dwsa a() {
        ekgb ekgbVar = this.a;
        if (ekgbVar != null) {
            return new dwod(ekgbVar);
        }
        throw new IllegalStateException("Missing required properties: lines");
    }

    @Override // defpackage.dwrj
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null lines");
        }
        this.a = ekgbVar;
    }
}
