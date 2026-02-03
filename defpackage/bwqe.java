package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwqe extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ bwqm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwqe(bwqm bwqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = bwqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwqe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        eieu eieuVarH;
        bwqa bwqaVar;
        elyd elydVarB;
        Object obj2;
        ?? r0;
        eieu eieuVar;
        fcyl fcylVar = fcyl.a;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                r0 = this.a;
                try {
                    fctl.b(obj);
                    eieuVar = r0;
                    fczl.a(eieuVar, null);
                    return fctx.a;
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                ?? r1 = this.d;
                obj2 = this.c;
                ?? r4 = this.b;
                ?? r5 = this.a;
                try {
                    fctl.b(obj);
                    bwqaVar = r1;
                    eieuVarH = r5;
                    elydVarB = r4;
                } catch (Throwable th2) {
                    th = th2;
                    r0 = r5;
                }
            }
            try {
                throw th;
            } catch (Throwable th3) {
                fczl.a(r0, th);
                throw th3;
            }
        }
        fctl.b(obj);
        bwqm bwqmVar = this.f;
        if (!eicg.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieuVarH = eiiy.h("E2eeInfoDataSource#fetchAndStoreData");
        try {
            bwqaVar = (bwqa) bwqmVar.f.b();
            bwvf bwvfVar = bwqmVar.g;
            aubq aubqVar = bwvfVar.f;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            aubqVar.getClass();
            elydVarB = elyd.b(bwvfVar.e);
            if (elydVarB == null) {
                elydVarB = elyd.UNKNOWN;
            }
            elydVarB.getClass();
            this.a = eieuVarH;
            this.b = elydVarB;
            this.c = aubqVar;
            this.d = bwqaVar;
            this.e = 1;
            obj = bwqmVar.e(this);
            if (obj != fcylVar) {
                obj2 = aubqVar;
            }
            return fcylVar;
        } catch (Throwable th4) {
            th = th4;
            r0 = eieuVarH;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = ((aubq) it.next()).d;
            str.getClass();
            arrayList.add(str);
        }
        this.a = eieuVarH;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 2;
        if (bwqaVar.a((aubq) obj2, elydVarB, arrayList, this) != fcylVar) {
            eieuVar = eieuVarH;
            fczl.a(eieuVar, null);
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwqe(this.f, fcxyVar);
    }
}
