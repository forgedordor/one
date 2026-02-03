package defpackage;

import android.content.Context;
import android.content.res.TypedArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqoc {
    public static int a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
