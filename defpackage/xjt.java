package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjt implements xhr {
    private final Optional b;
    private final cogw c;
    private final dowz d;

    public xjt(Optional optional, cogw cogwVar, xhj xhjVar) {
        cogwVar.getClass();
        this.b = optional;
        this.c = cogwVar;
        this.d = new dowz(R.drawable.quantum_gm_ic_schedule_vd_theme_24, new dowy(xhjVar.a(R.color.scheduled_send_shortcut_background), new dpxb(R.color.scheduled_send_shortcut_icon_tint)));
    }

    @Override // defpackage.xhr
    public final int a() {
        return R.string.scheduled_send_shortcut_title;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, vwi] */
    @Override // defpackage.xhr
    public final Object c(View view, fcxy fcxyVar) {
        Optional optional = this.b;
        optional.isPresent();
        return optional.get().a() ? new xhp(this.c.f()) : new xho((char[]) null);
    }

    @Override // defpackage.xhr
    public final /* synthetic */ List e() {
        return fcvo.a;
    }

    @Override // defpackage.xhr
    public final boolean f() {
        this.b.isPresent();
        return true;
    }
}
