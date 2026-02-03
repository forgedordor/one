package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjw implements xhr {
    public final fcsu b;
    private final fctc c;
    private final int d;
    private final dowz e;

    public xjw(@apnu fcsu fcsuVar, final fcsu fcsuVar2, xhj xhjVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
        this.c = fctd.a(new fdae() { // from class: xju
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional;
                Object objB = this.b.b();
                objB.getClass();
                fcsu fcsuVar3 = true != ((Boolean) objB).booleanValue() ? null : fcsuVar2;
                if (fcsuVar3 == null || (optional = (Optional) fcsuVar3.b()) == null) {
                    return null;
                }
                return (xgc) fdct.b(optional);
            }
        });
        this.d = R.string.selfie_gif_shortcut_title;
        this.e = new dowz(R.drawable.ic_selfie_gif, new dowy(xhjVar.a(R.color.selfie_gif_shortcut_background), new dpxb(R.color.selfie_gif_shortcut_icon_tint)));
    }

    private final xgc d() {
        return (xgc) this.c.a();
    }

    @Override // defpackage.xhr
    public final int a() {
        return this.d;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.xhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.view.View r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r6 instanceof defpackage.xjv
            if (r5 == 0) goto L13
            r5 = r6
            xjv r5 = (defpackage.xjv) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            xjv r5 = new xjv
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            defpackage.fctl.b(r6)
            goto L42
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            defpackage.fctl.b(r6)
            xgc r6 = r4.d()
            if (r6 == 0) goto L51
            r5.c = r3
            r1 = 2
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 == r0) goto L50
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L51
            xhp r5 = new xhp
            r5.<init>(r2)
            return r5
        L50:
            return r0
        L51:
            xho r5 = new xho
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjw.c(android.view.View, fcxy):java.lang.Object");
    }

    @Override // defpackage.xhr
    public final List e() {
        return fcva.b(dngy.a);
    }

    @Override // defpackage.xhr
    public final boolean f() {
        return d() != null;
    }
}
