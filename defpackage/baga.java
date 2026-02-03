package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baga {
    public static boiq a(final ConversationIdType conversationIdType) {
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boiqVar.A("createParticipantIdFromConversationToParticipantsTableQueryBuilder");
        boiqVar.f(new Function() { // from class: bafy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boiu boiuVar = (boiu) obj;
                boiuVar.b(conversationIdType);
                return boiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return boiqVar;
    }

    public static bsbm b(final boip boipVar) {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("createParticipantsTableQuery");
        bsboVarE.h(new Function() { // from class: bafz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.l(boipVar);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brzh brzhVar = ParticipantsTable.c;
        bsboVarE.D(g(brzhVar.m) + "," + g(brzhVar.g));
        return bsboVarE.b();
    }

    public static bsbm c(ConversationIdType conversationIdType) {
        return e(conversationIdType, false);
    }

    public static bsbm d(ConversationIdType conversationIdType) {
        final bsbm bsbmVarF = f();
        boiq boiqVarA = a(conversationIdType);
        boiqVarA.f(new Function() { // from class: bafw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boiu boiuVar = (boiu) obj;
                boiuVar.ap(new dqpk("conversation_to_participants.participant_id", 4, bsbmVarF));
                return boiuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boiqVarA.e(new Function() { // from class: bafx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((boic) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return b(boiqVarA.b());
    }

    public static bsbm e(ConversationIdType conversationIdType, boolean z) {
        bsbm bsbmVarF = f();
        boiq boiqVarA = a(conversationIdType);
        boiqVarA.e(new Function() { // from class: bafv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((boic) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boiqVarA.p(bsbmVarF);
        final boip boipVarB = boiqVarA.b();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("createParticipantsTableQuery");
        bsboVarE.h(new Function() { // from class: baft
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.l(boipVarB);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (z) {
            bsun bsunVarA = ProfilesTable.a();
            bsunVarA.c(new Function() { // from class: bafu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bstj bstjVar = (bstj) obj;
                    return new bstk[]{bstjVar.i, bstjVar.g, bstjVar.h};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsum bsumVarB = bsunVarA.b();
            bstj bstjVar = ProfilesTable.c;
            bstk bstkVar = bstjVar.b;
            brzh brzhVar = ParticipantsTable.c;
            dqtr dqtrVarI = dqts.i(bsumVarB, bstkVar, brzhVar.a);
            ((dqos) dqtrVarI).e = "profiles_table_join_tag";
            bsboVarE.H(dqtrVarI.g());
            brzi brziVar = brzhVar.m;
            bstk bstkVar2 = bstjVar.i;
            brzi brziVar2 = brzhVar.g;
            bsboVarE.C(new dqxl("(NULLIF($V, '') ISNULL), NULLIF($V, ''),(NULLIF($V{J:profiles_table_join_tag}, '') ISNULL),NULLIF($V{J:profiles_table_join_tag}, ''),(NULLIF($V, '') ISNULL), NULLIF($V, '')", new Object[]{brziVar, brziVar, bstkVar2, bstkVar2, brziVar2, brziVar2}));
        } else {
            brzh brzhVar2 = ParticipantsTable.c;
            bsboVarE.D(g(brzhVar2.m) + "," + g(brzhVar2.g));
        }
        return bsboVarE.b();
    }

    private static bsbm f() {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("ConversationParticipantsQueryFactory#createQuery");
        bsboVarE.f(new Function() { // from class: bafr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((brzh) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.h(new Function() { // from class: bafs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.w(-2);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsboVarE.b();
    }

    private static String g(brzi brziVar) {
        return dqxd.a(new dqxl("(NULLIF($V, '') ISNULL), NULLIF($V, '')", new Object[]{brziVar, brziVar}));
    }
}
