package defpackage;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auue {
    private static final cqce b = cqce.g("BugleDataModel", "CloudSyncDatabaseOperations");
    public final fcsu a;
    private final dqsn c;
    private final fcsu d;
    private final fcsu e;

    public auue(fcsu fcsuVar, dqsn dqsnVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.c = dqsnVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    public static ConversationIdType a(final String str) {
        ConversationIdType conversationIdTypeH;
        eieu eieuVarK = eiiy.k("CloudSyncDatabaseOperations#getExistingCloudSyncConversation");
        try {
            cqaz.h();
            botb botbVarE = botm.e();
            botbVarE.A("getExistingCloudSyncConversation");
            botbVarE.s();
            botbVarE.g(new Function() { // from class: auuc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bopp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.i(new Function() { // from class: auud
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.M(1);
                    int iIntValue = botm.g().intValue();
                    if (iIntValue < 8500) {
                        dqru.x("participant_id_list", iIntValue);
                    }
                    botlVar.ap(new dqpj("conversations.participant_id_list", 1, String.valueOf(str)));
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                if (boprVar.moveToFirst()) {
                    if (boprVar.getCount() != 1) {
                        cqbd cqbdVarE = b.e();
                        cqbdVarE.I("Unexpected cursor size:");
                        cqbdVarE.G(boprVar.getCount());
                        cqbdVarE.s(new Throwable());
                    }
                    conversationIdTypeH = boprVar.h();
                } else {
                    conversationIdTypeH = barn.a;
                }
                boprVar.close();
                eieuVarK.close();
                return conversationIdTypeH;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ConversationIdType b(bvdk bvdkVar, List list) {
        eieu eieuVarK = eiiy.k("CloudSyncDatabaseOperations#getOrCreateCloudSyncConversation");
        try {
            ecem.b();
            String strC = c(list);
            ConversationIdType conversationIdTypeA = a(strC);
            if (conversationIdTypeA.b()) {
                conversationIdTypeA = ((bakt) this.e.b()).aq(-1L, bvdkVar, list, 1, strC, -1L);
            }
            eieuVarK.close();
            return conversationIdTypeA;
        } finally {
        }
    }

    public final String c(List list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((bbca) this.d.b()).i((ParticipantsTable.BindData) list.get(i));
        }
        Arrays.sort(strArr);
        return TextUtils.join(",", strArr);
    }

    public final boolean d(ConversationIdType conversationIdType, cnqj cnqjVar) {
        eieu eieuVarK = eiiy.k("CloudSyncDatabaseOperations#isCloudSyncConversation");
        try {
            boolean z = false;
            if (cnqjVar.d()) {
                if (((bakt) this.e.b()).b(conversationIdType) == 1) {
                    z = true;
                }
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e(final String str, final Bundle bundle, final MessageCoreData messageCoreData) {
        return ((Boolean) this.c.c("CloudSyncDatabaseOperations#updateMessageWithCloudSyncId", new ejxr() { // from class: auub
            @Override // defpackage.ejxr
            public final Object get() {
                Bundle bundle2 = bundle;
                boolean z = false;
                boolean z2 = bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.READ", false);
                boolean z3 = z2 || bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED", false);
                if (z2 || z3) {
                    final String str2 = str;
                    String[] strArr = MessagesTable.a;
                    brdu brduVar = new brdu();
                    brduVar.ap("updateMessageWithCloudSyncIdInternal");
                    brduVar.X(new Function() { // from class: auua
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.d(str2);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (z2) {
                        brduVar.F(true);
                    }
                    brduVar.v(true);
                    bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.NOTIFIED");
                    bundle2.getBoolean("com.google.android.apps.messaging.cloudsync.extra.READ");
                    boolean z4 = cqca.b;
                    if (brduVar.b().e() > 0) {
                        MessageCoreData messageCoreData2 = messageCoreData;
                        ((bxlc) this.a.a.b()).l(messageCoreData2.A(), messageCoreData2.C(), (String[]) new ContentValues(brduVar.b().a).keySet().toArray(new String[0]));
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:6:0x0022, B:8:0x0032, B:9:0x0035, B:21:0x0082, B:22:0x0086, B:31:0x0097, B:30:0x0094, B:27:0x008f, B:10:0x0059, B:12:0x005f, B:13:0x0064, B:15:0x006a, B:17:0x0070, B:18:0x0074, B:20:0x007a), top: B:40:0x0022, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] f(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5, defpackage.brdv r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L1c
            java.lang.String[] r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a
            brec r6 = new brec
            r6.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            dqxl r2 = new dqxl
            java.lang.String r3 = "1"
            r2.<init>(r3, r1)
            r6.ar(r2)
            brdv r1 = new brdv
            r1.<init>(r6)
            r6 = r1
        L1c:
            java.lang.String r1 = "CloudSyncDatabaseOperations#getMessageCloudSyncIds"
            eieu r1 = defpackage.eiiy.k(r1)
            java.lang.String[] r2 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.a     // Catch: java.lang.Throwable -> L98
            brec r2 = new brec     // Catch: java.lang.Throwable -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L98
            r2.e()     // Catch: java.lang.Throwable -> L98
            boolean r3 = r5.b()     // Catch: java.lang.Throwable -> L98
            if (r3 != 0) goto L35
            r2.m(r5)     // Catch: java.lang.Throwable -> L98
        L35:
            brdr r5 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "+getMessageCloudSyncIds"
            r5.A(r3)     // Catch: java.lang.Throwable -> L98
            autz r3 = new autz     // Catch: java.lang.Throwable -> L98
            r3.<init>()     // Catch: java.lang.Throwable -> L98
            r5.f(r3)     // Catch: java.lang.Throwable -> L98
            r5.g(r2)     // Catch: java.lang.Throwable -> L98
            r5.k(r6)     // Catch: java.lang.Throwable -> L98
            r5.s()     // Catch: java.lang.Throwable -> L98
            brdp r5 = r5.b()     // Catch: java.lang.Throwable -> L98
            dqqj r5 = r5.p()     // Catch: java.lang.Throwable -> L98
            brap r5 = (defpackage.brap) r5     // Catch: java.lang.Throwable -> L98
            int r6 = r5.getCount()     // Catch: java.lang.Throwable -> L8e
            if (r6 <= 0) goto L86
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8e
            r6.<init>()     // Catch: java.lang.Throwable -> L8e
        L64:
            boolean r2 = r5.moveToNext()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L74
            java.lang.String r2 = r5.D()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L64
            r6.add(r2)     // Catch: java.lang.Throwable -> L8e
            goto L64
        L74:
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L86
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L8e
            java.lang.Object[] r6 = r6.toArray(r0)     // Catch: java.lang.Throwable -> L8e
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L8e
            r5.close()     // Catch: java.lang.Throwable -> L98
            goto L8a
        L86:
            r5.close()     // Catch: java.lang.Throwable -> L98
            r6 = 0
        L8a:
            r1.close()
            return r6
        L8e:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L93
            goto L97
        L93:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L98
        L97:
            throw r6     // Catch: java.lang.Throwable -> L98
        L98:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L9d
            goto La1
        L9d:
            r6 = move-exception
            r5.addSuppressed(r6)
        La1:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auue.f(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, brdv):java.lang.String[]");
    }
}
