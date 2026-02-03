package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.apps.messaging.R;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abju implements egzv<Boolean> {
    final /* synthetic */ abjq a;

    public abju(abjq abjqVar) {
        this.a = abjqVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        abjq.a.s("Failed to read shouldShowFailToLoadDittoDialog", th);
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            abjq abjqVar = this.a;
            AlertDialog alertDialog = abjqVar.z;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            abjqVar.z.dismiss();
            abjq.a.p("Dismissed FailToLoadDialog");
            ((ains) abjqVar.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 4);
            return;
        }
        cqce cqceVar = abjq.a;
        cqceVar.p("Show FailToLoadDialog");
        final abjq abjqVar2 = this.a;
        AlertDialog alertDialog2 = abjqVar2.z;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        AlertDialog.Builder title = new AlertDialog.Builder(abjqVar2.e.z(), R.style.FailToLoadDialog).setTitle(R.string.fail_to_load_dialog_title_new);
        fcsu fcsuVar = abjqVar2.m;
        AlertDialog.Builder positiveButton = title.setPositiveButton(R.string.fail_to_load_dialog_positive_button, new eigf((eigp) fcsuVar.b(), "com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer", "showFailToLoadDialog", 926, "FailToLoadDialog:positive", new DialogInterface.OnClickListener() { // from class: abjc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                abjq abjqVar3 = abjqVar2;
                abjqVar3.A = true;
                abjqVar3.d();
                final abki abkiVar = (abki) abjqVar3.j.b();
                ((abfv) abkiVar.c.b()).j(false).k(auvh.c(new Consumer() { // from class: abkf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        abkiVar.d();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), abkiVar.e);
                ((ains) abjqVar3.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 2);
            }
        }));
        if (((crnp) abjqVar2.n.b()).e()) {
            positiveButton.setNegativeButton(R.string.fail_to_load_dialog_negative_button, new eigf((eigp) fcsuVar.b(), "com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer", "showFailToLoadDialog", 942, "FailToLoadDialog:negative", new DialogInterface.OnClickListener() { // from class: abjh
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    abjq abjqVar3 = abjqVar2;
                    abki abkiVar = (abki) abjqVar3.j.b();
                    ((abfv) abkiVar.c.b()).j(false).k(auvh.b(), abkiVar.e);
                    ((ains) abjqVar3.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 3);
                    abjq.a.p("launching Standalone mode");
                    eg egVarA = abjqVar3.a();
                    egVarA.setResult(-1, egVarA.getIntent());
                    egVarA.finish();
                }
            }));
        }
        abjqVar2.z = positiveButton.create();
        AlertDialog alertDialog3 = abjqVar2.z;
        if (alertDialog3 == null) {
            cqceVar.r("failToLoadDialog is null.");
        } else {
            alertDialog3.show();
            ((ains) abjqVar2.l.b()).e("Bugle.Satellite.FailToLoadDialog.Status.Counts", 1);
        }
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
