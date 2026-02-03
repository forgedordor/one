package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfr {
    private LocaleList a;
    private kfu b;
    private final kgm c = new kgm();

    public final kfu a() {
        kgm kgmVar = this.c;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (kgmVar) {
            kfu kfuVar = this.b;
            if (kfuVar != null && localeList == this.a) {
                return kfuVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new kfs(localeList.get(i)));
            }
            kfu kfuVar2 = new kfu(arrayList);
            this.a = localeList;
            this.b = kfuVar2;
            return kfuVar2;
        }
    }
}
