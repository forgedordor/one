package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eige implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ eigp a;
    public final /* synthetic */ String b = "";
    public final /* synthetic */ String c = "";
    public final /* synthetic */ String d;
    public final /* synthetic */ MenuItem.OnMenuItemClickListener e;

    public /* synthetic */ eige(eigp eigpVar, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = eigpVar;
        this.d = str;
        this.e = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        eigp eigpVar = this.a;
        String str = this.d;
        String str2 = this.b;
        String str3 = this.c;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.e;
        eieh eiehVarC = eigpVar.c(str, str2, str3, 0);
        try {
            boolean zOnMenuItemClick = onMenuItemClickListener.onMenuItemClick(menuItem);
            eiehVarC.close();
            return zOnMenuItemClick;
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
