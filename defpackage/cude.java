package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cude implements cucy {
    public final Context a;
    public final ConversationId b;
    public final cudy c;
    public final ctuu d;
    public final fcsu e;
    public final fcsu f;
    public final cuei g;
    private final fdjx h;
    private final ctvb i;
    private final cucl j;
    private final fcsu k;
    private final asgz l;
    private final fcsu m;
    private final aqiu n;
    private final asdu o;
    private final aquo p;
    private final fcsu q;
    private final ardr r;
    private final cuce s;
    private final cuci t;
    private final fdvc u;
    private final fdvc v;
    private final fdvc w;

    public cude(Context context, fdjx fdjxVar, ConversationId conversationId, cudy cudyVar, ctvb ctvbVar, ctuu ctuuVar, cuei cueiVar, cucl cuclVar, final afzc afzcVar, cubt cubtVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, asgz asgzVar, fcsu fcsuVar4, fcsu fcsuVar5, aqiu aqiuVar, asdu asduVar, aquo aquoVar, fcsu fcsuVar6, ardr ardrVar) {
        context.getClass();
        fdjxVar.getClass();
        cudyVar.getClass();
        ctvbVar.getClass();
        ctuuVar.getClass();
        cueiVar.getClass();
        cuclVar.getClass();
        afzcVar.getClass();
        cubtVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        aqiuVar.getClass();
        asduVar.getClass();
        aquoVar.getClass();
        fcsuVar6.getClass();
        ardrVar.getClass();
        this.a = context;
        this.h = fdjxVar;
        this.b = conversationId;
        this.c = cudyVar;
        this.i = ctvbVar;
        this.d = ctuuVar;
        this.g = cueiVar;
        this.j = cuclVar;
        this.k = fcsuVar;
        this.e = fcsuVar3;
        this.l = asgzVar;
        this.m = fcsuVar4;
        this.f = fcsuVar5;
        this.n = aqiuVar;
        this.o = asduVar;
        this.p = aquoVar;
        this.q = fcsuVar6;
        this.r = ardrVar;
        cuce cuceVar = new cuce(new djkj(new djki(asgzVar.a(), aqiuVar.a(), ((asdx) fcsuVar6.b()).a()), 31), new ctye((String) null, (List) null, (fdae) null, (String) null, new ctyd(asduVar.a(), asgzVar.a(), aquoVar.a()), (fdae) null, 95));
        this.s = cuceVar;
        dihq dihqVarB = b(((asdv) fcsuVar3.b()).a() ? afzcVar.i(agbf.a) : !cueiVar.a, new fdae() { // from class: cucz
            @Override // defpackage.fdae
            public final Object invoke() {
                ctuu ctuuVar2 = this.a.d;
                ctuuVar2.h();
                if (afzcVar.j(agbf.a)) {
                    ctuuVar2.d();
                }
                return fctx.a;
            }
        });
        String string = context.getString(true != ardrVar.a() ? R.string.start_chat_top_app_bar_title_single : R.string.start_chat_top_app_bar_title_single_v2);
        string.getClass();
        cuci cuciVar = new cuci(new dloh(new dlnp(string, null, null, false, null, null, null, 254), dihqVarB, null, false, false, null, null, 116), false);
        this.t = cuciVar;
        this.u = fdtg.b(cubtVar.a(), fdjxVar, fdur.a(0L, 3), cuceVar);
        this.v = fdtg.b(fdud.a(((cuec) fcsuVar.b()).a(), cudyVar.a(), ((ctrq) fcsuVar4.b()).c(), new cudc(this, afzcVar, null)), fdjxVar, fdur.a(0L, 3), cuciVar);
        this.w = fdtg.b(cuclVar.a(), fdjxVar, fdur.a(0L, 3), new cucx());
    }

    @Override // defpackage.cucy
    public final cudh a() {
        return new cudh(this.u, this.v, this.w, new cudg(((asdv) this.e.b()).a(), this.l.a(), 8));
    }

    public final dihq b(boolean z, fdae fdaeVar) {
        Context context = this.a;
        djrr djrrVar = djrr.q;
        String string = context.getString(R.string.start_chat_top_app_bar_back);
        string.getClass();
        return new dihq(string, djrrVar, false, false, false, z, null, false, null, fdaeVar, 988);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cuda
            if (r0 == 0) goto L13
            r0 = r6
            cuda r0 = (defpackage.cuda) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuda r0 = new cuda
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            ctvb r6 = r4.i
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto L66
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L4c
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4c
            goto L61
        L4c:
            java.util.Iterator r5 = r6.iterator()
        L50:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            ctva r6 = (defpackage.ctva) r6
            boolean r6 = r6.b
            if (r6 != 0) goto L50
            r3 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cude.c(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r14 == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        if (r14 != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (r14 == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        if (r14 == r1) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aoer r12, defpackage.cudx r13, defpackage.fcxy r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cude.d(aoer, cudx, fcxy):java.lang.Object");
    }
}
