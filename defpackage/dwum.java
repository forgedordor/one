package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwum extends dwvi {
    private ekgb a;

    @Override // defpackage.dwvi
    public final dwvl a() {
        ekgb ekgbVar = this.a;
        if (ekgbVar != null) {
            return new dwun(ekgbVar);
        }
        throw new IllegalStateException("Missing required properties: verticalLayoutButtons");
    }

    @Override // defpackage.dwvi
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null verticalLayoutButtons");
        }
        this.a = ekgbVar;
    }
}
