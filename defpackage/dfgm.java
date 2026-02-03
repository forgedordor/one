package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfgm implements dfgv {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public dfgm(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.dfgv
    public final /* synthetic */ dfgu a(InstantMessageConfiguration instantMessageConfiguration, deyb deybVar) {
        dfgq dfgqVar = (dfgq) this.a.b();
        dfgqVar.getClass();
        eosc eoscVar = (eosc) this.b.b();
        instantMessageConfiguration.getClass();
        return new dfgl(dfgqVar, eoscVar, this.c, instantMessageConfiguration, deybVar);
    }
}
