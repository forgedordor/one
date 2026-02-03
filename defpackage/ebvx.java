package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebvx extends aag {
    final /* synthetic */ ebwd a;

    public ebvx(ebwd ebwdVar) {
        this.a = ebwdVar;
    }

    @Override // defpackage.aag
    public final int e(RecyclerView recyclerView, wv wvVar) {
        return g(3, 0);
    }

    @Override // defpackage.aag
    public final boolean k() {
        return false;
    }

    @Override // defpackage.aag
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aag
    public final boolean m(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        ebwd ebwdVar = this.a;
        List<etyu> list = ebwdVar.g;
        int iFt = wvVar.ft();
        int iFt2 = wvVar2.ft();
        Collections.swap(list, iFt, iFt2);
        ArrayList arrayList = new ArrayList();
        for (etyu etyuVar : list) {
            if (!ebwdVar.f.contains(etyuVar.b)) {
                arrayList.add(etyuVar.b);
            }
        }
        ebun ebunVar = ebwdVar.a;
        ebunVar.o().d(arrayList);
        ebwdVar.t(iFt, iFt2);
        ebxr ebxrVarA = ebunVar.a();
        String str = ((etyu) list.get(iFt2)).b;
        eryy eryyVar = eryy.FAVORITES;
        if (iFt == iFt2) {
            return true;
        }
        int i = iFt2 > iFt ? 37 : 36;
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(i);
        erzaVar.copyOnWrite();
        erzb erzbVar = (erzb) erzaVar.instance;
        str.getClass();
        erzbVar.d = str;
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).e = eryyVar.a();
        ((ebxs) ebxrVarA).f((erzb) erzaVar.build());
        return true;
    }

    @Override // defpackage.aag
    public final void i(wv wvVar, int i) {
    }
}
