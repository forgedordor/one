package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fekm implements fekj {
    @Override // defpackage.fekj
    public final List a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // defpackage.fekj
    public final void b(Context context, ComponentName componentName, int i) throws fekk {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i);
        if (!felc.a(context, intent)) {
            throw new fekk("unable to resolve intent: ".concat(String.valueOf(intent.toString())));
        }
        context.sendBroadcast(intent);
    }
}
