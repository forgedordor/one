package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.events.Event;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clej implements efav {
    public static final cqce a = cqce.g("BugleAction", "IncomingRcsEventProcessor");
    private static final cqbr d = new cqbr(TimeUnit.SECONDS.toMillis(3));
    private static final cqbr e = new cqbr(TimeUnit.SECONDS.toMillis(30));
    private static final ekhx f = ekhx.r(50050, 0);
    private static final eksp g = eksp.c("BugleAction");
    private final ciis A;
    private final coil B;
    private final ciie C;
    private final fcsu D;
    private final fcsu E;
    private final aspp F;
    private final awhr G;
    private final awhr H;
    private final asqx I;
    private final axnv J;
    private final axsf K;
    private final axmc L;
    private final axyf M;
    private final axoi N;
    private final axyh O;
    public final fcsu b;
    public final fcsu c;
    private final aypy h;
    private final ains i;
    private final eygg j;
    private final chwq k;
    private final crqv l;
    private final eygg m;
    private final cogw n;
    private final cldz o;
    private final clec p;
    private final aiwq q;
    private final aypt r;
    private final eosc s;
    private final aypx t;
    private final csuc u;
    private final ajfo v;
    private final cleb w;
    private final cilk x;
    private final cisf y;
    private final cjpo z;

    public clej(axnv axnvVar, axsf axsfVar, aypy aypyVar, axmc axmcVar, ains ainsVar, eygg eyggVar, chwq chwqVar, crqv crqvVar, eygg eyggVar2, cogw cogwVar, cldz cldzVar, clec clecVar, aiwq aiwqVar, aypt ayptVar, eosc eoscVar, axyf axyfVar, axoi axoiVar, aypx aypxVar, axyh axyhVar, csuc csucVar, fcsu fcsuVar, ajfo ajfoVar, cilk cilkVar, cleb clebVar, cisf cisfVar, cjpo cjpoVar, ciis ciisVar, coil coilVar, ciie ciieVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, aspp asppVar, awhr awhrVar, awhr awhrVar2, asqx asqxVar) {
        this.J = axnvVar;
        this.K = axsfVar;
        this.h = aypyVar;
        this.L = axmcVar;
        this.i = ainsVar;
        this.j = eyggVar;
        this.k = chwqVar;
        this.l = crqvVar;
        this.m = eyggVar2;
        this.n = cogwVar;
        this.o = cldzVar;
        this.p = clecVar;
        this.q = aiwqVar;
        this.r = ayptVar;
        this.s = eoscVar;
        this.N = axoiVar;
        this.M = axyfVar;
        this.t = aypxVar;
        this.O = axyhVar;
        this.u = csucVar;
        this.b = fcsuVar;
        this.v = ajfoVar;
        this.w = clebVar;
        this.x = cilkVar;
        this.y = cisfVar;
        this.z = cjpoVar;
        this.A = ciisVar;
        this.B = coilVar;
        this.C = ciieVar;
        this.D = fcsuVar2;
        this.E = fcsuVar3;
        this.c = fcsuVar4;
        this.F = asppVar;
        this.G = awhrVar;
        this.H = awhrVar2;
        this.I = asqxVar;
    }

    private final void e(Action action, cldb cldbVar) {
        this.z.p(cldbVar);
        action.q(cldbVar);
    }

    @Override // defpackage.efav
    public final String a() {
        return "IncomingRcsEventProcessor";
    }

    @Override // defpackage.efav
    public final void b(Event event) {
        c(event, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0704 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x09f9 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0970 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.ims.rcsservice.events.Event r20, defpackage.cldb r21) {
        /*
            Method dump skipped, instructions count: 3132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clej.c(com.google.android.ims.rcsservice.events.Event, cldb):void");
    }

    protected final void d(ChatSessionMessageEvent chatSessionMessageEvent, int i, cldb cldbVar) {
        final basd basdVarA = basd.a(chatSessionMessageEvent.c);
        if (basd.l(basdVarA) && aypb.a(i)) {
            e(this.J.a(basdVarA, i, enyw.RCS_LEGACY), cldbVar);
            auvh.h(this.s.submit(eiid.k(new Runnable() { // from class: clef
                @Override // java.lang.Runnable
                public final void run() {
                    clej clejVar = this.a;
                    baxe baxeVar = (baxe) clejVar.c.b();
                    basd basdVar = basdVarA;
                    ((ajhd) clejVar.b.b()).t(basdVar, baxeVar.y(basdVar), 25, enyw.RCS_LEGACY);
                }
            })));
        }
    }
}
