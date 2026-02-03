package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjq implements xhr {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationShortcutHandler");
    private final Optional c;
    private final xjc d;
    private final arjw e;
    private final dowz f;
    private final List g;

    public xjq(Optional optional, xjc xjcVar, arjw arjwVar, xhj xhjVar) {
        optional.getClass();
        this.c = optional;
        this.d = xjcVar;
        this.e = arjwVar;
        ((ekrd) b.g().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationShortcutHandler", "<init>", 47, "LocationShortcutHandler.kt")).q("Checking to recover location picker result");
        xjo xjoVar = (xjo) xjcVar;
        auvw.k(xjoVar.b, null, null, new xjh(xjoVar, null), 3);
        this.f = new dowz(R.drawable.quantum_gm_ic_place_vd_theme_24, new dowy(xhjVar.a(R.color.location_shortcut_background), new dpxb(R.color.location_shortcut_icon_tint)));
        this.g = fcva.b(dngy.b);
    }

    @Override // defpackage.xhr
    public final int a() {
        return R.string.location_shortcut_title;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.xhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.view.View r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.xjp
            if (r0 == 0) goto L13
            r0 = r7
            xjp r0 = (defpackage.xjp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xjp r0 = new xjp
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r7)
            goto L70
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r7)
            xjc r7 = r5.d
            if (r6 == 0) goto L3c
            kun r6 = defpackage.xhs.a(r6)
            goto L3d
        L3c:
            r6 = r4
        L3d:
            r0.c = r3
            xjo r7 = (defpackage.xjo) r7
            fcsu r2 = r7.i
            java.lang.Object r2 = r2.b()
            aqtu r2 = (defpackage.aqtu) r2
            boolean r2 = r2.a()
            if (r2 != 0) goto L67
            cliy r2 = r7.h
            fdvc r2 = r2.h()
            java.lang.Object r2 = r2.c()
            cljh r2 = (defpackage.cljh) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L67
            r7.c()
            xix r6 = defpackage.xix.a
            goto L6d
        L67:
            java.lang.String r2 = "Location"
            java.lang.Object r6 = r7.b(r2, r6, r0)
        L6d:
            r7 = r6
            if (r7 == r1) goto La9
        L70:
            xjb r7 = (defpackage.xjb) r7
            xiz r6 = defpackage.xiz.a
            boolean r6 = defpackage.fdbq.f(r7, r6)
            if (r6 != 0) goto La3
            xix r6 = defpackage.xix.a
            boolean r6 = defpackage.fdbq.f(r7, r6)
            if (r6 == 0) goto L83
            goto La3
        L83:
            boolean r6 = r7 instanceof defpackage.xja
            if (r6 == 0) goto L8f
            xho r6 = new xho
            xja r7 = (defpackage.xja) r7
            r6.<init>(r4)
            return r6
        L8f:
            boolean r6 = r7 instanceof defpackage.xiy
            if (r6 == 0) goto L9d
            xhn r6 = new xhn
            xiy r7 = (defpackage.xiy) r7
            java.lang.Exception r7 = r7.a
            r6.<init>(r7)
            return r6
        L9d:
            fctg r6 = new fctg
            r6.<init>()
            throw r6
        La3:
            xhp r6 = new xhp
            r6.<init>(r4)
            return r6
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjq.c(android.view.View, fcxy):java.lang.Object");
    }

    @Override // defpackage.xhr
    public final List e() {
        return this.g;
    }

    @Override // defpackage.xhr
    public final boolean f() {
        return !this.e.a() && this.c.isPresent();
    }
}
