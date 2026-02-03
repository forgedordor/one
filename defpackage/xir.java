package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xir implements xhr {
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler");
    private static final dltl e = dltl.a;
    public final Context c;
    public final cqmr d;
    private final fdjx f;
    private final fcyh g;
    private final fcyh h;
    private final afzc i;
    private final lwn j;
    private final vth k;
    private final int l;
    private final dowz m;
    private final whw n;
    private final aaft o;

    public xir(fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2, afzc afzcVar, whw whwVar, Context context, aaft aaftVar, cqmr cqmrVar, lwn lwnVar, vuc vucVar, vth vthVar, xhj xhjVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        afzcVar.getClass();
        whwVar.getClass();
        context.getClass();
        aaftVar.getClass();
        cqmrVar.getClass();
        vucVar.getClass();
        vthVar.getClass();
        this.f = fdjxVar;
        this.g = fcyhVar;
        this.h = fcyhVar2;
        this.i = afzcVar;
        this.n = whwVar;
        this.c = context;
        this.o = aaftVar;
        this.d = cqmrVar;
        this.j = lwnVar;
        this.k = vthVar;
        auvw.k(fdjxVar, null, null, new xil(this, null), 3);
        this.l = R.string.files_shortcut_title;
        this.m = new dowz(R.drawable.quantum_gm_ic_attach_file_vd_theme_24, new dowy(xhjVar.a(R.color.files_shortcut_background), new dpxb(R.color.files_shortcut_icon_tint)));
    }

    @Override // defpackage.xhr
    public final int a() {
        return this.l;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.m;
    }

    @Override // defpackage.xhr
    public final Object c(View view, fcxy fcxyVar) {
        return h(new agau("FilePicker", new adz(), "*/*", view != null ? xhs.a(view) : null), fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (g(r10, r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.xim
            if (r0 == 0) goto L13
            r0 = r10
            xim r0 = (defpackage.xim) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xim r0 = new xim
            r0.<init>(r9, r10)
        L18:
            r7 = r0
            java.lang.Object r10 = r7.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 == r2) goto L33
            if (r1 != r8) goto L2b
            defpackage.fctl.b(r10)
            goto L8b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            defpackage.fctl.b(r10)
            goto L52
        L37:
            defpackage.fctl.b(r10)
            r10 = r2
            lwn r2 = r9.j
            afzc r4 = r9.i
            xhm r1 = defpackage.xhr.a
            xik r6 = new xik
            r6.<init>()
            r7.c = r10
            java.lang.String r5 = "FilePicker"
            java.lang.String r3 = "files_shortcut_saved_state_pending_result"
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r10 == r0) goto L8e
        L52:
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 != 0) goto L79
            ekrg r10 = defpackage.xir.b
            ekrw r10 = r10.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BugleComposeRow2"
            r10.X(r0, r1)
            r0 = 185(0xb9, float:2.59E-43)
            java.lang.String r1 = "FilesShortcutHandler.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler"
            java.lang.String r3 = "checkForAndHandlePendingResult"
            ekrw r10 = r10.h(r2, r3, r0, r1)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Skipping file picker activity result because of null uri"
            r10.q(r0)
            fctx r10 = defpackage.fctx.a
            return r10
        L79:
            vth r1 = r9.k
            dltl r2 = defpackage.xir.e
            r3 = 0
            vvl r1 = r1.j(r2, r3)
            r7.c = r8
            java.lang.Object r10 = r9.g(r10, r1, r7)
            if (r10 != r0) goto L8b
            goto L8e
        L8b:
            fctx r10 = defpackage.fctx.a
            return r10
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xir.d(fcxy):java.lang.Object");
    }

    @Override // defpackage.xhr
    public final /* synthetic */ List e() {
        return fcvo.a;
    }

    @Override // defpackage.xhr
    public final boolean f() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r20, defpackage.vvl r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xir.g(android.net.Uri, vvl, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (g(r0, r4, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.agau r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xir.h(agau, fcxy):java.lang.Object");
    }
}
