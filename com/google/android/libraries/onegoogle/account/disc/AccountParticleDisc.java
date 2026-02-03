package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;
import defpackage.dxxk;
import defpackage.dxye;
import defpackage.dxyi;
import defpackage.dxyj;
import defpackage.dxyz;
import defpackage.dxza;
import defpackage.dxzc;
import defpackage.dxze;
import defpackage.dxzf;
import defpackage.dxzh;
import defpackage.dxzs;
import defpackage.dxzu;
import defpackage.dxzw;
import defpackage.dyaa;
import defpackage.dyqw;
import defpackage.dyrf;
import defpackage.dyyb;
import defpackage.ecem;
import defpackage.ejud;
import defpackage.ejwi;
import defpackage.ejwl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AccountParticleDisc<AccountT> extends FrameLayout {
    public final AvatarView a;
    public final BadgeFrameLayout b;
    public final RingFrameLayout c;
    public final dxzu d;
    public final dxzw e;
    public DrawableBadgeViewHolder f;
    public dyaa g;
    public boolean h;
    public boolean i;
    public dxyj j;
    public dxzh k;
    public Object l;
    public dxzf m;
    public dxxk n;
    public ejwi o;
    private final boolean p;
    private final CopyOnWriteArrayList q;
    private final dxze r;
    private final boolean s;
    private final int t;
    private dyyb u;
    private ejwi v;

    public AccountParticleDisc(Context context) {
        this(context, null);
    }

    public static dxyz b(dxzf dxzfVar) {
        dxzc dxzcVar;
        if (dxzfVar == null || (dxzcVar = dxzfVar.a) == null) {
            return null;
        }
        return (dxyz) dxzcVar.a().f();
    }

    private final void u() {
        dyyb dyybVar = this.u;
        if (dyybVar == null) {
            return;
        }
        DrawableBadgeViewHolder drawableBadgeViewHolder = this.f;
        if (drawableBadgeViewHolder != null) {
            drawableBadgeViewHolder.c = dyybVar;
            if (drawableBadgeViewHolder.e != null) {
                BadgeFrameLayout badgeFrameLayout = drawableBadgeViewHolder.a;
                badgeFrameLayout.gW(dyybVar);
                badgeFrameLayout.c(dyybVar, drawableBadgeViewHolder.e);
            }
        }
        dyaa dyaaVar = this.g;
        if (dyaaVar != null) {
            dyyb dyybVar2 = this.u;
            dyaaVar.d = dyybVar2;
            if (dyaaVar.c != null) {
                RingFrameLayout ringFrameLayout = dyaaVar.b;
                ringFrameLayout.gW(dyybVar2);
                ringFrameLayout.c(dyybVar2, dyaaVar.c);
            }
        }
    }

    public final int a() {
        return this.a.d;
    }

    public final dxza c() {
        dxzc dxzcVar;
        dxzf dxzfVar = this.m;
        dxyz dxyzVar = (dxzfVar == null || (dxzcVar = dxzfVar.a) == null) ? null : (dxyz) dxzcVar.a().f();
        if (dxyzVar == null) {
            return null;
        }
        return dxyzVar.b();
    }

    public final ejwi d() {
        ecem.c();
        if (!this.i) {
            return ejud.a;
        }
        dxzu dxzuVar = this.d;
        ecem.c();
        Object obj = dxzuVar.c;
        if (obj == null) {
            return ejud.a;
        }
        dxzh dxzhVar = dxzuVar.b;
        if (dxzhVar != null) {
            ejwi ejwiVarA = dxzu.a(dxzhVar.a(obj));
            if (ejwiVarA.g()) {
                return ejwiVarA;
            }
        }
        dxzh dxzhVar2 = dxzuVar.a;
        return dxzhVar2 != null ? dxzu.a(dxzhVar2.a(dxzuVar.c)) : ejud.a;
    }

    public final String e() {
        if (this.o.g()) {
            return ((dxyi) this.o.c()).a;
        }
        return null;
    }

    public final void f(dxye dxyeVar) {
        this.q.add(dxyeVar);
    }

    public final void g(dyyb dyybVar) {
        if (this.h || this.i) {
            this.u = dyybVar;
            u();
            if (this.h) {
                BadgeFrameLayout badgeFrameLayout = this.b;
                badgeFrameLayout.d();
                badgeFrameLayout.b(dyybVar);
            }
            if (this.i) {
                RingFrameLayout ringFrameLayout = this.c;
                ringFrameLayout.d();
                ringFrameLayout.b(dyybVar);
            }
        }
    }

    public final void h() {
        if (this.h) {
            return;
        }
        ejwl.m(!s(), "enableBadges is only allowed before calling initialize.");
        this.h = true;
    }

    public final void i(dxyj dxyjVar, final dxxk dxxkVar) {
        dxyjVar.getClass();
        this.j = dxyjVar;
        this.n = dxxkVar;
        if (this.s && this.v.g()) {
            int iIntValue = this.t - ((Integer) this.v.c()).intValue();
            int paddingLeft = (iIntValue - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (iIntValue - getPaddingTop()) - getPaddingBottom();
            int iMax = Math.max(0, (int) Math.ceil(paddingLeft / 2.0f));
            int iMax2 = Math.max(0, (int) Math.ceil(paddingTop / 2.0f));
            setPadding(getPaddingLeft() + iMax, getPaddingTop() + iMax2, getPaddingRight() + iMax, getPaddingBottom() + iMax2);
        }
        if (this.h) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        dyrf.a(new Runnable() { // from class: dxxz
            @Override // java.lang.Runnable
            public final void run() {
                AccountParticleDisc accountParticleDisc = this.a;
                final dxzo dxzoVar = new dxzo(accountParticleDisc.getResources());
                final dxxk dxxkVar2 = dxxkVar;
                dxzh dxzhVar = new dxzh() { // from class: dxzn
                    /* JADX WARN: Type inference failed for: r2v0, types: [dxzm] */
                    @Override // defpackage.dxzh
                    public final dxzf a(Object obj) {
                        dxxo dxxoVarA = dxxkVar2.a(obj);
                        dxzc dxzcVarA = null;
                        if (dxxoVarA != null && ((dxxm) dxxoVarA).a) {
                            if (dxzo.a == null) {
                                dxzo.a = new dxyi(new Object() { // from class: dxzm
                                }, null, dxzoVar.b.getString(R.string.og_google_one_account_a11y), 0);
                            }
                            dxyg dxygVar = new dxyg();
                            dxygVar.b = ejwi.j(dxzo.a);
                            dxzcVarA = dxygVar.a();
                        }
                        return new dxzf(dxzcVarA);
                    }
                };
                ecem.c();
                dxzu dxzuVar = accountParticleDisc.d;
                dxzuVar.c(dxzuVar.a, dxzuVar.c);
                dxzuVar.a = dxzhVar;
                dxzuVar.b(dxzhVar, dxzuVar.c);
            }
        });
        if (this.i) {
            this.g = new dyaa(this.a, this.c);
        }
        if (this.h) {
            this.f = new DrawableBadgeViewHolder(this.b, this.a);
        }
        u();
    }

    public final void j() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((dxye) it.next()).a();
        }
    }

    public final void k(dxye dxyeVar) {
        this.q.remove(dxyeVar);
    }

    public final void l(final Object obj) {
        dyrf.a(new Runnable() { // from class: dxyc
            /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r0 = r8.a
                    boolean r1 = r0.s()
                    java.lang.String r2 = "initialize must be called first"
                    defpackage.ejwl.m(r1, r2)
                    java.lang.Object r1 = r2
                    java.lang.Object r2 = r0.l
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L15
                    r5 = r3
                    goto L16
                L15:
                    r5 = r4
                L16:
                    if (r1 == 0) goto L2f
                    if (r2 != 0) goto L1c
                    r6 = r1
                    goto L30
                L1c:
                    dxxk r6 = r0.n
                    java.lang.String r6 = r6.b(r1)
                    dxxk r7 = r0.n
                    java.lang.String r2 = r7.b(r2)
                    boolean r2 = r6.equals(r2)
                    if (r2 != 0) goto L35
                    goto L32
                L2f:
                    r6 = 0
                L30:
                    if (r6 == r2) goto L35
                L32:
                    r0.m()
                L35:
                    r0.l = r1
                    dxzu r2 = r0.d
                    defpackage.ecem.c()
                    dxzh r6 = r2.b
                    java.lang.Object r7 = r2.c
                    r2.c(r6, r7)
                    dxzh r6 = r2.a
                    java.lang.Object r7 = r2.c
                    r2.c(r6, r7)
                    r2.c = r1
                    dxzh r6 = r2.b
                    r2.b(r6, r1)
                    dxzh r6 = r2.a
                    r2.b(r6, r1)
                    ejwi r2 = r0.d()
                    r0.o = r2
                    dyaa r2 = r0.g
                    if (r2 == 0) goto L65
                    ejwi r6 = r0.o
                    r2.b(r6)
                L65:
                    com.google.android.libraries.onegoogle.account.disc.AvatarView r2 = r0.a
                    defpackage.ecem.c()
                    r4 = r4 ^ r5
                    r2.g(r4)
                    dxyd r4 = new dxyd
                    r4.<init>()
                    r2.i = r4
                    int r1 = r2.d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    if (r1 == r2) goto L7e
                    r4.run()
                L7e:
                    r0.q()
                    com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder r1 = r0.f
                    if (r1 == 0) goto L8e
                    dxzf r2 = r0.m
                    dxyz r2 = com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.b(r2)
                    r1.a(r2, r3)
                L8e:
                    r0.j()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dxyc.run():void");
            }
        });
    }

    public final void m() {
        AvatarView avatarView = this.a;
        avatarView.setImageDrawable(avatarView.c);
        avatarView.g(true);
    }

    public final void n(final dxzh dxzhVar) {
        ejwl.m(this.h, "setDecorationRetriever is not allowed with false allowBadges.");
        this.k = dxzhVar;
        q();
        if (this.i) {
            dyrf.a(new Runnable() { // from class: dxxw
                @Override // java.lang.Runnable
                public final void run() {
                    ecem.c();
                    AccountParticleDisc accountParticleDisc = this.a;
                    dxzu dxzuVar = accountParticleDisc.d;
                    dxzuVar.c(dxzuVar.b, dxzuVar.c);
                    dxzh dxzhVar2 = dxzhVar;
                    dxzuVar.b = dxzhVar2;
                    dxzuVar.b(dxzhVar2, dxzuVar.c);
                    accountParticleDisc.r();
                }
            });
        }
        p();
        j();
    }

    public final void o(int i) {
        int dimension;
        ejwl.m(!s(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.v = ejwi.j(Integer.valueOf(i));
        if (this.h || this.i || this.p) {
            dimension = (int) getResources().getDimension(((float) i) > getResources().getDimension(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring) ? R.dimen.og_apd_min_padding_large_ring : R.dimen.og_apd_min_padding);
        } else {
            dimension = 0;
        }
        AvatarView avatarView = this.a;
        ViewGroup.LayoutParams layoutParams = avatarView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        int i2 = i - (dimension + dimension);
        avatarView.h = true;
        avatarView.i(i2);
        avatarView.e(i2);
    }

    public final void p() {
        dyrf.a(new Runnable() { // from class: dxxy
            @Override // java.lang.Runnable
            public final void run() {
                AccountParticleDisc accountParticleDisc = this.a;
                DrawableBadgeViewHolder drawableBadgeViewHolder = accountParticleDisc.f;
                if (drawableBadgeViewHolder != null) {
                    drawableBadgeViewHolder.a(AccountParticleDisc.b(accountParticleDisc.m), true);
                }
            }
        });
    }

    public final void q() {
        Object obj;
        dxzf dxzfVar = this.m;
        if (dxzfVar != null) {
            dxzfVar.b(this.r);
        }
        dxzh dxzhVar = this.k;
        dxzf dxzfVarA = null;
        if (dxzhVar != null && (obj = this.l) != null) {
            dxzfVarA = dxzhVar.a(obj);
        }
        this.m = dxzfVarA;
        if (dxzfVarA != null) {
            dxzfVarA.a(this.r);
        }
    }

    public final void r() {
        ecem.c();
        ejwi ejwiVarD = d();
        if (ejwiVarD.equals(this.o)) {
            return;
        }
        this.o = ejwiVarD;
        dyaa dyaaVar = this.g;
        if (dyaaVar != null) {
            ecem.c();
            dyaaVar.a(ejwiVarD, true);
        }
        j();
    }

    public final boolean s() {
        return this.j != null;
    }

    public final void t() {
        if (this.i) {
            return;
        }
        ejwl.m(!s(), "setAllowRings is only allowed before calling initialize.");
        this.i = true;
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new CopyOnWriteArrayList();
        this.r = new dxze() { // from class: dxya
            @Override // defpackage.dxze
            public final void a() {
                AccountParticleDisc accountParticleDisc = this.a;
                accountParticleDisc.p();
                accountParticleDisc.j();
            }
        };
        this.d = new dxzu(new dxze() { // from class: dxyb
            @Override // defpackage.dxze
            public final void a() {
                final AccountParticleDisc accountParticleDisc = this.a;
                dyrf.a(new Runnable() { // from class: dxxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        accountParticleDisc.r();
                    }
                });
            }
        });
        ejud ejudVar = ejud.a;
        this.v = ejudVar;
        this.o = ejudVar;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, (ViewGroup) this, true);
        AvatarView avatarView = (AvatarView) findViewById(R.id.og_apd_internal_image_view);
        this.a = avatarView;
        this.b = (BadgeFrameLayout) findViewById(R.id.badge_wrapper);
        this.c = (RingFrameLayout) findViewById(R.id.ring_wrapper);
        this.e = new dxzw(getResources());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dxzs.a, i, R.style.OneGoogle_AccountParticleDisc_DayNight);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
            dimensionPixelSize = dimensionPixelSize == Integer.MIN_VALUE ? typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Integer.MIN_VALUE) : dimensionPixelSize;
            this.p = typedArrayObtainStyledAttributes.getBoolean(0, true);
            this.i = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.s = typedArrayObtainStyledAttributes.getBoolean(3, false);
            this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
            Paint paint = avatarView.b;
            Resources resources = avatarView.getResources();
            int i2 = R.color.google_grey100;
            paint.setColor(resources.getColor(z ? R.color.google_grey900 : R.color.google_grey100));
            avatarView.b.setAlpha(30);
            Drawable drawable = avatarView.c;
            dyqw.c(drawable, avatarView.getResources().getColor(true != z ? R.color.google_grey800 : i2));
            avatarView.c = drawable;
            avatarView.a.setColor(avatarView.getResources().getColor(true != z ? R.color.og_elevation_dark_5 : R.color.google_white));
            typedArrayObtainStyledAttributes.recycle();
            m();
            if (dimensionPixelSize != Integer.MIN_VALUE) {
                o(dimensionPixelSize);
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
