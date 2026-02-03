package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edsu extends edsp {
    static final Uri ah = Uri.parse("http://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", "com.google.android.apps.photos").build();
    public MaterialButton aA;
    public CircularProgressIndicator aB;
    public boolean aC;
    public boolean aD = false;
    private eefa aE;
    public lxo ai;
    public lxo aj;
    public dtau ak;
    public dswb al;
    public eddy am;
    public edgv an;
    public ejxm ao;
    public ejxm ap;
    public dsvh aq;
    public dtar ar;
    public View as;
    public View at;
    public View au;
    public MaterialButton av;
    public ImageView aw;
    public ImageView ax;
    public MaterialTextView ay;
    public MaterialTextView az;

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean aZ(edhm edhmVar) {
        ekgb ekgbVarC = edhmVar.c();
        int size = ekgbVarC.size();
        int i = 0;
        while (i < size) {
            eure eureVar = (eure) ekgbVarC.get(i);
            exwf exwfVarB = exwf.b((eureVar.c == 2 ? (eurs) eureVar.d : eurs.a).c);
            if (exwfVarB == null) {
                exwfVarB = exwf.UNKNOWN_RPC;
            }
            i++;
            if (exwfVarB == exwf.OBAKE_MDI_REMOVE_PHOTO) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.photo_picker_update_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aX(ekgb ekgbVar) {
        if (!fbgv.o() || this.aD) {
            eurn eurnVar = (eurn) euro.a.createBuilder();
            eurnVar.copyOnWrite();
            euro euroVar = (euro) eurnVar.instance;
            euroVar.c = 7;
            euroVar.b |= 1;
            long jA = this.ao.a(TimeUnit.MICROSECONDS);
            eurnVar.copyOnWrite();
            euro euroVar2 = (euro) eurnVar.instance;
            euroVar2.b |= 2;
            euroVar2.d = jA;
            int size = ekgbVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                eure eureVar = (eure) ekgbVar.get(i);
                i++;
                if ((eureVar.b & 2) != 0) {
                    eurc eurcVar = eureVar.f;
                    if (eurcVar == null) {
                        eurcVar = eurc.a;
                    }
                    eurnVar.copyOnWrite();
                    euro euroVar3 = (euro) eurnVar.instance;
                    eurcVar.getClass();
                    euroVar3.e = eurcVar;
                    euroVar3.b |= 4;
                }
            }
            edgv edgvVar = this.an;
            eurj eurjVar = (eurj) eurk.a.createBuilder();
            eurd eurdVar = (eurd) eure.a.createBuilder();
            long jA2 = this.ap.a(TimeUnit.MICROSECONDS);
            eurdVar.copyOnWrite();
            eure eureVar2 = (eure) eurdVar.instance;
            eureVar2.b |= 1;
            eureVar2.e = jA2;
            eurx eurxVar = (eurx) eury.a.createBuilder();
            eurxVar.copyOnWrite();
            eury euryVar = (eury) eurxVar.instance;
            euryVar.d = 5;
            euryVar.b |= 2;
            eurxVar.copyOnWrite();
            eury euryVar2 = (eury) eurxVar.instance;
            euryVar2.c = 6;
            euryVar2.b |= 1;
            eurdVar.copyOnWrite();
            eure eureVar3 = (eure) eurdVar.instance;
            eury euryVar3 = (eury) eurxVar.build();
            euryVar3.getClass();
            eureVar3.d = euryVar3;
            eureVar3.c = 1;
            eurjVar.b(eurdVar);
            eurjVar.a(ekgbVar);
            eurjVar.copyOnWrite();
            eurk eurkVar = (eurk) eurjVar.instance;
            euro euroVar4 = (euro) eurnVar.build();
            euroVar4.getClass();
            eurkVar.d = euroVar4;
            eurkVar.b |= 1;
            edgvVar.c((eurk) eurjVar.build());
            if (fbgv.o()) {
                this.aD = false;
            }
        }
    }

    public final void aY(boolean z) throws Resources.NotFoundException {
        this.aE.a().w = z;
        this.aE.setCancelable(z);
        this.aE.setCanceledOnTouchOutside(z);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        edgv edgvVar = this.an;
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = 7;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
        this.aw = (ImageView) this.Q.findViewById(R.id.photo_picker_update_dialog_profile_image);
        this.ax = (ImageView) this.Q.findViewById(R.id.photo_picker_update_upsell_photos_logo);
        this.as = this.Q.findViewById(R.id.photo_picker_update_dialog_notice);
        this.ay = (MaterialTextView) this.Q.findViewById(R.id.photo_picker_update_dialog_title);
        this.az = (MaterialTextView) this.Q.findViewById(R.id.photo_picker_update_dialog_message);
        this.aB = (CircularProgressIndicator) this.Q.findViewById(R.id.photo_picker_update_dialog_loading_indicator);
        this.aA = (MaterialButton) this.Q.findViewById(R.id.photo_picker_update_dialog_accept_button);
        this.av = (MaterialButton) this.Q.findViewById(R.id.photo_picker_update_upsell_photos_download_button);
        this.au = this.Q.findViewById(R.id.photo_picker_update_upsell_notice);
        this.at = this.Q.findViewById(R.id.photo_picker_update_upsell_divider);
        ley.z(this.ay);
        edtf edtfVar = (edtf) this.ai.a(edtf.class);
        final edtb edtbVar = (edtb) this.aj.a(edtb.class);
        this.aA.setOnClickListener(new View.OnClickListener() { // from class: edsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edsu edsuVar = this.a;
                if (edsuVar.aC && fbgv.r()) {
                    edtb edtbVar2 = edtbVar;
                    edgv edgvVar2 = edtbVar2.b;
                    eurl eurlVar2 = (eurl) eurm.a.createBuilder();
                    eurlVar2.copyOnWrite();
                    eurm eurmVar2 = (eurm) eurlVar2.instance;
                    eurmVar2.c = 21;
                    eurmVar2.b |= 1;
                    edgvVar2.e((eurm) eurlVar2.build());
                    ecpy ecpyVar = edtbVar2.a;
                    ecpy.b(edtbVar2.c);
                }
                edsuVar.hh();
            }
        });
        this.av.setOnClickListener(new View.OnClickListener() { // from class: edss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                edsu edsuVar = this.a;
                edsuVar.aq.a(dsvg.e(), view);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(edsu.ah);
                edsuVar.aQ(intent);
            }
        });
        edtfVar.a().f(Q(), new lvz() { // from class: edst
            @Override // defpackage.lvz
            public final void a(Object obj) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
                edhm edhmVar = (edhm) obj;
                int iD = edhmVar.d() - 1;
                edsu edsuVar = this.a;
                if (iD == 0) {
                    ejxm ejxmVar = edsuVar.ap;
                    ejxmVar.e();
                    ejxmVar.f();
                } else if (iD != 1 && iD != 2) {
                    if (iD != 3) {
                        edsuVar.am.c(edsuVar.aw);
                        edsuVar.aw.setVisibility(8);
                        if (edsu.aZ(edhmVar)) {
                            edsuVar.az.setText(R.string.op3_update_remove_failure_message);
                        } else {
                            edsuVar.az.setText(R.string.op3_update_failure_message);
                        }
                        edsuVar.as.setVisibility(0);
                        edsuVar.ay.setText(R.string.op3_something_went_wrong);
                        if (fbgv.h()) {
                            edsuVar.au.setVisibility(8);
                            edsuVar.at.setVisibility(8);
                            edsuVar.av.setVisibility(8);
                        }
                        edsuVar.aB.setVisibility(8);
                        edsuVar.aA.setVisibility(0);
                        edsuVar.aY(true);
                        edsuVar.aX(edhmVar.c());
                        edsuVar.aC = false;
                        return;
                    }
                    eddy eddyVar = edsuVar.am;
                    Bitmap bitmapA = ((edml) edhmVar.b().c()).a();
                    edea edeaVar = new edea();
                    edeaVar.c();
                    eddyVar.d(bitmapA, edeaVar, edsuVar.aw);
                    edsuVar.aw.setVisibility(0);
                    edsuVar.az.setText(R.string.op3_update_message_will_update_soon);
                    edsuVar.ay.setText(R.string.op3_update_will_update_soon);
                    edsuVar.as.setVisibility(0);
                    edsuVar.aB.setVisibility(8);
                    edsuVar.aA.setVisibility(0);
                    edsuVar.aY(true);
                    try {
                        edsuVar.G().getPackageManager().getPackageInfo("com.google.android.apps.photos", 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (!edsu.aZ(edhmVar)) {
                            edsuVar.au.setVisibility(0);
                            edsuVar.at.setVisibility(0);
                            edsuVar.av.setVisibility(0);
                            edsuVar.am.f(Uri.parse(fbgv.f()), new edea(), edsuVar.ax);
                        }
                    }
                    edsuVar.au.setVisibility(8);
                    edsuVar.at.setVisibility(8);
                    edsuVar.av.setVisibility(8);
                    edsuVar.aC = true;
                    edsuVar.aX(edhmVar.c());
                    return;
                }
                if (fbgv.o()) {
                    ejxm ejxmVar2 = edsuVar.ap;
                    ejxmVar2.e();
                    ejxmVar2.f();
                    edsuVar.aD = true;
                }
                edsuVar.am.c(edsuVar.aw);
                edsuVar.aw.setVisibility(8);
                edsuVar.ay.setText(R.string.op3_update_saving_changes);
                edsuVar.az.setText("");
                edsuVar.as.setVisibility(8);
                edsuVar.aB.g();
                edsuVar.aA.setVisibility(8);
                edsuVar.au.setVisibility(8);
                edsuVar.at.setVisibility(8);
                edsuVar.av.setVisibility(8);
                edsuVar.aY(false);
                edsuVar.aC = false;
            }
        });
    }

    @Override // defpackage.edsp, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((edsp) this).ag) {
            return;
        }
        eygl.a(this);
    }

    @Override // defpackage.eefb, defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) throws Resources.NotFoundException {
        eefa eefaVar = (eefa) super.gK(bundle);
        this.aE = eefaVar;
        eefaVar.a().E(3);
        this.aE.setOnShowListener(new dtas(this, new DialogInterface.OnShowListener() { // from class: edsq
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                edsu edsuVar = this.a;
                edsuVar.ar.b(89736).a();
                edsuVar.al.b.a(89758).b(edsuVar.Q.findViewById(R.id.photo_picker_update_dialog_notice));
                edsuVar.al.b.a(89744).b(edsuVar.Q.findViewById(R.id.photo_picker_update_upsell_notice));
                dtat.c(edsuVar);
                edsuVar.al.b.a(89745).b(edsuVar.av);
            }
        }));
        return this.aE;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        ejxm ejxmVar = this.ao;
        ejxmVar.e();
        ejxmVar.f();
        this.ar = this.ak.a(this);
    }
}
