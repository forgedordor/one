package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eifs implements View.OnClickListener {
    public final /* synthetic */ eigp a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ View.OnClickListener f;

    public /* synthetic */ eifs(eigp eigpVar, String str, String str2, int i, String str3, View.OnClickListener onClickListener) {
        this.a = eigpVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eigp eigpVar = this.a;
        String str = this.e;
        String str2 = this.b;
        String str3 = this.c;
        View.OnClickListener onClickListener = this.f;
        eieh eiehVarC = eigpVar.c(str, str2, str3, this.d);
        try {
            onClickListener.onClick(view);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
