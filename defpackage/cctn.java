package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cctn extends fcyz implements fdap {
    final /* synthetic */ ccto a;
    final /* synthetic */ MessageCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cctn(ccto cctoVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = cctoVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        epwa epwaVar;
        cbtf cbtfVarE;
        fctl.b(obj);
        MessageCoreData messageCoreData = this.b;
        messageCoreData.getClass();
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        athh athhVarZ = messagePartCoreDataH != null ? messagePartCoreDataH.z() : null;
        cctj cctjVar = this.a.a;
        if (!((aptx) cctjVar.b.b()).a() || athhVarZ == null) {
            final basd basdVarF = messageCoreData.F();
            basdVarF.getClass();
            bpil bpilVarA = bpio.a();
            bpilVarA.A("MlsFileTransferDetailsConverter.getEtouffeeMessageByRcsId");
            bpilVarA.c(new Function() { // from class: ccti
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bpin bpinVar = (bpin) obj2;
                    bpinVar.b(basdVarF);
                    return bpinVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dqpd dqpdVarM = bpilVarA.b().m();
            dqpdVarM.getClass();
            bpfv bpfvVar = (bpfv) dqpdVarM;
            bpfvVar.aA(17, "mls_file_info");
            epwaVar = bpfvVar.r;
            epwaVar.getClass();
        } else {
            if (messageCoreData.H() == null) {
                throw new IllegalStateException("Message is missing an attachment");
            }
            epvz epvzVar = (epvz) epwa.a.createBuilder();
            epvzVar.getClass();
            fcsu fcsuVar = cctjVar.a;
            cbtf cbtfVarD = ((atjz) fcsuVar.b()).d(athhVarZ);
            cbtfVarD.getClass();
            if (!(cbtfVarD instanceof cbtd)) {
                throw new IllegalStateException("File is not an MLS encrypted attachment");
            }
            epwc epwcVar = ((cbtd) cbtfVarD).a;
            epvzVar.copyOnWrite();
            epwa epwaVar2 = (epwa) epvzVar.instance;
            epwaVar2.c = epwcVar;
            epwaVar2.b |= 1;
            MessagePartCoreData messagePartCoreDataH2 = messageCoreData.H();
            messagePartCoreDataH2.getClass();
            if (messagePartCoreDataH2.aS() && (cbtfVarE = ((atjz) fcsuVar.b()).e(athhVarZ)) != null) {
                if (!(cbtfVarE instanceof cbtd)) {
                    throw new IllegalStateException("Preview is not an MLS encrypted preview");
                }
                epwc epwcVar2 = ((cbtd) cbtfVarE).a;
                epvzVar.copyOnWrite();
                epwa epwaVar3 = (epwa) epvzVar.instance;
                epwaVar3.d = epwcVar2;
                epwaVar3.b |= 2;
            }
            evsn evsnVarBuild = epvzVar.build();
            evsnVarBuild.getClass();
            epwaVar = (epwa) evsnVarBuild;
        }
        return epwaVar.toByteString();
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cctn(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
