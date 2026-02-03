package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdl implements lcj {
    private static final Size a = new Size(1280, 720);
    private final String b;
    private final cax c;
    private final Size d;
    private final azv e;
    private final Range f;
    private final int g;

    public cdl(String str, int i, cax caxVar, Size size, azv azvVar, Range range) {
        this.b = str;
        this.g = i;
        this.c = caxVar;
        this.d = size;
        this.e = azvVar;
        this.f = range;
    }

    @Override // defpackage.lcj
    public final /* synthetic */ Object a() {
        Integer num;
        cax caxVar = this.c;
        cdg cdgVarB = cdk.b(caxVar, this.f);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = cdgVarB.a;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = cdgVarB.b;
        sb.append(i2);
        sb.append("fps.");
        bbs.a("VidEncCfgDefaultRslvr", sb.toString());
        bbs.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        Size size = this.d;
        azv azvVar = this.e;
        int i3 = azvVar.i;
        int width = size.getWidth();
        Size size2 = a;
        int iA = cdk.a(14000000, i3, 8, i2, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), ((bwz) caxVar).c);
        Map map = cgx.e;
        String str = this.b;
        Map map2 = (Map) map.get(str);
        int iIntValue = -1;
        if (map2 != null && (num = (Integer) map2.get(azvVar)) != null) {
            iIntValue = num.intValue();
        }
        cgq cgqVarD = cdk.d(str, iIntValue);
        cgo cgoVarM = cgp.m();
        cgoVarM.f(str);
        cgoVarM.e(this.g);
        cgoVarM.h(size);
        cgoVarM.b(iA);
        cgoVarM.c(i);
        cgoVarM.d(i2);
        cgoVarM.g(iIntValue);
        ((cdt) cgoVarM).b = cgqVarD;
        return cgoVarM.a();
    }
}
