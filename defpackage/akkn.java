package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akkn extends fcyz implements fdat {
    final /* synthetic */ cgrc a;
    final /* synthetic */ cgra b;
    final /* synthetic */ akkp c;
    final /* synthetic */ ConversationId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akkn(cgrc cgrcVar, cgra cgraVar, akkp akkpVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cgrcVar;
        this.b = cgraVar;
        this.c = akkpVar;
        this.d = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akkn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cgra cgraVar;
        cgra cgraVar2;
        fctl.b(obj);
        cgrc cgrcVar = this.a;
        if (cgrcVar == cgrc.b || (cgraVar = this.b) == (cgraVar2 = cgra.a)) {
            ekrw ekrwVarH = akkp.a.h();
            ekrwVarH.X(eksq.a, "BugleConversation");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/api/messaging/conversation/mute/bugle/MuteConversationDatabaseOperationsImpl$optimisticUpdateMuteSettings$2", "invokeSuspend", 63, "MuteConversationDatabaseOperationsImpl.kt")).q("Mute threshold is NONE or mute duration is NONE. Deleting existing notification settings row if it exists.");
            final ConversationId conversationId = this.d;
            return Boolean.valueOf(((ConversationNotificationSettingsTable.BindData) dqru.g(ConversationNotificationSettingsTable.a(), "MuteConversationDatabaseOperations#optimisticUpdateMuteSettings", new dqsh(new ejxr() { // from class: akkk
                @Override // defpackage.ejxr
                public final Object get() {
                    ekrg ekrgVar = akkp.a;
                    String[] strArr = ConversationNotificationSettingsTable.a;
                    bnyp bnypVar = new bnyp(ConversationNotificationSettingsTable.a);
                    bnypVar.A("getExistingNotificationSettingsRow");
                    bnyt bnytVar = new bnyt();
                    bnytVar.b(ajwb.a(conversationId));
                    bnypVar.k(new bnys(bnytVar));
                    ekgb ekgbVarZ = bnypVar.b().z();
                    ekgbVarZ.getClass();
                    return (ConversationNotificationSettingsTable.BindData) fcva.P(ekgbVarZ);
                }
            }), new dqsf(new Function() { // from class: akkl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return Boolean.valueOf(((ConversationNotificationSettingsTable.BindData) obj2) != null);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), new dqsg(new Function() { // from class: akkm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    ekrg ekrgVar = akkp.a;
                    String[] strArr = ConversationNotificationSettingsTable.a;
                    bnyk bnykVar = new bnyk();
                    bnykVar.f("deleteExistingNotificationSettingsRow");
                    final ConversationId conversationId2 = conversationId;
                    bnykVar.b = new bnys((bnyt) new Function() { // from class: akkj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            bnyt bnytVar = (bnyt) obj3;
                            ekrg ekrgVar2 = akkp.a;
                            bnytVar.b(ajwb.a(conversationId2));
                            return bnytVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new bnyt()));
                    bnykVar.d();
                    return null;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }))) == null);
        }
        ekrw ekrwVarH2 = akkp.a.h();
        ekrwVarH2.X(eksq.a, "BugleConversation");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/mute/bugle/MuteConversationDatabaseOperationsImpl$optimisticUpdateMuteSettings$2", "invokeSuspend", 79, "MuteConversationDatabaseOperationsImpl.kt")).q("Mute threshold is not NONE and mute duration is not NONE. Updating or inserting notification settings row.");
        akkp akkpVar = this.c;
        final ConversationId conversationId2 = this.d;
        String[] strArr = ConversationNotificationSettingsTable.a;
        bnxr bnxrVar = new bnxr();
        bnxrVar.b(ajwb.a(conversationId2));
        bnxrVar.d(cgrcVar);
        bnxrVar.c(cgraVar);
        if (cgraVar != cgra.e && cgraVar != cgraVar2) {
            bnxrVar.e(akkpVar.d.f().b(cgraVar.f, ChronoUnit.HOURS));
        }
        final ConversationNotificationSettingsTable.BindData bindDataA = bnxrVar.a();
        final bnys bnysVar = new bnys((bnyt) new Function() { // from class: akki
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bnyt bnytVar = (bnyt) obj2;
                ekrg ekrgVar = akkp.a;
                bnytVar.b(ajwb.a(conversationId2));
                return bnytVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bnyt()));
        final dqsy dqsyVarA = ConversationNotificationSettingsTable.a();
        Boolean bool = (Boolean) dqsyVarA.o(new ejxr() { // from class: bnxk
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = ConversationNotificationSettingsTable.a;
                bnyr bnyrVar = new bnyr();
                ConversationNotificationSettingsTable.BindData bindData = bindDataA;
                Instant instantN = bindData.n();
                if (instantN == null) {
                    bnyrVar.a.putNull("muted_until_timestamp");
                } else {
                    bnyrVar.a.put("muted_until_timestamp", Long.valueOf(bart.a(instantN)));
                }
                cgra cgraVarK = bindData.k();
                if (cgraVarK == null) {
                    bnyrVar.a.putNull("muted_duration");
                } else {
                    bnyrVar.a.put("muted_duration", Integer.valueOf(cgraVarK.ordinal()));
                }
                cgrc cgrcVarM = bindData.m();
                if (cgrcVarM == null) {
                    bnyrVar.a.putNull("muted_threshold");
                } else {
                    bnyrVar.a.put("muted_threshold", Integer.valueOf(cgrcVarM.ordinal()));
                }
                bnys bnysVar2 = bnysVar;
                bnyrVar.al();
                bnyrVar.af(bnysVar2);
                bnyrVar.an(new dqsb("conversation_notification_settings_table", "-updateOrInsert-update"));
                if (bnyrVar.b().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarA;
                return Boolean.valueOf(dqru.b(ConversationNotificationSettingsTable.a(), "conversation_notification_settings_table", bindData, new Function() { // from class: bnxl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Long.valueOf(dqsyVar.O("conversation_notification_settings_table", (dqst) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bnxm
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        });
        bool.booleanValue();
        return bool;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akkn(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
