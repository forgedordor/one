package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cecc implements cdfg {
    public final fcsu a;
    public final fcsu b;
    private final eosc c;

    public cecc(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = eoscVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.cdfg
    public final eiju b() {
        Callable callable = new Callable() { // from class: ceca
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Set<cmmh> setQ = ((cmlb) this.a.b.b()).q();
                ekgi ekgiVar = new ekgi();
                for (cmmh cmmhVar : setQ) {
                    ekgiVar.i(cmmhVar.c, cmmhVar.p);
                }
                return ekgiVar.c();
            }
        };
        eosc eoscVar = this.c;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: cecb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                StringBuilder sb = new StringBuilder("Section: mobile_configuration_retriever_flags_psd\n");
                ekqg ekqgVarListIterator = ((ekgp) obj).entrySet().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    cecc ceccVar = this.a;
                    Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    sb.append("sim_loggable_guid: ");
                    sb.append(str2);
                    sb.append("\nRcsOnboardingFlags:\n");
                    fcsu fcsuVar = ceccVar.a;
                    ekgp ekgpVarA = ((cebq) fcsuVar.b()).a(str);
                    StringBuilder sb2 = new StringBuilder();
                    ekqg ekqgVarListIterator2 = ekgpVarA.entrySet().listIterator();
                    while (ekqgVarListIterator2.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ekqgVarListIterator2.next();
                        sb2.append(String.format("       %s: %s\n", entry2.getKey(), entry2.getValue()));
                    }
                    sb.append(sb2.toString());
                    sb.append("RcsUpiPolicyFlags:\n");
                    ekgp ekgpVarB = ((cebq) fcsuVar.b()).b(str);
                    StringBuilder sb3 = new StringBuilder();
                    ekqg ekqgVarListIterator3 = ekgpVarB.entrySet().listIterator();
                    while (ekqgVarListIterator3.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ekqgVarListIterator3.next();
                        sb3.append(String.format("       %s: %s\n", entry3.getKey(), entry3.getValue()));
                    }
                    sb.append(sb3.toString());
                }
                return eijx.e(sb.toString());
            }
        }, eoscVar);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }
}
