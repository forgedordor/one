package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcvp {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final dqxe f;
    public static final dqxe g;
    static final String h;

    static {
        bopp boppVar = botm.c;
        a = boppVar.O.toString() + "=0 AND " + boppVar.a.toString() + "=" + bocg.c.b.toString();
        bopp boppVar2 = botm.c;
        b = boppVar2.O.toString() + "=0 AND " + boppVar2.a.toString() + "=" + boiv.c.a.toString();
        c = a("%ONE_ON_ONE_JOIN%");
        d = "messages._id=conversations.latest_message_id";
        e = a("%MESSAGES_JOIN%");
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("ConversationListSubQueries.containsVerifiedSmsParticipantsSubquery");
        bsboVarE.f(new Function() { // from class: bcvi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = bcvp.a;
                return ((brzh) obj).F;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.h(new Function() { // from class: bcvj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                String str = bcvp.a;
                String[] strArr = boiv.a;
                boiq boiqVar = new boiq(boiv.a);
                boiqVar.e(new Function() { // from class: bcvn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        String str2 = bcvp.a;
                        return ((boic) obj2).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boiqVar.f(new Function() { // from class: bcvo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        boiu boiuVar = (boiu) obj2;
                        String str2 = bcvp.a;
                        boiuVar.c(ParticipantsTable.c.a);
                        return boiuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsbxVar.l(boiqVar.b());
                bsbxVar.p(bvdz.VERIFICATION_NA);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f = new dqwh(bsboVarE.b());
        btii btiiVarC = btin.c();
        btiiVarC.c(new Function() { // from class: bcvk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = bcvp.a;
                return ((bthr) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btiiVarC.e(new Function() { // from class: bcvl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btim btimVar = (btim) obj;
                String str = bcvp.a;
                btimVar.b(botm.c.a);
                return btimVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btig btigVarB = btiiVarC.b();
        String[] strArr = btigVarB.l;
        if (strArr.length != 1) {
            throw new IllegalStateException("cannot do min on a projection with length other than 1");
        }
        g = new dqxl("SELECT MIN($R) FROM ($R)", new Object[]{dqru.o(strArr[0]), btigVarB.J()});
        h = "(messages.conversation_id = conversations._id)";
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("hasUnreadMessages");
        brdrVarD.h(new Function() { // from class: bcvm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                String str = bcvp.a;
                brecVar.O(false);
                brecVar.n(botm.c.a);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.b();
    }

    private static String a(String str) {
        return str.substring(1, str.length() - 1);
    }
}
