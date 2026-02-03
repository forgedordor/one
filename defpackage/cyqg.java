package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqg implements cypc {
    public final cypd a;
    public final Set b = new css();
    public final ains c;
    public final aipo d;
    int e;
    private final fcsu f;
    private final cqln g;
    private final eosc h;

    public cyqg(cqln cqlnVar, ains ainsVar, aipo aipoVar, fcsu fcsuVar, eosc eoscVar, cypd cypdVar) {
        this.g = cqlnVar;
        this.c = ainsVar;
        this.d = aipoVar;
        this.f = fcsuVar;
        this.h = eoscVar;
        this.a = cypdVar;
        synchronized (this) {
            this.e = 1;
        }
    }

    @Override // defpackage.cypc
    public final void a(String str) {
        AudioManager audioManager;
        this.c.c("Bugle.Ditto.Pairing.Attempted");
        this.d.b("Bugle.Ditto.Pairing.Latency");
        Activity activity = ((cypu) this.a).i;
        Vibrator vibrator = (Vibrator) activity.getSystemService("vibrator");
        if (vibrator != null && ((audioManager = (AudioManager) activity.getSystemService("audio")) == null || audioManager.getRingerMode() != 0)) {
            vibrator.vibrate(VibrationEffect.createOneShot(300L, -1));
        }
        int iIndexOf = str.indexOf("?c=");
        final cqlp cqlpVar = null;
        cqlpVar = null;
        cqlpVar = null;
        cqlpVar = null;
        cqlpVar = null;
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 3);
            cqca.c("Bugle", "Detected QR code");
            try {
                try {
                    epch epchVar = (epch) evsn.parseFrom(epch.a, Base64.decode(strSubstring, 0));
                    byte[] bArrI = epchVar.c.I();
                    byte[] bArrI2 = epchVar.d.I();
                    int length = bArrI.length;
                    if (length != 32) {
                        ekrw ekrwVarJ = cqlt.a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", 47, "PairingCodeConverter.java")).r("Invalid encryption key length: %d", length);
                    } else {
                        int length2 = bArrI2.length;
                        if (length2 != 32) {
                            ekrw ekrwVarJ2 = cqlt.a.j();
                            ekrwVarJ2.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", 51, "PairingCodeConverter.java")).r("Invalid HMAC key length: %d", length2);
                        } else {
                            byte[] bArrI3 = epchVar.b.I();
                            cqlr cqlrVar = new cqlr();
                            if (bArrI3 == null) {
                                throw new NullPointerException("Null retrievalToken");
                            }
                            cqlrVar.b = bArrI;
                            cqlrVar.a = bArrI2;
                            if (strSubstring == null) {
                                throw new NullPointerException("Null originalQrCode");
                            }
                            bajj bajjVar = Optional.empty().isEmpty() ? new bajj(cqlrVar.b, cqlrVar.a) : null;
                            if (bajjVar == null) {
                                throw new IllegalStateException("Missing required properties:".concat(" encryptionKeys"));
                            }
                            cqlpVar = new cqlp(bArrI3, bajjVar, strSubstring);
                        }
                    }
                } catch (evtj e) {
                    ekrw ekrwVarJ3 = cqlt.a.j();
                    ekrwVarJ3.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(e)).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", '(', "PairingCodeConverter.java")).q("Retrieved code has invalid payload.");
                }
            } catch (IllegalArgumentException unused) {
                ekrw ekrwVarJ4 = cqlt.a.j();
                ekrwVarJ4.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/util/ditto/common/PairingCodeConverter", "process", 32, "PairingCodeConverter.java")).t("Scanned code has invalid base64 data: %s", strSubstring);
            }
        }
        if (cqlpVar == null) {
            cqdq.f(new Runnable() { // from class: cyqa
                @Override // java.lang.Runnable
                public final void run() {
                    cypd cypdVar = this.a.a;
                    cypdVar.a(false);
                    final cypu cypuVar = (cypu) cypdVar;
                    Activity activity2 = cypuVar.i;
                    eeji eejiVar = new eeji(activity2);
                    eejiVar.v(activity2.getResources().getString(R.string.invalid_qr_code_dialog_title));
                    eejiVar.l(activity2.getResources().getString(R.string.invalid_qr_code_dialog_message, bvfd.i.e()));
                    eejiVar.s(activity2.getResources().getString(R.string.invalid_qr_code_dialog_positive_button_text), new DialogInterface.OnClickListener() { // from class: cypn
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cypuVar.a(true);
                            dialogInterface.dismiss();
                        }
                    });
                    eejiVar.a();
                }
            });
            return;
        }
        cqca.c("Bugle", "Successfully parsed QR code");
        ((bvio) this.f.b()).p(cqlpVar.c);
        this.a.a(false);
        synchronized (this) {
            this.e = 2;
        }
        final cqln cqlnVar = this.g;
        eiju eijuVarA = ((cema) cqlnVar.b.b()).a(new cfdw(cqlpVar, cqlnVar.e, cqlnVar.f));
        eooz eoozVar = new eooz() { // from class: cqll
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final epnq epnqVar;
                final ezja ezjaVar = (ezja) obj;
                cqca.c("BugleDitto", "Retrieved pairing data.");
                try {
                    epnqVar = (epnq) evsn.parseFrom(epnq.a, ezjaVar.d);
                } catch (evtj unused2) {
                    cqca.n("BugleDitto", "Pairing payload didn't contain PairingData");
                    epnqVar = null;
                }
                final cqls cqlsVar = cqlpVar;
                final cqln cqlnVar2 = cqlnVar;
                if (!((cdio) cqlnVar2.h.b()).a()) {
                    return cqlnVar2.a(ezjaVar, cqlsVar, epnqVar).i(new eooz() { // from class: cqlj
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ((cema) cqlnVar2.b.b()).a((cfac) obj2);
                        }
                    }, cqlnVar2.d).h(new ejvr() { // from class: cqlk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ezol ezolVar = (ezol) obj2;
                            cqlnVar2.c.a(ezolVar);
                            return new cqlo(ezolVar, epnqVar, ((cqlp) cqlsVar).b);
                        }
                    }, eoqg.a);
                }
                fcsu fcsuVar = cqlnVar2.g;
                eiju eijuVarE = ((Optional) fcsuVar.b()).isEmpty() ? eijx.e(null) : ((bvos) ((Optional) fcsuVar.b()).get()).a().h(new ejvr() { // from class: cqlf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ejxr ejxrVar = cqln.a;
                        return null;
                    }
                }, eoqg.a);
                eooz eoozVar2 = new eooz() { // from class: cqlg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return cqlnVar2.a(ezjaVar, cqlsVar, epnqVar);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                return eijuVarE.i(eoozVar2, eoqgVar).i(new eooz() { // from class: cqlh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return ((cema) cqlnVar2.b.b()).a((cfac) obj2);
                    }
                }, cqlnVar2.d).h(new ejvr() { // from class: cqli
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ezol ezolVar = (ezol) obj2;
                        cqlnVar2.c.a(ezolVar);
                        return new cqlo(ezolVar, epnqVar, ((cqlp) cqlsVar).b);
                    }
                }, eoqgVar);
            }
        };
        eosc eoscVar = cqlnVar.d;
        eiju eijuVarH = eijuVarA.i(eoozVar, eoscVar).h(new ejvr() { // from class: cqlm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqlnVar.b((cqlq) obj);
                return null;
            }
        }, eoscVar).h(new ejvr() { // from class: cypw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return true;
            }
        }, eoqg.a);
        ejvr ejvrVar = new ejvr() { // from class: cypx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqca.p("Bugle", (Throwable) obj, "Failed to register pairing for scanned QR code");
                cyqg cyqgVar = this.a;
                cyqgVar.a.a(true);
                cyqgVar.b();
                return false;
            }
        };
        eosc eoscVar2 = this.h;
        eijuVarH.e(Throwable.class, ejvrVar, eoscVar2).h(new ejvr() { // from class: cypy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                cyqg cyqgVar = this.a;
                cyqgVar.c.c("Bugle.Ditto.Pairing.Success");
                cyqgVar.d.k("Bugle.Ditto.Pairing.Latency");
                cyqgVar.d();
                return null;
            }
        }, eoscVar2);
        cqdq.a.postDelayed(new Runnable() { // from class: cypz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        }, 200L);
    }

    public final synchronized void b() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 4) {
                this.e = 5;
                return;
            } else if (i2 != 5 && i2 != 6) {
                cqca.n("Bugle", "Unexpected state transition when trying to show failure dialog: ".concat(cyqf.a(i)));
                return;
            }
        }
        this.e = 7;
        cqdq.f(new Runnable() { // from class: cyqd
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        });
    }

    public final synchronized void c() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 2) {
            this.e = 6;
            return;
        }
        if (i2 == 3) {
            this.e = 6;
            d();
        } else if (i2 == 4) {
            this.e = 6;
            b();
        } else {
            if (i2 == 6 || i2 == 7) {
                return;
            }
            cqca.n("Bugle", "Unexpected state transition when trying to handle loading complete: ".concat(cyqf.a(i)));
        }
    }

    public final synchronized void d() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                this.e = 4;
                return;
            } else if (i2 != 5 && i2 != 7) {
                cqca.n("Bugle", "Unexpected state transition when trying to show success dialog: ".concat(cyqf.a(i)));
                return;
            }
        }
        this.e = 8;
        cqdq.f(new Runnable() { // from class: cyqe
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                this.a.h();
            }
        });
    }

    public final synchronized void e() {
        ((cyns) ((cypu) this.a).l).e.finish();
        this.e = 9;
    }

    public final synchronized void f() {
        cypd cypdVar = this.a;
        if (((cypu) cypdVar).j.aF()) {
            ((cypu) cypdVar).d();
            ((cypu) cypdVar).b(false, false);
            Activity activity = ((cypu) cypdVar).i;
            iu iuVar = new iu(activity);
            iuVar.c(activity.getResources().getString(R.string.failed_qr_pairing_dialog_message));
            final cypu cypuVar = (cypu) cypdVar;
            iuVar.g(activity.getResources().getString(R.string.failed_qr_pairing_dialog_positive_button_text), new DialogInterface.OnClickListener() { // from class: cypk
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cypu cypuVar2 = cypuVar;
                    cypuVar2.d();
                    cypt cyptVar = cypuVar2.l;
                    if (abxb.b()) {
                        cyns cynsVar = (cyns) cyptVar;
                        if (cynsVar.o.isPresent()) {
                            cynsVar.c(cynsVar.o);
                            return;
                        }
                    }
                    ((cyns) cyptVar).c(Optional.empty());
                }
            });
            ((cypu) cypdVar).r = iuVar.a();
        }
        this.e = 1;
    }

    public final synchronized void g() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            this.e = 3;
            this.a.b(true, true);
            cqdq.a.postDelayed(new Runnable() { // from class: cyqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            }, 1000L);
        } else {
            if (i2 == 6 || i2 == 7) {
                return;
            }
            cqca.n("Bugle", "Unexpected state transition when trying to show loading dialog: ".concat(cyqf.a(i)));
        }
    }

    public final void h() throws Resources.NotFoundException {
        cypu cypuVar = (cypu) this.a;
        if (cypuVar.j.aF()) {
            cypuVar.d();
            View viewFindViewById = cypuVar.q.findViewById(R.id.qr_loading_progress_bar);
            viewFindViewById.animate().cancel();
            ObjectAnimator duration = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(cypuVar.i.getResources().getInteger(android.R.integer.config_shortAnimTime));
            duration.addListener(new cypp(viewFindViewById));
            List listC = cypuVar.c(cypuVar.q.findViewById(R.id.qr_loading_checkmark), cypuVar.q.findViewById(R.id.qr_loading_overlay_background));
            AnimatorSet animatorSet = new AnimatorSet();
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                animatorSet.play((Animator) it.next()).after(duration);
            }
            animatorSet.start();
        }
        cqdq.a.postDelayed(new Runnable() { // from class: cyqc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e();
            }
        }, 2000L);
    }

    public final synchronized void i() {
        int i = this.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
                this.a.b(true, false);
                return;
            case 6:
                f();
                return;
            case 7:
                h();
                return;
            default:
                cqca.n("Bugle", "Unexpected state transition when trying to show loading dialog: ".concat(cyqf.a(i)));
                return;
        }
    }
}
