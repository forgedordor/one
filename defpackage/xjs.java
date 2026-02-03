package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjs implements xhr {
    private final Context b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final dowz i;

    public xjs(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, xhj xhjVar) {
        context.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = new dowz(R.drawable.gs_pen_spark_vd_theme_24, new dowy(xhjVar.a(R.color.rewrite_shortcut_background), new dpxb(R.color.rewrite_shortcut_icon_tint)));
    }

    @Override // defpackage.xhr
    public final int a() {
        return R.string.magic_compose_shortcut_title;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.i;
    }

    @Override // defpackage.xhr
    public final Object c(View view, fcxy fcxyVar) {
        if (((dnih) this.e.b()).b(false).length() != 0) {
            ((uvn) this.d.b()).b();
            ((vwg) this.c.b()).c(vvz.a);
            return new xhp(null);
        }
        if (((Boolean) crbf.bd.e()).booleanValue() || !((aqab) this.h.b()).a()) {
            ((uvn) this.d.b()).c();
            ((vwg) this.c.b()).c(vvz.a);
            return new xhp(null);
        }
        ahax ahaxVar = (ahax) this.f.b();
        Context context = this.b;
        String string = context.getString(R.string.magic_compose_magic_rewrite_without_draft_error_message);
        string.getClass();
        String string2 = context.getString(R.string.rewrite_shortcut_no_message_text_confirm);
        string2.getClass();
        ahaxVar.c(new djmj(string, null, null, null, false, false, new dktq(string2, new fdae() { // from class: xjr
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), null, null, 446), true);
        return new xho((char[]) null);
    }

    @Override // defpackage.xhr
    public final /* synthetic */ List e() {
        return fcvo.a;
    }

    @Override // defpackage.xhr
    public final boolean f() {
        return ((Boolean) crbf.aN.e()).booleanValue() && ((crqx) this.g.b()).j();
    }
}
