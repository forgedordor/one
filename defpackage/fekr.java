package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekr implements fekj {
    @Override // defpackage.fekj
    public final List a() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // defpackage.fekj
    public final void b(Context context, ComponentName componentName, int i) throws fekk {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (!felc.a(context, intent) && !felc.a(context, intent2)) {
            throw new fekk("unable to resolve intent: ".concat(String.valueOf(intent2.toString())));
        }
        context.sendBroadcast(intent);
        context.sendBroadcast(intent2);
    }
}
