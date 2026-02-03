package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfe extends ndq {
    private static final mbo d;
    private final nep[] e;
    private final List f;
    private final mcl[] g;
    private final ArrayList h;
    private int i = -1;
    private long[][] j;
    private nfc k;

    static {
        mbd mbdVar = new mbd();
        mbdVar.b("MergingMediaSource");
        d = mbdVar.a();
    }

    public nfe(nep... nepVarArr) {
        this.e = nepVarArr;
        this.h = new ArrayList(Arrays.asList(nepVarArr));
        this.f = new ArrayList(nepVarArr.length);
        int i = 0;
        while (true) {
            int length = nepVarArr.length;
            if (i >= length) {
                this.g = new mcl[length];
                this.j = new long[0][];
                new HashMap();
                ekcw.c(8, "expectedKeys");
                new ekmk().b().a();
                return;
            }
            this.f.add(new ArrayList());
            i++;
        }
    }

    @Override // defpackage.nep
    public final mbo F() {
        nep[] nepVarArr = this.e;
        return nepVarArr.length > 0 ? nepVarArr[0].F() : d;
    }

    @Override // defpackage.ndq, defpackage.ndd
    protected final void k(min minVar) {
        super.k(minVar);
        int i = 0;
        while (true) {
            nep[] nepVarArr = this.e;
            if (i >= nepVarArr.length) {
                return;
            }
            z(Integer.valueOf(i), nepVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ndq, defpackage.ndd
    protected final void n() {
        super.n();
        Arrays.fill(this.g, (Object) null);
        this.i = -1;
        this.k = null;
        ArrayList arrayList = this.h;
        arrayList.clear();
        Collections.addAll(arrayList, this.e);
    }

    @Override // defpackage.ndd, defpackage.nep
    public final void q(mbo mboVar) {
        this.e[0].q(mboVar);
    }

    @Override // defpackage.ndq, defpackage.nep
    public final void t() throws nfc {
        nfc nfcVar = this.k;
        if (nfcVar != null) {
            throw nfcVar;
        }
        super.t();
    }

    @Override // defpackage.nep
    public final void v(nel nelVar) {
        nfb nfbVar = (nfb) nelVar;
        int i = 0;
        while (true) {
            nep[] nepVarArr = this.e;
            if (i >= nepVarArr.length) {
                return;
            }
            List list = (List) this.f.get(i);
            nel nelVarM = nfbVar.m(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((nfd) list.get(i2)).b.equals(nelVarM)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            nepVarArr[i].v(nfbVar.m(i));
            i++;
        }
    }

    @Override // defpackage.nep
    public final nel w(nen nenVar, niu niuVar, long j) {
        mcl[] mclVarArr = this.g;
        nep[] nepVarArr = this.e;
        int length = nepVarArr.length;
        nel[] nelVarArr = new nel[length];
        int iA = mclVarArr[0].a(nenVar.a);
        for (int i = 0; i < length; i++) {
            nen nenVarA = nenVar.a(mclVarArr[i].f(iA));
            nelVarArr[i] = nepVarArr[i].w(nenVarA, niuVar, j - this.j[iA][i]);
            ((List) this.f.get(i)).add(new nfd(nenVarA, nelVarArr[i]));
        }
        return new nfb(this.j[iA], nelVarArr);
    }

    @Override // defpackage.ndq
    protected final /* bridge */ /* synthetic */ nen x(Object obj, nen nenVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.f;
        List list2 = (List) list.get(iIntValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((nfd) list2.get(i)).a.equals(nenVar)) {
                return ((nfd) ((List) list.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.ndq
    protected final /* bridge */ /* synthetic */ void y(Object obj, nep nepVar, mcl mclVar) {
        int iB;
        if (this.k != null) {
            return;
        }
        if (this.i == -1) {
            iB = mclVar.b();
            this.i = iB;
        } else {
            int iB2 = mclVar.b();
            int i = this.i;
            if (iB2 != i) {
                this.k = new nfc();
                return;
            }
            iB = i;
        }
        if (this.j.length == 0) {
            this.j = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, this.g.length);
        }
        ArrayList arrayList = this.h;
        arrayList.remove(nepVar);
        mcl[] mclVarArr = this.g;
        mclVarArr[((Integer) obj).intValue()] = mclVar;
        if (arrayList.isEmpty()) {
            l(mclVarArr[0]);
        }
    }
}
