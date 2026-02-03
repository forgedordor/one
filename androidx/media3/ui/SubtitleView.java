package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.ejwm;
import defpackage.mdt;
import defpackage.mdu;
import defpackage.mee;
import defpackage.ofe;
import defpackage.off;
import defpackage.ohk;
import defpackage.ohl;
import defpackage.oho;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    private List a;
    private off b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;
    private ohl g;
    private View h;

    public SubtitleView(Context context) {
        this(context, null);
    }

    private final void d() {
        List arrayList;
        ohl ohlVar = this.g;
        if (this.e && this.f) {
            arrayList = this.a;
        } else {
            arrayList = new ArrayList(this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                mdt mdtVar = new mdt((mdu) this.a.get(i));
                if (!this.e) {
                    mdtVar.b();
                    CharSequence charSequence = mdtVar.a;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            mdtVar.a = SpannableString.valueOf(charSequence);
                        }
                        CharSequence charSequence2 = mdtVar.a;
                        mee.f(charSequence2);
                        oho.c((Spannable) charSequence2, new ejwm() { // from class: ohm
                            @Override // defpackage.ejwm
                            public final boolean a(Object obj) {
                                return !(obj instanceof mdz);
                            }
                        });
                    }
                    oho.b(mdtVar);
                } else if (!this.f) {
                    oho.b(mdtVar);
                }
                arrayList.add(mdtVar.a());
            }
        }
        off offVar = this.b;
        float f = this.c;
        float f2 = this.d;
        ofe ofeVar = (ofe) ohlVar;
        ofeVar.b = arrayList;
        ofeVar.d = offVar;
        ofeVar.c = f;
        ofeVar.e = f2;
        while (true) {
            List list = ofeVar.a;
            if (list.size() >= arrayList.size()) {
                ofeVar.invalidate();
                return;
            }
            list.add(new ohk(ofeVar.getContext()));
        }
    }

    public final void a(List list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        d();
    }

    public final void b() {
        CaptioningManager captioningManager;
        off offVar;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            offVar = off.a;
        } else {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            offVar = new off(userStyle.hasForegroundColor() ? userStyle.foregroundColor : off.a.b, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : off.a.c, userStyle.hasWindowColor() ? userStyle.windowColor : off.a.d, userStyle.hasEdgeType() ? userStyle.edgeType : off.a.e, userStyle.hasEdgeColor() ? userStyle.edgeColor : off.a.f, userStyle.getTypeface());
        }
        this.b = offVar;
        d();
    }

    public final void c() {
        CaptioningManager captioningManager;
        float fontScale = 1.0f;
        if (!isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            fontScale = captioningManager.getFontScale();
        }
        this.c = fontScale * 0.0533f;
        d();
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = off.a;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        ofe ofeVar = new ofe(context);
        this.g = ofeVar;
        this.h = ofeVar;
        addView(ofeVar);
    }
}
