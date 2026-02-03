package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czct {
    public final cvw a;
    private final czcq[] b;

    /* compiled from: PG */
    public interface a {
        cpch a();
    }

    public czct(Context context, czcq czcqVar) throws Resources.NotFoundException {
        cvw cvwVar = new cvw();
        this.a = cvwVar;
        cpch cpchVarA = ((a) ehli.a(context, a.class)).a();
        String[] stringArray = context.getResources().getStringArray(R.array.gif_category_names_tenor);
        String[] stringArray2 = context.getResources().getStringArray(R.array.gif_category_queries_tenor);
        int[] intArray = context.getResources().getIntArray(R.array.gif_category_background_colors);
        int[] intArray2 = context.getResources().getIntArray(R.array.gif_category_text_icon_colors);
        int length = stringArray.length;
        int length2 = stringArray2.length;
        ejwl.l(length == length2);
        ejwl.l(length == intArray.length);
        ejwl.l(length == intArray2.length);
        int i = czcqVar != null ? 1 : 0;
        czcq[] czcqVarArr = new czcq[length2 + i];
        this.b = czcqVarArr;
        if (czcqVar != null) {
            czcqVarArr[0] = czcqVar;
            cvwVar.put(ejwk.b(czcqVar.b), 0);
        }
        boolean zG = cpchVarA.g();
        for (int i2 = 0; i2 < stringArray2.length; i2++) {
            czcq[] czcqVarArr2 = this.b;
            int i3 = i2 + i;
            String str = stringArray[i2];
            String str2 = stringArray2[i2];
            if (zG) {
                eehg.d(context, R.attr.colorOnSurfaceInverse, "GifCategoryModel");
                eehg.d(context, R.attr.colorOnSurface, "GifCategoryModel");
            } else {
                int i4 = intArray[i2];
                int i5 = intArray2[i2];
            }
            czcqVarArr2[i3] = new czcq(str, str2);
            ejwl.l(!this.a.containsKey(stringArray2[i2]));
            this.a.put(stringArray2[i2], Integer.valueOf(i3));
        }
    }

    public final int a() {
        return this.b.length;
    }

    public final czcq b(int i) {
        return this.b[i];
    }
}
