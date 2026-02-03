package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqe {
    public final ejqb a;
    public final ekgp b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final boolean h;
    public final int i;

    public ejqe(ejqb ejqbVar, ekgp ekgpVar, int i, boolean z) {
        Optional optionalEmpty;
        this.a = ejqbVar;
        this.b = ekgpVar;
        this.i = i;
        if ((ejqbVar.b & 16) != 0) {
            this.d = Optional.of(ejqbVar.i);
        } else {
            this.d = Optional.empty();
        }
        if ((ejqbVar.b & 32) != 0) {
            this.c = Optional.of(ejqbVar.j);
        } else {
            this.c = Optional.empty();
        }
        if ((ejqbVar.b & 64) != 0) {
            this.e = Optional.of(Long.valueOf(ejqbVar.k));
        } else {
            this.e = Optional.empty();
        }
        if ((ejqbVar.b & 1024) != 0) {
            ezal ezalVarB = ezal.b(ejqbVar.o);
            optionalEmpty = Optional.of(ezalVarB == null ? ezal.UNKNOWN_SUGGESTION_SOURCE : ezalVarB);
        } else {
            optionalEmpty = Optional.empty();
        }
        this.f = optionalEmpty;
        this.g = (ejqbVar.b & 512) != 0 ? Optional.of(Float.valueOf(ejqbVar.n)) : Optional.empty();
        this.h = z;
    }

    public final Optional a() {
        ejqb ejqbVar = this.a;
        return ejqbVar.e.isEmpty() ? Optional.empty() : Optional.of(ejqbVar.e);
    }

    public final String b() {
        return this.a.d;
    }
}
