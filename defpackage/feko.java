package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feko implements fekj {
    @Override // defpackage.fekj
    public final List a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override // defpackage.fekj
    public final void b(Context context, ComponentName componentName, int i) throws fekk {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (!felc.a(context, intent)) {
            throw new fekk("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
        }
        context.sendBroadcast(intent);
    }
}
