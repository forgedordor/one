package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhn extends bmr {
    public azv a;
    public bjq b;
    private Size c;
    private Size d;
    private Integer e;
    private Range f;
    private Boolean g;

    public bhn() {
    }

    @Override // defpackage.bmr
    public final bms a() {
        Size size = this.c;
        Size size2 = this.d;
        String strConcat = size == null ? " resolution" : "";
        if (size2 == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (this.a == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (this.e == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (this.f == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (this.g == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new bho(this.c, this.d, this.a, this.e.intValue(), this.f, this.b, this.g.booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // defpackage.bmr
    public final void b(Range range) {
        if (range == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        this.f = range;
    }

    @Override // defpackage.bmr
    public final void c(Size size) {
        if (size == null) {
            throw new NullPointerException("Null originalConfiguredResolution");
        }
        this.d = size;
    }

    @Override // defpackage.bmr
    public final void d(Size size) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.c = size;
    }

    @Override // defpackage.bmr
    public final void e(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.bmr
    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public bhn(bms bmsVar) {
        bho bhoVar = (bho) bmsVar;
        this.c = bhoVar.a;
        this.d = bhoVar.b;
        this.a = bhoVar.c;
        this.e = Integer.valueOf(bhoVar.d);
        this.f = bhoVar.e;
        this.b = bhoVar.f;
        this.g = Boolean.valueOf(bhoVar.g);
    }
}
