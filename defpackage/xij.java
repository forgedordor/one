package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xij implements xhr {
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler");
    public static final doig c;
    public static final dltl d;
    public final fdjx e;
    public final fcyh f;
    public final dnhq g;
    public final cywg h;
    public final cywh i;
    public final cqiz j;
    public final Context k;
    public final vth l;
    private final fcyh m;
    private final afzc n;
    private final dnih o;
    private final ahax p;
    private final lwn q;
    private final int r;
    private final dowz s;
    private final aaft t;

    static {
        doig doigVarA = dohx.a("text/x-vCard");
        if (doigVarA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c = doigVarA;
        d = dltl.a;
    }

    public xij(fdjx fdjxVar, fcyh fcyhVar, fcyh fcyhVar2, afzc afzcVar, dnih dnihVar, whw whwVar, dnhq dnhqVar, cywg cywgVar, cywh cywhVar, cqiz cqizVar, Context context, ahax ahaxVar, aaft aaftVar, lwn lwnVar, vuc vucVar, vth vthVar, xhj xhjVar) {
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        afzcVar.getClass();
        dnihVar.getClass();
        whwVar.getClass();
        dnhqVar.getClass();
        cywgVar.getClass();
        cywhVar.getClass();
        cqizVar.getClass();
        context.getClass();
        ahaxVar.getClass();
        aaftVar.getClass();
        vucVar.getClass();
        vthVar.getClass();
        this.e = fdjxVar;
        this.f = fcyhVar;
        this.m = fcyhVar2;
        this.n = afzcVar;
        this.o = dnihVar;
        this.g = dnhqVar;
        this.h = cywgVar;
        this.i = cywhVar;
        this.j = cqizVar;
        this.k = context;
        this.p = ahaxVar;
        this.t = aaftVar;
        this.q = lwnVar;
        this.l = vthVar;
        auvw.k(fdjxVar, null, null, new xia(this, null), 3);
        this.r = R.string.contacts_shortcut_title;
        this.s = new dowz(R.drawable.quantum_gm_ic_person_vd_theme_24, new dowy(xhjVar.a(R.color.contacts_shortcut_background), new dpxb(R.color.contacts_shortcut_icon_tint)));
    }

    private final void h(final Uri uri) {
        this.p.d(true, new fdap() { // from class: xhy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final ahat ahatVar = (ahat) obj;
                ahatVar.getClass();
                final xij xijVar = this.a;
                Context context = xijVar.k;
                String string = context.getString(R.string.shareDialogTitle);
                string.getClass();
                String string2 = context.getString(R.string.shareDialogTypeFile);
                string2.getClass();
                final Uri uri2 = uri;
                String string3 = context.getString(R.string.shareDialogTypeText);
                string3.getClass();
                return new djmn(string, fcva.g(new dkeg(string2, null, null, null, null, null, null, new fdae() { // from class: xhw
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dltl dltlVar = xij.d;
                        doif doifVar = xij.c.b;
                        xij xijVar2 = xijVar;
                        dnhn dnhnVarK = xijVar2.l.k(dltlVar, doifVar);
                        ahatVar.a();
                        auvw.k(xijVar2.e, null, null, new xih(xijVar2, uri2, dnhnVarK, null), 3);
                        return fctx.a;
                    }
                }, 126), new dkeg(string3, null, null, null, null, null, null, new fdae() { // from class: xhx
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ahatVar.a();
                        xij xijVar2 = xijVar;
                        auvw.k(xijVar2.e, null, null, new xii(xijVar2, uri2, null), 3);
                        return fctx.a;
                    }
                }, 126)), null, null, null, null, null, null, null, 508);
            }
        });
    }

    @Override // defpackage.xhr
    public final int a() {
        return this.r;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r0 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f8, code lost:
    
        if (r0.a(r5, r14) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.xhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.view.View r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xij.c(android.view.View, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.xic
            if (r0 == 0) goto L13
            r0 = r9
            xic r0 = (defpackage.xic) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xic r0 = new xic
            r0.<init>(r8, r9)
        L18:
            r7 = r0
            java.lang.Object r9 = r7.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.fctl.b(r9)
            goto L4b
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L30:
            defpackage.fctl.b(r9)
            r9 = r2
            lwn r2 = r8.q
            afzc r4 = r8.n
            xhm r1 = defpackage.xhr.a
            xhz r6 = new xhz
            r6.<init>()
            r7.c = r9
            java.lang.String r5 = "Contacts"
            java.lang.String r3 = "contact_shortcut_saved_state_pending_result"
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 == r0) goto L90
        L4b:
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r0 = "checkForAndHandlePendingResult"
            java.lang.String r1 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler"
            java.lang.String r2 = "BugleComposeRow2"
            java.lang.String r3 = "ContactsShortcutHandler.kt"
            if (r9 != 0) goto L72
            ekrg r9 = defpackage.xij.b
            ekrw r9 = r9.j()
            ekrz r4 = defpackage.eksq.a
            r9.X(r4, r2)
            r2 = 168(0xa8, float:2.35E-43)
            ekrw r9 = r9.h(r1, r0, r2, r3)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Skipping contact picker activity result because of null uri"
            r9.q(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L72:
            ekrg r4 = defpackage.xij.b
            ekrw r4 = r4.e()
            ekrz r5 = defpackage.eksq.a
            r4.X(r5, r2)
            r2 = 171(0xab, float:2.4E-43)
            ekrw r0 = r4.h(r1, r0, r2, r3)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Showing dialog on whether to send contact as file or text."
            r0.q(r1)
            r8.h(r9)
            fctx r9 = defpackage.fctx.a
            return r9
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xij.d(fcxy):java.lang.Object");
    }

    @Override // defpackage.xhr
    public final /* synthetic */ List e() {
        return fcvo.a;
    }

    @Override // defpackage.xhr
    public final boolean f() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r12 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.net.Uri r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.xig
            if (r0 == 0) goto L13
            r0 = r12
            xig r0 = (defpackage.xig) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xig r0 = new xig
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "sendContactAsText"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler"
            java.lang.String r6 = "BugleComposeRow2"
            r7 = 2
            r8 = 1
            java.lang.String r9 = "ContactsShortcutHandler.kt"
            if (r2 == 0) goto L3f
            if (r2 == r8) goto L3b
            if (r2 != r7) goto L33
            defpackage.fctl.b(r12)
            goto L83
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            defpackage.fctl.b(r12)
            goto L6d
        L3f:
            defpackage.fctl.b(r12)
            ekrg r12 = defpackage.xij.b
            ekrw r12 = r12.e()
            ekrz r2 = defpackage.eksq.a
            r12.X(r2, r6)
            r2 = 214(0xd6, float:3.0E-43)
            ekrw r12 = r12.h(r5, r4, r2, r9)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r2 = "Converting contact to text. contactUri %s"
            r12.t(r2, r11)
            fcyh r12 = r10.f
            fcyh r12 = defpackage.eicg.a(r12)
            xie r2 = new xie
            r2.<init>(r3, r10, r11)
            r0.c = r8
            java.lang.Object r12 = defpackage.fdin.a(r12, r2, r0)
            if (r12 == r1) goto La8
        L6d:
            fcyh r11 = r10.m
            cyvj r12 = (defpackage.cyvj) r12
            fcyh r11 = defpackage.eicg.a(r11)
            xif r2 = new xif
            r2.<init>(r3, r10, r12)
            r0.c = r7
            java.lang.Object r12 = defpackage.fdin.a(r11, r2, r0)
            if (r12 != r1) goto L83
            goto La8
        L83:
            java.lang.String r12 = (java.lang.String) r12
            ekrg r11 = defpackage.xij.b
            ekrw r11 = r11.e()
            ekrz r0 = defpackage.eksq.a
            r11.X(r0, r6)
            r0 = 226(0xe2, float:3.17E-43)
            ekrw r11 = r11.h(r5, r4, r0, r9)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r0 = "Appending selected contact in draft text."
            r11.q(r0)
            dnih r11 = r10.o
            r12.getClass()
            r11.c(r12)
            fctx r11 = defpackage.fctx.a
            return r11
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xij.g(android.net.Uri, fcxy):java.lang.Object");
    }
}
