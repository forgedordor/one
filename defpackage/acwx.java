package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwx extends opn {
    public static final cqce a = cqce.g("Bugle", "ConversationListDataSources");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/home/list/ConversationListDataSources");
    private final eosc E;
    public final cogw c;
    public final ajfo d;
    public final adaw e;
    public final eigp f;
    public final eosc g;
    public final fcsu h;
    public final fcsu i;
    public final eosd j;
    public final fcsu k;
    public final cdpg l;
    public final adms n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public oqw s;
    public final int x;
    eiju y;
    public eiju z;
    public boolean t = true;
    public boolean u = true;
    public boolean v = false;
    public acww w = acww.NOT_STARTED;
    public Map A = new HashMap();
    public final AtomicLong B = new AtomicLong(0);
    public final AtomicBoolean C = new AtomicBoolean(false);
    final cczi D = cdag.e(cdag.b, "conversation_list_data_source_invalidation_frequency_log_limit", 33);
    public final AtomicReference m = new AtomicReference(SuperSortLabel.UNKNOWN);

    public acwx(cogw cogwVar, ajfo ajfoVar, adaw adawVar, eigp eigpVar, eosc eoscVar, eosd eosdVar, eosc eoscVar2, adms admsVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cdpg cdpgVar, int i) {
        this.c = cogwVar;
        this.d = ajfoVar;
        this.e = adawVar;
        this.f = eigpVar;
        this.g = eoscVar2;
        this.h = fcsuVar;
        this.k = fcsuVar3;
        this.l = cdpgVar;
        this.E = eoscVar;
        this.j = eosdVar;
        this.x = i;
        this.n = admsVar;
        this.o = fcsuVar4;
        this.i = fcsuVar2;
        this.p = fcsuVar5;
        this.q = fcsuVar6;
        this.r = fcsuVar7;
    }

    public static long a(acwb acwbVar) {
        return agkk.a(acwbVar.c(), acwbVar.a());
    }

    public static String b(dqsd dqsdVar) {
        StringBuilder sb = new StringBuilder("TRIGGER: ");
        if (dqsdVar.c() != null) {
            sb.append("UPDATE ");
            dqyd dqydVarC = dqsdVar.c();
            dqydVarC.getClass();
            sb.append(dqydVarC.getClass());
            sb.append(" COLUMNS MODIFIED ");
            dqyd dqydVarC2 = dqsdVar.c();
            dqydVarC2.getClass();
            sb.append(Arrays.toString(dqydVarC2.p()));
        }
        if (dqsdVar.b() != null) {
            sb.append("INSERT ");
            dqpd dqpdVarB = dqsdVar.b();
            dqpdVarB.getClass();
            sb.append(dqpdVarB.getClass());
        }
        if (dqsdVar.a() != null) {
            sb.append("BULK-INSERT ");
            dqpd[] dqpdVarArrA = dqsdVar.a();
            dqpdVarArrA.getClass();
            for (dqpd dqpdVar : dqpdVarArrA) {
                sb.append(dqpdVar.toString());
                sb.append(";\n");
            }
        }
        if (dqsdVar.d() != null) {
            sb.append("DELETE ");
            dqyj dqyjVarD = dqsdVar.d();
            dqyjVarD.getClass();
            sb.append(dqyjVarD.toString());
        }
        return sb.toString();
    }

    public final void c() {
        oqw oqwVar = this.s;
        if (oqwVar != null) {
            oqwVar.c();
        }
    }

    public final void d(final List list) {
        this.E.submit(new Runnable() { // from class: acwm
            @Override // java.lang.Runnable
            public final void run() {
                Map map = (Map) Collection.EL.stream(list).collect(Collectors.groupingBy(new Function() { // from class: bbek
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bpyn) obj).m();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((ConversationIdType) entry.getKey()).b()) {
                        cqbd cqbdVarE = bbew.a.e();
                        cqbdVarE.G(((List) entry.getValue()).size());
                        cqbdVarE.I("annotations with null conversationId");
                        cqbdVarE.r();
                    } else {
                        bbew bbewVar = new bbew();
                        bbewVar.d((List) entry.getValue());
                        map2.put((ConversationIdType) entry.getKey(), bbewVar);
                    }
                }
                acwx acwxVar = this.a;
                acwxVar.A = map2;
                if (acwxVar.s != null) {
                    ekrw ekrwVarH = acwx.b.h();
                    ekrwVarH.X(eksq.a, "ConversationListDataSources");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/list/ConversationListDataSources", "setAnnotations", 412, "ConversationListDataSources.java")).q("setAnnotations invalidate data source");
                    acwxVar.s.c();
                }
            }
        });
    }

    public final void e() {
        tep.c(this.c);
    }
}
