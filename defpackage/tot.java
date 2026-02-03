package defpackage;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tot {
    public static final cqce a = cqce.g("BugleCms", "FiAccountConfirmationFragmentPeer");
    public ValueAnimator A;
    public iv B;
    public final toj b;
    public final efwo c;
    public final egpr d;
    public final eigp e;
    public final ehac f;
    public final tqj g;
    public final egbf h;
    public final fcsu i;
    public final fcsu j;
    public final einm k;
    public final fcsu l;
    public final ains m;
    public final tov n;
    public final fcsu o;
    public final fcsu p;
    public final cpmi r;
    public Snackbar t;
    public ProgressBar w;
    public Button x;
    public Button y;
    public ImageView z;
    public final egps u = new egps<Void, Boolean>() { // from class: tot.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            tot.this.w.setVisibility(0);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            final tot totVar = tot.this;
            totVar.m.c("Bugle.Cms.PrimaryDevice.ExistingPrimaryDeviceCheck.Success.Count");
            if (!((Boolean) obj2).booleanValue()) {
                tot.a.p("There does not exist another primary device.");
                totVar.a();
                return;
            }
            tot.a.p("There exists another primary device, showing change primary device dialog.");
            toj tojVar = totVar.b;
            AlertDialog.Builder message = new AlertDialog.Builder(tojVar.z()).setTitle(tojVar.Y(R.string.fi_account_confirmation_change_primary_device_dialog_title)).setMessage(R.string.fi_account_confirmation_change_primary_device_dialog_message);
            eigp eigpVar = totVar.e;
            AlertDialog alertDialogCreate = message.setNegativeButton(tojVar.Y(R.string.fi_account_confirmation_change_primary_device_dialog_negative), new eigf(eigpVar, "com/google/android/apps/messaging/cloudstore/fi/FiAccountConfirmationFragmentPeer", "showChangePrimaryDeviceDialog", 421, "FiAccountConfirmationFragmentPeer:changePrimaryDeviceDialog:negative", new DialogInterface.OnClickListener() { // from class: tok
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    tot totVar2 = totVar;
                    totVar2.w.setVisibility(8);
                    totVar2.x.setEnabled(true);
                    totVar2.y.setEnabled(true);
                }
            })).setPositiveButton(tojVar.Y(R.string.fi_account_confirmation_change_primary_device_dialog_positive), new eigf(eigpVar, "com/google/android/apps/messaging/cloudstore/fi/FiAccountConfirmationFragmentPeer", "showChangePrimaryDeviceDialog", 432, "FiAccountConfirmationFragmentPeer:changePrimaryDeviceDialog:positive", new DialogInterface.OnClickListener() { // from class: tol
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    totVar.a();
                    dialogInterface.dismiss();
                }
            })).create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.show();
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            tot totVar = tot.this;
            totVar.w.setVisibility(8);
            totVar.m.c("Bugle.Cms.PrimaryDevice.ExistingPrimaryDeviceCheck.Failure.Count");
            tot.a.s("Failed to determine whether exists another primary device.", th);
            totVar.a();
        }
    };
    public final egzv v = new egzv<egbs>() { // from class: tot.2
        @Override // defpackage.egzv
        public final void a(Throwable th) {
            throw new IllegalStateException("Error retrieving AccountInfo for id ".concat(String.valueOf(tot.this.c.toString())), th);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            egbs egbsVar = (egbs) obj;
            boolean zIsEmpty = egbsVar.h.isEmpty();
            tot totVar = tot.this;
            if (!zIsEmpty) {
                ehqu ehquVarA = ehqs.b(totVar.b).i(egbsVar.h).A();
                rtt rttVar = new rtt(totVar.z);
                rttVar.l();
                ehquVarA.w(rttVar);
                totVar.z.setImageTintList(null);
                return;
            }
            toj tojVar = totVar.b;
            ehqu ehquVarE = ehqs.b(tojVar).e(tojVar.B().getDrawable(R.drawable.quantum_ic_account_circle_black_48, null));
            rtt rttVar2 = new rtt(totVar.z);
            rttVar2.l();
            ehquVarE.w(rttVar2);
            totVar.z.setColorFilter(tojVar.z().getColor(R.color.text_color_primary));
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }
    };
    public final a q = new a();
    public final egps s = new b();

    /* compiled from: PG */
    final class b implements egps<Void, Boolean> {
        public b() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            tot.this.w.setVisibility(0);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            int iA;
            tot totVar = tot.this;
            totVar.w.setVisibility(8);
            if (!((Boolean) cpyl.a.e()).booleanValue() || (iA = emck.a(totVar.n.c)) == 0 || iA != 3) {
                toj tojVar = totVar.b;
                tojVar.aD(tlz.c(tojVar.z()));
                einf.f(new trt(), tojVar);
            } else {
                avmp avmpVar = (avmp) totVar.l.b();
                toj tojVar2 = totVar.b;
                Intent intentE = avmpVar.e(tojVar2.z());
                intentE.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
                intentE.putExtra("opted_in_through_growth_kit_flow", true);
                tojVar2.aD(intentE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
        @Override // defpackage.egps
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ void f(java.lang.Object r9, java.lang.Throwable r10) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tot.b.f(java.lang.Object, java.lang.Throwable):void");
        }
    }

    public tot(tov tovVar, toj tojVar, efwo efwoVar, egpr egprVar, eigp eigpVar, ehac ehacVar, tqj tqjVar, egbf egbfVar, fcsu fcsuVar, fcsu fcsuVar2, einm einmVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cpmi cpmiVar, ains ainsVar) {
        this.n = tovVar;
        this.b = tojVar;
        this.c = efwoVar;
        this.d = egprVar;
        this.e = eigpVar;
        this.f = ehacVar;
        this.g = tqjVar;
        this.h = egbfVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = einmVar;
        this.l = fcsuVar3;
        this.r = cpmiVar;
        this.p = fcsuVar5;
        this.o = fcsuVar4;
        this.m = ainsVar;
    }

    public final void a() {
        Context contextZ = this.b.z();
        int iA = emck.a(this.n.c);
        if (iA == 0) {
            iA = 1;
        }
        final efwo efwoVar = this.c;
        final tqj tqjVar = this.g;
        boolean z = iA == 3;
        this.d.h(new egpq((abxb.b() && ((Optional) tqjVar.f.b()).isPresent()) ? tqjVar.e.a(efwoVar, z, contextZ).i(new eooz() { // from class: tqe
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                tqj tqjVar2 = tqjVar;
                return ((bvos) ((Optional) tqjVar2.f.b()).get()).b(efwoVar).h(new ejvr() { // from class: tqf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return true;
                    }
                }, tqjVar2.d);
            }
        }, tqjVar.d) : tqjVar.e.a(efwoVar, z, contextZ).h(new ejvr() { // from class: tqg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, tqjVar.d)), new egpo(null), this.s);
    }

    /* compiled from: PG */
    final class a implements egps<Void, Void> {
        public a() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            tot.a.p("Deleted the B&R, close the Fi Account confirmation");
            einf.f(new trt(), tot.this.b);
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            tot.a.s("Deleted the B&R failed, close the Fi Account confirmation", th);
            einf.f(new trt(), tot.this.b);
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
