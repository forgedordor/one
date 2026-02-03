package defpackage;

import android.content.DialogInterface;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class einh implements DialogInterface.OnClickListener {
    public final /* synthetic */ einm a;
    public final /* synthetic */ einb b;

    public /* synthetic */ einh(einm einmVar, einb einbVar) {
        this.a = einmVar;
        this.b = einbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Button buttonB = ((iv) dialogInterface).b(i);
        boolean zA = eidq.a(buttonB);
        einb einbVar = this.b;
        if (zA) {
            eieh eiehVarD = this.a.a.d("com/google/apps/tiktok/ui/event/Events", "onDialogClick", 144, i != -3 ? i != -2 ? i != -1 ? "Clicked dialog button" : "Clicked positive dialog button" : "Clicked negative dialog button" : "Clicked neutral dialog button");
            try {
                einf.g(einbVar, buttonB);
                eiehVarD.close();
            } catch (Throwable th) {
                try {
                    eiehVarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
