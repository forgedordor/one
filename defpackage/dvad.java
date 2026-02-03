package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvad {
    public final ekgp a;
    public final Executor b;
    public final ejwi c;

    public dvad(dvac dvacVar) {
        this.a = dvacVar.a.c();
        this.b = dvacVar.b;
        this.c = dvacVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [dtpi, java.lang.Object] */
    public final dtpy a(dtpy dtpyVar) {
        ejwi ejwiVar = this.c;
        if (ejwiVar.g()) {
            ?? C = ejwiVar.c();
            dtnc dtncVarT = C.t();
            String str = dtpyVar.f;
            str.getClass();
            evub evubVar = dtncVarT.b;
            long jLongValue = evubVar.containsKey(str) ? ((Long) evubVar.get(str)).longValue() : 0L;
            if (jLongValue > 0) {
                dtpw dtpwVar = (dtpw) dtpyVar.toBuilder();
                dtpwVar.copyOnWrite();
                dtpy dtpyVar2 = (dtpy) dtpwVar.instance;
                dtpyVar2.b |= 4096;
                dtpyVar2.h = jLongValue;
                dtpyVar = (dtpy) dtpwVar.build();
            } else {
                dtnc dtncVarT2 = C.t();
                String str2 = dtpyVar.e;
                str2.getClass();
                evub evubVar2 = dtncVarT2.b;
                long jLongValue2 = evubVar2.containsKey(str2) ? ((Long) evubVar2.get(str2)).longValue() : 0L;
                if (jLongValue2 > 0) {
                    dtpw dtpwVar2 = (dtpw) dtpyVar.toBuilder();
                    dtpwVar2.copyOnWrite();
                    dtpy dtpyVar3 = (dtpy) dtpwVar2.instance;
                    dtpyVar3.b |= 4096;
                    dtpyVar3.h = jLongValue2;
                    dtpyVar = (dtpy) dtpwVar2.build();
                }
            }
        }
        dtpw dtpwVar3 = (dtpw) dtpyVar.toBuilder();
        dtpwVar3.copyOnWrite();
        dtpy dtpyVar4 = (dtpy) dtpwVar3.instance;
        dtpyVar4.c = 1;
        dtpyVar4.b = 1 | dtpyVar4.b;
        return (dtpy) dtpwVar3.build();
    }

    public final ListenableFuture b(ejwi ejwiVar, ewut ewutVar) {
        ekgp ekgpVar = this.a;
        if (ekgpVar.containsKey(ewutVar)) {
            return ((duyk) ekgpVar.get(ewutVar)).a(ejwiVar);
        }
        int i = ekgb.d;
        return eork.i(ekoe.a);
    }
}
