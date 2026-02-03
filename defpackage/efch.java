package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efch extends efeu {
    private final String a;
    private final effi b;
    private final efes c;
    private final Optional d;
    private final Optional e;
    private final ekgb f;

    public efch(String str, effi effiVar, efes efesVar, Optional optional, Optional optional2, ekgb ekgbVar) {
        this.a = str;
        this.b = effiVar;
        this.c = efesVar;
        this.d = optional;
        this.e = optional2;
        this.f = ekgbVar;
    }

    @Override // defpackage.efeu
    public final efes a() {
        return this.c;
    }

    @Override // defpackage.efeu
    public final effi b() {
        return this.b;
    }

    @Override // defpackage.efeu
    public final ekgb c() {
        return this.f;
    }

    @Override // defpackage.efeu
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.efeu
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efeu) {
            efeu efeuVar = (efeu) obj;
            if (this.a.equals(efeuVar.f()) && this.b.equals(efeuVar.b()) && this.c.equals(efeuVar.a()) && this.d.equals(efeuVar.e()) && this.e.equals(efeuVar.d()) && ekjz.h(this.f, efeuVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.efeu
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
