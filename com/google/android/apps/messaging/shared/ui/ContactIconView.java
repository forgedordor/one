package com.google.android.apps.messaging.shared.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.bxfq;
import defpackage.bxhb;
import defpackage.cpap;
import defpackage.cpas;
import defpackage.cpat;
import defpackage.cpau;
import defpackage.cpbn;
import defpackage.cpbr;
import defpackage.cqaz;
import defpackage.ekrg;
import defpackage.elrk;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class ContactIconView extends cpas {
    public static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/ui/ContactIconView");
    private final int D;
    protected final int i;
    public long j;
    public String k;
    public long l;
    public String m;
    public boolean n;
    public final boolean o;
    public cpap p;
    public elrk q;
    public Optional r;
    public cpbn s;
    public cpat t;
    public fcsu u;

    public ContactIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = elrk.UNKNOWN_BIZINFO_EVENT_SOURCE;
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpau.b);
        int i = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (i == 0) {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_normal_size);
        } else if (i == 1) {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_large_size);
        } else if (i == 2) {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_small_size);
        } else if (i != 3) {
            this.i = 0;
            cqaz.c("Unsupported ContactIconView icon size attribute");
        } else {
            this.i = (int) resources.getDimension(R.dimen.contact_icon_view_xlarge_size);
        }
        this.D = resources.getColor(R.color.contact_avatar_pressed_color);
        this.n = true;
        this.o = true;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g(Uri uri) {
        j(uri, -1L, null, -1L, null);
    }

    public final void h() {
        this.r.ifPresent(new Consumer() { // from class: cpam
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                avbr avbrVar = (avbr) obj;
                ContactIconView contactIconView = this.a;
                String str = contactIconView.m;
                avbrVar.f(contactIconView, contactIconView.j, contactIconView.k, contactIconView.l, str != null ? ((alrj) contactIconView.u.b()).n(str) : null, 6);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void i(Uri uri, long j, String str, long j2, String str2) {
        j(uri, j, str, j2, str2);
    }

    public final void j(Uri uri, long j, String str, long j2, String str2) {
        if (uri == null) {
            d(null);
        } else {
            String strT = cpbr.t(uri);
            boolean z = !"g".equals(strT);
            if ("s".equals(strT)) {
                cpbn cpbnVar = this.s;
                int i = this.i;
                d(new bxfq(cpbnVar, uri, i, i, true, null));
            } else {
                int i2 = this.i;
                d(new bxhb(uri, i2, i2, true, z, 0));
            }
        }
        this.j = j;
        this.k = str;
        this.l = j2;
        this.m = str2;
        if (this.n) {
            if ((j <= -1 || TextUtils.isEmpty(str)) && TextUtils.isEmpty(this.m)) {
                setOnClickListener(null);
            } else {
                setOnClickListener(new View.OnClickListener() { // from class: cpal
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ContactIconView contactIconView = this.a;
                        String str3 = contactIconView.m;
                        if (str3 == null) {
                            contactIconView.h();
                            return;
                        }
                        cpat cpatVar = contactIconView.t;
                        elrk elrkVar = contactIconView.q;
                        ajhd ajhdVar = (ajhd) cpatVar.a.b();
                        ajhdVar.getClass();
                        fcsu fcsuVar = cpatVar.b;
                        fcsu fcsuVar2 = cpatVar.c;
                        fcsu fcsuVar3 = cpatVar.d;
                        Optional optional = (Optional) cpatVar.e.b();
                        optional.getClass();
                        elrkVar.getClass();
                        contactIconView.p = new cpap(ajhdVar, fcsuVar, fcsuVar2, fcsuVar3, optional, str3, contactIconView, elrkVar);
                        contactIconView.p.e(new Void[0]);
                    }
                });
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.ui.AsyncImageView, android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cpap cpapVar = this.p;
        if (cpapVar != null) {
            cpapVar.cancel(true);
            this.p.b = null;
            this.p = null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o) {
            return false;
        }
        if (this.n && isClickable()) {
            if (motionEvent.getActionMasked() == 0) {
                setColorFilter(this.D);
            } else {
                clearColorFilter();
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
