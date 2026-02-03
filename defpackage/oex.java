package defpackage;

import android.media.metrics.LogSessionId;
import android.util.Pair;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oex {
    public final oav a;
    public final mau b;
    public final ekgb c;
    public final List d;
    public final odx e;
    public final ocv f;
    public final String g;
    public final int h;
    public final LogSessionId i;
    public mch j;
    public volatile oaw k;
    public volatile int l;
    public volatile boolean m;

    public oex(oav oavVar, mau mauVar, ekgb ekgbVar, List list, odx odxVar, ocv ocvVar, LogSessionId logSessionId) {
        int i = 0;
        mee.a(mauVar.E != null);
        this.a = oavVar;
        this.b = mauVar;
        this.c = ekgbVar;
        this.d = list;
        this.e = odxVar;
        this.f = ocvVar;
        this.i = logSessionId;
        String str = mauVar.o;
        mee.f(str);
        String str2 = odxVar.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (mbw.j(str)) {
            str = "video/hevc";
        }
        int i2 = odxVar.d;
        mag magVar = mauVar.E;
        if (i2 != 0) {
            str3 = str;
            i = i2;
        } else if (!mag.i(magVar) || !ocf.g(str, magVar).isEmpty()) {
            str3 = str;
        } else if (ocf.g("video/hevc", magVar).isEmpty()) {
            i = 2;
            str3 = str;
        }
        Pair pairCreate = Pair.create(str3, Integer.valueOf(i));
        this.g = (String) pairCreate.first;
        this.h = ((Integer) pairCreate.second).intValue();
    }
}
