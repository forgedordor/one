package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abbe implements eora {
    final /* synthetic */ abbf a;

    public abbe(abbf abbfVar) {
        this.a = abbfVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        abbf abbfVar = this.a;
        abbfVar.c = zBooleanValue;
        if (zBooleanValue) {
            eygg eyggVar = abbfVar.b;
            final abbc abbcVar = (abbc) eyggVar.b();
            if (abbcVar.g == null) {
                abbc.a.p("The device does not support accelerometer sensor.");
            } else {
                eosc eoscVar = abbcVar.k;
                abbcVar.j = eoscVar.submit(new Callable() { // from class: abaz
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        double dFloatValue = ((Float) abal.b.e()).floatValue();
                        abbc abbcVar2 = abbcVar;
                        abbcVar2.b = dFloatValue;
                        abbcVar2.c = ((Long) abal.c.e()).longValue();
                        abbcVar2.d = ((Integer) abal.e.e()).intValue();
                        abbcVar2.f = ((Long) abal.f.e()).longValue();
                        abbcVar2.e = ((Float) abal.d.e()).floatValue();
                        return null;
                    }
                });
                eika.l(abbcVar.j, new abba(abbcVar), eoscVar);
            }
            ((abbc) eyggVar.b()).i.add(abbfVar);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        abbf.a.r("Fail to get phenotype flag for isShakeToReportEnabled");
    }
}
