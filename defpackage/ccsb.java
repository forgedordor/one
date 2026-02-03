package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccsb extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ccsc c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ asrg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccsb(ccsc ccscVar, MessageCoreData messageCoreData, asrg asrgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ccscVar;
        this.d = messageCoreData;
        this.e = asrgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccsb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.io.Closeable] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        eieu eieuVarH;
        fcti fctiVar;
        chvf chvfVarA;
        eieu eieuVar;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.b;
        try {
            if (r1 == 0) {
                fctl.b(obj);
                final ccsc ccscVar = this.c;
                final MessageCoreData messageCoreData = this.d;
                asrg asrgVar = this.e;
                if (!eicg.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                eieuVarH = eiiy.h("MlsRcsChatMessageSender#sendChatMessage");
                if (cmnp.p(messageCoreData)) {
                    String strAm = messageCoreData.am();
                    if (strAm == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    fctiVar = new fcti(auby.b(strAm), new fdae() { // from class: ccrx
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            String strAz = messageCoreData.az();
                            if (strAz != null) {
                                return evqs.A(strAz);
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    });
                } else if (cmnp.j(messageCoreData, ccscVar.b)) {
                    fctiVar = new fcti(auby.b("application/vnd.gsma.rcspushlocation+xml"), new fdae() { // from class: ccry
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            MessageCoreData messageCoreData2 = messageCoreData;
                            LocationInformation locationInformationC = cmsm.c(messageCoreData2);
                            locationInformationC.getClass();
                            return evqs.x(ccscVar.b.d(messageCoreData2, locationInformationC));
                        }
                    });
                } else {
                    ekrw ekrwVarH = ccsc.a.h();
                    ekrwVarH.X(eksq.a, "BugleE2eeMls");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.e, messageCoreData.F().f());
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/MlsRcsChatMessageSender", "getMessageInformation", 112, "MlsRcsChatMessageSender.kt")).q("Unsupported message type for mls.");
                    fctiVar = null;
                }
                if (fctiVar != null) {
                    aubx aubxVar = (aubx) fctiVar.a;
                    fdae fdaeVar = (fdae) fctiVar.b;
                    this.a = eieuVarH;
                    this.b = 1;
                    obj = ccscVar.b(messageCoreData, asrgVar, aubxVar, fdaeVar, this);
                    eieuVarH = eieuVarH;
                    if (obj == fcylVar) {
                        return fcylVar;
                    }
                }
                chvfVarA = chvf.j(3, 0).a();
                eieuVar = eieuVarH;
                fczl.a(eieuVar, null);
                chvfVarA.getClass();
                return chvfVarA;
            }
            Object obj2 = this.a;
            fctl.b(obj);
            eieuVarH = obj2;
            chvfVarA = (chvf) obj;
            if (chvfVarA != null) {
                eieuVar = eieuVarH;
            } else {
                chvfVarA = chvf.j(3, 0).a();
                eieuVar = eieuVarH;
            }
            fczl.a(eieuVar, null);
            chvfVarA.getClass();
            return chvfVarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(r1, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccsb(this.c, this.d, this.e, fcxyVar);
    }
}
