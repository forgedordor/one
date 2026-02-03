package defpackage;

import com.sun.jna.Pointer;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxj implements epzw {
    final /* synthetic */ ccnl a;

    public epxj(ccnl ccnlVar) {
        this.a = ccnlVar;
    }

    @Override // defpackage.epzw
    /* renamed from: invoke-HFZJxNs */
    public eqay mo436invokeHFZJxNs(Pointer pointer, eqau eqauVar, final long j, Pointer pointer2) {
        eqaw eqawVarA;
        final String str;
        dqqj dqqjVarP;
        ccds ccdsVar;
        eqauVar.getClass();
        pointer2.getClass();
        byte[] bArrB = epzk.b(eqauVar);
        epze epzeVar = new epze(pointer2);
        try {
            ccnm ccnmVar = this.a.b;
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            str = new String(bArrCopyOf, fdfy.a);
            final String str2 = ccnmVar.b;
            String[] strArr = ccen.a;
            ccei cceiVar = new ccei(ccen.a);
            cceiVar.A("getEpoch");
            cceiVar.c(new Function() { // from class: ccnw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ccem ccemVar = (ccem) obj;
                    ccemVar.d(str2);
                    ccemVar.c(str);
                    ccemVar.b(j);
                    return ccemVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqqjVarP = cceiVar.b().p();
            try {
                ccdsVar = (ccds) dqqjVarP;
            } finally {
            }
        } catch (Exception e) {
            ekrw ekrwVarJ = ccnl.a.j();
            ekrwVarJ.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "epoch-pxsixaI", 144, "GroupStateStorageAdapter.kt")).D("Failed to get epoch record from MlsEpochRecords table, epochId: %s, groupId: %s", new fcts(j), ccoj.a(bArrB));
            if (e instanceof ccnn) {
                eqax eqaxVar = eqaw.a;
                eqawVarA = eqav.b();
            } else {
                eqax eqaxVar2 = eqaw.a;
                eqawVarA = eqav.a(eqbq.w);
            }
        }
        if (!ccdsVar.moveToFirst()) {
            throw new ccnn(str, j);
        }
        ccdc ccdcVar = (ccdc) ccdsVar.cU();
        epsh epshVar = (epsh) epsi.a.createBuilder();
        epshVar.getClass();
        epsj.d(ccdcVar.k(), epshVar);
        epsj.c(evqs.x(ccdcVar.o()), epshVar);
        epsj.b(ccdcVar.m().getEpochSecond(), epshVar);
        epsi epsiVarA = epsj.a(epshVar);
        fczl.a(dqqjVarP, null);
        byte[] byteArray = epsiVarA.toByteArray();
        byte[] bArrCopyOf2 = Arrays.copyOf(byteArray, byteArray.length);
        bArrCopyOf2.getClass();
        epzeVar.a(bArrCopyOf2);
        eqax eqaxVar3 = eqaw.a;
        eqawVarA = eqav.c();
        return eqawVarA.b;
    }
}
