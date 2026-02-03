package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctsy implements ctrq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/startchat/groupname/GroupNameUiAdapterImpl");
    private final asdw A;
    private final fdvc B;
    private final fdvc C;
    private final fdvc D;
    private final fdvc E;
    private final fdvc F;
    private final fduf G;
    private final fdvc H;
    private final fdvc I;
    public final fdjx b;
    public final Context c;
    public final ctro d;
    public final ConversationId e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final cudy i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final asdt o;
    public final asgz p;
    public final afzx q;
    public final ardj r;
    public final lwn s;
    public final ards t;
    public final fduf u;
    public final fduf v;
    public final fduf w;
    public final AtomicBoolean x;
    private final fcyh y;
    private final ctuu z;

    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v3 */
    public ctsy(fdjx fdjxVar, Context context, fcyh fcyhVar, ctro ctroVar, ConversationId conversationId, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cudy cudyVar, fcsu fcsuVar4, fcsu fcsuVar5, ctuu ctuuVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, asdt asdtVar, asgz asgzVar, asdw asdwVar, afzx afzxVar, ardj ardjVar, lwn lwnVar, ards ardsVar, aofc aofcVar) {
        char c;
        byte[] bArr;
        ?? r22;
        fdvc fdvcVarB;
        fdjxVar.getClass();
        context.getClass();
        fcyhVar.getClass();
        ctroVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cudyVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        ctuuVar.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        ardjVar.getClass();
        aofcVar.getClass();
        this.b = fdjxVar;
        this.c = context;
        this.y = fcyhVar;
        this.d = ctroVar;
        this.e = conversationId;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = cudyVar;
        this.j = fcsuVar4;
        this.k = fcsuVar5;
        this.z = ctuuVar;
        this.l = fcsuVar6;
        this.m = fcsuVar7;
        this.n = fcsuVar8;
        this.o = asdtVar;
        this.p = asgzVar;
        this.A = asdwVar;
        this.q = afzxVar;
        this.r = ardjVar;
        this.s = lwnVar;
        this.t = ardsVar;
        if (ctroVar.b && conversationId == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (ardjVar.a() && fdbq.f(lwnVar.b("has_pending_profile_photo_picker_result"), true)) {
            auvw.k(fdjxVar, null, null, new ctrs(this, null), 3);
        }
        fdvc fdvcVarA = ardjVar.a() ? fdvf.a(null) : fdtg.b(new ctsf(cudyVar.a(), this), fdjxVar, fdur.a(0L, 3), null);
        this.B = fdvcVarA;
        fdvc fdvcVarB2 = ardjVar.a() ? fdtg.b(cudyVar.a(), fdjxVar, fdur.a(0L, 3), null) : fdvf.a(null);
        this.C = fdvcVarB2;
        fduf fdufVarA = fdvf.a(ctroVar.a);
        this.u = fdufVarA;
        if (ardsVar.a()) {
            fdpl fdplVarA = cudyVar.a();
            anpj anpjVarA = aofcVar.a();
            anpjVarA.getClass();
            c = 1;
            r22 = 0;
            bArr = null;
            fdvcVarB = fdtg.b(new fdua(fdplVarA, anov.a(anpjVarA), new ctrw(this, null)), fdjxVar, fdur.a(0L, 3), false);
        } else {
            c = 1;
            bArr = null;
            r22 = 0;
            fdvcVarB = fdtg.b(new ctsi(cudyVar.a(), this), fdjxVar, fdur.a(0L, 3), false);
        }
        this.D = fdvcVarB;
        fdvc fdvcVarB3 = fdtg.b(ardjVar.a() ? new ctsl(fdvcVarB, this) : new ctso(cudyVar.a(), this), fdjxVar, fdur.a(0L, 3), context.getString(R.string.group_name_description_rcs_pending));
        this.E = fdvcVarB3;
        fduf fdufVarA2 = fdvf.a(Boolean.valueOf(ctroVar.b));
        this.v = fdufVarA2;
        fdpl fdplVarA2 = fdqq.a(new ctsr(fdufVarA));
        fdus fdusVarA = fdur.a(0L, 3);
        Boolean boolValueOf = Boolean.valueOf((boolean) r22);
        fdvc fdvcVarB4 = fdtg.b(fdplVarA2, fdjxVar, fdusVarA, boolValueOf);
        this.F = fdvcVarB4;
        fduf fdufVarA3 = fdvf.a(bArr);
        this.w = fdufVarA3;
        fduf fdufVarA4 = fdvf.a(bArr);
        this.G = fdufVarA4;
        fdvc fdvcVarB5 = fdtg.b(new ctsu(fdvcVarB, this), fdjxVar, fdur.a(0L, 3), boolValueOf);
        this.H = fdvcVarB5;
        fdpl[] fdplVarArr = new fdpl[9];
        fdplVarArr[r22] = fdvcVarA;
        fdplVarArr[c] = fdufVarA;
        fdplVarArr[2] = fdvcVarB3;
        fdplVarArr[3] = fdufVarA2;
        fdplVarArr[4] = fdvcVarB4;
        fdplVarArr[5] = fdufVarA3;
        fdplVarArr[6] = fdvcVarB5;
        fdplVarArr[7] = fdvcVarB2;
        fdplVarArr[8] = fdufVarA4;
        this.I = fdtg.b(new ctsc(fdplVarArr, this), fdjxVar, fdur.a(0L, 3), new ctte(bArr));
        this.x = new AtomicBoolean();
    }

    static /* synthetic */ Object l(ctsy ctsyVar, cudx cudxVar, fcxy fcxyVar) {
        return ctsyVar.k(cudxVar, fcvo.a, fcxyVar);
    }

    @Override // defpackage.ctrq
    public final Uri a() {
        return (Uri) this.G.c();
    }

    @Override // defpackage.ctrq
    public final String b() {
        return (String) this.u.c();
    }

    @Override // defpackage.ctrq
    public final fdvc c() {
        return this.I;
    }

    @Override // defpackage.ctrq
    public final void d() {
        this.v.f(true);
        ctuu ctuuVar = this.z;
        ctuuVar.b.c(8, ctuuVar.f);
    }

    @Override // defpackage.ctrq
    public final boolean e() {
        return this.d.b || ((Boolean) ctif.c.e()).booleanValue();
    }

    @Override // defpackage.ctrq
    public final boolean f() {
        return (e() && ((Boolean) this.F.c()).booleanValue()) ? false : true;
    }

    @Override // defpackage.ctrq
    public final boolean g() {
        return e() && !((Boolean) this.v.c()).booleanValue();
    }

    public final void h(Uri uri) {
        if (uri == null) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleContacts");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/startchat/groupname/GroupNameUiAdapterImpl", "handleProfilePhotoPickerResult", 553, "GroupNameUiAdapterImpl.kt")).q("No group icon was picked");
        } else {
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleContacts");
            ekrd ekrdVar = (ekrd) ekrwVarH2;
            ekrdVar.X(cqnc.ab, uri);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/startchat/groupname/GroupNameUiAdapterImpl", "handleProfilePhotoPickerResult", 550, "GroupNameUiAdapterImpl.kt")).q("Group icon was picked");
            this.G.f(uri);
        }
    }

    public final void i() {
        if (this.x.getAndSet(true)) {
            return;
        }
        auvw.k(this.b, null, null, new ctrz(this, (String) this.u.c(), null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r3 == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016c, code lost:
    
        if (r3 == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ac, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[LOOP:0: B:39:0x00d4->B:41:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b A[LOOP:1: B:43:0x0105->B:45:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.cudx r27, java.lang.String r28, defpackage.fcxy r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctsy.j(cudx, java.lang.String, fcxy):java.lang.Object");
    }

    public final Object k(cudx cudxVar, List list, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.y), new ctrv(null, this, list, cudxVar), fcxyVar);
    }
}
