package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.PhoneNumberPreference;
import defpackage.alqm;
import defpackage.alrj;
import defpackage.cuti;
import defpackage.cvcs;
import defpackage.eebt;
import defpackage.eehg;
import defpackage.eeji;
import defpackage.ehli;
import defpackage.eigf;
import defpackage.eigp;
import defpackage.ejwk;
import defpackage.fcsu;
import defpackage.lbo;
import defpackage.lbu;
import defpackage.pab;
import defpackage.qx;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneNumberPreference extends Preference {
    private final String F;
    public final fcsu a;
    public cvcs b;
    public String c;
    public Optional d;
    public alqm e;
    public boolean f;
    public boolean g;
    public cuti h;
    private final fcsu i;

    /* compiled from: PG */
    public interface a {
        alrj an();

        eigp ez();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [alrj, java.lang.Object] */
    public PhoneNumberPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = Optional.empty();
        this.c = "";
        String string = context.getString(R.string.unknown_phone_number_pref_display_value);
        this.F = string;
        final a aVar = (a) ehli.a(context, a.class);
        aVar.getClass();
        fcsu fcsuVar = new fcsu() { // from class: cuuw
            @Override // defpackage.fcsu
            public final Object b() {
                return aVar.an();
            }
        };
        this.a = fcsuVar;
        this.i = new fcsu() { // from class: cuux
            @Override // defpackage.fcsu
            public final Object b() {
                return aVar.ez();
            }
        };
        this.e = fcsuVar.b().n(string);
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) {
        super.a(pabVar);
        TextView textView = (TextView) pabVar.C(android.R.id.title);
        if (textView != null) {
            textView.setSingleLine(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [alqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [alqm, java.lang.Object] */
    public final void ab() {
        Optional optionalK = k();
        if (optionalK.isEmpty() || TextUtils.isEmpty(optionalK.get().n())) {
            optionalK = this.d;
        }
        alqm alqmVar = this.e;
        alqm alqmVar2 = alqmVar;
        if (optionalK.isPresent()) {
            alqmVar2 = alqmVar;
            if (!TextUtils.isEmpty(optionalK.get().n())) {
                alqmVar2 = optionalK.get();
            }
        }
        String strB = ejwk.b(alqmVar2.n());
        if (this.f) {
            strB = alqmVar2.F().toString();
        }
        n(lbo.a().c(strB, lbu.a));
    }

    @Override // androidx.preference.Preference
    protected final void c() throws Resources.NotFoundException {
        Context context = this.j;
        final qx qxVar = new qx(context);
        qxVar.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.phone_number_preference_edit_text_size));
        CharSequence charSequenceM = m();
        if (charSequenceM != null && !this.F.contentEquals(charSequenceM)) {
            qxVar.setText(charSequenceM);
        }
        qxVar.setHint(this.F);
        qxVar.setInputType(3);
        qxVar.setTextAlignment(5);
        qxVar.setPadding(0, qxVar.getPaddingTop(), 0, qxVar.getPaddingBottom());
        qxVar.setTextColor(eehg.b(qxVar, R.attr.colorOnSurface));
        qxVar.setSelectAllOnFocus(true);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        qxVar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        eebt.c(qxVar);
        eeji eejiVar = new eeji(context);
        eejiVar.v(this.q);
        eejiVar.m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: cuut
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cuti cutiVar = this.a.h;
                if (cutiVar != null) {
                    cutiVar.a.I.c("Bugle.Preference.Smsc.Editor.Closed.Cancel");
                }
            }
        });
        eejiVar.r(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: cuuu
            /* JADX WARN: Type inference failed for: r0v1, types: [alrj, java.lang.Object] */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Editable text = qxVar.getText();
                if (text == null) {
                    return;
                }
                PhoneNumberPreference phoneNumberPreference = this.a;
                phoneNumberPreference.l(phoneNumberPreference.a.b().n(text.toString()));
            }
        });
        if (this.g) {
            eejiVar.o(new eigf((eigp) this.i.b(), "com/google/android/apps/messaging/ui/appsettings/PhoneNumberPreference", "setClearButton", 344, "PhoneNumberPreference::dialog::neutralButtonClicked", new DialogInterface.OnClickListener() { // from class: cuuv
                /* JADX WARN: Type inference failed for: r3v3, types: [alrj, java.lang.Object] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PhoneNumberPreference phoneNumberPreference = this.a;
                    phoneNumberPreference.d = Optional.empty();
                    phoneNumberPreference.l(phoneNumberPreference.a.b().n(""));
                }
            }));
        }
        if (!TextUtils.isEmpty(this.c)) {
            eejiVar.l(this.c);
        }
        eejiVar.w(qxVar);
        eejiVar.create().show();
    }

    public final Optional k() {
        if (this.b == null) {
            this.b = cvcs.a(this.d);
        }
        return this.b.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alrj, java.lang.Object] */
    public final void l(alqm alqmVar) {
        alqm alqmVar2;
        final ?? B = this.a.b();
        if (this.f) {
            alqmVar = B.k(alqmVar);
            Optional optional = this.d;
            B.getClass();
            alqmVar2 = (alqm) optional.map(new Function() { // from class: cuus
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return B.k((alqm) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(this.e);
        } else {
            alqmVar2 = (alqm) this.d.orElse(this.e);
        }
        this.b.b(alqmVar.equals(alqmVar2) ? Optional.empty() : Optional.of(alqmVar));
        ab();
    }

    public final void o(alqm alqmVar) {
        this.d = Optional.of(alqmVar);
    }
}
