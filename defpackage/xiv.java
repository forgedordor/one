package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xiv implements xhr {
    public final cogw b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final dowz g;
    private final ahnz h;

    public xiv(fcsu fcsuVar, fcsu fcsuVar2, ahnz ahnzVar, fcsu fcsuVar3, fcsu fcsuVar4, xhj xhjVar, cogw cogwVar) {
        ahnzVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cogwVar.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.h = ahnzVar;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.b = cogwVar;
        this.g = new dowz(R.drawable.ic_compose_camera_gallery_unselected_v2, new dowy(xhjVar.a(R.color.camera_gallery_shortcut_background), new dpxb(R.color.camera_gallery_shortcut_icon_tint)));
    }

    @Override // defpackage.xhr
    public final int a() {
        return R.string.camera_gallery_shortcut_title;
    }

    @Override // defpackage.xhr
    public final dowz b() {
        return this.g;
    }

    @Override // defpackage.xhr
    public final Object c(View view, fcxy fcxyVar) {
        if (!((aqgu) this.e.b()).a() || !((aqgw) this.f.b()).a()) {
            ((vwg) this.c.b()).c(vwc.a);
            return new xhp(null);
        }
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        wdq wdqVarA = this.h.a(emsj.PLUS_BUTTON, new xiu(fdiuVar, this));
        if (wdqVarA.h()) {
            ((dpnt) this.d.b()).b(wdqVarA);
        } else {
            wdqVarA.g();
            fdiuVar.e(new xho((char[]) null), xis.a);
        }
        return fdiuVar.m();
    }

    @Override // defpackage.xhr
    public final /* synthetic */ List e() {
        return fcvo.a;
    }

    @Override // defpackage.xhr
    public final boolean f() {
        return true;
    }
}
