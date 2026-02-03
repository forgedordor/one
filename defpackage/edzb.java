package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edzb implements fdau {
    final /* synthetic */ hox a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdap c;
    final /* synthetic */ Context d;
    final /* synthetic */ add e;
    final /* synthetic */ Uri f;
    final /* synthetic */ add g;
    final /* synthetic */ add h;
    final /* synthetic */ boolean i;
    final /* synthetic */ fdap j;
    final /* synthetic */ edvs k;

    public edzb(hox hoxVar, boolean z, fdap fdapVar, edvs edvsVar, Context context, add addVar, Uri uri, add addVar2, add addVar3, boolean z2, fdap fdapVar2) {
        this.a = hoxVar;
        this.b = z;
        this.c = fdapVar;
        this.k = edvsVar;
        this.d = context;
        this.e = addVar;
        this.f = uri;
        this.g = addVar2;
        this.h = addVar3;
        this.i = z2;
        this.j = fdapVar2;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdap fdapVar;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ecj ecjVar = ecr.g;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(egq.d(icoVar, 1.0f), 24.0f, 0.0f, 24.0f, 16.0f, 2);
            hox hoxVar = this.a;
            boolean z = this.b;
            fdap fdapVar2 = this.c;
            edvs edvsVar = this.k;
            ixm ixmVarA = egk.a(ecjVar, iccVar, hmlVar, 54);
            int iA = edyl.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Object objValueOf = Integer.valueOf(iA);
                hmlVar.y(objValueOf);
                hmlVar.h(objValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            dthx.b(jqu.b(R.string.pqe_bottom_sheet_header, hmlVar), null, 0L, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVar).h, hmlVar, 0, 0, 65022);
            hml hmlVar2 = hmlVar;
            ecye.a(228760, hxe.d(631241232, new edza(hoxVar, z, fdapVar2, edvsVar), hmlVar2), hmlVar2, 54);
            hmlVar2.n();
            ics icsVarC = dpc.c(dkl.a(efy.j(icoVar, 24.0f, 0.0f, 24.0f, 16.0f, 2), glz.a(hmlVar2).p, evn.a(10)), dpc.a(0, hmlVar2, 0, 1), false & ((14 & 8) == 0), (14 & 2) != 0, true);
            final Context context = this.d;
            final add addVar = this.e;
            final Uri uri = this.f;
            final add addVar2 = this.g;
            final add addVar3 = this.h;
            boolean z2 = this.i;
            final fdap fdapVar3 = this.j;
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVar2, 0);
            int iA2 = edyl.a(hmg.b(hmlVar2));
            hxi hxiVarN2 = hmlVar2.N();
            ics icsVarB2 = icj.b(hmlVar2, icsVarC);
            hmlVar2.M();
            hmlVar2.x();
            if (hmlVar2.H()) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA2, fdatVar);
            hsk.b(hmlVar2, hxiVarN2, fdatVar2);
            if (hmlVar2.H() || !fdbq.f(hmlVar2.f(), Integer.valueOf(iA2))) {
                Object objValueOf2 = Integer.valueOf(iA2);
                hmlVar2.y(objValueOf2);
                hmlVar2.h(objValueOf2, fdatVar3);
            }
            hsk.b(hmlVar2, icsVarB2, fdatVar4);
            inz inzVarA = jqq.a(R.drawable.quantum_gm_ic_android_camera_vd_theme_24, hmlVar2, 0);
            hmlVar2.v(-1224400529);
            boolean zF = hmlVar2.F(context) | hmlVar2.F(addVar) | hmlVar2.F(uri) | hmlVar2.F(addVar2);
            Object objF = hmlVar2.f();
            if (zF || objF == hmk.a) {
                objF = new fdae() { // from class: edym
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        if (kxj.c(context, "android.permission.CAMERA") == 0) {
                            addVar.c(edzd.a(uri));
                        } else {
                            addVar2.c("android.permission.CAMERA");
                        }
                        return fctx.a;
                    }
                };
                hmlVar2.y(objF);
            }
            hmlVar2.o();
            edzd.i(inzVarA, R.string.pqe_edit_camera_option, 0L, "camera", (fdae) objF, 228764, hmlVar2, 199680);
            ioi ioiVar = fwi.a;
            if (ioiVar == null) {
                iog iogVar = new iog("Outlined.PhotoLibrary", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = ipr.a;
                fdapVar = fdapVar2;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(20.0f, 4.0f, arrayList);
                ioj.m(12.0f, arrayList);
                ioj.g(8.0f, 16.0f, arrayList);
                ioj.g(8.0f, 4.0f, arrayList);
                ioj.f(12.0f, arrayList);
                ioj.j(0.0f, -2.0f, arrayList);
                ioj.g(8.0f, 2.0f, arrayList);
                ioj.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f, arrayList);
                ioj.m(12.0f, arrayList);
                ioj.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                ioj.f(12.0f, arrayList);
                ioj.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f, arrayList);
                ioj.g(22.0f, 4.0f, arrayList);
                ioj.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(11.5f, 11.67f, arrayList);
                ioj.h(1.69f, 2.26f, arrayList);
                ioj.h(2.48f, -3.1f, arrayList);
                ioj.g(19.0f, 15.0f, arrayList);
                ioj.g(9.0f, 15.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(2.0f, 6.0f, arrayList);
                ioj.m(14.0f, arrayList);
                ioj.d(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f, arrayList);
                ioj.f(14.0f, arrayList);
                ioj.m(-2.0f, arrayList);
                ioj.g(4.0f, 20.0f, arrayList);
                ioj.g(4.0f, 6.0f, arrayList);
                ioj.g(2.0f, 6.0f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fwi.a = iogVar.a();
                ioiVar = fwi.a;
                ioiVar.getClass();
            } else {
                fdapVar = fdapVar2;
            }
            ioi ioiVar2 = ioiVar;
            int i = 5004770;
            hmlVar2.v(5004770);
            boolean zF2 = hmlVar2.F(addVar3);
            Object objF2 = hmlVar2.f();
            if (zF2 || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: edyn
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.setType("image/*");
                        addVar3.c(intent);
                        return fctx.a;
                    }
                };
                hmlVar2.y(objF2);
            }
            hmlVar2.o();
            edzd.j(ioiVar2, R.string.pqe_edit_gallery_option, 0L, "gallery", (fdae) objF2, 228765, hmlVar2, 199680);
            ioi ioiVar3 = fwh.a;
            if (ioiVar3 == null) {
                iog iogVar2 = new iog("Outlined.Palette", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list2 = ipr.a;
                long j = ije.a;
                ikt iktVar2 = new ikt(j);
                ArrayList arrayList2 = new ArrayList(32);
                ioj.i(12.0f, 22.0f, arrayList2);
                ioj.c(6.49f, 22.0f, 2.0f, 17.51f, 2.0f, 12.0f, arrayList2);
                ioj.k(6.49f, arrayList2);
                ioj.l(10.0f, 4.04f, 10.0f, 9.0f, arrayList2);
                ioj.d(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f, arrayList2);
                ioj.f(-1.77f, arrayList2);
                ioj.d(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f, arrayList2);
                ioj.d(0.0f, 0.12f, 0.05f, 0.23f, 0.13f, 0.33f, arrayList2);
                ioj.d(0.41f, 0.47f, 0.64f, 1.06f, 0.64f, 1.67f, arrayList2);
                ioj.c(14.5f, 20.88f, 13.38f, 22.0f, 12.0f, 22.0f, arrayList2);
                ioj.b(arrayList2);
                ioj.i(12.0f, 4.0f, arrayList2);
                ioj.d(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f, arrayList2);
                ioj.l(3.59f, 8.0f, 8.0f, 8.0f, arrayList2);
                ioj.d(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f, arrayList2);
                ioj.d(0.0f, -0.16f, -0.08f, -0.28f, -0.14f, -0.35f, arrayList2);
                ioj.d(-0.41f, -0.46f, -0.63f, -1.05f, -0.63f, -1.65f, arrayList2);
                ioj.d(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f, arrayList2);
                ioj.e(16.0f, arrayList2);
                ioj.d(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f, arrayList2);
                ioj.c(20.0f, 7.14f, 16.41f, 4.0f, 12.0f, 4.0f, arrayList2);
                ioj.b(arrayList2);
                iogVar2.c(arrayList2, 0, "", iktVar2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                ikt iktVar3 = new ikt(j);
                ArrayList arrayList3 = new ArrayList(32);
                ioj.i(6.5f, 11.5f, arrayList3);
                ioj.j(-1.5f, 0.0f, arrayList3);
                ioj.a(3.0f, arrayList3);
                ioj.a(-3.0f, arrayList3);
                iogVar2.c(arrayList3, 0, "", iktVar3, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                ikt iktVar4 = new ikt(j);
                ArrayList arrayList4 = new ArrayList(32);
                ioj.i(9.5f, 7.5f, arrayList4);
                ioj.j(-1.5f, 0.0f, arrayList4);
                ioj.a(3.0f, arrayList4);
                ioj.a(-3.0f, arrayList4);
                iogVar2.c(arrayList4, 0, "", iktVar4, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                ikt iktVar5 = new ikt(j);
                ArrayList arrayList5 = new ArrayList(32);
                ioj.i(14.5f, 7.5f, arrayList5);
                ioj.j(-1.5f, 0.0f, arrayList5);
                ioj.a(3.0f, arrayList5);
                ioj.a(-3.0f, arrayList5);
                iogVar2.c(arrayList5, 0, "", iktVar5, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                ikt iktVar6 = new ikt(j);
                ArrayList arrayList6 = new ArrayList(32);
                ioj.i(17.5f, 11.5f, arrayList6);
                ioj.j(-1.5f, 0.0f, arrayList6);
                ioj.a(3.0f, arrayList6);
                ioj.a(-3.0f, arrayList6);
                iogVar2.c(arrayList6, 0, "", iktVar6, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fwh.a = iogVar2.a();
                ioiVar3 = fwh.a;
                ioiVar3.getClass();
                i = 5004770;
            }
            hmlVar2.v(i);
            final fdap fdapVar4 = fdapVar;
            boolean zD = hmlVar2.D(fdapVar4);
            Object objF3 = hmlVar2.f();
            if (zD || objF3 == hmk.a) {
                objF3 = new fdae() { // from class: edyo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdapVar4.invoke(etzq.OBAKE_PICTURE_PICKER_ILLUSTRATION_SCREEN);
                        return fctx.a;
                    }
                };
                hmlVar2.y(objF3);
            }
            hmlVar2.o();
            edzd.j(ioiVar3, R.string.pqe_edit_art_option, 0L, "illustration", (fdae) objF3, 228766, hmlVar2, 199680);
            hmlVar2.v(-25338323);
            hml hmlVar3 = hmlVar2;
            if (!z2) {
                dtev.a(null, 1.0f, glz.a(hmlVar2).B, hmlVar2, 48, 1);
                hml hmlVar4 = hmlVar2;
                inz inzVarA2 = jqq.a(R.drawable.quantum_gm_ic_delete_vd_theme_24, hmlVar4, 0);
                hmlVar4.v(5004770);
                boolean zD2 = hmlVar4.D(fdapVar3);
                Object objF4 = hmlVar4.f();
                if (zD2 || objF4 == hmk.a) {
                    objF4 = new fdae() { // from class: edyp
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdapVar3.invoke(etzq.OBAKE_PICTURE_PICKER_REMOVE_PICTURE_SCREEN);
                            return fctx.a;
                        }
                    };
                    hmlVar4.y(objF4);
                }
                hmlVar4.o();
                edzd.i(inzVarA2, R.string.pqe_edit_remove_option, 0L, "remove", (fdae) objF4, 228767, hmlVar4, 199680);
                hmlVar3 = hmlVar4;
            }
            hmlVar3.o();
            hmlVar3.n();
            egt.a(new eea(ehv.g(hmlVar3), ehu.a), hmlVar3);
        }
        return fctx.a;
    }
}
