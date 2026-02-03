package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import defpackage.kxj;
import defpackage.qnh;
import defpackage.qni;
import defpackage.qnk;
import defpackage.qnl;
import defpackage.qnm;
import defpackage.qnu;
import defpackage.qof;
import defpackage.qoh;
import defpackage.qoj;
import defpackage.qok;
import defpackage.qoo;
import defpackage.qor;
import defpackage.qos;
import defpackage.qot;
import defpackage.qsn;
import defpackage.qst;
import defpackage.qwz;
import defpackage.qxc;
import defpackage.qxe;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final qoh a = new qoh() { // from class: qnf
        @Override // defpackage.qoh
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            qoh qohVar = LottieAnimationView.a;
            ThreadLocal threadLocal = qwz.a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            qws.b("Unable to load composition.", th);
        }
    };
    public int b;
    public final qof c;
    public boolean d;
    private final qoh e;
    private final qoh f;
    private String g;
    private int h;
    private boolean i;
    private boolean j;
    private final Set k;
    private final Set l;
    private qoo m;

    public LottieAnimationView(Context context) {
        super(context);
        this.e = new qoh() { // from class: qnd
            @Override // defpackage.qoh
            public final void a(Object obj) {
                this.a.h((qnm) obj);
            }
        };
        this.f = new qnh(this);
        this.b = 0;
        this.c = new qof();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        q(null, R.attr.lottieAnimationViewStyle);
    }

    private final void p() {
        qoo qooVar = this.m;
        if (qooVar != null) {
            qooVar.g(this.e);
            this.m.f(this.f);
        }
    }

    private final void q(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qor.a, i, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(12);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(7);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(17);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                f(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(7);
            if (string2 != null) {
                g(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(17)) != null) {
            r(this.d ? qnu.l(getContext(), string, "url_".concat(string)) : qnu.l(getContext(), string, null));
        }
        this.b = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.j = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(10, false)) {
            this.c.t(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            m(typedArrayObtainStyledAttributes.getInt(15, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            l(typedArrayObtainStyledAttributes.getInt(14, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            n(typedArrayObtainStyledAttributes.getFloat(16, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.c.n(typedArrayObtainStyledAttributes.getBoolean(2, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            String string3 = typedArrayObtainStyledAttributes.getString(4);
            qof qofVar = this.c;
            qofVar.h = string3;
            qsn qsnVarF = qofVar.f();
            if (qsnVarF != null) {
                qsnVarF.e = string3;
            }
        }
        i(typedArrayObtainStyledAttributes.getString(9));
        k(typedArrayObtainStyledAttributes.getFloat(11, 0.0f), typedArrayObtainStyledAttributes.hasValue(11));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(5, false);
        qof qofVar2 = this.c;
        qofVar2.i(z);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            qofVar2.g(new qst("**"), qok.K, new qxc(new qot(kxj.d(getContext(), typedArrayObtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(13, 0);
            qos.a();
            if (i2 >= 3) {
                i2 = 0;
            }
            qofVar2.w(qos.a()[i2]);
        }
        qofVar2.d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            qofVar2.b.l = typedArrayObtainStyledAttributes.getBoolean(18, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        boolean z2 = qwz.b(getContext()) != 0.0f;
        Boolean.valueOf(z2).getClass();
        qofVar2.c = z2;
    }

    private final void r(qoo qooVar) {
        this.k.add(qnl.SET_ANIMATION);
        this.c.h();
        p();
        qooVar.e(this.e);
        qooVar.d(this.f);
        this.m = qooVar;
    }

    public final float a() {
        return this.c.c();
    }

    public final void b(qst qstVar, Object obj, qxe qxeVar) {
        this.c.g(qstVar, obj, new qni(qxeVar));
    }

    public final void c() {
        this.k.add(qnl.PLAY_OPTION);
        qof qofVar = this.c;
        qofVar.e.clear();
        qofVar.b.cancel();
        if (qofVar.isVisible()) {
            return;
        }
        qofVar.n = 1;
    }

    public final void d() {
        this.k.add(qnl.PLAY_OPTION);
        this.c.k();
    }

    public final void e() {
        this.k.add(qnl.PLAY_OPTION);
        this.c.m();
    }

    public final void f(final int i) {
        this.h = i;
        this.g = null;
        r(isInEditMode() ? new qoo(new Callable() { // from class: qng
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i;
                LottieAnimationView lottieAnimationView = this.a;
                if (!lottieAnimationView.d) {
                    return qnu.e(lottieAnimationView.getContext(), i2, null);
                }
                Context context = lottieAnimationView.getContext();
                return qnu.e(context, i2, qnu.m(context, i2));
            }
        }, true) : this.d ? qnu.j(getContext(), i) : qnu.k(getContext(), i, null));
    }

    public final void g(final String str) {
        this.g = str;
        this.h = 0;
        r(isInEditMode() ? new qoo(new Callable() { // from class: qne
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                LottieAnimationView lottieAnimationView = this.a;
                return lottieAnimationView.d ? qnu.a(lottieAnimationView.getContext(), str2) : qnu.b(lottieAnimationView.getContext(), str2, null);
            }
        }, true) : this.d ? qnu.h(getContext(), str) : qnu.i(getContext(), str, null));
    }

    public final void h(qnm qnmVar) {
        qof qofVar = this.c;
        qofVar.setCallback(this);
        this.i = true;
        boolean zV = qofVar.v(qnmVar);
        this.i = false;
        if (getDrawable() == qofVar) {
            if (!zV) {
                return;
            }
        } else if (!zV) {
            boolean zO = o();
            setImageDrawable(null);
            setImageDrawable(qofVar);
            if (zO) {
                qofVar.m();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((qoj) it.next()).a();
        }
    }

    public final void i(String str) {
        this.c.g = str;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof qof) && ((qof) drawable).l) {
            this.c.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        qof qofVar = this.c;
        if (drawable2 == qofVar) {
            super.invalidateDrawable(qofVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(float f) {
        this.c.r(f);
    }

    public final void k(float f, boolean z) {
        if (z) {
            this.k.add(qnl.SET_PROGRESS);
        }
        this.c.s(f);
    }

    public final void l(int i) {
        this.k.add(qnl.SET_REPEAT_COUNT);
        this.c.t(i);
    }

    public final void m(int i) {
        this.k.add(qnl.SET_REPEAT_MODE);
        this.c.b.setRepeatMode(i);
    }

    public final void n(float f) {
        this.c.b.c = f;
    }

    public final boolean o() {
        return this.c.u();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.j) {
            return;
        }
        this.c.k();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof qnk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qnk qnkVar = (qnk) parcelable;
        super.onRestoreInstanceState(qnkVar.getSuperState());
        this.g = qnkVar.a;
        Set set = this.k;
        qnl qnlVar = qnl.SET_ANIMATION;
        if (!set.contains(qnlVar) && !TextUtils.isEmpty(this.g)) {
            g(this.g);
        }
        this.h = qnkVar.b;
        if (!set.contains(qnlVar) && (i = this.h) != 0) {
            f(i);
        }
        if (!set.contains(qnl.SET_PROGRESS)) {
            k(qnkVar.c, false);
        }
        if (!set.contains(qnl.PLAY_OPTION) && qnkVar.d) {
            d();
        }
        if (!set.contains(qnl.SET_IMAGE_ASSETS)) {
            i(qnkVar.e);
        }
        if (!set.contains(qnl.SET_REPEAT_MODE)) {
            m(qnkVar.f);
        }
        if (set.contains(qnl.SET_REPEAT_COUNT)) {
            return;
        }
        l(qnkVar.g);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        qnk qnkVar = new qnk(super.onSaveInstanceState());
        qnkVar.a = this.g;
        qnkVar.b = this.h;
        qof qofVar = this.c;
        qnkVar.c = qofVar.c();
        if (qofVar.isVisible()) {
            z = qofVar.b.k;
        } else {
            int i = qofVar.n;
            z = i == 2 || i == 3;
        }
        qnkVar.d = z;
        qnkVar.e = qofVar.g;
        qnkVar.f = qofVar.b.getRepeatMode();
        qnkVar.g = qofVar.e();
        return qnkVar;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        p();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        p();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        p();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        qof qofVar;
        if (!this.i && drawable == (qofVar = this.c) && qofVar.u()) {
            this.j = false;
            qofVar.j();
        } else if (!this.i && (drawable instanceof qof)) {
            qof qofVar2 = (qof) drawable;
            if (qofVar2.u()) {
                qofVar2.j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new qoh() { // from class: qnd
            @Override // defpackage.qoh
            public final void a(Object obj) {
                this.a.h((qnm) obj);
            }
        };
        this.f = new qnh(this);
        this.b = 0;
        this.c = new qof();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        q(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new qoh() { // from class: qnd
            @Override // defpackage.qoh
            public final void a(Object obj) {
                this.a.h((qnm) obj);
            }
        };
        this.f = new qnh(this);
        this.b = 0;
        this.c = new qof();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new HashSet();
        this.l = new HashSet();
        q(attributeSet, i);
    }
}
