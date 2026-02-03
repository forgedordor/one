package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dahz implements adaq {
    private final acyh a;
    private final fcsu b;
    private String c;
    private String d;
    private String e;

    public dahz(acyh acyhVar, fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = acyhVar;
        this.b = fcsuVar;
        this.c = "";
        this.d = "";
        this.e = "";
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        adaoVar.getClass();
        this.a.b(adaoVar, z);
        String strM = adaoVar.M();
        if (strM == null) {
            strM = "";
        }
        this.d = strM;
        String strL = adaoVar.L();
        if (strL == null) {
            strL = "";
        }
        this.e = strL;
        String strJ = adaoVar.J();
        this.c = strJ != null ? strJ : "";
        f();
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        acyh acyhVar = this.a;
        acyhVar.c(view);
        acyhVar.a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dahy
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.a.f();
            }
        });
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) throws Resources.NotFoundException {
        this.a.d(adanVar, acyxVar);
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        adaoVar2.getClass();
        String strJ = adaoVar2.J();
        adaoVar.getClass();
        return (TextUtils.equals(strJ, adaoVar.J()) && TextUtils.equals(adaoVar2.M(), adaoVar.M()) && TextUtils.equals(adaoVar2.L(), adaoVar.L()) && fdbq.f(adaoVar2.h(), adaoVar.h()) && adaoVar2.d() == adaoVar.d()) ? false : true;
    }

    public final void f() {
        TextView textView = this.a.a;
        textView.setText(((axjx) this.b.b()).c(this.e, this.d, this.c, textView));
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
