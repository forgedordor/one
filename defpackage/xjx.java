package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjx implements xhr {
    private final fcsu b;
    private final dowz c;

    public xjx(fcsu fcsuVar, xhj xhjVar) {
        this.b = fcsuVar;
        this.c = new dowz(R.drawable.quantum_gm_ic_sticker_vd_theme_24, new dowy(xhjVar.a(R.color.stickers_shortcut_background), new dpxb(R.color.stickers_shortcut_icon_tint)));
    }

    @Override // defpackage.xhr
    public final int a() {
        return R.string.stickers_shortcut_title;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.c;
    }

    @Override // defpackage.xhr
    public final Object c(View view, fcxy fcxyVar) {
        ((vwg) this.b.b()).c(new vwb(vvy.c, 2));
        return new xhp(null);
    }

    @Override // defpackage.xhr
    public final /* synthetic */ List e() {
        return fcvo.a;
    }

    @Override // defpackage.xhr
    public final boolean f() {
        return ((Boolean) ujw.c.e()).booleanValue() && ujw.c();
    }
}
