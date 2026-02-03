package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfg implements bayb {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnRcsMessageReceivedListener");
    public Instant a;
    private final fdjx c;
    private final fcyh d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final aqau h;
    private boolean i;
    private basd j;
    private Instant k;
    private ckez l;

    public ckfg(fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, aqau aqauVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.c = fdjxVar;
        this.d = fcyhVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = aqauVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r4 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r1 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.ckfe
            if (r2 == 0) goto L17
            r2 = r1
            ckfe r2 = (defpackage.ckfe) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            ckfe r2 = new ckfe
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.b
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.d
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L43
            if (r4 == r6) goto L38
            if (r4 != r5) goto L30
            defpackage.fctl.b(r1)
            goto Lb2
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.Object r4 = r2.a
            defpackage.fctl.b(r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L67
        L43:
            defpackage.fctl.b(r1)
            basd r1 = r0.j
            if (r1 == 0) goto L6a
            java.lang.String r4 = r18.aB()
            if (r4 == 0) goto L6a
            fcyh r8 = r0.d
            fcyh r8 = defpackage.eicg.a(r8)
            ckff r9 = new ckff
            r9.<init>(r7, r1, r4, r0)
            r1 = r18
            r2.a = r1
            r2.d = r6
            java.lang.Object r4 = defpackage.fdin.a(r8, r9, r2)
            if (r4 == r3) goto Lb1
        L67:
            j$.time.Duration r4 = (j$.time.Duration) r4
            goto L6d
        L6a:
            r1 = r18
            r4 = r7
        L6d:
            fcsu r6 = r0.f
            java.lang.Object r6 = r6.b()
            ckdn r6 = (defpackage.ckdn) r6
            ckdv r8 = new ckdv
            long r9 = r1.t()
            ckez r11 = r0.l
            if (r11 == 0) goto L82
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r11 = r11.a
            goto L83
        L82:
            r11 = r7
        L83:
            if (r4 != 0) goto L87
            j$.time.Duration r4 = j$.time.Duration.ZERO
        L87:
            r12 = r4
            r12.getClass()
            basd r13 = r0.j
            j$.time.Instant r14 = defpackage.ckfj.b(r1)
            boolean r15 = defpackage.ckfj.a(r1)
            r8.<init>(r9, r11, r12, r13, r14, r15)
            r2.a = r7
            r2.d = r5
            fcyh r1 = r6.b
            fcyh r1 = defpackage.eicg.a(r1)
            ckdm r4 = new ckdm
            r4.<init>(r7, r6, r8)
            java.lang.Object r1 = defpackage.fdin.a(r1, r4, r2)
            if (r1 == r3) goto Laf
            fctx r1 = defpackage.fctx.a
        Laf:
            if (r1 != r3) goto Lb2
        Lb1:
            return r3
        Lb2:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckfg.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, fcxy):java.lang.Object");
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (((Boolean) this.g.b()).booleanValue()) {
            if (this.j == null && this.k == null) {
                return;
            }
            auvw.k(this.c, null, null, new ckfd(this, messageCoreData, null), 3);
        }
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) throws IOException {
        basd basdVarC;
        boolean zIsBefore;
        messageCoreData.getClass();
        if (!((Boolean) this.g.b()).booleanValue()) {
            return;
        }
        eieu eieuVarH = eiiy.h("EditOnRcsMessageReceivedListener#beforeMessageInserted");
        try {
            String strAB = messageCoreData.aB();
            if (strAB == null) {
                fczl.a(eieuVarH, null);
                return;
            }
            eyga eygaVarAc = messageCoreData.ac();
            boolean z = true;
            if (eygaVarAc != null) {
                basdVarC = ckfj.c(eygaVarAc);
                if (true != basdVarC.k()) {
                    basdVarC = null;
                }
                if (basdVarC == null) {
                    Optional optionalA = civb.a(eygaVarAc, civa.RCS_EDIT_NAMESPACE, "Edited-Message-Id");
                    final ckfi ckfiVar = ckfi.a;
                    Optional map = optionalA.map(new Function() { // from class: ckfh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ckfiVar.invoke(obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    map.getClass();
                    basdVarC = (basd) fdct.b(map);
                }
            } else {
                basdVarC = null;
            }
            this.j = basdVarC;
            Instant instantOfEpochMilli = ckfj.a(messageCoreData) ? Instant.ofEpochMilli(messageCoreData.r()) : ckfj.b(messageCoreData);
            this.k = instantOfEpochMilli;
            if (this.j != null && instantOfEpochMilli != null) {
                this.i = true;
                basd basdVar = this.j;
                basdVar.getClass();
                ckez ckezVarC = ckfa.c(basdVar, strAB);
                this.l = ckezVarC;
                zIsBefore = ckezVarC != null ? ckezVarC.b.isBefore(this.k) : true;
            } else {
                if (!((eoth) ((apkh) this.h).a.b()).a("bugle.handle_out_of_order_edits")) {
                    fczl.a(eieuVarH, null);
                    return;
                }
                fcsu fcsuVar = this.e;
                final basd basdVarF = messageCoreData.F();
                basdVarF.getClass();
                String[] strArr = bqfo.a;
                bqfj bqfjVar = new bqfj(bqfo.a);
                bqfjVar.A("wasPotentiallyEdited");
                bqfjVar.f(new Function() { // from class: ckeo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bqeu) obj).c;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqfjVar.g(new Function() { // from class: ckep
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqfn bqfnVar = (bqfn) obj;
                        bqfnVar.b(basdVarF);
                        return bqfnVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqfjVar.y(1);
                if (!bqfjVar.b().U()) {
                    fczl.a(eieuVarH, null);
                    return;
                }
                basd basdVarF2 = messageCoreData.F();
                basdVarF2.getClass();
                ckez ckezVarC2 = ckfa.c(basdVarF2, strAB);
                this.l = ckezVarC2;
                if (ckezVarC2 == null) {
                    fczl.a(eieuVarH, null);
                    return;
                }
                this.i = true;
                this.j = messageCoreData.F();
                this.k = Instant.ofEpochMilli(-1L);
                zIsBefore = false;
            }
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleRcsEdits");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrz ekrzVar = ckfb.a;
            ekrdVar.X(ckfb.c, this.j);
            ekrdVar.X(ckfb.d, this.k);
            ekrz ekrzVar2 = ckfb.e;
            ckez ckezVar = this.l;
            ekrdVar.X(ekrzVar2, ckezVar != null ? ckezVar.a : null);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnRcsMessageReceivedListener", "beforeMessageInserted", 109, "EditOnRcsMessageReceivedListener.kt")).t("Preparing incoming edit: isNewMessageVisible = %s.", Boolean.valueOf(zIsBefore));
            messageCoreData.bx(!zIsBefore);
            this.a = Instant.ofEpochMilli(messageCoreData.o());
            basd basdVar2 = this.j;
            basdVar2.getClass();
            Instant instantB = ckfa.b(basdVar2, strAB);
            if (instantB != null) {
                messageCoreData.bL(instantB.toEpochMilli());
            }
            if (zIsBefore && instantB == null) {
                z = false;
            }
            messageCoreData.bz(z);
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        if (!((Boolean) this.g.b()).booleanValue()) {
            return;
        }
        eieu eieuVarH = eiiy.h("EditOnRcsMessageReceivedListener#onInsertedInTransaction");
        try {
            if (!this.i) {
                fczl.a(eieuVarH, null);
                return;
            }
            ckfa ckfaVar = (ckfa) this.e.b();
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            conversationIdTypeA.getClass();
            MessageIdType messageIdTypeC = messageCoreData.C();
            messageIdTypeC.getClass();
            String strAB = messageCoreData.aB();
            strAB.getClass();
            basd basdVar = this.j;
            basdVar.getClass();
            Instant instant = this.k;
            instant.getClass();
            Instant instant2 = this.a;
            instant2.getClass();
            ckfaVar.a(conversationIdTypeA, messageIdTypeC, strAB, basdVar, instant, instant2, this.l);
            fczl.a(eieuVarH, null);
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleRcsEdits");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrz ekrzVar = ckfb.a;
            ekrdVar.X(ckfb.a, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcsedit/transport/EditOnRcsMessageReceivedListener", "onInsertedInTransaction", 160, "EditOnRcsMessageReceivedListener.kt")).q("Processed incoming edit.");
        } finally {
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
