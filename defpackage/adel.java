package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class adel {
    public adeo a;
    protected adge b;

    public static final String f(Context context, int i, int i2) {
        if (true == ((Boolean) cgwx.c.e()).booleanValue()) {
            i = i2;
        }
        String string = context.getString(i);
        string.getClass();
        return string;
    }

    protected abstract adeo a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, fdap fdapVar);

    protected abstract adga b();

    public final adeo c() {
        adeo adeoVar = this.a;
        if (adeoVar != null) {
            return adeoVar;
        }
        fdbq.c("binding");
        return null;
    }

    protected final void d(final adfw adfwVar) {
        adge adgeVar = this.b;
        if (adgeVar == null) {
            fdbq.c("eventLogger");
            adgeVar = null;
        }
        final adga adgaVarB = b();
        adgeVar.k(new Supplier() { // from class: adgb
            @Override // java.util.function.Supplier
            public final Object get() {
                enda endaVar = (enda) endb.a.createBuilder();
                endaVar.getClass();
                adfw adfwVar2 = adfwVar;
                adga adgaVar = adgaVarB;
                if (adgaVar instanceof adfz) {
                    endh endhVar = (endh) endi.a.createBuilder();
                    endhVar.getClass();
                    int iA = adfm.a(adfwVar2);
                    endhVar.copyOnWrite();
                    endi endiVar = (endi) endhVar.instance;
                    endiVar.c = iA - 1;
                    endiVar.b |= 1;
                    evsn evsnVarBuild = endhVar.build();
                    evsnVarBuild.getClass();
                    endaVar.copyOnWrite();
                    endb endbVar = (endb) endaVar.instance;
                    endbVar.c = (endi) evsnVarBuild;
                    endbVar.b = 1;
                } else if (adgaVar instanceof adfx) {
                    endc endcVar = (endc) endd.a.createBuilder();
                    endcVar.getClass();
                    int iA2 = adfm.a(adfwVar2);
                    endcVar.copyOnWrite();
                    endd enddVar = (endd) endcVar.instance;
                    enddVar.c = iA2 - 1;
                    enddVar.b |= 1;
                    dooy dooyVar = ((adfx) adgaVar).a;
                    endcVar.copyOnWrite();
                    endd enddVar2 = (endd) endcVar.instance;
                    enddVar2.d = dooyVar.e;
                    enddVar2.b |= 2;
                    evsn evsnVarBuild2 = endcVar.build();
                    evsnVarBuild2.getClass();
                    endaVar.copyOnWrite();
                    endb endbVar2 = (endb) endaVar.instance;
                    endbVar2.c = (endd) evsnVarBuild2;
                    endbVar2.b = 2;
                } else {
                    if (!(adgaVar instanceof adfy)) {
                        throw new fctg();
                    }
                    endf endfVar = (endf) endg.a.createBuilder();
                    endfVar.getClass();
                    int iA3 = adfm.a(adfwVar2);
                    endfVar.copyOnWrite();
                    endg endgVar = (endg) endfVar.instance;
                    endgVar.c = iA3 - 1;
                    endgVar.b |= 1;
                    evsn evsnVarBuild3 = endfVar.build();
                    evsnVarBuild3.getClass();
                    endaVar.copyOnWrite();
                    endb endbVar3 = (endb) endaVar.instance;
                    endbVar3.c = (endg) evsnVarBuild3;
                    endbVar3.b = 3;
                }
                evsn evsnVarBuild4 = endaVar.build();
                evsnVarBuild4.getClass();
                return (endb) evsnVarBuild4;
            }
        });
    }

    public final void e() {
        d(adft.a);
    }
}
