package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uak {
    public static final cqce a = cqce.g("BugleCms", "ConversationUpdateEventHandler");
    static final cczi b = cdag.q(172676922, "enable_cancel_notifications_after_read_status_update");
    static final cczi c = cdag.h(cdag.b, "enable_handle_conversation_status_opaque_data_update", false);
    public static final ekfk d = ekfk.b(bvdk.UNARCHIVED, epjs.ACTIVE, bvdk.ARCHIVED, epjs.ARCHIVED, bvdk.KEEP_ARCHIVED, epjs.KEEP_ARCHIVED, bvdk.SPAM_FOLDER, epjs.SPAM_FOLDER, bvdk.BLOCKED_FOLDER, epjs.BLOCKED_FOLDER, bvdk.CROSS_COUNTRY_FOLDER, epjs.CROSS_COUNTRY_FOLDER);
    public final cpmc e;
    public final cpqp f;
    public final eosc g;
    public final eosc h;
    public final byeq i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;

    public uak(cpmc cpmcVar, cpqp cpqpVar, byeq byeqVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar, eosc eoscVar2) {
        this.e = cpmcVar;
        this.f = cpqpVar;
        this.i = byeqVar;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.g = eoscVar;
        this.h = eoscVar2;
    }

    public static void b(eqjy eqjyVar, String str) {
        cqbd cqbdVarC = a.c();
        String str2 = bzmz.t.a;
        int iB = eqjx.b(eqjyVar.b);
        if (iB == 0) {
            iB = 1;
        }
        cqbdVarC.A(str2, eqjx.a(iB));
        cqbdVarC.A(bzmz.v.a, "Ignore");
        cqbdVarC.A(bzmz.w.a, eqjyVar.c);
        cqbdVarC.A(bzmz.x.a, str);
        cqbdVarC.I("ConversationEvent received");
        cqbdVarC.r();
    }

    public final Optional a(eqjv eqjvVar, eqjy eqjyVar) {
        if (!eqjyVar.d.contains("most_recent_read_message_time_web")) {
            return Optional.empty();
        }
        evqs evqsVar = (evqs) DesugarCollections.unmodifiableMap(eqjvVar.g).get("most_recent_read_message_time_web");
        if (evqsVar == null) {
            cqbd cqbdVarE = a.e();
            String str = bzmz.t.a;
            int iB = eqjx.b(eqjyVar.b);
            cqbdVarE.A(str, eqjx.a(iB != 0 ? iB : 1));
            cqbdVarE.A(bzmz.v.a, "Ignore");
            cqbdVarE.A(bzmz.w.a, eqjyVar.c);
            cqbdVarE.A(bzmz.x.a, "Missing most_recent_read_message_time_web key in opaque data");
            cqbdVarE.I("ConversationEvent received");
            cqbdVarE.r();
            return Optional.empty();
        }
        try {
            return Optional.of((epkb) this.f.a((epkh) evsn.parseFrom(epkh.a, evqsVar, evrr.a()), epkb.a));
        } catch (cpyv unused) {
            cqbd cqbdVarE2 = a.e();
            String str2 = bzmz.t.a;
            int iB2 = eqjx.b(eqjyVar.b);
            cqbdVarE2.A(str2, eqjx.a(iB2 != 0 ? iB2 : 1));
            cqbdVarE2.A(bzmz.v.a, "Ignore");
            cqbdVarE2.A(bzmz.w.a, eqjyVar.c);
            cqbdVarE2.A(bzmz.x.a, "Failed to convert CMS conversation to ReadStatus object.");
            cqbdVarE2.r();
            return Optional.empty();
        } catch (evtj unused2) {
            cqbd cqbdVarE3 = a.e();
            String str3 = bzmz.t.a;
            int iB3 = eqjx.b(eqjyVar.b);
            cqbdVarE3.A(str3, eqjx.a(iB3 != 0 ? iB3 : 1));
            cqbdVarE3.A(bzmz.v.a, "Ignore");
            cqbdVarE3.A(bzmz.w.a, eqjyVar.c);
            cqbdVarE3.A(bzmz.x.a, "Failed to parse encrypted most recent read message timestamp for web in opaque data.");
            cqbdVarE3.r();
            return Optional.empty();
        }
    }

    public final void c(ConversationIdType conversationIdType, boolean z) {
        bvdk bvdkVarS = ((bakt) this.j.b()).s(conversationIdType);
        baqi baqiVar = (baqi) this.k.b();
        if (bvdkVarS == null) {
            bvdkVarS = bvdk.UNARCHIVED;
        }
        baqiVar.b(conversationIdType, false, bvdkVarS);
        if (((Boolean) b.e()).booleanValue() && z) {
            ((cgbn) this.m.b()).L(conversationIdType);
            cqbd cqbdVarC = a.c();
            cqbdVarC.A(bzmz.v.a, "Process");
            cqbdVarC.A("conversationId", conversationIdType);
            cqbdVarC.I("Canceled notification for conversation");
            cqbdVarC.r();
        }
    }

    public final boolean d(final ConversationIdType conversationIdType, epkb epkbVar, bojh bojhVar, eqjy eqjyVar) {
        evvp evvpVar = epkbVar.c;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        final long jA = evxc.a(evvpVar);
        cqce cqceVar = a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.A(bzmz.w.a, eqjyVar.c);
        cqbdVarC.z("conversationEventReadTimestamp", jA);
        cqbdVarC.r();
        if (jA <= bojhVar.t() || jA <= ((baxe) this.l.b()).e(conversationIdType)) {
            b(eqjyVar, "Database has a more recent timestamp.");
            return false;
        }
        eieu eieuVarK = eiiy.k("CmsDatabaseOperations#updateConversationsCmsMostRecentReadMessageTimestampMs");
        try {
            String[] strArr = botm.a;
            bote boteVar = new bote();
            boteVar.ap("updateConversationsCmsMostRecentReadMessageTimestampMs");
            int iIntValue = botm.g().intValue();
            int iIntValue2 = botm.g().intValue();
            if (iIntValue2 < 53030) {
                dqru.x("cms_most_recent_read_message_timestamp_ms", iIntValue2);
            }
            if (iIntValue >= 53030) {
                boteVar.a.put("cms_most_recent_read_message_timestamp_ms", Long.valueOf(jA));
            }
            boteVar.ad(new Function() { // from class: cpqd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    botlVar.r(conversationIdType);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boteVar.b().e();
            eieuVarK.close();
            eieuVarK = eiiy.k("CmsDatabaseOperations#updateMessagesReadStatus");
            try {
                String[] strArr2 = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("updateMessagesReadStatus");
                brduVar.F(true);
                brduVar.X(new Function() { // from class: cpqc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        brecVar.m(conversationIdType);
                        brecVar.A(false);
                        brecVar.O(false);
                        brecVar.aj(100, 117);
                        brecVar.T(jA);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brduVar.b().e();
                eieuVarK.close();
                cqbd cqbdVarC2 = cqceVar.c();
                String str = bzmz.t.a;
                int iB = eqjx.b(eqjyVar.b);
                if (iB == 0) {
                    iB = 1;
                }
                cqbdVarC2.A(str, eqjx.a(iB));
                cqbdVarC2.A(bzmz.v.a, "Process");
                cqbdVarC2.A(bzmz.w.a, eqjyVar.c);
                cqbdVarC2.I("Updated messages read status based on CMS conversation event.");
                cqbdVarC2.r();
                return true;
            } finally {
                try {
                    eieuVarK.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
