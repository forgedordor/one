package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvw implements adaq {
    public cpdw a;
    public IllustrationViewStub b;
    private final fcsu c;
    private final fcsu d;
    private ImageView e;
    private cpdw f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final Context l;
    private final fcsu m;

    public acvw(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.l = context;
        this.c = fcsuVar;
        this.g = fcsuVar3;
        this.h = fcsuVar7;
        this.d = fcsuVar4;
        this.i = fcsuVar2;
        this.j = fcsuVar6;
        this.k = fcsuVar5;
        this.m = fcsuVar8;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    @Override // defpackage.adaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.adao r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acvw.b(adao, boolean):void");
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.e = (ImageView) view.findViewById(R.id.conversation_icon);
        this.f = new cpdw(view, R.id.conversation_checkmark, R.id.conversation_checkmark, R.layout.conversation_checkmark_icon);
        this.a = new cpdw(view, R.id.avatar_badge_icon, R.id.avatar_badge_icon);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        if (((aquo) this.k.b()).a()) {
            adanVar.g(((ccwh) this.j.b()).a(acyxVar.Q(), acyxVar.J()));
        }
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        String strJ = adaoVar2.k().J();
        if (strJ == null || TextUtils.equals(strJ, adaoVar.k().J())) {
            return tet.a() && adaoVar.U() != adaoVar2.U();
        }
        return true;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
