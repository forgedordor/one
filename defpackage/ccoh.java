package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccoh implements ccoc {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public ccoh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.ccoc
    public final basd a() {
        return ((auau) this.a.b()).a();
    }

    @Override // defpackage.ccoc
    public final epsi b(final basd basdVar) {
        cckl ccklVarA = cckr.a();
        ccklVarA.A("MlsMessageAccessor#getMessageEpoch");
        ccklVarA.y(1);
        ccklVarA.c(new Function() { // from class: ccoe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cckq cckqVar = (cckq) obj;
                cckqVar.b(basdVar);
                return cckqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = ccklVarA.b().z();
        ekgbVarZ.getClass();
        final ccir ccirVar = (ccir) fcva.Y(ekgbVarZ);
        if (ccirVar == null) {
            return null;
        }
        String[] strArr = ccen.a;
        ccei cceiVar = new ccei(ccen.a);
        cceiVar.A("MlsMessageAccessor#getMessageEpoch");
        cceiVar.y(1);
        cceiVar.c(new Function() { // from class: ccof
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ccir ccirVar2 = ccirVar;
                ccem ccemVar = (ccem) obj;
                ccemVar.d(ccirVar2.p());
                ccemVar.c(ccirVar2.o());
                ccemVar.b(ccirVar2.k());
                return ccemVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ2 = cceiVar.b().z();
        ekgbVarZ2.getClass();
        ccdc ccdcVar = (ccdc) fcva.Y(ekgbVarZ2);
        if (ccdcVar == null) {
            return null;
        }
        epsh epshVar = (epsh) epsi.a.createBuilder();
        epshVar.getClass();
        epsj.d(ccdcVar.k(), epshVar);
        byte[] bArrO = ccdcVar.o();
        bArrO.getClass();
        epsj.c(evwm.a(bArrO), epshVar);
        epsj.b(ccdcVar.m().getEpochSecond(), epshVar);
        return epsj.a(epshVar);
    }

    @Override // defpackage.ccoc
    public final eptc c(basd basdVar, String str) {
        final ParticipantsTable.BindData bindDataD;
        final MessageCoreData messageCoreDataY = ((baxe) this.b.b()).y(basdVar);
        if (messageCoreDataY == null || (bindDataD = ((bbca) this.c.b()).d(str)) == null) {
            return eptc.IMDN_UNAVAILABLE;
        }
        btbo btboVarB = btbt.b();
        btboVarB.A("MlsMessageAccessor#getImdnForMessageAndRecipient");
        btboVarB.y(1);
        btboVarB.e(new Function() { // from class: ccod
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btbs btbsVar = (btbs) obj;
                btbsVar.b(messageCoreDataY.C());
                String strR = bindDataD.R();
                strR.getClass();
                btbsVar.c(Long.parseLong(strR));
                return btbsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = btboVarB.b().z();
        ekgbVarZ.getClass();
        btai btaiVar = (btai) fcva.Y(ekgbVarZ);
        return btaiVar == null ? eptc.IMDN_UNAVAILABLE : btaiVar.q().isPresent() ? eptc.IMDN_FAILED_TO_DECRYPT : ((int) btaiVar.m()) != 0 ? eptc.IMDN_READ : ((int) btaiVar.n()) != 0 ? eptc.IMDN_DELIVERED : eptc.IMDN_UNAVAILABLE;
    }

    @Override // defpackage.ccoc
    public final eptp d(final basd basdVar) {
        MessageCoreData messageCoreDataY;
        cckl ccklVarA = cckr.a();
        ccklVarA.A("MlsMessageAccessor#getMessageContent");
        ccklVarA.y(1);
        ccklVarA.c(new Function() { // from class: ccog
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cckq cckqVar = (cckq) obj;
                cckqVar.b(basdVar);
                return cckqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ccir ccirVar = (ccir) ccklVarA.b().l();
        if (ccirVar == null || (messageCoreDataY = ((baxe) this.b.b()).y(basdVar)) == null) {
            return null;
        }
        epto eptoVar = (epto) eptp.a.createBuilder();
        eptoVar.getClass();
        byte[] bArrR = ccirVar.r();
        if (bArrR != null) {
            evqs evqsVarA = evwm.a(bArrR);
            eptoVar.copyOnWrite();
            eptp eptpVar = (eptp) eptoVar.instance;
            eptpVar.b = 1 | eptpVar.b;
            eptpVar.c = evqsVarA;
        }
        ccirVar.aA(4, "encryption_timestamp");
        long epochMilli = ccirVar.e.toEpochMilli();
        eptoVar.copyOnWrite();
        eptp eptpVar2 = (eptp) eptoVar.instance;
        eptpVar2.b |= 2;
        eptpVar2.d = epochMilli;
        int iQ = (int) messageCoreDataY.q();
        eptoVar.copyOnWrite();
        eptp eptpVar3 = (eptp) eptoVar.instance;
        eptpVar3.b |= 4;
        eptpVar3.e = iQ;
        evsn evsnVarBuild = eptoVar.build();
        evsnVarBuild.getClass();
        return (eptp) evsnVarBuild;
    }
}
