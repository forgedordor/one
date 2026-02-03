package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import defpackage.dxzr;
import defpackage.dyca;
import defpackage.dydh;
import defpackage.dyqw;
import defpackage.dzdf;
import defpackage.dzdh;
import defpackage.ejwl;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SelectedAccountDisc<T> extends FrameLayout implements dzdh, dzdf {
    public final Rect a;
    public final ImageView b;
    public final AccountParticleDisc c;
    public View.OnClickListener d;
    public View.OnTouchListener e;
    public View.OnTouchListener f;
    public dydh g;
    public dxzr h;
    public WeakReference i;
    private final Rect j;
    private final int[] k;

    public SelectedAccountDisc(Context context) {
        this(context, null);
    }

    public final int a() {
        ImageView imageView = this.b;
        if (imageView.getVisibility() == 0) {
            return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        }
        AccountParticleDisc accountParticleDisc = this.c;
        return accountParticleDisc.o.g() ? accountParticleDisc.e.b(accountParticleDisc.a()) : accountParticleDisc.a();
    }

    @Override // defpackage.dzdh
    public final Rect b() {
        AccountParticleDisc accountParticleDisc = this.c;
        int[] iArr = this.k;
        accountParticleDisc.getLocationInWindow(iArr);
        float width = accountParticleDisc.getWidth();
        float f = iArr[0];
        float height = (accountParticleDisc.getHeight() * 0.5f) + iArr[1];
        float f2 = (width * 0.5f) + f;
        float fA = a() * 0.5f;
        float f3 = height + fA;
        float f4 = f2 + fA;
        float f5 = height - fA;
        float f6 = f2 - fA;
        Rect rect = this.j;
        rect.set(Math.round(f6), Math.round(f5), Math.round(f4), Math.round(f3));
        return rect;
    }

    public final void c(int i) {
        AccountParticleDisc accountParticleDisc = this.c;
        ejwl.m(!accountParticleDisc.s(), "setMaxDiscContentSize is only allowed before calling initialize.");
        accountParticleDisc.o(i);
    }

    @Override // android.view.View
    public final void setOnClickListener(final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: dycf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectedAccountDisc selectedAccountDisc = this.a;
                View.OnClickListener onClickListener2 = selectedAccountDisc.d;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
                dydh dydhVar = selectedAccountDisc.g;
                if (dydhVar != null) {
                    ((dydm) dydhVar).k.f(new dsve(5), view);
                }
                dxzr dxzrVar = selectedAccountDisc.h;
                if (dxzrVar != null) {
                    ekgb ekgbVar = dxzrVar.a;
                    int i = ((ekoe) ekgbVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                    }
                }
                View.OnClickListener onClickListener3 = onClickListener;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(view);
                }
            }
        });
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.e = onTouchListener;
    }

    public void setScale(float f) {
        AvatarView avatarView = this.c.a;
        AvatarView.b(f, avatarView.e);
        avatarView.f = f;
        avatarView.j();
        avatarView.invalidate();
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new Rect();
        this.k = new int[2];
        this.a = new Rect();
        this.i = new WeakReference(null);
        LayoutInflater.from(context).inflate(R.layout.selected_account_disc, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.og_selected_account_disc_apd);
        this.c = accountParticleDisc;
        ImageView imageView = (ImageView) findViewById(R.id.incognito_on_image_view);
        this.b = imageView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dyca.a, i, 0);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize != -1) {
                c(dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes.recycle();
            int iB = dyqw.b(context);
            if (iB != 0) {
                accountParticleDisc.setBackgroundResource(iB);
                imageView.setBackgroundResource(iB);
            }
            super.setOnTouchListener(new View.OnTouchListener() { // from class: dycb
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    SelectedAccountDisc selectedAccountDisc = this.a;
                    View.OnTouchListener onTouchListener = selectedAccountDisc.e;
                    boolean z = onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
                    View.OnTouchListener onTouchListener2 = selectedAccountDisc.f;
                    boolean z2 = onTouchListener2 != null && onTouchListener2.onTouch(view, motionEvent);
                    if (selectedAccountDisc.f == null || !z) {
                        return z2 || z;
                    }
                    throw new RuntimeException("customOnTouchListener may not consume the event");
                }
            });
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
