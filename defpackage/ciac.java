package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciac extends cibu {
    public ekgb a;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();

    @Override // defpackage.cibu
    public final cibv a() {
        ekgb ekgbVar = this.a;
        if (ekgbVar != null) {
            return new ciad(ekgbVar, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: allParameterResults");
    }
}
