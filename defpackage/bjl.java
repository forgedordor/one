package defpackage;

import android.util.Range;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjl {
    public static final bjo a = new bhd("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final bjo b = new bhd("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final bjo c = new bhd("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    final List d;
    public final bjq e;
    public final int f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final bmx j;
    public final bib k;

    public bjl(List list, bjq bjqVar, int i, boolean z, List list2, boolean z2, bmx bmxVar, bib bibVar) {
        this.d = list;
        this.e = bjqVar;
        this.f = i;
        this.h = DesugarCollections.unmodifiableList(list2);
        this.i = z2;
        this.j = bmxVar;
        this.k = bibVar;
        this.g = z;
    }

    public final int a() {
        Object objC = this.j.c("CAPTURE_CONFIG_ID_KEY");
        if (objC == null) {
            return -1;
        }
        return ((Integer) objC).intValue();
    }

    public final int b() {
        Integer num = (Integer) this.e.n(bni.z, 0);
        num.getClass();
        return num.intValue();
    }

    public final int c() {
        Integer num = (Integer) this.e.n(bni.A, 0);
        num.getClass();
        return num.intValue();
    }

    public final Range d() {
        Range range = (Range) this.e.n(c, bms.h);
        range.getClass();
        return range;
    }

    public final List e() {
        return DesugarCollections.unmodifiableList(this.d);
    }
}
