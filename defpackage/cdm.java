package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdm implements lcj {
    private final String a;
    private final cax b;
    private final Size c;
    private final bki d;
    private final azv e;
    private final Range f;
    private final int g;

    public cdm(String str, int i, cax caxVar, Size size, bki bkiVar, azv azvVar, Range range) {
        this.a = str;
        this.g = i;
        this.b = caxVar;
        this.c = size;
        this.d = bkiVar;
        this.e = azvVar;
        this.f = range;
    }

    @Override // defpackage.lcj
    public final /* synthetic */ Object a() {
        cax caxVar = this.b;
        cdg cdgVarB = cdk.b(caxVar, this.f);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = cdgVarB.a;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = cdgVarB.b;
        sb.append(i2);
        sb.append("fps.");
        bbs.a("VidEncVdPrflRslvr", sb.toString());
        bbs.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        Range range = ((bwz) caxVar).c;
        Size size = this.c;
        azv azvVar = this.e;
        bki bkiVar = this.d;
        int iA = cdk.a(bkiVar.b(), azvVar.i, bkiVar.a(), i2, bkiVar.e(), size.getWidth(), bkiVar.i(), size.getHeight(), bkiVar.g(), range);
        String str = this.a;
        int iH = bkiVar.h();
        cgq cgqVarD = cdk.d(str, iH);
        cgo cgoVarM = cgp.m();
        cgoVarM.f(str);
        cgoVarM.e(this.g);
        cgoVarM.h(size);
        cgoVarM.b(iA);
        cgoVarM.c(i);
        cgoVarM.d(i2);
        cgoVarM.g(iH);
        ((cdt) cgoVarM).b = cgqVarD;
        return cgoVarM.a();
    }
}
