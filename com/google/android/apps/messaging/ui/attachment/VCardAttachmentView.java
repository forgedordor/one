package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import defpackage.alrj;
import defpackage.aluy;
import defpackage.alvx;
import defpackage.aqbd;
import defpackage.avbr;
import defpackage.babu;
import defpackage.baby;
import defpackage.bajq;
import defpackage.bajr;
import defpackage.cczv;
import defpackage.cpbh;
import defpackage.cqaz;
import defpackage.cssf;
import defpackage.cvid;
import defpackage.cvif;
import defpackage.cvik;
import defpackage.cvil;
import defpackage.fcsu;
import defpackage.kxj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VCardAttachmentView extends cvid implements View.OnLayoutChangeListener, bajq {
    public avbr a;
    public cssf b;
    public fcsu c;
    public final baby d;
    public cpbh e;
    private final cpbh f;
    private final boolean g;
    private TextView h;
    private TextView i;
    private ContactIconView j;
    private ImageView k;
    private cvil l;

    public VCardAttachmentView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f = new cvik(this);
        this.d = new baby();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvif.b);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.g = z;
        ColorStateList colorStateListD = kxj.d(context, R.color.message_image_selected_tint_selector);
        colorStateListD.getClass();
        colorStateListD.getDefaultColor();
        context.getColor(R.color.attachment_vcard_preview_name_text_m2);
        context.getColor(R.color.attachment_vcard_preview_details_text_m2);
        LayoutInflater.from(getContext()).inflate(true != z ? R.layout.vcard_attachment_view_m2 : R.layout.vcard_conversation_attachment_view_m2_consistent, (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final String h() {
        int measuredWidth = this.h.getMeasuredWidth();
        String strM = ((bajr) this.d.a()).m();
        if (measuredWidth == 0 || TextUtils.isEmpty(strM) || !strM.contains(",")) {
            return cssf.c(strM);
        }
        cssf cssfVar = this.b;
        TextPaint paint = this.h.getPaint();
        getContext().getString(R.string.plus_n);
        return cssfVar.f(strM, paint, measuredWidth, R.plurals.plus_n_plural);
    }

    private final void i() {
        String strH = h();
        if (TextUtils.isEmpty(strH)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.setText(strH);
        }
    }

    @Override // defpackage.bajq
    public final void a(bajr bajrVar) {
        this.d.e(bajrVar);
        g();
    }

    @Override // defpackage.bajq
    public final void b(bajr bajrVar) {
        this.d.e(bajrVar);
        g();
    }

    public final void e(bajr bajrVar) {
        baby babyVar = this.d;
        if (babyVar.g()) {
            if (((bajr) babyVar.a()).equals(bajrVar)) {
                return;
            } else {
                babyVar.f();
            }
        }
        if (bajrVar != null) {
            babyVar.c(bajrVar);
            ((bajr) babyVar.a()).c = this;
            this.h.setContentDescription(h());
        }
        g();
    }

    public final void f(cpbh cpbhVar) {
        this.e = cpbhVar;
        if (cpbhVar == null) {
            return;
        }
        setOnClickListener(new View.OnClickListener() { // from class: cvih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VCardAttachmentView vCardAttachmentView = this.a;
                if (vCardAttachmentView.e != null) {
                    baby babyVar = vCardAttachmentView.d;
                    if (babyVar.g()) {
                        vCardAttachmentView.e.c((bajr) babyVar.a());
                    }
                }
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: cvii
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                VCardAttachmentView vCardAttachmentView = this.a;
                if (vCardAttachmentView.e == null) {
                    return false;
                }
                baby babyVar = vCardAttachmentView.d;
                if (!babyVar.g()) {
                    return false;
                }
                cpbh cpbhVar2 = vCardAttachmentView.e;
                cpbhVar2.d();
                return false;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [alqm, java.lang.Object] */
    protected final void g() {
        baby babyVar = this.d;
        String strP = null;
        if (!babyVar.g()) {
            this.h.setText("");
            this.i.setText("");
            this.j.g(null);
            if (this.k != null) {
                cvil cvilVar = this.l;
                cqaz.g();
                boolean z = cvilVar.a;
                this.k.setVisibility(4);
            }
            return;
        }
        i();
        String strL = ((bajr) babyVar.a()).l();
        if (TextUtils.isEmpty(strL)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            cczv cczvVar = alvx.a;
            boolean zA = aqbd.a();
            String string = ((alrj) this.c.b()).i(((alrj) this.c.b()).n(strL), !zA).G(zA).toString();
            this.i.setText(cssf.c(string));
            this.i.setContentDescription(string);
        }
        ContactIconView contactIconView = this.j;
        Uri uriD = ((bajr) babyVar.a()).d();
        long jA = ((bajr) babyVar.a()).a();
        String strN = ((bajr) babyVar.a()).n();
        long jB = ((bajr) babyVar.a()).b();
        if (((bajr) babyVar.a()).e().isPresent()) {
            ?? r1 = ((bajr) babyVar.a()).e().get();
            cczv cczvVar2 = alvx.a;
            strP = r1.p(((Boolean) new aluy().get()).booleanValue());
        }
        contactIconView.i(uriD, jA, strN, jB, strP);
        contactIconView.setClickable(false);
        ((bajr) babyVar.a()).k().isPresent();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        baby babyVar = this.d;
        babu babuVar = babyVar.a;
        if (babuVar != null) {
            cqaz.f(babyVar.g());
            babyVar.c(babuVar);
            babyVar.a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        baby babyVar = this.d;
        if (babyVar.g()) {
            cqaz.i(babyVar.a);
            cqaz.k(babyVar.g());
            babyVar.a = babyVar.a();
            babyVar.f();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.h = (TextView) findViewById(R.id.name);
        this.i = (TextView) findViewById(R.id.details);
        this.j = (ContactIconView) findViewById(R.id.contact_icon);
        findViewById(R.id.details_container);
        this.h.addOnLayoutChangeListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.add_a_photo);
        this.k = imageView;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: cvij
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VCardAttachmentView vCardAttachmentView = this.a;
                    baby babyVar = vCardAttachmentView.d;
                    Uri lookupUri = null;
                    if (babyVar.g()) {
                        bajr bajrVar = (bajr) babyVar.a();
                        cqaz.l(bajrVar);
                        String strN = bajrVar.n();
                        if (strN != null) {
                            lookupUri = ContactsContract.Contacts.getLookupUri(bajrVar.a(), strN);
                        }
                    }
                    if (lookupUri != null) {
                        vCardAttachmentView.a.h(vCardAttachmentView.getContext(), lookupUri);
                    }
                }
            });
            this.l = new cvil(this.k);
        }
        f(this.f);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.d.g() && view == this.h) {
            i();
        }
    }
}
