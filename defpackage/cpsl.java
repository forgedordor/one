package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpsl {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsMessageObjectFetcher");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final dqsn i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final aqfg m;
    private final fcsu n;
    private final fcsu o;

    public cpsl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, dqsn dqsnVar, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, aqfg aqfgVar) {
        this.b = fcsuVar;
        this.n = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.o = fcsuVar5;
        this.e = fcsuVar6;
        this.f = fcsuVar7;
        this.g = fcsuVar8;
        this.h = fcsuVar9;
        this.i = dqsnVar;
        this.j = fcsuVar10;
        this.k = fcsuVar11;
        this.l = fcsuVar12;
        this.m = aqfgVar;
    }

    public static final ekgb g(cprt cprtVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ParticipantsTable.BindData bindDataD = cprtVar.d();
        if (bindDataD != null) {
            cpre.a(bindDataD, ekfwVar);
        }
        ParticipantsTable.BindData bindDataE = cprtVar.e();
        if (bindDataE != null) {
            cpre.a(bindDataE, ekfwVar);
        }
        bojh bojhVarB = cprtVar.b();
        if (bojhVarB != null) {
            String strS = bojhVarB.S();
            ConversationIdType conversationIdTypeC = bojhVarB.C();
            if (TextUtils.isEmpty(strS) && !conversationIdTypeC.b()) {
                ekfwVar.h(new cpyp(conversationIdTypeC.a(), 2));
            }
        }
        return ekfwVar.g();
    }

    public final bojh a(ConversationIdType conversationIdType) {
        return ((bakt) this.o.b()).r(conversationIdType);
    }

    public final ParticipantsTable.BindData b() {
        return ((bbca) this.d.b()).a();
    }

    public final ParticipantsTable.BindData c(String str) {
        ParticipantsTable.BindData bindDataB = ((bbca) this.d.b()).b(str);
        if (bindDataB == null) {
            return null;
        }
        return bindDataB.r() != -2 ? b() : bindDataB;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cprt d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r13, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r14, defpackage.bpvd r15, java.util.List r16, java.util.List r17, defpackage.ekgp r18, java.util.List r19, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r20, defpackage.bojh r21) {
        /*
            r12 = this;
            aqfg r0 = r12.m
            boolean r0 = r0.a()
            if (r0 == 0) goto L15
            if (r20 != 0) goto Lc
            r0 = 0
            goto L17
        Lc:
            int r0 = r20.r()
            r1 = -2
            if (r0 == r1) goto L15
            r0 = r14
            goto L17
        L15:
            r0 = r20
        L17:
            cplr r1 = new cplr
            r1.<init>()
            int r2 = defpackage.ekgb.d
            ekgb r2 = defpackage.ekoe.a
            r1.b(r2)
            r1.d(r2)
            r1.c(r2)
            ekgp r2 = defpackage.ekoj.a
            r1.a(r2)
            if (r13 == 0) goto Lc9
            r1.a = r13
            r1.b = r0
            r1.c = r14
            r13 = r21
            r1.d = r13
            r1.e = r15
            r13 = r16
            r1.b(r13)
            r13 = r17
            r1.d(r13)
            r13 = r19
            r1.c(r13)
            fcsu r13 = r12.l
            java.lang.Object r13 = r13.b()
            apom r13 = (defpackage.apom) r13
            boolean r13 = r13.a()
            if (r13 == 0) goto L64
            boolean r13 = defpackage.cpyl.a()
            if (r13 == 0) goto L64
            r13 = r18
            r1.a(r13)
        L64:
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r3 = r1.a
            if (r3 == 0) goto L87
            ekgb r8 = r1.f
            if (r8 == 0) goto L87
            ekgb r9 = r1.g
            if (r9 == 0) goto L87
            ekgp r10 = r1.h
            if (r10 == 0) goto L87
            ekgb r11 = r1.i
            if (r11 != 0) goto L79
            goto L87
        L79:
            cpls r2 = new cpls
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r4 = r1.b
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r5 = r1.c
            bojh r6 = r1.d
            bpvd r7 = r1.e
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L87:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14 = r1.a
            if (r14 != 0) goto L95
            java.lang.String r14 = " message"
            r13.append(r14)
        L95:
            ekgb r14 = r1.f
            if (r14 != 0) goto L9e
            java.lang.String r14 = " conversationSuggestions"
            r13.append(r14)
        L9e:
            ekgb r14 = r1.g
            if (r14 != 0) goto La7
            java.lang.String r14 = " spamSources"
            r13.append(r14)
        La7:
            ekgp r14 = r1.h
            if (r14 != 0) goto Lb0
            java.lang.String r14 = " cmsData"
            r13.append(r14)
        Lb0:
            ekgb r14 = r1.i
            if (r14 != 0) goto Lb9
            java.lang.String r14 = " messageAnnotations"
            r13.append(r14)
        Lb9:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r13 = r0.concat(r13)
            r14.<init>(r13)
            throw r14
        Lc9:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "Null message"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpsl.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, bpvd, java.util.List, java.util.List, ekgp, java.util.List, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, bojh):cprt");
    }

    public final ekgp e(MessageIdType messageIdType) {
        ekgp ekgpVarJ;
        eieu eieuVarK = eiiy.k("CmsMessageObjectFetcher#getCmsData");
        try {
            if (((apom) this.l.b()).a() && cpyl.a()) {
                fcsu fcsuVar = this.g;
                ekgpVarJ = ((Optional) fcsuVar.b()).isEmpty() ? ekoj.a : ekgp.j(((cpme) this.h.b()).b((Map) ((Optional) fcsuVar.b()).get(), messageIdType.toString()));
            }
            eieuVarK.close();
            return ekgpVarJ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional f(final MessageIdType messageIdType) {
        return Optional.ofNullable(((baxe) this.n.b()).w(messageIdType)).map(new Function() { // from class: cpsg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cpsl cpslVar = this.a;
                fcsu fcsuVar = cpslVar.b;
                MessageCoreData messageCoreData = (MessageCoreData) obj;
                ParticipantsTable.BindData bindDataB = cpslVar.b();
                MessageIdType messageIdType2 = messageIdType;
                bpvd bpvdVar = (bpvd) bbfz.c(messageIdType2).orElse(null);
                eieu eieuVarK = eiiy.k("ConversationSuggestionDatabaseOperations#getConversationSuggestionsByMessageId");
                try {
                    cqaz.h();
                    String[] strArr = bofr.a;
                    bofq bofqVar = new bofq();
                    bofqVar.b(messageIdType2);
                    bofp bofpVar = new bofp(bofqVar);
                    cqaz.h();
                    bofm bofmVarA = bofr.a();
                    bofmVarA.A("getConversationSuggestions");
                    bofmVarA.k(bofpVar);
                    boet boetVar = (boet) bofmVarA.b().p();
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (boetVar.moveToNext()) {
                            arrayList.add(crhj.a((bods) boetVar.cQ()));
                        }
                        boetVar.close();
                        eieuVarK.close();
                        Stream map = Collection.EL.stream(arrayList).map(new Function() { // from class: cpru
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((RbmSuggestionData) ((SuggestionData) obj2)).b;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = ekgb.d;
                        List list = (List) map.collect(ekcv.a);
                        ekgb ekgbVarA = ((csea) cpslVar.f.b()).a(new cspi(messageIdType2));
                        ekgp ekgpVarE = cpslVar.e(messageIdType2);
                        ekfw ekfwVar = new ekfw();
                        ekfwVar.j(cqyx.a(messageIdType2).d);
                        return cpslVar.d(messageCoreData, bindDataB, bpvdVar, list, ekgbVarA, ekgpVarE, ekfwVar.g(), cpslVar.c(messageCoreData.aB()), cpslVar.a(messageCoreData.A()));
                    } finally {
                    }
                } finally {
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
