package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmgb {
    public static final dqxe a(dqpo dqpoVar, boolean z) {
        return new dqxl("$V $R", new Object[]{dqpoVar, true != z ? "DESC" : "ASC"});
    }

    public static final dqxe b(dqpo dqpoVar, final dqpo dqpoVar2, crku crkuVar, cogw cogwVar) {
        cogwVar.getClass();
        if (!crbf.g()) {
            return new dqxl("$V", new Object[]{0});
        }
        Long l = (Long) crbf.Z.e();
        Long l2 = (Long) crbf.aa.e();
        long epochMilli = cogwVar.f().toEpochMilli();
        bqch bqchVarA = bqcn.a();
        bqchVarA.A("getIsNudgeableExpression");
        bqbu[] bqbuVarArr = {(bqbu) new Function() { // from class: bmfz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bqbt) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bqcn.c)};
        int iIntValue = bqcn.c().intValue();
        if (((Integer) bqcn.b.getOrDefault(bqbuVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        bqchVarA.m(bqbuVarArr);
        bqchVarA.c(new Function() { // from class: bmga
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqcm bqcmVar = (bqcm) obj;
                bqcmVar.ap(new dqpk("message_classifications_table.message_id", 1, dqpoVar2));
                bqcmVar.b(ezah.NUDGE_CLASSIFICATION);
                return bqcmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqcg bqcgVarB = bqchVarA.b();
        dqxl dqxlVar = new dqxl(true != crkuVar.c ? "0" : "1", new Object[0]);
        Long lValueOf = Long.valueOf(epochMilli);
        return new dqxl("$V AND $V AND EXISTS $V AND $V", new Object[]{new dqxl("$V >= ($V + $V)", new Object[]{lValueOf, dqpoVar, l}), new dqxl("$V <= ($V + $V + $V)", new Object[]{lValueOf, dqpoVar, l, l2}), bqcgVarB, dqxlVar});
    }

    public static final dqxe c(final dqpo dqpoVar, cogw cogwVar, crku crkuVar) {
        cogwVar.getClass();
        if (!tet.a() || (((Boolean) ((cczi) tet.c.get()).e()).booleanValue() && !crkuVar.e)) {
            return new dqxl("$V", new Object[]{0});
        }
        final String string = tep.c(cogwVar).toString();
        string.getClass();
        bngu bnguVarA = bngz.a();
        bnguVarA.A("getBirthdayExpression");
        bnge[] bngeVarArr = {(bnge) new Function() { // from class: bmfx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bngd) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bngz.c)};
        int iIntValue = bngz.c().intValue();
        if (((Integer) bngz.b.getOrDefault(bngeVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        bnguVarA.m(bngeVarArr);
        bnguVarA.c(new Function() { // from class: bmfy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bngy bngyVar = (bngy) obj;
                bngyVar.ap(new dqpk("conversation_classifications_table.conversation_id", 1, dqpoVar));
                bngyVar.c(aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
                bngyVar.b(aukd.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
                bngyVar.e(string);
                return bngyVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new dqxl("EXISTS $V", new Object[]{bnguVarA.b()});
    }

    public static final dqxe d(final dqpo dqpoVar, final dqpo dqpoVar2, final cogw cogwVar) {
        cogwVar.getClass();
        if (!czwc.b()) {
            return new dqxl("$V", new Object[]{0});
        }
        btii btiiVarC = btin.c();
        btiiVarC.A("getReminderNudgeExpression");
        btiiVarC.c(new Function() { // from class: bmfu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bthr) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btiiVarC.e(new Function() { // from class: bmfv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btim btimVar = (btim) obj;
                btimVar.b(dqpoVar);
                btimVar.e(cogwVar.f().toEpochMilli());
                btimVar.ap(new dqpk("reminders.trigger_time", 7, dqpoVar2));
                return btimVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new dqxl("EXISTS $V", new Object[]{btiiVarC.b()});
    }

    public static final dqxe e(final dqpo dqpoVar) {
        cmcm cmcmVarB = ScheduledSendTable.b();
        cmcmVarB.A("getScheduledMessageExpression");
        cmcmVarB.c(ScheduledSendTable.c.a);
        cmcmVarB.e(new Function() { // from class: bmfw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmcs cmcsVar = (cmcs) obj;
                cmcsVar.b(dqpoVar);
                return cmcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new dqxl("EXISTS $V", new Object[]{cmcmVarB.b()});
    }

    public static final dqxe f(dqpo dqpoVar, dqpo dqpoVar2, final dqpo dqpoVar3, crku crkuVar, final cogw cogwVar) {
        char c;
        char c2;
        char c3;
        cogwVar.getClass();
        dqxl dqxlVar = new dqxl("WHEN 1 THEN '$R'", new Object[]{"NUDGE"});
        if (crbf.f()) {
            dqxlVar = new dqxl("WHEN $V THEN '$R'", new Object[]{e(dqpoVar3), "NONE"});
        }
        dqxl dqxlVar2 = new dqxl("", new Object[0]);
        if (crbf.g()) {
            dqxlVar2 = new dqxl("WHEN $V THEN '$R'", new Object[]{b(dqpoVar, dqpoVar2, crkuVar, cogwVar), "NUDGE"});
        }
        dqxl dqxlVar3 = new dqxl("", new Object[0]);
        if (tet.a()) {
            dqxlVar3 = new dqxl("WHEN $R AND $V THEN '$R'", new Object[]{(!((Boolean) ((cczi) tet.c.get()).e()).booleanValue() || crkuVar.e) ? "1" : "0", c(dqpoVar3, cogwVar, crkuVar), "BIRTHDAY"});
        }
        dqxl dqxlVar4 = new dqxl("", new Object[0]);
        if (czwc.b()) {
            dqxlVar4 = new dqxl("WHEN $V THEN '$R'", new Object[]{d(dqpoVar3, dqpoVar, cogwVar), "REMINDER"});
        }
        dqxl dqxlVar5 = new dqxl("CASE $V $V $V $V ELSE '$R' END", new Object[]{dqxlVar, dqxlVar4, dqxlVar3, dqxlVar2, "NONE"});
        Long lValueOf = Long.valueOf(tep.a(cogwVar));
        dqxl dqxlVar6 = new dqxl("CASE WHEN $V > $V THEN $V ELSE $V END", new Object[]{lValueOf, dqpoVar, lValueOf, dqpoVar});
        dqxl dqxlVar7 = new dqxl("($V + $V)", new Object[]{dqpoVar, (Long) crbf.Z.e()});
        if (((Boolean) ((cczi) agki.a.get()).e()).booleanValue()) {
            Long l = (Long) agki.b.e();
            c = 5;
            c2 = 4;
            c3 = 0;
            dqxlVar7 = new dqxl("($V + $V)", new Object[]{dqxlVar7, new dqxl("(($V / $V) * $V)", new Object[]{new dqxl("($V - $V)", new Object[]{Long.valueOf(cogwVar.f().toEpochMilli()), dqxlVar7}), l, l})});
        } else {
            c = 5;
            c2 = 4;
            c3 = 0;
        }
        btii btiiVarC = btin.c();
        btiiVarC.A("getLatestReminderTimestampSql");
        btiiVarC.c(new Function() { // from class: czwq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bthr) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btiiVarC.e(new Function() { // from class: czwr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btim btimVar = (btim) obj;
                btimVar.b(dqpoVar3);
                btimVar.e(cogwVar.f().toEpochMilli());
                return btimVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btif[] btifVarArr = new btif[1];
        btifVarArr[c3] = new btif(btin.c.d);
        btiiVarC.D((String) DesugarArrays.stream(btifVarArr).map(new Function() { // from class: btih
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((btif) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        btiiVarC.y(1);
        btig btigVarB = btiiVarC.b();
        Object[] objArr = new Object[8];
        objArr[c3] = dqxlVar5;
        objArr[1] = "REMINDER";
        objArr[2] = btigVarB;
        objArr[3] = "BIRTHDAY";
        objArr[c2] = dqxlVar6;
        objArr[c] = "NUDGE";
        objArr[6] = dqxlVar7;
        objArr[7] = dqpoVar;
        return new dqxl("CASE $V WHEN '$R' THEN $V WHEN '$R' THEN $V WHEN '$R' THEN $V ELSE $V END", objArr);
    }
}
