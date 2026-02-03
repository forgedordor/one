package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwvc extends dwwf {
    private ekgb a;

    @Override // defpackage.dwwf
    public final dwwg a() {
        ekgb ekgbVar = this.a;
        if (ekgbVar != null) {
            return new dwvd(ekgbVar);
        }
        throw new IllegalStateException("Missing required properties: elements");
    }

    @Override // defpackage.dwwf
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null elements");
        }
        this.a = ekgbVar;
    }
}
