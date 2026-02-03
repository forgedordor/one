package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahiv implements ehkg {
    final /* synthetic */ ahjq a;

    public ahiv(ahjq ahjqVar) {
        this.a = ahjqVar;
    }

    @Override // defpackage.ehkg
    public final ehkf a(String str) {
        ahjq ahjqVar = this.a;
        ahjr ahjrVar = ahjqVar.b;
        efwo efwoVar = (efwo) ahjrVar.b.b();
        ahkn ahknVar = ahjqVar.a;
        ahnh ahnhVar = ahknVar.a;
        egbf egbfVar = (egbf) ahnhVar.pG.b();
        ehhy ehhyVarMH = ahnhVar.mH();
        ehkk ehkkVar = (ehkk) ahknVar.b.gi.b();
        eyik eyikVar = ahjrVar.d;
        Executor executor = (Executor) ahknVar.p.b();
        ahkn.iM();
        return new ehkf(efwoVar, egbfVar, ehhyVarMH, ehkkVar, eyikVar, executor, str);
    }
}
