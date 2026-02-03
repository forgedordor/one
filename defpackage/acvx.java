package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvx implements adaq {
    private final Context a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private ImageView j;
    private cpdw k;
    private cpdw l;
    private IllustrationViewStub m;

    public acvx(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar10;
    }

    private static final boolean f(dkpf dkpfVar) {
        Boolean bool = dkpfVar.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        rbr rbrVarD;
        adaoVar.getClass();
        if (adaoVar.l() == null) {
            return;
        }
        ImageView imageView = null;
        cpdw cpdwVar = null;
        ImageView imageView2 = null;
        if (z) {
            cpdw cpdwVar2 = this.k;
            if (cpdwVar2 == null) {
                fdbq.c("checkmarkViewStubber");
                cpdwVar2 = null;
            }
            cpdwVar2.g(0);
            ImageView imageView3 = this.j;
            if (imageView3 == null) {
                fdbq.c("avatar");
                imageView3 = null;
            }
            imageView3.setVisibility(8);
            cpdw cpdwVar3 = this.l;
            if (cpdwVar3 == null) {
                fdbq.c("badgeIconViewStubber");
            } else {
                cpdwVar = cpdwVar3;
            }
            cpdwVar.g(8);
            return;
        }
        cpdw cpdwVar4 = this.k;
        if (cpdwVar4 == null) {
            fdbq.c("checkmarkViewStubber");
            cpdwVar4 = null;
        }
        cpdwVar4.g(8);
        ImageView imageView4 = this.j;
        if (imageView4 == null) {
            fdbq.c("avatar");
            imageView4 = null;
        }
        imageView4.setVisibility(0);
        cpdw cpdwVar5 = this.l;
        if (cpdwVar5 == null) {
            fdbq.c("badgeIconViewStubber");
            cpdwVar5 = null;
        }
        if (cpdwVar5.h()) {
            if (adaoVar.U()) {
                IllustrationViewStub illustrationViewStub = this.m;
                if (illustrationViewStub == null) {
                    cpdw cpdwVar6 = this.l;
                    if (cpdwVar6 == null) {
                        fdbq.c("badgeIconViewStubber");
                        cpdwVar6 = null;
                    }
                    cpdwVar6.f(R.layout.cake_badge);
                    cpdw cpdwVar7 = this.l;
                    if (cpdwVar7 == null) {
                        fdbq.c("badgeIconViewStubber");
                        cpdwVar7 = null;
                    }
                    illustrationViewStub = (IllustrationViewStub) ((FrameLayout) cpdwVar7.b()).findViewById(R.id.birthday_cake);
                    illustrationViewStub.e();
                    this.m = illustrationViewStub;
                }
                if (illustrationViewStub != null) {
                    Object objE = ((cczi) tet.f.get()).e();
                    objE.getClass();
                    illustrationViewStub.d(((Number) objE).intValue());
                    cpdw cpdwVar8 = this.l;
                    if (cpdwVar8 == null) {
                        fdbq.c("badgeIconViewStubber");
                        cpdwVar8 = null;
                    }
                    cpdwVar8.g(0);
                }
            } else if (((Boolean) this.h.b()).booleanValue() && adaoVar.k().aa()) {
                afjw afjwVar = (afjw) fdct.b((Optional) ((eyig) this.c).a);
                if (afjwVar != null) {
                    IllustrationViewStub illustrationViewStub2 = this.m;
                    if (illustrationViewStub2 == null) {
                        cpdw cpdwVar9 = this.l;
                        if (cpdwVar9 == null) {
                            fdbq.c("badgeIconViewStubber");
                            cpdwVar9 = null;
                        }
                        cpdwVar9.f(afjwVar.a().b());
                        cpdw cpdwVar10 = this.l;
                        if (cpdwVar10 == null) {
                            fdbq.c("badgeIconViewStubber");
                            cpdwVar10 = null;
                        }
                        illustrationViewStub2 = (IllustrationViewStub) ((FrameLayout) cpdwVar10.b()).findViewById(afjwVar.a().a());
                        this.m = illustrationViewStub2;
                    }
                    if (illustrationViewStub2 != null) {
                        illustrationViewStub2.c().requestLayout();
                        cpdw cpdwVar11 = this.l;
                        if (cpdwVar11 == null) {
                            fdbq.c("badgeIconViewStubber");
                            cpdwVar11 = null;
                        }
                        cpdwVar11.g(0);
                    }
                }
            } else if (adaoVar.k().d() == 3) {
                IllustrationViewStub illustrationViewStub3 = this.m;
                if (illustrationViewStub3 == null) {
                    cpdw cpdwVar12 = this.l;
                    if (cpdwVar12 == null) {
                        fdbq.c("badgeIconViewStubber");
                        cpdwVar12 = null;
                    }
                    cpdwVar12.f(R.layout.rcs_badge);
                    cpdw cpdwVar13 = this.l;
                    if (cpdwVar13 == null) {
                        fdbq.c("badgeIconViewStubber");
                        cpdwVar13 = null;
                    }
                    illustrationViewStub3 = (IllustrationViewStub) ((FrameLayout) cpdwVar13.b()).findViewById(R.id.rcs_badge);
                    this.m = illustrationViewStub3;
                }
                if (illustrationViewStub3 != null) {
                    illustrationViewStub3.c().requestLayout();
                    cpdw cpdwVar14 = this.l;
                    if (cpdwVar14 == null) {
                        fdbq.c("badgeIconViewStubber");
                        cpdwVar14 = null;
                    }
                    cpdwVar14.g(0);
                }
            } else {
                cpdw cpdwVar15 = this.l;
                if (cpdwVar15 == null) {
                    fdbq.c("badgeIconViewStubber");
                    cpdwVar15 = null;
                }
                cpdwVar15.g(8);
            }
        }
        adal adalVarL = adaoVar.l();
        if (adalVarL == null) {
            throw new IllegalStateException("Required value was null.");
        }
        rbr rbrVar = adalVarL.a;
        if (rbrVar != null && (rbrVarD = rbrVar.d(adalVarL.b)) != null) {
            ImageView imageView5 = this.j;
            if (imageView5 == null) {
                fdbq.c("avatar");
            } else {
                imageView2 = imageView5;
            }
            rbrVarD.v(imageView2);
            return;
        }
        rbr rbrVarD2 = ((ehrb) this.b.b()).d(null);
        ImageView imageView6 = this.j;
        if (imageView6 == null) {
            fdbq.c("avatar");
        } else {
            imageView = imageView6;
        }
        rbrVarD2.v(imageView);
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.j = (ImageView) view.findViewById(R.id.conversation_icon);
        this.k = new cpdw(view, R.id.conversation_checkmark, R.id.conversation_checkmark, R.layout.conversation_checkmark_icon);
        this.l = new cpdw(view, R.id.avatar_badge_icon, R.id.avatar_badge_icon);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    @Override // defpackage.adaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.adan r8, defpackage.acyx r9) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acvx.d(adan, acyx):void");
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        adaoVar.getClass();
        adaoVar2.getClass();
        String strJ = adaoVar2.k().J();
        if (strJ == null || fdbq.f(strJ, adaoVar.k().J())) {
            return tet.a() && adaoVar.U() != adaoVar2.U();
        }
        return true;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
