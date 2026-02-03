package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oar extends odm {
    private final oaw e;
    private final mdk f;
    private final mix g;
    private final mix h;
    private final oao i;
    private final oaq j;
    private final mau k;
    private boolean l;
    private long m;

    /* JADX WARN: Multi-variable type inference failed */
    public oar(mau mauVar, mau mauVar2, odx odxVar, obt obtVar, ekgb ekgbVar, oav oavVar, odh odhVar, ocv ocvVar, LogSessionId logSessionId) throws ocp {
        oav oavVar2;
        obo oboVar;
        mau mauVar3;
        oaq oaqVarB;
        odx odxVarA;
        super(mauVar, odhVar);
        mdr mdrVar = new mdr();
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(ekgbVar);
        ekfwVar.h(mdrVar);
        oao oaoVar = new oao(ekfwVar.g());
        this.i = oaoVar;
        this.k = mauVar2;
        oaq oaqVarB2 = oaoVar.b(obtVar, mauVar2);
        mdk mdkVarA = oaoVar.a();
        mee.c(!mdkVarA.equals(mdk.a));
        mat matVar = new mat();
        String str = odxVar.b;
        if (str == null) {
            str = mauVar.o;
            mee.f(str);
        }
        matVar.c(str);
        matVar.F = mdkVarA.b;
        matVar.E = mdkVarA.c;
        matVar.G = mdkVarA.d;
        matVar.j = mauVar2.k;
        mau mauVar4 = new mau(matVar);
        mat matVar2 = new mat(mauVar4);
        matVar2.c(k(mauVar4, odhVar.b(1)));
        mau mauVar5 = new mau(matVar2);
        oat oatVar = (oat) oavVar;
        oav oavVar3 = oatVar.a;
        if (mauVar5.j == -1) {
            mat matVar3 = new mat(mauVar5);
            matVar3.h = 131072;
            mauVar5 = new mau(matVar3);
        }
        final String str2 = mauVar5.o;
        if (str2 == null) {
            throw obq.b(mauVar5, false);
        }
        MediaFormat mediaFormatB = mfi.b(mauVar5);
        ekgb ekgbVarF = ocf.f(str2);
        if (ekgbVarF.isEmpty()) {
            throw obq.a(mauVar5, "No audio media codec found");
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) ekgbVarF.get(0);
        if (ekgbVarF.isEmpty()) {
            oboVar = null;
            oavVar2 = oavVar3;
        } else {
            final int i = mauVar5.H;
            oavVar2 = oavVar3;
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) obq.c(ekgbVarF, new obn() { // from class: obl
                @Override // defpackage.obn
                public final int a(MediaCodecInfo mediaCodecInfo3) {
                    String str3 = str2;
                    int i2 = i;
                    return Math.abs(ocf.b(mediaCodecInfo3, str3, i2) - i2);
                }
            }).get(0);
            int iB = ocf.b(mediaCodecInfo2, str2, i);
            mat matVar4 = new mat(mauVar5);
            matVar4.F = iB;
            oboVar = new obo(mediaCodecInfo2, new mau(matVar4));
        }
        if (oboVar != null) {
            MediaCodecInfo mediaCodecInfo3 = oboVar.a;
            mau mauVar6 = oboVar.b;
            mediaFormatB = mfi.b(mauVar6);
            mediaCodecInfo = mediaCodecInfo3;
            mauVar3 = mauVar6;
        } else {
            mauVar3 = mauVar5;
        }
        if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
            oet.a(mediaFormatB, logSessionId);
        }
        obe obeVar = new obe(((obq) oavVar2).a, mauVar3, mediaFormatB, mediaCodecInfo.getName(), false, null);
        oatVar.b = obeVar.c();
        this.e = obeVar;
        try {
            MediaFormat inputFormat = obeVar.b.getInputFormat();
            boolean z = obeVar.e;
            mdk mdkVar = new mdk(obe.j(inputFormat, z, obeVar.a.l));
            if (mdkVar.b != mdkVarA.b) {
                oaoVar.c();
                mdrVar.j(mdkVar.b);
                oaqVarB = oaoVar.b(obtVar, mauVar2);
                mdkVarA = oaoVar.a();
            } else {
                oaqVarB = oaqVarB2;
            }
            this.j = oaqVarB;
            this.f = mdkVarA;
            this.g = new mix(0);
            this.h = new mix(0);
            mau mauVar7 = obeVar.a;
            if (Objects.equals(mauVar4.o, mauVar7.o)) {
                odxVarA = odxVar;
            } else {
                odw odwVar = new odw(odxVar);
                odwVar.b(mauVar7.o);
                odxVarA = odwVar.a();
            }
            ocvVar.a(odxVarA);
        } catch (RuntimeException e) {
            mff.h(e);
            throw obeVar.k(e);
        }
    }

    private final long h() {
        mdk mdkVar = this.f;
        return ((this.m / mdkVar.e) * 1000000) / mdkVar.b;
    }

    @Override // defpackage.odm
    public final void d() {
        this.i.c();
        this.e.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7 A[Catch: mdl -> 0x0278, TryCatch #2 {mdl -> 0x0278, blocks: (B:72:0x0192, B:74:0x019f, B:76:0x01ab, B:78:0x01c5, B:79:0x01d0, B:81:0x01da, B:83:0x01e7, B:85:0x01ee), top: B:157:0x0192 }] */
    @Override // defpackage.odm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean g() throws defpackage.mdl, defpackage.ocp {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oar.g():boolean");
    }

    @Override // defpackage.odm
    protected final mau p() {
        return this.e.b();
    }

    @Override // defpackage.odm
    protected final mix q() {
        mix mixVar = this.h;
        oaw oawVar = this.e;
        mixVar.d = oawVar.d();
        if (mixVar.d == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfoA = oawVar.a();
        mee.f(bufferInfoA);
        mixVar.f = bufferInfoA.presentationTimeUs;
        mixVar.a = 1;
        return mixVar;
    }

    @Override // defpackage.odm
    public final /* bridge */ /* synthetic */ ocx r(obt obtVar, mau mauVar, int i) {
        if (this.l) {
            return this.i.b(obtVar, mauVar);
        }
        this.l = true;
        mee.c(mauVar.equals(this.k));
        return this.j;
    }

    @Override // defpackage.odm
    protected final void s() {
        this.e.i();
    }

    @Override // defpackage.odm
    protected final boolean t() {
        return this.e.g();
    }
}
