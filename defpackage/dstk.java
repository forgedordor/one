package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dstk extends fcyz implements fdat {
    int a;
    final /* synthetic */ dstm b;
    final /* synthetic */ String c;
    final /* synthetic */ ethn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dstk(dstm dstmVar, String str, ethn ethnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dstmVar;
        this.c = str;
        this.d = ethnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dstk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && fbcz.b()) {
            dstm dstmVar = this.b;
            String str = this.c;
            ethn ethnVar = this.d;
            long epochMilli = dstmVar.a.f().plusMillis(fbcn.a.get().a()).toEpochMilli();
            evtg evtgVar = ethnVar.b;
            evtgVar.getClass();
            ArrayList<Integer> arrayList = new ArrayList();
            Iterator<E> it = evtgVar.iterator();
            while (it.hasNext()) {
                etht ethtVar = ((ethk) it.next()).c;
                if (ethtVar == null) {
                    ethtVar = etht.a;
                }
                evsx evsxVar = ethtVar.c;
                evsxVar.getClass();
                fcva.y(arrayList, evsxVar);
            }
            ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
            for (Integer num : arrayList) {
                String string = num.toString();
                ethl ethlVar = (ethl) ethm.a.createBuilder();
                ethlVar.getClass();
                num.getClass();
                int iIntValue = num.intValue();
                ethlVar.copyOnWrite();
                ((ethm) ethlVar.instance).c = iIntValue;
                evvo evvoVar = (evvo) evvp.a.createBuilder();
                evvoVar.getClass();
                evvq.b(TimeUnit.MILLISECONDS.toSeconds(epochMilli), evvoVar);
                evvp evvpVarA = evvq.a(evvoVar);
                ethlVar.copyOnWrite();
                ethm ethmVar = (ethm) ethlVar.instance;
                ethmVar.d = evvpVarA;
                ethmVar.b = 1 | ethmVar.b;
                evsn evsnVarBuild = ethlVar.build();
                evsnVarBuild.getClass();
                arrayList2.add(dsmz.c(str, string, (ethm) evsnVarBuild, 0L, epochMilli));
            }
            ListenableFuture listenableFutureC = dstmVar.b.c(arrayList2);
            listenableFutureC.getClass();
            this.a = 1;
            if (fdxs.c(listenableFutureC, this) == fcylVar) {
                return fcylVar;
            }
        }
        return new dxfx(fctx.a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dstk(this.b, this.c, this.d, fcxyVar);
    }
}
