package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stn implements bayk, bayb {
    public static final eksp a = eksp.c("BugleAudio");
    public final sti b;
    private final Context c;
    private final bahv d;
    private final ajvr e;

    public stn(Context context, sti stiVar, bahv bahvVar, ajvr ajvrVar) {
        context.getClass();
        bahvVar.getClass();
        ajvrVar.getClass();
        this.c = context;
        this.b = stiVar;
        this.d = bahvVar;
        this.e = ajvrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bayk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.stl
            if (r0 == 0) goto L13
            r0 = r7
            stl r0 = (defpackage.stl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            stl r0 = new stl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r6 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r7 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.fctl.b(r7)
            java.lang.String r7 = "VoiceMoodsTransportListener::onBeforeInsertion"
            eieu r7 = defpackage.eiiy.h(r7)
            r0.d = r7     // Catch: java.lang.Throwable -> L4f
            r0.c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 == r1) goto L4e
            r4 = r7
            r7 = r6
            r6 = r4
        L49:
            r0 = 0
            defpackage.fczl.a(r6, r0)
            return r7
        L4e:
            return r1
        L4f:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L53:
            throw r7     // Catch: java.lang.Throwable -> L54
        L54:
            r0 = move-exception
            defpackage.fczl.a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stn.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.stn.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final void e(final MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (j() && messageCoreData.cX()) {
            Optional optionalA = civb.a(messageCoreData.ac(), civa.VOICE_MOODS_NAMESPACE, GroupManagementRequest.DATA_TAG);
            final fdap fdapVar = new fdap() { // from class: stj
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    str.getClass();
                    MessageCoreData messageCoreData2 = messageCoreData;
                    stn stnVar = this;
                    try {
                        MessagePartCoreData messagePartCoreDataH = messageCoreData2.H();
                        if (messagePartCoreDataH != null) {
                            dqbw dqbwVarJ = messagePartCoreDataH.J();
                            dqbwVarJ.getClass();
                            dqbv dqbvVar = (dqbv) dqbwVarJ.toBuilder();
                            dqbvVar.getClass();
                            byte[] bArrDecode = Base64.decode(str, 2);
                            dqcs dqcsVar = dqcs.a;
                            dqcs dqcsVar2 = (dqcs) evsn.parseFrom(dqcsVar, bArrDecode);
                            dqcsVar2.getClass();
                            dqbx.c(dqcsVar2, dqbvVar);
                            messagePartCoreDataH.aJ(dqbx.a(dqbvVar));
                            sti stiVar = stnVar.b;
                            dqcs dqcsVar3 = messagePartCoreDataH.J().c;
                            if (dqcsVar3 != null) {
                                dqcsVar = dqcsVar3;
                            }
                            int iB = dqcv.b(dqcsVar.c);
                            if (iB == 0) {
                                iB = 1;
                            }
                            ailn ailnVarA = ((aimb) stiVar.a.b()).a();
                            ellh ellhVar = ellh.a;
                            ellg ellgVar = (ellg) ellhVar.createBuilder();
                            ellgVar.getClass();
                            ellf ellfVar = ellf.VOICE_MOOD_EVENT;
                            elgr.g(ellfVar, ellgVar);
                            enln enlnVar = enln.a;
                            enll enllVar = (enll) enlnVar.createBuilder();
                            enllVar.getClass();
                            eode.b(3, enllVar);
                            eode.c(iB, enllVar);
                            elgr.l(eode.a(enllVar), ellgVar);
                            eiju eijuVarE = eijx.e(elgr.a(ellgVar).toBuilder());
                            aioj aiojVar = aioj.LOG_SPEC_VOICE_MOOD_EVENTS;
                            ailnVarA.i(eijuVarE, aiojVar);
                            ailn ailnVarA2 = ((aimb) stiVar.b.b()).a();
                            ellg ellgVar2 = (ellg) ellhVar.createBuilder();
                            ellgVar2.getClass();
                            elgr.g(ellfVar, ellgVar2);
                            enll enllVar2 = (enll) enlnVar.createBuilder();
                            enllVar2.getClass();
                            eode.b(5, enllVar2);
                            elgr.l(eode.a(enllVar2), ellgVar2);
                            ailnVarA2.i(eijx.e(elgr.a(ellgVar2).toBuilder()), aiojVar);
                        }
                    } catch (evtj e) {
                        ((eksl) ((eksl) stn.a.i()).g(e)).q("Failed to deserialize voice mood.");
                    }
                    return fctx.a;
                }
            };
            optionalA.ifPresent(new Consumer() { // from class: stk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    eksp ekspVar = stn.a;
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final boolean j() {
        Object objE = aonl.g.e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
