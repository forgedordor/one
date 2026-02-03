package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafa {
    public final dzyn a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;

    public eafa(dzyn dzynVar, String str, String str2, boolean z) {
        this.a = dzynVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        Context context = dzynVar.d;
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f("phenotype");
        ecfaVar.g(str2 + "/" + str + ".pb");
        if (z) {
            int i = dqyw.a;
            ecfaVar.d();
        }
        this.b = ecfaVar.a();
    }

    final ListenableFuture a(String str) {
        dzyn dzynVar = this.a;
        return eooq.f(dzynVar.b().c(this.c, str), new ejvr() { // from class: eaeu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dzzu dzzuVar = (dzzu) obj;
                eafb eafbVar = (eafb) eafc.a.createBuilder();
                if (dzzuVar == null) {
                    return (eafc) eafbVar.build();
                }
                for (dzzz dzzzVar : dzzuVar.f) {
                    eafd eafdVar = (eafd) eafe.a.createBuilder();
                    String str2 = dzzzVar.e;
                    eafdVar.copyOnWrite();
                    eafe eafeVar = (eafe) eafdVar.instance;
                    str2.getClass();
                    eafeVar.b |= 1;
                    eafeVar.e = str2;
                    int i = dzzzVar.c;
                    int iA = dzzy.a(i);
                    if (iA == 0) {
                        throw null;
                    }
                    int i2 = iA - 1;
                    if (i2 == 0) {
                        long jLongValue = i == 1 ? ((Long) dzzzVar.d).longValue() : 0L;
                        eafdVar.copyOnWrite();
                        eafe eafeVar2 = (eafe) eafdVar.instance;
                        eafeVar2.c = 2;
                        eafeVar2.d = Long.valueOf(jLongValue);
                    } else if (i2 == 1) {
                        boolean zBooleanValue = i == 2 ? ((Boolean) dzzzVar.d).booleanValue() : false;
                        eafdVar.copyOnWrite();
                        eafe eafeVar3 = (eafe) eafdVar.instance;
                        eafeVar3.c = 3;
                        eafeVar3.d = Boolean.valueOf(zBooleanValue);
                    } else if (i2 == 2) {
                        double dDoubleValue = i == 3 ? ((Double) dzzzVar.d).doubleValue() : 0.0d;
                        eafdVar.copyOnWrite();
                        eafe eafeVar4 = (eafe) eafdVar.instance;
                        eafeVar4.c = 4;
                        eafeVar4.d = Double.valueOf(dDoubleValue);
                    } else if (i2 == 3) {
                        String str3 = i == 4 ? (String) dzzzVar.d : "";
                        eafdVar.copyOnWrite();
                        eafe eafeVar5 = (eafe) eafdVar.instance;
                        str3.getClass();
                        eafeVar5.c = 5;
                        eafeVar5.d = str3;
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        evqs evqsVar = i == 5 ? (evqs) dzzzVar.d : evqs.b;
                        eafdVar.copyOnWrite();
                        eafe eafeVar6 = (eafe) eafdVar.instance;
                        evqsVar.getClass();
                        eafeVar6.c = 6;
                        eafeVar6.d = evqsVar;
                    }
                    eafe eafeVar7 = (eafe) eafdVar.build();
                    eafbVar.copyOnWrite();
                    eafc eafcVar = (eafc) eafbVar.instance;
                    eafeVar7.getClass();
                    evtg evtgVar = eafcVar.g;
                    if (!evtgVar.c()) {
                        eafcVar.g = evsn.mutableCopy(evtgVar);
                    }
                    eafcVar.g.add(eafeVar7);
                }
                String str4 = dzzuVar.e;
                eafbVar.copyOnWrite();
                eafc eafcVar2 = (eafc) eafbVar.instance;
                str4.getClass();
                eafcVar2.b = 4 | eafcVar2.b;
                eafcVar2.e = str4;
                String str5 = dzzuVar.c;
                eafbVar.copyOnWrite();
                eafc eafcVar3 = (eafc) eafbVar.instance;
                str5.getClass();
                eafcVar3.b = 1 | eafcVar3.b;
                eafcVar3.c = str5;
                long j = dzzuVar.i;
                eafbVar.copyOnWrite();
                eafc eafcVar4 = (eafc) eafbVar.instance;
                eafcVar4.b |= 8;
                eafcVar4.f = j;
                if ((dzzuVar.b & 2) != 0) {
                    evqs evqsVar2 = dzzuVar.d;
                    eafbVar.copyOnWrite();
                    eafc eafcVar5 = (eafc) eafbVar.instance;
                    evqsVar2.getClass();
                    eafcVar5.b |= 2;
                    eafcVar5.d = evqsVar2;
                }
                return (eafc) eafbVar.build();
            }
        }, dzynVar.e());
    }

    public final ListenableFuture b(final eafc eafcVar) {
        return eork.m(new Callable() { // from class: eaev
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ecfo ecfoVar = new ecfo();
                eafa eafaVar = this.a;
                eafc eafcVar2 = eafcVar;
                try {
                    ecev ecevVarC = eafaVar.a.c();
                    Uri uri = eafaVar.b;
                    echl echlVar = new echl(eafcVar2);
                    echlVar.a = new ecfo[]{ecfoVar};
                    return null;
                } catch (IOException | RuntimeException e) {
                    dzzk.a(Level.WARNING, eafaVar.a.e(), e, "Failed to update snapshot for %s flags may be stale.", eafaVar.c);
                    return null;
                }
            }
        }, this.a.e());
    }

    final boolean c() {
        return this.a.f.a(this.e).a(eryd.FILE);
    }
}
