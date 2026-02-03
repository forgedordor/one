package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drmw {
    private static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/emoji/data/EmojiDataUtils");

    public static int a() {
        return drsl.b(drsl.instance.j) ? R.array.emoji_list_raw_resources_with_gender_inclusive_for_supplier : R.array.emoji_list_raw_resources_for_supplier;
    }

    public static List b(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
        ArrayList arrayList = new ArrayList(typedArrayObtainTypedArray.length());
        for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
            int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
            if (resourceId != 0) {
                arrayList.add(Integer.valueOf(resourceId));
            } else {
                ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/inputmethod/emoji/data/EmojiDataUtils", "getResourceIds", 67, "EmojiDataUtils.java")).B("Invalid resource ID was specified in %s (index=%d)", dryf.a(context, i), i2);
            }
        }
        typedArrayObtainTypedArray.recycle();
        return arrayList;
    }
}
