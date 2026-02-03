package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.cuvd;
import defpackage.cuvg;
import defpackage.cuvi;
import defpackage.cvca;
import defpackage.eeji;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehod;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsMultiSimStatusCheckboxView extends cvca implements ehlg<cuvg> {
    public cuvg a;
    private Context f;

    @Deprecated
    public RcsMultiSimStatusCheckboxView(Context context) {
        super(context);
        g();
    }

    private final void g() {
        if (this.a == null) {
            try {
                cuvi cuviVar = (cuvi) bb();
                cuvd cuvdVar = new cuvd(this);
                ehod.c(cuvdVar);
                try {
                    cuvg cuvgVarK = cuviVar.K();
                    this.a = cuvgVarK;
                    if (cuvgVarK == null) {
                        ehod.b(cuvdVar);
                    }
                    this.a.d = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof eyhx) && !(context instanceof eyhq.a) && !(context instanceof ehnz)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ehnq)) {
                        throw new IllegalStateException(a.O(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        ehod.b(cuvdVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cuvg.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cuvg H() {
        cuvg cuvgVar = this.a;
        if (cuvgVar != null) {
            return cuvgVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.eegq, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.f;
            if (context == null) {
                this.f = contextA;
                return;
            }
            boolean z = true;
            if (context != contextA && !ehoh.b(context)) {
                z = false;
            }
            ejwl.m(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final boolean performClick() {
        g();
        final cuvg cuvgVar = this.a;
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = cuvgVar.c;
        if (rcsMultiSimStatusCheckboxView.isChecked()) {
            Context context = cuvgVar.a;
            eeji eejiVar = new eeji(context);
            eejiVar.v(context.getString(R.string.disable_rcs_warning_title_v2));
            eejiVar.l(cuvgVar.b.length() == 0 ? context.getString(R.string.disable_rcs_warning_text_sim_level) : context.getString(R.string.disable_rcs_warning_text_sim_level_phone_number, cuvgVar.b));
            eejiVar.s(context.getString(R.string.disable_rcs_warning_accept_text), new DialogInterface.OnClickListener() { // from class: cuve
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cuvgVar.c.f(0);
                }
            });
            eejiVar.n(context.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: cuvf
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            eejiVar.create().show();
        } else {
            rcsMultiSimStatusCheckboxView.f(1);
        }
        return true;
    }

    public RcsMultiSimStatusCheckboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RcsMultiSimStatusCheckboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RcsMultiSimStatusCheckboxView(ehmt ehmtVar) {
        super(ehmtVar);
        g();
    }
}
