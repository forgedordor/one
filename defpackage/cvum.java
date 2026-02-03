package defpackage;

import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvum implements cvul {
    private final fcsu c;
    private final fcsu d;
    private final HashSet b = new HashSet();
    private final float e = ((Float) cvul.a.e()).floatValue();
    private final boolean f = false;

    public cvum(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        ((Optional) this.c.b()).isPresent();
    }

    @Override // defpackage.cvul
    public final float g() {
        return this.e;
    }

    @Override // defpackage.cvul
    public final void h(cvuk cvukVar) {
        ecem.g();
        this.b.add(cvukVar);
    }

    @Override // defpackage.cvul
    public final void i(cvuk cvukVar) {
        ecem.g();
        this.b.remove(cvukVar);
    }

    @Override // defpackage.cvul
    public final void j() {
        ecem.g();
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
