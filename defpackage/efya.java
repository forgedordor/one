package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efya implements efyb {
    private final eg a;
    private adj b;
    private adj c;
    private final ehnu d;

    public efya(eg egVar, ehnu ehnuVar) {
        this.a = egVar;
        this.d = ehnuVar;
    }

    @Override // defpackage.efyb
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.efyb
    public final adj b() {
        return this.c;
    }

    @Override // defpackage.efyb
    public final adj c() {
        return this.b;
    }

    @Override // defpackage.efyb
    public final void d(adi adiVar, adi adiVar2) {
        aeo aeoVar = new aeo();
        eg egVar = this.a;
        this.b = egVar.v(aeoVar, adiVar);
        this.c = egVar.v(new aeo(), adiVar2);
    }

    @Override // defpackage.efyb
    public final boolean e() {
        return true;
    }

    @Override // defpackage.efyb
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.efyb
    public final boolean g() {
        return this.d.a().ag();
    }
}
