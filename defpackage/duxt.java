package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duxt implements dtpd {
    private final String a;
    private final String b;

    public duxt(duxs duxsVar) {
        this.a = duxsVar.a;
        this.b = duxsVar.b;
    }

    @Override // defpackage.dtpd
    public final ListenableFuture a(final dtsl dtslVar) {
        durt.b("%s: Add groups from ph config to Mdd.", "PhFileGroupPop");
        dzzf dzzfVar = new dzzf(dzyc.a(this.a));
        dtoq dtoqVar = (dtoq) dzzfVar.k(this.b, dtoq.a, new dzze() { // from class: duxn
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (dtoq) evsn.parseFrom(dtoq.a, bArr);
            }
        }).b();
        ArrayList arrayList = new ArrayList();
        for (final dtoo dtooVar : dtoqVar.b) {
            durt.c("%s: Found ph flag %s from ph config.", "PhFileGroupPop", dtooVar.b);
            dzzh dzzhVarK = dzzfVar.k(dtooVar.b, null, new dzze() { // from class: duxo
                @Override // defpackage.dzze
                public final Object a(byte[] bArr) {
                    return (dtns) evsn.parseFrom(dtns.a, bArr);
                }
            });
            ListenableFuture listenableFutureI = eork.i(ejud.a);
            if (dzzhVarK.b() != null && !((dtns) dzzhVarK.b()).c.isEmpty()) {
                listenableFutureI = eork.i(ejwi.j((dtns) dzzhVarK.b()));
            }
            eooz eoozVar = new eooz() { // from class: duxp
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ejwi ejwiVar = (ejwi) obj;
                    if (!ejwiVar.g() || ((dtns) ejwiVar.c()).c.isEmpty()) {
                        durt.c("%s: Not adding file group from ph flag %s because of overrider.", "PhFileGroupPop", dtooVar.b);
                        return eork.i(false);
                    }
                    dtsl dtslVar2 = dtslVar;
                    dtmj dtmjVar = new dtmj();
                    dtmjVar.c((dtns) ejwiVar.c());
                    return dtslVar2.a(dtmjVar.a());
                }
            };
            eoqg eoqgVar = eoqg.a;
            ListenableFuture listenableFutureK = eika.k(listenableFutureI, eoozVar, eoqgVar);
            eika.l(listenableFutureK, new duxr(dzzhVarK), eoqgVar);
            arrayList.add(listenableFutureK);
        }
        return dvat.a(arrayList).a(new Callable() { // from class: duxq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqg.a);
    }
}
