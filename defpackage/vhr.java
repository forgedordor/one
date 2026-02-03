package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhr implements vdy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/actions/deletemessage/DeleteMessageActionPlugin");
    public final Context b;
    public final ConversationId c;
    public final ajmh d;
    public final fdjx e;
    public final zqm f;
    public final fdpl g;
    public final fduj h;
    public djmn i;
    public final yrn j;
    public int k;
    private final ahax l;
    private final dalj m;
    private final cssw n;
    private final appk o;
    private final arvu p;
    private final fdpl q;
    private final Set r;

    public vhr(Context context, ConversationId conversationId, ahax ahaxVar, dalj daljVar, ajmh ajmhVar, fdjx fdjxVar, zqm zqmVar, cssw csswVar, appk appkVar, cqdr cqdrVar, fdpl fdplVar, fduj fdujVar, arvu arvuVar, yrn yrnVar) {
        context.getClass();
        conversationId.getClass();
        ahaxVar.getClass();
        daljVar.getClass();
        ajmhVar.getClass();
        fdjxVar.getClass();
        zqmVar.getClass();
        csswVar.getClass();
        appkVar.getClass();
        cqdrVar.getClass();
        fdujVar.getClass();
        arvuVar.getClass();
        yrnVar.getClass();
        this.b = context;
        this.c = conversationId;
        this.l = ahaxVar;
        this.m = daljVar;
        this.d = ajmhVar;
        this.e = fdjxVar;
        this.f = zqmVar;
        this.n = csswVar;
        this.o = appkVar;
        this.g = fdplVar;
        this.h = fdujVar;
        this.p = arvuVar;
        this.j = yrnVar;
        this.k = 1;
        String string = context.getString(R.string.rcs_delete_message_confirmation_dialog_title);
        string.getClass();
        fcvo fcvoVar = fcvo.a;
        String string2 = context.getString(R.string.delete_message_confirmation_button);
        string2.getClass();
        dktq dktqVar = new dktq(string2, new fdae() { // from class: vgy
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
        String string3 = context.getString(android.R.string.cancel);
        string3.getClass();
        this.i = new djmn(string, fcvoVar, null, null, null, null, dktqVar, new dktq(string3, new fdae() { // from class: vgz
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), null, 316);
        this.q = arvuVar.a() ? fdud.a(zqmVar.a(), fdujVar, fdplVar, new vhg(this, null)) : new vhq(zqmVar.a(), this);
        this.r = fcwm.d(zqx.b, zqx.c, zqx.d, zqx.e);
    }

    public static final boolean h(List list, wac wacVar, aoer aoerVar) {
        if (list.size() != 1) {
            return false;
        }
        wab wabVar = wacVar instanceof wab ? (wab) wacVar : null;
        if (wabVar != null && wabVar.u()) {
            return aoerVar != null && ((ajlt) fcva.X(list)).t(aoerVar);
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.c, ((ajlt) fcva.X(list)).b());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/actions/deletemessage/DeleteMessageActionPlugin", "isEligibleForRemoteDelete", 146, "DeleteMessageActionPlugin.kt")).q("Not remotely deletable reason: conversation does not support remote delete");
        return false;
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.r;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r11 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.vhj
            if (r0 == 0) goto L13
            r0 = r11
            vhj r0 = (defpackage.vhj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vhj r0 = new vhj
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r11)
            goto Ldd
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.fctl.b(r11)
            goto Lc3
        L38:
            defpackage.fctl.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r2 = 10
            int r5 = defpackage.fcva.p(r10, r2)
            r11.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L4a:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r10.next()
            ajlt r5 = (defpackage.ajlt) r5
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r5.b()
            r11.add(r5)
            goto L4a
        L5e:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = defpackage.fcva.p(r11, r2)
            r10.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L6b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r2.next()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = (com.google.android.apps.messaging.shared.api.messaging.MessageId) r5
            java.lang.String r5 = r5.a()
            r10.add(r5)
            goto L6b
        L7f:
            ekrg r2 = defpackage.vhr.a
            ekrw r2 = r2.h()
            ekrz r5 = defpackage.eksq.a
            java.lang.String r6 = "Bugle"
            r2.X(r5, r6)
            r5 = 307(0x133, float:4.3E-43)
            java.lang.String r6 = "DeleteMessageActionPlugin.kt"
            java.lang.String r7 = "com/google/android/apps/messaging/conversation2/actions/deletemessage/DeleteMessageActionPlugin"
            java.lang.String r8 = "deleteMessages"
            ekrw r2 = r2.h(r7, r8, r5, r6)
            ekrd r2 = (defpackage.ekrd) r2
            ajmh r5 = r9.d
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r6 = r5.g()
            java.lang.String r6 = r6.b()
            java.lang.String r7 = "UI initiated message %s deletion in conversation %s"
            r2.D(r7, r10, r6)
            appk r10 = r9.o
            boolean r10 = r10.a()
            if (r10 == 0) goto Lcd
            ekgb r10 = defpackage.ekfv.a(r11)
            cdyt r11 = defpackage.cdyt.MESSAGE_LIST_CONVO_V2_MANUAL_DELETION
            eiju r10 = r5.s(r10, r11)
            r0.c = r4
            java.lang.Object r11 = defpackage.fdxs.c(r10, r0)
            if (r11 == r1) goto Lfd
        Lc3:
            r11.getClass()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            goto Le6
        Lcd:
            ekgb r10 = defpackage.ekfv.a(r11)
            eiju r10 = r5.r(r10)
            r0.c = r3
            java.lang.Object r11 = defpackage.fdxs.c(r10, r0)
            if (r11 == r1) goto Lfd
        Ldd:
            r11.getClass()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
        Le6:
            if (r10 != 0) goto Lf8
            android.content.Context r11 = r9.b
            r0 = 2132083820(0x7f15046c, float:1.9807793E38)
            java.lang.String r0 = r11.getString(r0)
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r0, r4)
            r11.show()
        Lf8:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        Lfd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhr.c(java.util.List, fcxy):java.lang.Object");
    }

    public final List d(final ahat ahatVar) {
        final int i = 2;
        djzw[] djzwVarArr = new djzw[2];
        Context context = this.b;
        String string = context.getString(R.string.delete_for_everyone);
        string.getClass();
        String string2 = context.getString(R.string.delete_for_everyone_info);
        int i2 = this.k;
        final int i3 = 1;
        djzwVarArr[0] = new djzw(string, string2, i2 == 1, new fdae() { // from class: vhc
            @Override // defpackage.fdae
            public final Object invoke() {
                vhr vhrVar = this.a;
                vhrVar.k = i3;
                djmn djmnVar = vhrVar.i;
                ahat ahatVar2 = ahatVar;
                vhrVar.i = djmn.b(djmnVar, null, vhrVar.d(ahatVar2), null, null, null, null, 509);
                ahatVar2.b(vhrVar.i);
                return fctx.a;
            }
        });
        String string3 = context.getString(R.string.delete_for_me);
        string3.getClass();
        int i4 = this.k;
        djzwVarArr[1] = new djzw(string3, null, i4 == 2, new fdae() { // from class: vhc
            @Override // defpackage.fdae
            public final Object invoke() {
                vhr vhrVar = this.a;
                vhrVar.k = i;
                djmn djmnVar = vhrVar.i;
                ahat ahatVar2 = ahatVar;
                vhrVar.i = djmn.b(djmnVar, null, vhrVar.d(ahatVar2), null, null, null, null, 509);
                ahatVar2.b(vhrVar.i);
                return fctx.a;
            }
        });
        return fcva.g(djzwVarArr);
    }

    public final void e(final List list, boolean z, final fdae fdaeVar) throws Resources.NotFoundException {
        list.getClass();
        cssw csswVar = this.n;
        Context context = this.b;
        if (!csswVar.b(context)) {
            this.m.a();
            return;
        }
        if (z) {
            this.l.d(true, new fdap() { // from class: vhb
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    final ahat ahatVar = (ahat) obj;
                    ahatVar.getClass();
                    final vhr vhrVar = this.a;
                    djmn djmnVar = vhrVar.i;
                    List listD = vhrVar.d(ahatVar);
                    Context context2 = vhrVar.b;
                    String string = context2.getString(R.string.delete_message_confirmation_button);
                    string.getClass();
                    final List list2 = list;
                    final fdae fdaeVar2 = fdaeVar;
                    dktq dktqVar = new dktq(string, new fdae() { // from class: vha
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            vhr vhrVar2 = vhrVar;
                            auvw.k(vhrVar2.e, null, null, new vhl(vhrVar2, list2, fdaeVar2, null), 3);
                            ahatVar.a();
                            return fctx.a;
                        }
                    });
                    String string2 = context2.getString(android.R.string.cancel);
                    string2.getClass();
                    vhrVar.i = djmn.b(djmnVar, null, listD, null, dktqVar, new dktq(string2, new fdae() { // from class: vhd
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            ahatVar.a();
                            return fctx.a;
                        }
                    }), null, 317);
                    return vhrVar.i;
                }
            });
            return;
        }
        ahax ahaxVar = this.l;
        String quantityString = context.getResources().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, list.size(), Integer.valueOf(list.size()));
        String string = context.getString(R.string.delete_message_confirmation_dialog_text);
        string.getClass();
        String string2 = context.getString(R.string.delete_message_confirmation_button);
        string2.getClass();
        dktq dktqVar = new dktq(string2, new fdae() { // from class: vgw
            @Override // defpackage.fdae
            public final Object invoke() {
                vhr vhrVar = this.a;
                auvw.k(vhrVar.e, null, null, new vhn(vhrVar, list, fdaeVar, null), 3);
                return fctx.a;
            }
        });
        String string3 = context.getString(android.R.string.cancel);
        string3.getClass();
        ahaxVar.c(new djmj(string, null, null, quantityString, false, false, dktqVar, new dktq(string3, new fdae() { // from class: vgx
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), null, 310), true);
    }

    public final void f(List list, fdae fdaeVar) {
        auvw.k(this.e, null, null, new vhm(this, list, fdaeVar, null), 3);
    }
}
