package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chvi extends fcyz implements fdat {
    int a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ alqm c;
    final /* synthetic */ chvm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chvi(fcxy fcxyVar, MessageCoreData messageCoreData, alqm alqmVar, chvm chvmVar) {
        super(2, fcxyVar);
        this.b = messageCoreData;
        this.c = alqmVar;
        this.d = chvmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chvi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        basd basdVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            basdVar = (basd) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            MessageCoreData messageCoreData = this.b;
            basd basdVarF = messageCoreData.F();
            augr augrVar = (augr) augs.a.createBuilder();
            augrVar.getClass();
            String strF = basdVarF.f();
            augrVar.copyOnWrite();
            augs augsVar = (augs) augrVar.instance;
            augsVar.b |= 1;
            augsVar.c = strF;
            evsn evsnVarBuild = augrVar.build();
            evsnVarBuild.getClass();
            augs augsVar2 = (augs) evsnVarBuild;
            Optional optionalE = this.c.e();
            optionalE.getClass();
            Object objB = fdct.b(optionalE);
            if (objB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Optional optionalAh = messageCoreData.ah();
            final chvj chvjVar = chvj.a;
            aubq aubqVar = (aubq) optionalAh.flatMap(new Function() { // from class: chvl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj2) {
                    return chvjVar.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseThrow(chvk.a);
            augn augnVar = (augn) augo.a.createBuilder();
            augnVar.getClass();
            augnVar.copyOnWrite();
            augo augoVar = (augo) augnVar.instance;
            augoVar.c = (aubq) objB;
            augoVar.b |= 1;
            String strF2 = basdVarF.f();
            augnVar.copyOnWrite();
            augo augoVar2 = (augo) augnVar.instance;
            augoVar2.b |= 2;
            augoVar2.d = strF2;
            String strA = messageCoreData.A().a();
            strA.getClass();
            augnVar.copyOnWrite();
            augo augoVar3 = (augo) augnVar.instance;
            augoVar3.b |= 4;
            augoVar3.e = strA;
            evqs byteString = augsVar2.toByteString();
            augnVar.copyOnWrite();
            augo augoVar4 = (augo) augnVar.instance;
            augoVar4.b |= 8;
            augoVar4.f = byteString;
            aubqVar.getClass();
            augnVar.copyOnWrite();
            augo augoVar5 = (augo) augnVar.instance;
            augoVar5.g = aubqVar;
            augoVar5.b |= 16;
            evsn evsnVarBuild2 = augnVar.build();
            evsnVarBuild2.getClass();
            eiju eijuVarD = ((asre) this.d.d.b()).d((augo) evsnVarBuild2);
            eijuVarD.getClass();
            this.e = basdVarF;
            this.a = 1;
            obj = fdxs.c(eijuVarD, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            basdVar = basdVarF;
        }
        aubl aublVar = ((augq) obj).c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        aubkVarB.getClass();
        if (aubk.OK == aubkVarB || aubk.PENDING == aubkVarB) {
            return true;
        }
        ((ains) this.d.e.b()).g("Bugle.Rcs.Chat.Message.Revoke.Send.Failed.Counts", 0L);
        ekrw ekrwVarE = chvm.a.e();
        ekrwVarE.X(eksq.a, "BugleAction");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrdVar.X(cqnc.e, basdVar.f());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/RcsRevocationSenderImpl$revokeWithChatApi$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 96, "RcsRevocationSenderImpl.kt")).t("Failed to revoke, status: %s.", aubkVarB.name());
        return false;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chvi chviVar = new chvi(fcxyVar, this.b, this.c, this.d);
        chviVar.e = obj;
        return chviVar;
    }
}
