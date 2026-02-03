package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eigf implements DialogInterface.OnClickListener {
    public final /* synthetic */ eigp a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ DialogInterface.OnClickListener f;

    public /* synthetic */ eigf(eigp eigpVar, String str, String str2, int i, String str3, DialogInterface.OnClickListener onClickListener) {
        this.a = eigpVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = onClickListener;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        eigp eigpVar = this.a;
        String str = this.e;
        String str2 = this.b;
        String str3 = this.c;
        DialogInterface.OnClickListener onClickListener = this.f;
        eieh eiehVarC = eigpVar.c(str, str2, str3, this.d);
        try {
            onClickListener.onClick(dialogInterface, i);
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
