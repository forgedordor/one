package defpackage;

import android.content.Context;
import java.io.File;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class drmc implements Supplier {
    public final /* synthetic */ drke a;

    public /* synthetic */ drmc(drke drkeVar) {
        this.a = drkeVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        drke drkeVar = this.a;
        String str = drkeVar.a;
        if (str.length() == 0 || str.length() > 32) {
            ((ekrd) drkh.a.a(drub.a).h("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory$Builder", "checkLength", 435, "AutoCleanableDirectory.java")).B("The length of key (%s) must be >0 and <=%d", str, 32);
        }
        Context context = drkeVar.b;
        EnumMap enumMap = drkeVar.c;
        File cacheDir = context.getCacheDir();
        ekgp ekgpVarC = ekmi.c(enumMap);
        StringBuilder sb = new StringBuilder();
        sb.append(drke.b("BundledEmojiListLoader"));
        ekqg ekqgVarListIterator = ekgpVarC.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            sb.append('|');
            sb.append(ejuf.c(((drkg) entry.getKey()).toString()));
            sb.append('>');
            sb.append(drke.b((String) entry.getValue()));
        }
        String strA = drke.a(drke.a(sb.toString(), '%'), '/');
        ekrg ekrgVar = drxz.a;
        String[] strArr = {"auto_clean", strA};
        int i = 0;
        while (i < 2) {
            File file = new File(cacheDir, strArr[i]);
            i++;
            cacheDir = file;
        }
        return new drkh(cacheDir, "BundledEmojiListLoader", ekgpVarC);
    }
}
