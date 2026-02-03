package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acik extends acid {
    public Optional b;
    private elie d;
    public Optional a = Optional.empty();
    public Optional c = Optional.empty();

    @Override // defpackage.acid
    public final acie a() {
        elie elieVar = this.d;
        if (elieVar != null) {
            return new acil(this.a, this.b, this.c, elieVar);
        }
        throw new IllegalStateException("Missing required properties: bugleAdvancedFeedbackSource");
    }

    @Override // defpackage.acid
    public final void b(elie elieVar) {
        if (elieVar == null) {
            throw new NullPointerException("Null bugleAdvancedFeedbackSource");
        }
        this.d = elieVar;
    }
}
