package defpackage;

import android.content.pm.PackageManager;
import android.os.Process;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbuq {
    public static final int a = Process.myUid();

    public static fbur a(fbur... fburVarArr) {
        ejwl.b(true, "securityPolicies must not be empty");
        return new fbup(fburVarArr);
    }

    public static fbur b(PackageManager packageManager, String str, byte[] bArr) {
        return c(packageManager, str, ekgb.r(bArr));
    }

    public static fbur c(PackageManager packageManager, String str, List list) {
        packageManager.getClass();
        list.getClass();
        ejwl.a(!list.isEmpty());
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            bArr.getClass();
            int length = bArr.length;
            ejwl.a(length == 32);
            ekfwVar.h(Arrays.copyOf(bArr, length));
        }
        return new fbuo(packageManager, str, ekfwVar.g());
    }
}
