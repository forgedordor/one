package com.google.android.apps.messaging.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.aipo;
import defpackage.bacr;
import defpackage.bacs;
import defpackage.cqaz;
import defpackage.cvjs;
import defpackage.dabl;
import defpackage.dabm;
import defpackage.dadi;
import defpackage.dadm;
import defpackage.einf;
import defpackage.einm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ContactListItemView extends cvjs implements View.OnClickListener {
    public bacr a;
    public TextView b;
    public TextView c;
    public TextView d;
    public ContactIconView e;
    public ImageView f;
    public ProgressBar g;
    public ImageView h;
    public aipo i;
    public bacs j;
    public einm k;
    public fcsu l;
    public dadi m;

    /* compiled from: PG */
    public static class ContactItemViewRow extends ContactListItemView {
        public ContactItemViewRow(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        protected final boolean a() {
            return true;
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: PG */
    public static class ContactItemViewTop extends ContactListItemView {
        public ContactItemViewTop(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        protected final boolean a() {
            return false;
        }

        @Override // com.google.android.apps.messaging.ui.contact.ContactListItemView
        public final boolean b() {
            return false;
        }
    }

    public ContactListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected abstract boolean a();

    public abstract boolean b();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cqaz.k(view == this);
        cqaz.k(this.m != null);
        dadi dadiVar = this.m;
        fcsu fcsuVar = dadiVar.a;
        bacr bacrVar = this.a;
        ((dabm) fcsuVar.b()).e(6);
        ((dabl) dadiVar.b.b()).f(6, 7);
        einf.g(new dadm(bacrVar), this);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.j.a();
        this.b = (TextView) findViewById(R.id.contact_name);
        this.c = (TextView) findViewById(R.id.contact_details);
        this.d = (TextView) findViewById(R.id.contact_detail_type);
        this.e = (ContactIconView) findViewById(R.id.contact_icon);
        this.f = (ImageView) findViewById(R.id.contact_checkmark);
        this.g = (ProgressBar) findViewById(R.id.contact_pending);
        ContactIconView contactIconView = this.e;
        contactIconView.n = a();
        contactIconView.setOnClickListener(null);
        contactIconView.setClickable(false);
        this.h = (ImageView) findViewById(R.id.work_profile_icon);
    }
}
