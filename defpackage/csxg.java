package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxg implements csyy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/video/BugleVideoCallingReachabilityUpdater");
    public final fcsu b;
    private final dcsx c;
    private final fdjx d;
    private final fcsu e;
    private final fcsu f;
    private final cogw g;
    private final aqcf h;
    private final aqcg i;
    private final fcsu j;
    private final fcsu k;

    public csxg(dcsx dcsxVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, aqcf aqcfVar, aqcg aqcgVar, fcsu fcsuVar4, fcsu fcsuVar5) {
        dcsxVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cogwVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.c = dcsxVar;
        this.d = fdjxVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
        this.g = cogwVar;
        this.h = aqcfVar;
        this.i = aqcgVar;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
    }

    private static final void d(List list, int i, final Iterable iterable) {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantsTable.BindData) it.next()).R());
        }
        final Set setAv = fcva.av(arrayList);
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("updateAvailabilityInDb");
        bsbsVarF.S(i);
        bsbsVarF.U(new Function() { // from class: csxa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.m(setAv);
                int iIntValue = ParticipantsTable.i().intValue();
                if (iIntValue < 13050) {
                    dqru.x("video_reachability", iIntValue);
                }
                bsbxVar.ap(new dqpm("participants.video_reachability", 4, bsbx.as(iterable), true));
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.b().e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r9 != r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.csxc
            if (r0 == 0) goto L13
            r0 = r9
            csxc r0 = (defpackage.csxc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            csxc r0 = new csxc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            goto L60
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            goto L4a
        L3b:
            defpackage.fctl.b(r9)
            dcsx r9 = r7.c
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = defpackage.csye.a(r9, r0)
            if (r9 == r1) goto La5
        L4a:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 == 0) goto La4
            if (r9 == r5) goto L87
            if (r9 == r4) goto L87
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r7.b(r8, r0)
            if (r9 == r1) goto La5
        L60:
            java.lang.Integer r9 = new java.lang.Integer
            r0 = 11
            r9.<init>(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 12
            r0.<init>(r1)
            java.lang.Integer r1 = new java.lang.Integer
            r2 = 7
            r1.<init>(r2)
            r6 = 3
            java.lang.Integer[] r6 = new java.lang.Integer[r6]
            r6[r3] = r9
            r6[r5] = r0
            r6[r4] = r1
            java.util.List r9 = defpackage.fcva.g(r6)
            d(r8, r2, r9)
            fcvo r8 = defpackage.fcvo.a
            return r8
        L87:
            java.lang.Integer r9 = new java.lang.Integer
            r0 = 10
            r9.<init>(r0)
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 8
            r0.<init>(r1)
            java.lang.Integer[] r2 = new java.lang.Integer[r4]
            r2[r3] = r9
            r2[r5] = r0
            java.util.List r9 = defpackage.fcva.g(r2)
            d(r8, r1, r9)
            fcvo r8 = defpackage.fcvo.a
        La4:
            return r8
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csxg.a(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x00b9, B:41:0x00bd], limit reached: 64 */
    /* JADX WARN: Path cross not found for [B:41:0x00bd, B:39:0x00b9], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:37:0x00b0, B:39:0x00b9, B:34:0x0085), top: B:58:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csxg.b(java.util.List, fcxy):java.lang.Object");
    }

    @Override // defpackage.csyy
    public final void c(List list) {
        list.getClass();
        if (((Boolean) csym.a.e()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((alrj) this.f.b()).q((ParticipantsTable.BindData) obj).r()) {
                    arrayList.add(obj);
                }
            }
            auvw.k(this.d, null, null, new csxe(arrayList, this, null), 3);
        }
    }
}
