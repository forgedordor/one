package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcl implements kcj {
    private static final Typeface d(String str, kcc kccVar, int i) {
        if (kbw.b(i, 0) && fdbq.f(kccVar, kcc.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iB = kas.b(kccVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iB) : Typeface.create(str, iB);
    }

    private static final Typeface e(String str, kcc kccVar, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceD = d(str, kccVar, i);
        if (fdbq.f(typefaceD, Typeface.create(Typeface.DEFAULT, kas.b(kccVar, i))) || fdbq.f(typefaceD, d(null, kccVar, i))) {
            return null;
        }
        return typefaceD;
    }

    @Override // defpackage.kcj
    public final Typeface a(kcc kccVar, int i) {
        return d(null, kccVar, i);
    }

    @Override // defpackage.kcj
    public final Typeface b(kce kceVar, kcc kccVar, int i) {
        String strConcat;
        String str;
        int i2 = kccVar.i / 100;
        String str2 = kceVar.f;
        if (i2 < 0 || i2 >= 2) {
            if (i2 < 2 || i2 >= 4) {
                if (i2 != 4) {
                    if (i2 == 5) {
                        str = "-medium";
                    } else if ((i2 < 6 || i2 >= 8) && i2 >= 8 && i2 < 11) {
                        str = "-black";
                    }
                }
                strConcat = str2;
            } else {
                str = "-light";
            }
            strConcat = str2.concat(str);
        } else {
            strConcat = str2.concat("-thin");
        }
        Typeface typefaceE = e(strConcat, kccVar, i);
        return typefaceE == null ? d(str2, kccVar, i) : typefaceE;
    }

    @Override // defpackage.kcj
    public final Typeface c(String str, kcc kccVar, kca kcaVar, Context context) {
        Typeface typefaceB;
        kce kceVar = kbj.b;
        if (fdbq.f(str, kceVar.f)) {
            typefaceB = b(kceVar, kccVar, 0);
        } else {
            kce kceVar2 = kbj.c;
            if (fdbq.f(str, kceVar2.f)) {
                typefaceB = b(kceVar2, kccVar, 0);
            } else {
                kce kceVar3 = kbj.d;
                if (fdbq.f(str, kceVar3.f)) {
                    typefaceB = b(kceVar3, kccVar, 0);
                } else {
                    kce kceVar4 = kbj.e;
                    typefaceB = fdbq.f(str, kceVar4.f) ? b(kceVar4, kccVar, 0) : e(str, kccVar, 0);
                }
            }
        }
        return kcm.a(typefaceB, kcaVar, context);
    }
}
