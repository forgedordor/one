package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agnq implements actm, egps {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/otp/deletion/banner/PositiveButtonOnClickListener");
    public final fcsu a;
    public final fcsu b;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private View g;

    public agnq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.a = fcsuVar3;
        this.b = fcsuVar4;
        this.f = fcsuVar5;
    }

    @Override // defpackage.actm
    public final void a(final egpr egprVar, View view) {
        this.g = view;
        Context context = view.getContext();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.otp_deletion_dialog_view, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.otp_deletion_dialog_body);
        fcsu fcsuVar = this.f;
        textView.setText(context.getString(true != ((arqk) fcsuVar.b()).a() ? R.string.otp_auto_deletion_opt_in_dialog_body_text : R.string.otp_auto_deletion_opt_in_dialog_body_text_with_description));
        eeji eejiVar = new eeji(context);
        if (((arqk) fcsuVar.b()).a()) {
            eejiVar.v(context.getResources().getQuantityString(R.plurals.otp_auto_deletion_opt_in_dialog_title_text_with_description, 24, 24));
        } else {
            eejiVar.v(context.getString(R.string.otp_auto_deletion_opt_in_dialog_title_text));
        }
        eejiVar.r(R.string.otp_auto_deletion_opt_in_dialog_positive_button_text, new eigf((eigp) this.d.b(), "com/google/android/apps/messaging/otp/deletion/banner/PositiveButtonOnClickListener", "onClick", 110, "OTPAutoDeleteBanner#dialog#positiveListener", new DialogInterface.OnClickListener() { // from class: agnp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                agnq agnqVar = this.a;
                egprVar.g(egpq.b(((agmw) agnqVar.a.b()).a(true)), agnqVar);
                ((agoo) agnqVar.b.b()).b(new Supplier() { // from class: agol
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eniy eniyVar = (eniy) enjk.a.createBuilder();
                        enjc enjcVar = (enjc) enjd.a.createBuilder();
                        enja enjaVar = (enja) enjb.a.createBuilder();
                        enjaVar.copyOnWrite();
                        enjb enjbVar = (enjb) enjaVar.instance;
                        enjbVar.c = 1;
                        enjbVar.b |= 1;
                        enjcVar.copyOnWrite();
                        enjd enjdVar = (enjd) enjcVar.instance;
                        enjb enjbVar2 = (enjb) enjaVar.build();
                        enjbVar2.getClass();
                        enjdVar.c = enjbVar2;
                        enjdVar.b |= 1;
                        enjd enjdVar2 = (enjd) enjcVar.build();
                        eniyVar.copyOnWrite();
                        enjk enjkVar = (enjk) eniyVar.instance;
                        enjdVar2.getClass();
                        enjkVar.c = enjdVar2;
                        enjkVar.b = 2;
                        return (enjk) eniyVar.build();
                    }
                });
            }
        }));
        eejiVar.m(R.string.otp_auto_deletion_opt_in_dialog_negative_button_text, null);
        eejiVar.w(viewInflate);
        eejiVar.a();
        ((agoo) this.b.b()).c(2);
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ekrw ekrwVarH = c.h();
        ekrwVarH.X(eksq.a, "BugleOtp");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/otp/deletion/banner/PositiveButtonOnClickListener", "onSuccess", 127, "PositiveButtonOnClickListener.java")).q("Opt-in OTP auto deletion successfully.");
        ((egzh) this.e.b()).a(eijx.e(null), acto.a);
        View view = this.g;
        view.getClass();
        einf.g(new ctex(((arqk) this.f.b()).a() ? view.getResources().getQuantityString(R.plurals.otp_auto_deletion_opt_in_snackbar_message_with_description, 24, 24) : view.getResources().getString(R.string.otp_auto_deletion_opt_in_snackbar_message), "", new Runnable() { // from class: agno
            @Override // java.lang.Runnable
            public final void run() {
            }
        }), view);
        this.g = null;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        ekrw ekrwVarJ = c.j();
        ekrwVarJ.X(eksq.a, "BugleOtp");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/otp/deletion/banner/PositiveButtonOnClickListener", "onFailure", (char) 162, "PositiveButtonOnClickListener.java")).q("Failed to opt-in otp auto deletion");
        this.g = null;
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
