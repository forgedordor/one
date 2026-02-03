package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibc extends diaj {
    public dibc() {
        super(dbjt.COMPONENT_ENABLED_SETTING_FIX, 0L);
    }

    private static ComponentName c(Context context, String str) {
        return new ComponentName(context.getPackageName(), str);
    }

    private static int d(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 1;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.diaj
    public final diap a(diap diapVar, ejwi ejwiVar) {
        if (!ejwiVar.g() || ((dbkw) ejwiVar.c()).b != 8) {
            throw new IllegalArgumentException();
        }
        dbkw dbkwVar = (dbkw) ejwiVar.c();
        dbka dbkaVar = dbkwVar.b == 8 ? (dbka) dbkwVar.c : dbka.a;
        HashSet hashSet = new HashSet();
        Iterator<E> it = dbkaVar.b.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(((dbjz) it.next()).b)) {
                throw new IllegalArgumentException("Duplicate componentName in config");
            }
        }
        Context context = diapVar.b;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList = new ArrayList();
            for (dbjz dbjzVar : dbkaVar.b) {
                ComponentName componentNameC = c(context, dbjzVar.b);
                int iA = dbjy.a(dbjzVar.c);
                if (iA == 0) {
                    iA = 1;
                }
                arrayList.add(new PackageManager.ComponentEnabledSetting(componentNameC, d(iA), 1));
            }
            context.getPackageManager().setComponentEnabledSettings(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < dbkaVar.b.size()) {
                try {
                    dbjz dbjzVar2 = (dbjz) dbkaVar.b.get(i);
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentNameC2 = c(context, dbjzVar2.b);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentNameC2);
                    int iA2 = dbjy.a(dbjzVar2.c);
                    if (iA2 == 0) {
                        iA2 = 1;
                    }
                    packageManager.setComponentEnabledSetting(componentNameC2, d(iA2), 1);
                    arrayList2.add(Integer.valueOf(componentEnabledSetting));
                    i++;
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager2 = context.getPackageManager();
                    while (true) {
                        i--;
                        if (i < 0) {
                            throw new IllegalArgumentException("Failed to set componentEnabled state.", e);
                        }
                        packageManager2.setComponentEnabledSetting(c(context, ((dbjz) dbkaVar.b.get(i)).b), ((Integer) arrayList2.get(i)).intValue(), 1);
                    }
                }
            }
        }
        if (dbkaVar.c) {
            return diapVar;
        }
        diao diaoVar = new diao(diapVar);
        diaoVar.c();
        return diaoVar.a();
    }

    @Override // defpackage.diaj
    public final String b() {
        return "COMPONENT_ENABLED_SETTING_FIX";
    }
}
