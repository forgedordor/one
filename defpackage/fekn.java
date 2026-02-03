package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekn implements fekj {
    @Override // defpackage.fekj
    public final List a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // defpackage.fekj
    public final void b(Context context, ComponentName componentName, int i) throws fekk {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        if (!felc.a(context, intent)) {
            throw new fekk("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
        }
        context.sendBroadcast(intent);
    }
}
